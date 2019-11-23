<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>All User Details</title>
</head>
<body>
<h1>
	List of Candidates and Tests
</h1>
<br/>
	<table border="1">
		<tr>
			<th>Test Date</th>
			<th>Assessment</th>
			<th>Test Marks</th>
			<th>Email Id</th>
			<th>Total Marks</th>
			<th>Result</th>
		</tr>
		<c:forEach items="${users}" var="user" varStatus="loop">
			<tr>
				<td><span id="testDate${loop.index+1}"><c:out value="${user.takenOn}"/></span></td>
				<td><span id="assessment${loop.index+1}"><c:out value="${user.assessment}"/></span></td>
				<td><span id="marks${loop.index+1}"><c:out value="${user.marks}"/></span></td>
				<td><span id="email${loop.index+1}"><c:out value="${user.email}"/></span></td>  
				<td><span id="totalMarks${loop.index+1}"><c:out value="${user.totalMarks}"/></span></td>  
				<td><span id="result${loop.index+1}"><c:out value="${user.result}"/></span></td>  
			</tr>
		</c:forEach>
	</table>
</body>
</html>
