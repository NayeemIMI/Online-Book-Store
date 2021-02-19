<%-- 
    Document   : landing
    Created on : Jan 15, 2021, 8:40:47 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Home | BookWish</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="CSS/Landing.css">
        <!--<div class="bg-img">
            <image class="imge" src="https://images7.alphacoders.com/697/thumb-1920-697523.jpg" image height="836px">
            
        </div>-->
    </head>
    
    <body>
        <div style="background-image: url('https://images7.alphacoders.com/697/thumb-1920-697523.jpg');" style="width:100%">
        <div class="tonav">
            
            <a class="websitefont" style="font-family:'Lucida Handwriting'" > BookWish</a>
            <a class="logclass" href="#Logo" style="margin-left:40px"> <img class="logo" src="C:/Users/DELL/Downloads/BookWishLogo.jpg" width="40px"></a>
            <div class="dropdown">
            
        
<!--                <div class="dropdown-content">
                    <a href="#Engineering">Engineering</a>
                    <a href="#Programming">Programming</a>
                    <a href="#English">English</a>
                    <a href="#Business">Business</a>
                    <a href="#Story">Story</a>
                </div>-->


<form action="bookController" method="POST">
    <button type="submit" class="books" name="action" value="AllBooks">All Books</button>
</form>


            </div>
            
            <a class="active" href="#Home">Home <i class="material-icons" style="font-size:16px;">home</i></a>
        <a class="cart" href="#Cart">Cart <i class="material-icons" style="font-size:16px;">shopping_cart</i></a>
            
            
            
            
  <div class="register">
    <a href="#Register">Register</a>
    <a href="#Login">Login</a>
  </div>
  <div class="search-container">
    <form style="margin-top:3px" action="/action_page.php">
      <input type="text" placeholder="Search by book name" name="search" style="width:270px">
      <button type="#submit" style="background-color:#98AFC7"><i class="fa fa-search" style="margin-bottom:10px"></i></button>
      
    </form>
  </div>
            
</div>
            <br>
            <br>
            
        
        <!--<div class="topnav">
            
            <div class="dropdown">
            <button class="dropbtn" href="#Category">Category <i class="fa fa-caret-down"></i></button>
        
                <div class="dropdown-content">
                    <a href="#Engineering">Engineering</a>
                    <a href="#Programming">Programming</a>
                    <a href="#English">English</a>
                    <a href="#Business">Business</a>
                    <a href="#Story">Story</a>
                </div>
            </div>
        
        <a class="active" href="#Home">Home <i class="material-icons" style="font-size:16px;">home</i></a>
        <a class="cart" href="#Cart">Cart <i class="material-icons" style="font-size:16px;">shopping_cart</i></a>
        </div>-->
        
        <div>
        <div class="offerborder">
        <div class="slideshow-container" style="width:100%">

            <div class="mySlides fade">
                <!--<div class="numbertext">1 / 3</div>-->
                <a href="#Offer1"> <img src="https://image.freepik.com/free-photo/abstract-pink-red-background-christmas-valentines-layout-des_1258-262.jpg" style="width:80%"></a>
                <!--<div class="text">Offers</div>-->
            </div>

            <div class="mySlides fade">
                <!--<div class="numbertext">2 / 3</div>-->
                <a href="#Offer2"> <img src="https://image.freepik.com/free-photo/card-soft-template-paper-report_1258-167.jpg" style="width:80%"> </a>
                <!--<div class="text" style="color:yellow">Offers</div>-->
            </div>
            
            <!--<div class="mySlides fade">
                <div class="numbertext">3 / 3</div>
                <a href="Offer3"> <img src="http://www.pngmagic.com/product_images/solid-light-purple-background.jpg" style="width:100%"> </a>
                <div class="text">Offers</div>
            </div>-->
            <div class="text">Offers</div>

        </div>
        </div>
        <div style="text-align:center">
            <span class="dot"></span> 
            <span class="dot"></span> 
            <!--<span class="dot"></span>-->
        </div>
        <script>
var slideIndex = 0;
showSlides();

