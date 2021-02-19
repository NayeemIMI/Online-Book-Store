<%-- 
    Document   : login
    Created on : Jan 15, 2021, 7:28:48 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
       
        <title>Login</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="login.css">
        <link rel="stylesheet" href="CSS/login.css" type="text/css"/>

</head>
<body>

    <form class="modal-content" action="userController" method="POST">
    
    <div class="container">
        <h1>Enter Username and Password</h1>
      <label for="uname"><b>Username</b></label>
      <input type="text" placeholder="Enter Username" name="username" required>

      <label for="psw"><b>Password</b></label>
      <input type="password" placeholder="Enter Password" name="password" required>
        
      <button type="submit" name="action" value="Login">Login</button>
   
    </div>
    
  </form>

</body>
</html>