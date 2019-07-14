<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>

<title>Spring Tags demo</title>

</head>
<body>

<h2>Spring Tags demo!</h2>

<hr>

<form:form action="./register" modelAttribute="student">

<label>Enter your name:</label>
<form:input type="text" placeholder="First name" path="firstName"/>
<form:errors path="firstName"/>
<form:input type="text" placeholder="Last name" path="lastName"/>
<form:errors path="lastName"/>
<br/><br/>
<label>Country of origin: </label><form:select path="country">

<form:options items="${countryOpts}"/>

</form:select>

<br/><br/>

Choose your native language:
<form:radiobuttons items="${student.radioLang}" path="nativeLanguage"/>

<br/><br/>
Choose your OS: 
<form:checkboxes items="${student.osSelect}" path="osOpts"/>

<br/><br/>






<input type="submit" value="Submit" />


</form:form>

</body>
</html>