<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>All User Details</title>
</head>
<body>
<h1>
	List of All Users
</h1>
<br/>
	<table border="1">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email ID</th>
			<th>User Type</th>
		</tr>
		<c:forEach items="${users}" var="user" varStatus="loop">
			<tr>
				<td><span id="firstName${loop.index+1}"><c:out value="${user.firstname}"/></span></td>
				<td><span id="lastName${loop.index+1}"><c:out value="${user.lastname}"/></span></td>
				<td><span id="email${loop.index+1}"><c:out value="${user.email}"/></span></td>
				<td><span id="userType${loop.index+1}"><c:out value="${user.userType}"/></span></td>  
			</tr>
		</c:forEach>
	</table>
</body>
</html>
