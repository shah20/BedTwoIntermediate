<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Online Assessment - Home Page</title>
</head>
<body>
<h1>
	Welcome to Online Assessment
</h1>

<h2>Login</h2>
<form action="login/do" method="post">
	<table>
		<tr>
			<td>Email ID</td>
			<td><input type="email" id="email" name="email" required/></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="password" id="password" name="password" required/></td>
		</tr>
		<tr>
			<td><input type="submit" id="login" value="LOGIN" /></td>
			<td></td>
        </tr>
        <tr>
            <td>New User?</td>
            <td>
                <c:set var="registerURL" value="/register.html" />
                <a href="/register.html" id="index">register here</a>
                <!-- register here -->
            </td>
        </tr>
	</table>
</form>
</body>
</html>
