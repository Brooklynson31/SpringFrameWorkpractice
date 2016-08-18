<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<script src = "https://code.jquery.com/jquery-3.1.0.min.js" type="text/javascript"></script>
<script type="text/javascript">
$(function() {
	$("#submitBtn").click(function() {
		var password = $("#password").val();
		var confirmpassword = $("#confirmpassword").val();
	
	if(password == confirmpassword)
	{
		$("#user").submit();
	}
	else
	{
		alert("passwords do not match");
		return false;
	}
	
});
	
	
 });
</script>
	<title>Home</title>
</head>
<body>
<h1>
	User Registration  
</h1>


<form:form commandName="user" method = "POST">  

 Username: <form:input path="username"/><br/><br/>
 Password: <form:password path="password"/><br/><br/>
 Confirm Password: <input type="password" id="confirmpassword" /><br/><br/>
 Account Type: <form:radiobuttons path="accountType" items="${MySpecialAccountTypes}"/><br/><br/>
 Do you Agree to <br/> Terms of Service? <form:checkbox path="userAgreement" label="Agree"/><br/><br/>
 Countries visited: <form:checkboxes path="visitedCountires" label="Countries Visted" items="${visitCountry}"/><br/><br/>
<input type="submit" id="submitBtn" value="Submit"/>
 
</form:form>
 
</body>
</html>
