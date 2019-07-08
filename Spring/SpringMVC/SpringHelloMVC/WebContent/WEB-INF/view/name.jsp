<html>
<head>

<title>Hello Spring MVC World</title>

</head>
<body>

<h2>Hello Spring MVC World!</h2>

<hr>

<form action="./hello" method="get">

<label>Enter your name:</label>
<input type="text" placeholder="name via param" name="name"/>
<input type="submit" value="Submit via param" />

</form>

<form action="./hellomodel" method="get">

<label>Enter your name:</label>
<input type="text" placeholder="name via model" name="name"/>
<input type="submit" value="Submit via Model" />

</form>

</body>
</html>