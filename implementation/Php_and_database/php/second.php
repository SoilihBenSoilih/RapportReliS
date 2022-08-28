<!DOCTYPE html>
<html>
<head>
	<title>Relis</title>
	<meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <link href="https://fonts.googleapis.com/css2?family=Lato:ital@1&display=swap" rel="stylesheet">	
</head>
<body>


<?php
require 'database.php';
    
$code=null;
$id_project=null;
$name_project=null;
$id_user=null;

    if ($_SERVER["REQUEST_METHOD"] == "GET") 
    {
        $id_project = $_GET["id_project"];
        $name_project = $_GET["name_project"];
        $id_user = $_GET["id_user"];
    }
 
$db = Database::connect();
$statement = $db->prepare('SELECT * FROM phases WHERE project = ?');
$statement->execute(array($id_project)); 
$phases = array();
       
while($tab = $statement->fetch()) 
{
     $phases[$tab['id_phase']]=$tab['name_phase'];
}
    
$code = "ProjectName: ".$name_project."\n\n";
$code .= "Participants: \n\n";

$statement2 = $db->prepare('SELECT * FROM participants WHERE project = ?');
$statement2->execute(array($id_project));

while($tab = $statement2->fetch()) 
{
     $code .= "{ Participant: ".$tab['name_participant']." Role: ".$tab['role']."} \n"; 

}
 
foreach ($phases as $key => $value) {
	
	$code .= "\n\n Phase: ".$value."\n\n { \n";

		$code .= "DecisionPerUser: \n\n";

		$statement3 = $db->prepare('SELECT * FROM decisions WHERE phase = ?');
		$statement3->execute(array($key));

		while($tab = $statement3->fetch()) 
		{
		    $code .="\n { \n";
		    $code .="       D_User: ".$tab['user']."\n";
		    $code .="       D_Included: ".$tab['included']."\n";
		    $code .="       D_Excluded: ".$tab['excluded']."\n";
		    $code .="       D_InConfclict: ".$tab['inConflict']."\n";
		    $code .="} \n";
		}
		    
		$code .="\n\n StatisticsOnExclusionCriteria: \n\n";
		    
		$statement4 = $db->prepare('SELECT * FROM criterias WHERE phase = ?');
		$statement4->execute(array($key));

		while($tab = $statement4->fetch()) 
		{
		    $code .="\n { \n";
		    $code .="       S_Criteria: ".$tab['nameCriteria']."\n";
		    $code .="       S_Nombre: ".$tab['number']."\n";
		    $code .="       S_Pourcentage: ".$tab['percentage']."\n";
		    $code .="} \n";
		}

		$code .="\n\n ConflictResolution: \n\n";
		    
		$statement5 = $db->prepare('SELECT * FROM conflicts WHERE phase = ?');
		$statement5->execute(array($key));

		while($tab = $statement5->fetch()) 
		{
		    $code .="\n { \n";
		    $code .="       C_Decision: ".$tab['conflict_decision']."\n";
		    $code .="       C_Nombre: ".$tab['conflict_number']."\n";
		    $code .="} \n";
		}

		$code .="\n\n Result: \n\n";
		    
		$statement6 = $db->prepare('SELECT * FROM results WHERE phase = ? AND result_decision=?');
		$var ="Total";
		$statement6->execute(array($key, $var));

		$tb = $statement6->fetch();
		    
		$code .=" R_Total: ".$tb['result_papers'];

		$statement7 = $db->prepare('SELECT * FROM results WHERE phase = ? AND result_decision != ?');
		$statement7->execute(array($key, $var));
		    
		while($tab = $statement7->fetch()) 
		{
		    $code .="\n { \n";
		    $code .="       R_Decision: ".$tab['result_decision']."\n";
		    $code .="       R_Paper: ".$tab['result_papers']."\n";
		    $code .="       R_Pourcentage: ".$tab['result_percentage']."\n";
		    $code .="} \n";
		}

	$code .= "\n\n }";	

}

