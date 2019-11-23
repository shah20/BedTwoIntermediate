<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Spring Assessment</title>
</head>
<body>
<h1>
	Spring Assessment
</h1>
<br/>
<hr/>
<form action="evaluate/spring/test" method="post">
<b>Question 1: What is Spring?</b> <br/>
<input type="radio" name="Question1" value="J2EE App Server" id="Q1-Opt1"/>J2EE App Server
<input type="radio" name="Question1" value="J2EE App Development Framework" id="Q1-Opt2"/>J2EE App Development Framework
<input type="radio" name="Question1" value="Configuration Management Tool" id="Q1-Opt3"/>Configuration Management Tool
<input type="radio" name="Question1" value="Build Tool" id="Q1-Opt4"/>Build Tool
<br/><br/>
<b>Question 2: What is full form of IOC?</b> <br/>
<input type="radio" name="Question2" value="Inversion Of Control" id="Q2-Opt1"/>Inversion Of Control
<input type="radio" name="Question2" value="Interjection of Control" id="Q2-Opt2"/>Interjection of Control
<input type="radio" name="Question2" value="Internal Object Control" id="Q2-Opt3"/>Internal Object Control
<input type="radio" name="Question2" value="In-built Object Control" id="Q2-Opt4"/>In-built Object Control
<br/><br/>
<b>Question 3: What is full form of AOP?</b> <br/>
<input type="radio" name="Question3" value="Anticipation of Properties" id="Q3-Opt1"/>Anticipation of Properties
<input type="radio" name="Question3" value="Aspect Oriented Programming" id="Q3-Opt2"/>Aspect Oriented Programming
<input type="radio" name="Question3" value="Associated Object Programming" id="Q3-Opt3"/>Associated Object Programming
<input type="radio" name="Question3" value="Anti Object Programming" id="Q3-Opt4"/>Anti Object Programming
<br/><br/>
<b>Question 4: Which of the below is a spring container?</b> <br/>
<input type="radio" name="Question4" value="View Resolver" id="Q4-Opt1"/>View Resolver
<input type="radio" name="Question4" value="Application Context" id="Q4-Opt2"/>Application Context
<input type="radio" name="Question4" value="Handler Mapping" id="Q4-Opt3"/>Handler Mapping
<input type="radio" name="Question4" value="Dispatcher Servlet" id="Q4-Opt4"/>Dispatcher Servlet
<br/><br/>
<b>Question 5: Which is Spring's front Controller Implementation?</b> <br/>
<input type="radio" name="Question5" value="Bean Factory" id="Q5-Opt1"/>Bean Factory
<input type="radio" name="Question5" value="Class Path Application Context" id="Q5-Opt2"/>Class Path Application Context
<input type="radio" name="Question5" value="Application Context" id="Q5-Opt3"/>Application Context
<input type="radio" name="Question5" value="Dispatcher Servlet" id="Q5-Opt4"/>Dispatcher Servlet
<br/>
<input type="hidden" value="${email}" name="email" />
<input type="hidden" value="Spring-L1" name="assessment" />
<input type="submit" id="submitspring" value="submit Test" />
</form>
</body>
</html>