<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Hibernate Assessment</title>
</head>
<body>
<h1>
		Hibernate Assessment
</h1>
<br/>
<hr/>
<form action="evaluate/hibernate/test" method="post">
<b>Question 1: What is full form of ORM?</b> <br/>
<input type="radio" name="Question1" value="Object Random Memory" id="Q1-Opt1"/>Object Random Memory
<input type="radio" name="Question1" value="Object Relational Mismatch" id="Q1-Opt2"/>Object Relational Mismatch
<input type="radio" name="Question1" value="Object Relational Mapping" id="Q1-Opt3"/>Object Relational Mapping
<input type="radio" name="Question1" value="Object Random Mapping" id="Q1-Opt4"/>Object Random Mapping
<br/><br/>
<b>Question 2: In hibernate, based on directionality, what could be the mappings?</b> <br/>
<input type="radio" name="Question2" value="uni-directional & bi-directional" id="Q2-Opt1"/>uni-directional & bi-directional
<input type="radio" name="Question2" value="one-to-many & many-to-one" id="Q2-Opt2"/>one-to-many & many-to-one
<input type="radio" name="Question2" value="inheritance mapping" id="Q2-Opt3"/>inheritance mapping
<input type="radio" name="Question2" value="north & south mapping" id="Q2-Opt4"/>north & south mapping
<br/><br/>
<b>Question 3: In an Hibernate Application, which file would have datasource details?</b> <br/>
<input type="radio" name="Question3" value="hibernate mapping file" id="Q3-Opt1"/>hibernate mapping file
<input type="radio" name="Question3" value="configuration file" id="Q3-Opt2"/>configuration file
<input type="radio" name="Question3" value="Model/Entity class" id="Q3-Opt3"/>Model/Entity class
<input type="radio" name="Question3" value="HibernateUtil class" id="Q3-Opt4"/>HibernateUtil class
<br/><br/>
<b>Question 4: Which of the full form of HQL?</b> <br/>
<input type="radio" name="Question4" value="High-level Query language" id="Q4-Opt1"/>High-level Query language
<input type="radio" name="Question4" value="Hidden Query Language" id="Q4-Opt2"/>Hidden Query Language
<input type="radio" name="Question4" value="Hibernate Query Language" id="Q4-Opt3"/>Hibernate Query Language
<input type="radio" name="Question4" value="Hibernate Quadratic Language" id="Q4-Opt4"/>Hibernate Quadratic Language
<br/><br/>
<b>Question 5: In an Hibernate application, concurrency can be controlled by setting?</b> <br/>
<input type="radio" name="Question5" value="concurrency level" id="Q5-Opt1"/>concurrency level
<input type="radio" name="Question5" value="one-to-one-mapping" id="Q5-Opt2"/>one-to-one-mapping
<input type="radio" name="Question5" value="many-to-one bi-directional mapping" id="Q5-Opt3"/>many-to-one bi-directional mapping
<input type="radio" name="Question5" value="isolation levels" id="Q5-Opt4"/>isolation levels
<br/>
<input type="hidden" value="${email}" name="email" />
<input type="hidden" value="Hibernate-L1" name="assessment" />
<input type="submit" id="submithibernate" value="submit Test" />
</form>
</body>
</html>