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
    $array = array("utilisateur" => "","utilisateurError" => "");
    $id_needed = null;
    $username_needed = null;
    $project_needed = null;

    if ($_SERVER["REQUEST_METHOD"] == "POST") 
    { 
        $array["utilisateur"] = test_input($_POST["username"]);    
        
         

         $db = Database::connect();
         $statement = $db->prepare('SELECT * FROM users WHERE username = ?');
         $statement->execute(array($array["utilisateur"]));
         
         while($util = $statement->fetch()) 
         {
             $id_needed = $util['id_users'];
             $username_needed = $util['username'];
             $project_needed = $util['project'];
         }
        
         if($id_needed == null){
             $array["utilisateurError"] = "Utilisateur introuvable";
         }
        
    }
    
    function test_input($data) 
        {
          $data = trim($data);
          $data = stripslashes($data);
          $data = htmlspecialchars($data);
          return $data;
        }
?>


		<style type="text/css">
			
			.bouton1
			{
			    font-weight: bold;
			    text-transform: uppercase;
			    color: #fff;
			    border: 1px solid #fff;
			    padding: 18px 50px;
			    margin: 10px;
			    border-radius: 5px;
			    display: inline-block;
			    transition: all 0.5s ease-in 0s;
			    background: transparent;
			}

			.bouton1:hover
			{
			    background: #000;
			    color: #fff;
			    text-decoration: none;
			}

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

			#projects
			{
			    font-size: 20px;
			    background: #fff;
			    padding: 40px;
			    margin-top: 25px; 
			    border-radius: 10px;
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
                            <div class="col-md-9">
                                <input id="Username" type="text" name="username" class="form-control" 
                                placeholder="Username" required>
                                <p class="comments"><?php echo $array["utilisateurError"]; ?></p>
                            </div>
                            <div class="col-md-12" >
                                <input type="submit" class="bouton1" value="Validate">
                            </div>    
                        </div>
                    </form>
                </div>
           </div>

           <div class="row">
               <div class="col-lg-10 col-lg-offset-1">
                  <div id="projects">   
                    <table class="table">
                          <thead>
                            <tr>
                              <th scope="col">#</th>
                              <th scope="col">Project</th>
                            </tr>
                          </thead>
                          <tbody>
                                  
                                <?php
                                if ($array["utilisateur"] != "") 
                                { 
                                $statement2 = $db->prepare('SELECT * FROM project WHERE id_project = ? ORDER BY id_project DESC');
                                $statement2->execute(array($project_needed));
                                }
                            
                                ?>
                              
                              <?php   
                                $i=1;
                                if ($array["utilisateur"] != "") 
                                {
                                        while($projet = $statement2->fetch()) {
                               ?>
                                            <tr>
                                                  <th scope="row"><?php echo $i ?></th>
                                                    <td><a href="second.php?id_project=<?php echo $projet["id_project"] 
                                                           ?>&name_project=<?php echo $projet["name_project"] ?>&id_user=<?php echo $projet["users"] ?>"> <?php echo $projet["name_project"] ?></a></td>
                                                  </tr>
                              <?php 
                                            $i++;
                                        }
                                  }
                              
                              Database::disconnect();
                              ?>
                          </tbody>
                    </table>
                    </div>
                </div>
           </div>
        </div>
        </div>
</body>
</html>