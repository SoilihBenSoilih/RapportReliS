Ce fichier donne des détails sur le contenu du dossier "implémentation".

********** où trouver les fichiers concernés? *************

*Pour Xtext et Xtend :
	-<<ReliSRS.xtext>> dans le dossier "\Xtext_Xtend\Xtext_and_xtend\reliS\src\org\xtext\slr"
	  est le fichier contenant la DSL du projet xtext.
	-<<ReliSRSGenerator.xtend>> dans le dossier "\Xtext_Xtend\Xtext_and_xtend\reliS\src\org\xtext\slr\generator"
	  contient la transformation xtend.

*Pour l'instance de la DSL:
	Elle se trouve dans le dossier
	"\Xtext_Xtend\modele_instance\SLR" et se nomme <<instance-soilihi.slr>>.
	Dans le dossier "\Xtext_Xtend\modele_instance\SLR\src-gen\resource\SRL"
	<<instance-soilihi.tex>> est le fichier généré en latex pour le rapport. 

*Pour le PHP et MySQL:
	-"\Php_and_database\mysql_database" contient <<relis_database_project.sql>>
	qui est le fichier sql qu'on peut importer après avec créé la base de 
	données `relis_database_project`.

	N.B: on peut nommer autrement la base de données mais il faut update le fichier
	`database.php` en conséquence!

	-dans le dossier "\Php_and_database\php", on peut trouver <<index.php>> qui est
	 la page d'accueil du site, <<second.php>> qui est la page dans lequel le 
	 contenu de l'instance qu'on créera sera généré.Puis le fichier <<database.php>>
	 qui gère les connexions à la base de données.

*******************Comment exécuter? *****************************

a) on va dans le site : https://relis-project.bensoilih.com/
   dans lequel on écrit un nom d'utilisateur utilisé dans notre
   compte ReliS. Vu que c'est une base de données créée pour une 
   simulation, il n'y a pas toutes les informations de ReliS.
   Voici donc les personne ayant des projets ReliS dans notre
   base de données : 
     ["soilihi","erick","lea","juan","esther","ankica","ankica",
      "vasco","dusan","paulo","eugene","dominique","ivan","ferhat",
      "antonio","bedir","miguel","moharram","mustafa","raheleh",
      "claudio","oksana","rima","hana","letitia"]

b) la liste des projets de la personne s'affiche, on en choisit un et 
   on récupère le code généré dans la page suivante.

c) on va dans Eclipse et cherche le fichier contenant la grammaire de 
  notre DSL <<ReliSRS.xtext>>. On fait un clic droit dessus, puis on 
  fait: "Run As -> Generate Xtext Artifacts"

d) A la fin de la génération, on place le curseur sur le dossier
   de notre DSL <<reliS.ui>>, puis on fait clic droit dessus,
   ensuite: "Run As -> Eclipse Application"

e) Une fois l'instance Eclipse ouverte, aller dessus et créez un 
   nouveau projet en faisant: 
   "File -> New -> Project -> General -> Project".
   Donner le nom de votre choix et faites finish.

f) Placez-vous sur le projet créé et faites clic droit puis:
   "New -> File". Donner le nom de votre choix mais l'extension
   doit être ".slr"

g) Collez le code que vous aviez reccupéré dans le site précédemment
   ce qui nous générera le rapport en latex dans le nouveau dossier crée
   dans le projet. On peut compiler ce code latex dans n'importe quel 
   Editeur Latex pour générer un pdf par exemple.
