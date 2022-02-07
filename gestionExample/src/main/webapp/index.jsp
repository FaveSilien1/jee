
<%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html>
<html lang="fr">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <link href="css/style.css" rel="stylesheet" id="bootstrap-css">
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <title>Hello Struts2</title>
    <style>
    
    </style>
    <s:head />
</head>

<body>
<div class="sidenav">
         <div class="login-main-text">
            <h2>Application<br> JAVA EE</h2>
            <p>Example Servlet.</p>
            <br>
          
         </div>
      </div>
      <div class="main">
         <div class="col-md-6 col-sm-12">
            <div class="login-form">
              <!--  <h1><a href="<s:url action="hello"/>">Hello Struts</a></h1> -->

				<h1>
					<s:text name="global.heading" />
				</h1>

				<s:url var="indexEN" namespace="/" action="locale">
					<s:param name="request_locale">en</s:param>
				</s:url>
				<s:a href="%{indexEN}">English</s:a>

				<s:url var="indexFR" namespace="/" action="locale">
					<s:param name="request_locale">fr</s:param>
				</s:url>
				<s:a href="%{indexFR}">France</s:a>

      

				<s:form  action="hello" method="post" validate="true">
					<s:textfield class="form-control" name="personne.firstName"
						key = "global.firstName" />
					<s:textfield class="form-control" name="personne.lastName"
						key = "global.lastName" />
					<s:textfield class="form-control" name="personne.title"
						key = "global.title" />
					<s:textfield class="form-control" name="personne.age"
						key = "global.age"/>	
					<s:textfield type="date" name="personne.startDate"
						format="dd/MM/yyyy" key = "global.date" />
					 <s:select name="personne.ville" list="{'paris','lille','nantes'}" size="1" key = "global.ville"/>
      
					<s:submit key = "global.submit" value="Envoyer" />
				</s:form>


			</div>
         </div>
      </div>
</body>
</html>