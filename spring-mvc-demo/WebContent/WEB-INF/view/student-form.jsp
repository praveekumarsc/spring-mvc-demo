<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>Student Registration form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		
		First Name:<form:input path="firstName"/>
		<br><br>	
		Last Name:<form:input path="lastName"/>
		<br><br>
		Country: <form:select path="country">
					<form:options items="${student.countryOptions}" />
				 </form:select>
		<br><br>
		Favorite Language:
		Java<form:radiobutton path="favoritelanguage" value="java"/>
		PHP<form:radiobutton path="favoritelanguage" value="php"/>
		Python<form:radiobutton path="favoritelanguage" value="python"/>
		<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>