function showSlides() {
  var i;
  var slides = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("dot");
  for (i = 0; i < slides.length; i++) {
    slides[i].style.display = "none";  
  }
  slideIndex++;
  if (slideIndex > slides.length) {slideIndex = 1}    
  for (i = 0; i < dots.length; i++) {
    dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block";  
  dots[slideIndex-1].className += " active";
  setTimeout(showSlides, 2500); // Change image every 2 seconds
}
</script>
    </div>
        
        
        
        <div class="row">
            <div class="rowset">
            <div class="column1">
                
                <div class="slideshow-container2" style="width:200px">
                <div class="text2" style="color:black">Best Selling Books</div>

            <div class="mySlides2 fade2">
                <!--<div class="numbertext2">1 / 3</div>-->
                <a href="#BestSell1"> <img src="https://www.w3schools.com/w3images/falls2.jpg" style="width:100%"></a>
                <!--<div class="text2" style="color:greenyellow">Best Selling Books</div>-->
            </div>

            <div class="mySlides2 fade2">
                <!--<div class="numbertext2">2 / 3</div>-->
                <a href="#BestSell2"> <img src="https://www.w3schools.com/w3images/mountainskies.jpg" style="width:100%"> </a>
                <!--<div class="text2" style="color:greenyellow">Best Selling Books</div>-->
            </div>
            
            <div class="mySlides2 fade2">
                <!--<div class="numbertext2">3 / 3</div>-->
                <a href="#BestSell3"> <img src="https://www.w3schools.com/w3images/ocean.jpg" style="width:100%"> </a>
                <!--<div class="text2" style="color:greenyellow">Best Selling Books</div>-->
            </div>
            </div>
        
            <div style="text-align:center">
            <span class="dot2"></span> 
            <span class="dot2"></span> 
            <span class="dot2"></span>
        </div>
        <script>
var slideIndex2 = 0;
showSlides2();

function showSlides2() {
  var i;
  var slides2 = document.getElementsByClassName("mySlides2");
  var dots2 = document.getElementsByClassName("dot2");
  for (i = 0; i < slides2.length; i++) {
    slides2[i].style.display = "none";  
  }
  slideIndex2++;
  if (slideIndex2 > slides2.length) {slideIndex2 = 1}    
  for (i = 0; i < dots2.length; i++) {
    dots2[i].className = dots2[i].className.replace(" active", "");
  }
  slides2[slideIndex2-1].style.display = "block";  
  dots2[slideIndex2-1].className += " active";
  setTimeout(showSlides2, 3900); // Change image every 3.5 seconds
}
</script>
            
            </div>
            </div>
                
            
                

            
            <div class="rowset">
            <div class="column2">
                <div class="slideshow-container3" style="width:130px">
                    <div class="text3" style="color:black">New Arrivals</div>
                    
            <div class="mySlides3 fade3">
                <!--<div class="numbertext3">1 / 3</div>-->
                <a href="#NewArrive1"> <img src="https://cdn.pixabay.com/photo/2017/01/18/18/03/filter-1990470_1280.jpg" style="width:100%"></a>
                <!--<div class="text3" style="color:black">New Arrivals</div>-->
            </div>

            <div class="mySlides3 fade3">
                <!--<div class="numbertext3">2 / 3</div>-->
                <a href="#NewArrive2"> <img src="https://cdn.pixabay.com/photo/2017/02/21/08/12/filter-2085021_1280.jpg" style="width:100%"> </a>
                <!--<div class="text3" style="color:black">New Arrivals</div>-->
            </div>
            
            <div class="mySlides3 fade3">
                <!--<div class="numbertext3">3 / 3</div>-->
                <a href="#NewArrive3"> <img src="https://cdn.pixabay.com/photo/2016/08/21/08/04/blue-1609122_1280.jpg" style="width:100%"> </a>
                <!--<div class="text3" style="color:black">New Arrivals</div>-->
            </div>
            </div>
        
            <div style="text-align:center">
            <span class="dot3"></span> 
            <span class="dot3"></span> 
            <span class="dot3"></span>
        </div>
        <script>
var slideIndex3 = 0;
showSlides3();

function showSlides3() {
  var i;
  var slides3 = document.getElementsByClassName("mySlides3");
  var dots3 = document.getElementsByClassName("dot3");
  for (i = 0; i < slides3.length; i++) {
    slides3[i].style.display = "none";  
  }
  slideIndex3++;
  if (slideIndex3 > slides3.length) {slideIndex3 = 1}    
  for (i = 0; i < dots3.length; i++) {
    dots3[i].className = dots3[i].className.replace(" active", "");
  }
  slides3[slideIndex3-1].style.display = "block";  
  dots3[slideIndex3-1].className += " active";
  setTimeout(showSlides3, 3000); // Change image every 3.5 seconds
}
</script>
            </div>
            </div>
        </div>
            <br>
            <br>
            <br>
            <br>
        
        
            
            
            
            
            
            
            
            
            
        
        
      <div class="row2">
          
          
          
  <div class="rowset2">
    <h2 style="color:white">About Us</h2>
    <p>"BookWish" is an online bookstore where you can find variety of books. We are keenly responsive to our customer’s demand, suggestions and sharing responsibilities towards bringing book lovers under a single umbrella. We offer special offers and discounts and information about new arrival. And our motto is to provide the best quality books with the lowest possible price.</p>
  </div>
          <div class="vl"></div>
          <div class="rowset2">
              <div class="contact">
    <h2 style="color:white">Contact Us</h2>
    <p>Cell: +8801739485517</p>
    <p>Email: bookwish@gmail.com</p>
    <p>Address: Mirpur Cantonment, Dhaka- 1216</p>
    </div>
  </div>
  
          
</div>
            
            <br>
            <br>
            <br>
            
            
            
            
            <div class="bottomnav">
            
                <a class="CopyrightFont">Copyright © 2021 BookWish. All rights Reserved</a>
  
            </div>
            
            
</div>
    </body>
    
</html>
