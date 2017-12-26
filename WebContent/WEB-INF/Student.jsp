<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fill-up Student Form</title>
</head>
<body>
<a href="/FirstSpringMVC/studentForm.html?siteLanguage=en">English</a> |
<a href="/FirstSpringMVC/studentForm.html?siteLanguage=fr">Tagalog</a>
	<form:errors path="sf.*"/>
		<form action="/FirstSpringMVC/studentFormSubmit.html" method="Post">
			<table>
				<tr>
					<td><h1>Student-Form</h1></td>
				</tr>
				<tr>
					<td><spring:message code="label.studentName"/>:</td>
					<td><input type="text" name="sName"></td>
				</tr>
				<tr>
					<td><spring:message code="label.studentCourses"/>:</td>
					<td><input type="text" name="sCourse"></td>
				</tr>
				<tr>
					<td><spring:message code="label.studentNumber"/>:</td>
					<td><input type="text" name="sNum"></td>
				</tr>
				<tr>
					<td><spring:message code="label.studentSkills"/>:</td>
					<td><select name="sSkills" multiple>
							<option value="Java Core">Java Core</option>
							<option value="Spring Core">Spring Core</option>
							<option value="Spring MVC">Spring MVC</option>
					</select></td>
				</tr>
				<tr>
					<td><spring:message code="label.date"/>:</td>
					<td><input type="date" name="sDate"></td>
				</tr>
				<tr>
					<td><spring:message code="label.country"/>: <input type="text" name="studentAdress.country"></td>
					<td><spring:message code="label.city"/>: <input type="text" name="studentAdress.city"></td>
					<td><spring:message code="label.street"/>: <input type="text" name="studentAdress.street"></td>
					<td><spring:message code="label.pin"/>: <input type="text" name="studentAdress.pin"></td>
				</tr>

				<tr>
					<td><input type="submit" value="submit"></td>
				</tr>



			</table>
		</form>
</body>
</html>