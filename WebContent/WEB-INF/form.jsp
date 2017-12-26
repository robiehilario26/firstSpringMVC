<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form</title>
</head>
<body>

<h1>Register Name and Course</h1>
<form action="/FirstSpringMVC/submitForm.html" method="Post" >
Enter name: <input type="text" name="userName"/><br>
Enter course: <input type="text" name="userCourse"/><br>
<input type="submit" value="submit form"/>
</form>
<br>
<br>
<h1>Register Name and Course using Model Annotation</h1>
<form action="/FirstSpringMVC/submitFormModel.html" method="Post" >
Enter name: <input type="text" name="studentName"/><br>
Enter course: <input type="text" name="studentCourse"/><br>
<input type="submit" value="submit form"/>
</form>
</body>
</html>