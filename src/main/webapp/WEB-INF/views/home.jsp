<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Angular and Spring App</title>
	<link rel="stylesheet" href="resources/css/bootstrap.min.css">
	<link rel="stylesheet" href="resources/css/app.css">
	<script src="resources/scripts/angular.min.js"></script>
	<script src="resources/scripts/jquery-1.11.3.min.js"></script>
	<script src="resources/scripts/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">School Application</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Alumnos <span class="sr-only">(current)</span></a></li>
        <li><a href="#">Materias</a></li>
        <li><a href="#">Profesores</a></li>
<!--         <li class="dropdown"> -->
<!--           <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a> -->
<!--           <ul class="dropdown-menu"> -->
<!--             <li><a href="#">Action</a></li> -->
<!--             <li><a href="#">Another action</a></li> -->
<!--             <li><a href="#">Something else here</a></li> -->
<!--             <li role="separator" class="divider"></li> -->
<!--             <li><a href="#">Separated link</a></li> -->
<!--             <li role="separator" class="divider"></li> -->
<!--             <li><a href="#">One more separated link</a></li> -->
<!--           </ul> -->
<!--         </li> -->
      </ul>
<!--       <form class="navbar-form navbar-left" role="search"> -->
<!--         <div class="form-group"> -->
<!--           <input type="text" class="form-control" placeholder="Search"> -->
<!--         </div> -->
<!--         <button type="submit" class="btn btn-default">Submit</button> -->
<!--       </form> -->
      <ul class="nav navbar-nav navbar-right">
        <li><a href="j_spring_security_logout">Logout</a></li>
<!--         <li class="dropdown"> -->
<!--           <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a> -->
<!--           <ul class="dropdown-menu"> -->
<!--             <li><a href="#">Action</a></li> -->
<!--             <li><a href="#">Another action</a></li> -->
<!--             <li><a href="#">Something else here</a></li> -->
<!--             <li role="separator" class="divider"></li> -->
<!--             <li><a href="#">Separated link</a></li> -->
<!--           </ul> -->
<!--         </li> -->
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
<section ng-view class="main-container">
	<div class="row">
		content
	</div>
</section>
<footer class="footer">
  <div class="container-fluid">
   <span>All rights reserved School Application &copy;<br>Server Time: ${serverTime}</span>
  </div>
</footer>
</body>
</html>
