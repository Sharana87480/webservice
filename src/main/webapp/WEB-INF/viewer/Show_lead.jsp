<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Lead</title>
</head>
<body>
       <h2>Show Leads</h2>
   
          <table>
                 <tr>
                     <th>Name</th>
                     <th>City</th>
                 </tr>
                 <c:forEach var="l" items="${lead}">
                 
                 <tr>
                     <td>${l.name}</td>
                     <td>${l.city}</td>
                 </tr>
                 
                 </c:forEach>
         </table>
</body>
</html>