$code .= "\n\n Classification: \n\n";

//**********************code provisoire début***********************//

$statement8 = $db->prepare('SELECT * FROM classification WHERE project = ?');
$statement8->execute(array($id_project));

$responses = array();

while($tab = $statement8->fetch()) 
{

	$statement9 = $db->prepare('SELECT * FROM responses WHERE classification = ?');
	$statement9->execute(array($tab['id_class']));	
	while($tab2 = $statement9->fetch()) 
	{
        $responses[] =  
        	 [
        	 	'classification' => $tab2['classification'],'response' => $tab2['name_response'], 'stat' => $tab2['response_stat']
        	 ];
	}
	
}




//var_dump($responses);


foreach ($responses as $value) {
	$statement10 = $db->prepare('SELECT * FROM classification WHERE id_class = ?');
	$statement10->execute(array($value['classification']));
	$tab = $statement10->fetch();

	$code .= "{ question: ".$tab['question']." { response: ".$value['response']." result: ".$value['stat']." }} \n";
}

//**********************fin code provisoire*************************//

//**********************début code optimal*************************//
/*
$statement8 = $db->prepare('SELECT * FROM classification WHERE project = ?');
$statement8->execute(array($id_project));


    
while($tab = $statement8->fetch()) 
{
	$code .= "{ question: ".$tab['question'];

	$statement9 = $db->prepare('SELECT * FROM responses WHERE classification = ?');
	$statement9->execute(array($tab['id_class']));	
	while($tab2 = $statement9->fetch()) 
	{

		$code .= "{ response: ".$tab2['name_response']." result: ".$tab2['response_stat']." }} \n";
	}
	
}

*/

//**********************fin code optimal*************************//
$code = str_replace( array('à','á','â','ã','ä', 'ç', 'è','é','ê','ë', 'ì','í','î','ï', 'ñ', 'ò','ó','ô','õ','ö', 'ù','ú','û','ü', 'ý','ÿ', 'À','Á','Â','Ã','Ä', 'Ç', 'È','É','Ê','Ë', 'Ì','Í','Î','Ï', 'Ñ', 'Ò','Ó','Ô','Õ','Ö', 'Ù','Ú','Û','Ü', 'Ý', '/', '-','?','(',')','='), array('a','a','a','a','a', 'c', 'e','e','e','e', 'i','i','i','i', 'n', 'o','o','o','o','o', 'u','u','u','u', 'y','y', 'A','A','A','A','A', 'C', 'E','E','E','E', 'I','I','I','I', 'N', 'O','O','O','O','O', 'U','U','U','U', 'Y', ' or ', ' ','', '', '', ' equal '), $code);

    
?>

		<style type="text/css">

			body
			{
			    font-family: 'Lato', sans-serif;
			    /*#000245rgbargba(0,2,69,0.9)(12,254,30,0.8)#281e5d*/
			    background: #000245;
			}

			#corps
			{
				
			}

			img 
			{
			    max-width: 100%;
			    max-height: auto;
			    border-radius: 30px; 
			    margin: 20px;

			}

			.comments
			{
			    font-style: italic;
			    font-size: 18px;
			    color: #9e0d0d;
			    height: 25px
			}


		</style>

		<div class="col-xs-8 col-md-4 profile-picture">
                <a href="index.php"><img id="moi" src="images/udem.png" alt="udem"></a>
        </div>
            
        <div id="corps">

        <div class="container-fluid">
           <div class="row">
               <div class="col-lg-10 col-lg-offset-1">
                    <form id="contact-form" action="index.php" method="post" role="form">
                        <div class="row">
                            <div class="col-md-12">
                                <textarea id="code" name="code" class="form-control" placeholder="Code" rows="30"><?php echo $code ?></textarea>
                                <p class="comments"></p>
                            </div>
                        </div>
                    </form>
                </div>
           </div>
        </div>
        </div>
</body>
</html>