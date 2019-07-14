<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>

<title>Spring Tags demo</title>

</head>
<body>

<h2>Spring Tags demo!!</h2>

<hr>

Hello, ${student.firstName} ${student.lastName} . Nice to see you here! 

<br/><br/>

Country of origin: ${student.country}
<br/><br/>
Native Language: ${student.nativeLanguage}
<br/><br/>
OS Choice:
<ul>
<c:forEach var="os" items="${student.osOpts}">
<li>${os}</li>
</c:forEach>
</ul>
</body>
</html>