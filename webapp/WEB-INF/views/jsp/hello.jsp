<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@include file="include.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Airline Portal</title>
 
<spring:url value="/resources/core/css/hello.css" var="coreCss" />
<spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapCss" />
<link href="${bootstrapCss}" rel="stylesheet" />
<link href="${coreCss}" rel="stylesheet" />
</head>
 
<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container">
	<div class="navbar-header">
		<a class="navbar-brand" href="#">Management Portal</a>
	</div>
  </div>
</nav>
 
<div class="jumbotron">
  <div class="container">
	<h1>${title}</h1>
	</div>
</div>
 
<div class="container">
 
  <div class="row">
	<div class="col-md-4">
		<h2>Flight Portal</h2>
		<p>Search Flights</p>
		<p>
			<a class="btn btn-default" href="searchflights" role="button">View details</a>
		</p>
	</div>
	<div class="col-md-4">
		<h2>My Account</h2>
		<p>Login to view my Account</p>
		<p>
			<a class="btn btn-default" href="login" role="button">View details</a>
		</p>
		<%-- <form:form id="loginForm" method="post" action="login" modelAttribute="loginBean">
			<form:label path="username">Enter your user-name</form:label>
			<form:input id="username" name="username" path="username" /><br>
			<form:label path="username">Please enter your password</form:label>
			<form:password id="password" name="password" path="password" /><br>
			<input type="submit" value="Submit" />
		</form:form> --%>
	</div>
	<div class="col-md-4">
		<h2>Hotel Portal</h2>
		<p>Search for available hotels</p>
		<p>
			<a class="btn btn-default" href="searchhotels" role="button">View details</a>
		</p>
	</div>
  </div>
 
 
  <hr>
  <footer>
	<p>&copy; Airlines</p>
  </footer>
</div>
 
<spring:url value="/resources/core/js/hello.js" var="coreJs" />
<spring:url value="/resources/core/js/bootstrap.min.js" var="bootstrapJs" />
 
<script src="${coreJs}"></script>
<script src="${bootstrapJs}"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
 
</body>
</html>