<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Spring3Example</title>

</head>

<body>
	<form:form action="login.htm" commandName="loginForm">

		<table>

			<tr>

				<td>User Name:<FONT color="red"><form:errors
							path="userName" /></FONT></td>

			</tr>

			<tr>

				<td><form:input path="userName" /></td>

			</tr>

			<tr>

				<td>Password:<FONT color="red"><form:errors
							path="password" /></FONT></td>

			</tr>

			<tr>

				<td><form:password path="password" /></td>

			</tr>

			<tr>

				<td><input type="submit" value="Submit" /></td>

			</tr>

		</table>

	</form:form>

</body>
</html>