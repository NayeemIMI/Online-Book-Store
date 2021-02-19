<%-- 
    Document   : category
    Created on : Jan 15, 2021, 8:38:55 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Catagory</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="CSS/category.css">
</head>
<body>
    <div class="container">
        <h2>
                <a href="#">Home/</a> Category
        </h2>
        <h1>Books</h1>
        
    <table style="width:100%">
       <th>Book Name</th>
        <th>Writer/Author</th> 
        <th>Price</th>
        <th>Available</th>
        <c:forEach items="${allbooks}" var="book">
            <tr>
                <td>${book.bookName}</td>
                <td>${book.author}</td>
                <td>${book.price}</td>
                <td>${book.available}</td>
            </tr>
        </c:forEach>
        
        
    </table>
    </div>   
  
    
</body>
</html>
