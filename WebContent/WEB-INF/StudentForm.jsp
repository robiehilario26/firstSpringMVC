<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Submit Form:</title>
</head>
<body>
	<table>
		<tr>
			<td><h1>Student-Form Submit</h1></td>
		</tr>
		<tr>
			<td>Student name:</td>
			<td>${sf.sName}</td>
		</tr>
		<tr>
			<td>Student course:</td>
			<td>${sf.sCourse}</td>
		</tr>
		<tr>
			<td>Student number:</td>
			<td>${sf.sNum}</td>
		</tr>
		<tr>
			<td>Student skills:</td>
			<td>${sf.sSkills}</td>
		</tr>
		
		<tr>
			<td>Date</td>
			<td>${sf.sDate}</td>
		</tr>

		<tr>
			<td>Country: ${sf.studentAdress.country}</td>
			<td>City: ${sf.studentAdress.city}</td>
			<td>Street: ${sf.studentAdress.street}</td>
			<td>Pin: ${sf.studentAdress.pin}</td>
		</tr>
		<!-- 			<tr> -->
		<!-- 				<td><input type="submit" value="submit"></td> -->
		<!-- 			</tr> -->



	</table>
</body>
</html>