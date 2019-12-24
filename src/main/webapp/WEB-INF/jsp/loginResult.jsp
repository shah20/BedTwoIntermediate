<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>

<head>
	<title>${title}</title>
</head>

<body>
	<h1 id="msg">
		${msg}
	</h1>
	<br />
	<c:if test="${valid}">
		<c:if test="${userType=='candidate'}">
			<form action="../springAssessment.html" method="post">
				<input type="hidden" value="${email}" name="email" />
				<input type="submit" id="submitspring" value="Spring Assessment" />
				<!-- <a href="../springAssessment.html">Spring Assessment</a> <br/> -->
			</form>
			<form action="../hibernateAssessment.html" method="post">
				<input type="hidden" value="${email}" name="email" />
				<input type="submit" id="submithibernate" value="Hibernate Assessment" />
				<!-- <a href="hibernateAssessment.html">Hibernate Assessment</a><br/> -->
			</form>
		</c:if>
		<c:if test="${userType=='admin'}">
			<a href="../users/all">View list of all candidates</a><br />
			<a href="../tests/all">View list of all tests taken</a><br />
		</c:if>
	</c:if>
	<a href="/" id="index">${linkText}</a>
</body>

</html>