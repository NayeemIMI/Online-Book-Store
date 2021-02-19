<%-- 
    Document   : bookDetails
    Created on : Jan 15, 2021, 8:34:21 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="CSS/book.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet">
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
    
    <div class="container">
        
    <div>
       <p class="headAddress"><a style="color: dimgray; text-decoration: none;" href="#">Home</a></p>
       <p class="headAddress" style="color: dimgray; text-decoration: none; ">/</p>
       <p class="headAddress"><a style="color: dimgray; text-decoration: none;" href="#">Category</a></p>
       <p class="headAddress" style="color: dimgray; text-decoration: none;">/</p>
       <p class="headAddress"><a style="color: dimgray; text-decoration: none;" href="#">BookDetail</a></p>
    </div>
        
    <div class="row" style="margin-top: 1.5rem;">
        <div class="col-md-5" style="align-items: center;">
            <img class="mx-auto d-block" src="https://images-na.ssl-images-amazon.com/images/I/41TUQh5crpL._SX328_BO1,204,203,200_.jpg">
        </div>
        <div class="col-md-7" style = "margin-top: 4rem;">
            <h2>Competitive Programming 3</h2>
            <h3>Steven Halim, Felix Halim</h3>
            <span> 4.5/5</span>
            <div class="row"  style="margin-top: 15px;">
            <div class="col-md-4">
                <span>Give a Rating : </span>
            </div>
            <div class="col-md-8">
            <form>
            <div class="rating">
            <input id="star5" name="star" type="radio" value="5" class="radio-btn hide" />
            <label for="star5" >☆</label>
            <input id="star4" name="star" type="radio" value="4" class="radio-btn hide" />
            <label for="star4" >☆</label>
            <input id="star3" name="star" type="radio" value="3" class="radio-btn hide" />
            <label for="star3" >☆</label>
            <input id="star2" name="star" type="radio" value="2" class="radio-btn hide" />
            <label for="star2" >☆</label>
            <input id="star1" name="star" type="radio" value="1" class="radio-btn hide" />
            <label for="star1" >☆</label>
            <div class="clear"></div>
        </div>
                
    </form>
    </div>
    </div>
            <div class="row no-gutters">
            <div class="col-md-2"  style="margin-right: 0; padding-right: 0;">
                <h4>Price :</h4>
                </div>
            <div class="col-md-1"  style="margin-right: 0; padding-right: 0; text-align: end;">
                <span>Tk. </span>
                </div>
                <div class="col-md-6" >
                    <span>100</span>
                </div>
            </div>
            
            <form class="row" style="margin-top: 1.5rem;">
                <div class="col-md-3" style="margin-right: 0; padding-right: 0;">
                    <input  id="addtocart" type="submit" id="addtocart" value="ADD TO CART">
                </div>
                <div class="col-md-8" style="margin-left: 0; padding-left: 0;">
                    <input  type="number" value="1" min="1" class="input" style="padding:0.5rem; width:100px; height: 50px; padding-left: 15px;">
                </div>
            </form>
        </div>
        
    </div>
</div>
</body>
</html>