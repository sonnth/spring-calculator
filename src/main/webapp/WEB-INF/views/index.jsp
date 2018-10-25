<%--
  Created by IntelliJ IDEA.
  User: Jimmy
  Date: 10/25/2018
  Time: 8:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
  <form name="operator" method="post">
    <input type="text" placeholder="First number" name="first_number">
    <input type="text" placeholder="Second number" name="second_number"><br>
    <input type="submit" name="operator" value="+">
    <input type="submit" name="operator" value="-">
    <input type="submit" name="operator" value="*">
    <input type="submit" name="operator" value="/"><br>
    <h1>Result: ${result}</h1>
  </form>

  </body>
</html>
