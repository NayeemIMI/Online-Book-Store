<%-- 
    Document   : registration
    Created on : Jan 15, 2021, 6:59:08 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Register</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="CSS/register.css">
    <style>

</style>
</head>
    <body>
        <form class="modal-content" action="userController" method="POST">
    <div class="container">
      <h1>Register</h1>
      <p>Please fill in this form to create an account.</p>
      <hr>
       <label for="name"><b>Name</b></label>
      <input type="text" placeholder="Enter Name" name="username" required>
      
      <label for="email"><b>Email</b></label>
      <input type="text" placeholder="Enter Email" name="email" required>
      
       <label for="contact"><b>Contact</b></label>
      <input type="text" placeholder="Enter Contact" name="contact" required>
      
       <label for="address"><b>Address</b></label>
      <input type="text" placeholder="Enter Address" name="address" required>
      
      <label for="password"><b>Password</b></label>
      <input type="password" placeholder="Enter Password" name="password" required>

      <label for="psw-confirm"><b>Repeat Password</b></label>
      <input type="password" placeholder="Confirm Password" name="psw-confirm" required>
      
     

      <div class="clearfix">
          <button type="submit" class="signupbtn" name="action" value="Registration">Register</button>
      </div>
    </div>
  </form>



    </body>
</html>
