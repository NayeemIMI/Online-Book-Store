<%-- 
    Document   : cart
    Created on : Jan 15, 2021, 8:36:55 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<header>
    <link rel="stylesheet" href="CSS/details_cart.css">
</header>
<body>
    <div  style="padding-left: 6rem; padding-top: 4rem;">
       <p class="headAddress"><a style="color: dimgray;" href="#">Home</a></p>
       <p class="headAddress" style="color: dimgray;">/</p>
       <p class="headAddress"><a style="color: dimgray;" href="#">Cart</a></p>
    </div>
    <h2 style="padding-left: 6rem">Cart Details</h2>
<div class="container" style="padding: 6rem; padding-top: 0;">
                
                <div class="table-responsive">
				<table class="table table-bordered" style="border: 1px solid black; border-collapse:collapse; text-align:center;" width ="100%">
					<tr>
						<th width="30%" style="border: 1px solid black; padding: 8px; font-size: 18px;">Book Name</th>
                        <th width="30%" style="border: 1px solid black; padding: 8px;font-size: 18px;">Author Name</th>
						<th width="20%" style="border: 1px solid black; padding: 8px;font-size: 18px;">Quantity</th>
						<th width="20%" style="border: 1px solid black; padding: 8px;font-size: 18px;">Price</th>
						
					</tr>
					
					<tr>
						<td style="border: 1px solid black; padding: 4px; font-size: 15px;">Book1</td>
						<td style="border: 1px solid black; padding: 4px; font-size: 15px;">Humayun Ahmed</td>
						<td style="border: 1px solid black; padding: 4px; font-size: 15px;">1</td>
						<td style="border: 1px solid black; padding: 4px; font-size: 15px;">120</td>
					</tr>
						
				</table>
			</div>
            <div style="margin-top: 2rem;margin-bottom: 2rem;">
            <h2 class="headAddress">Total Price: </h2>
            <h3 id="totalAmount" class="headAddress" style="align-self: center">120</h3>
            </div>
    
            <a class="continue" href="#">Continue To Buy</a>
</div>
</body>
</html>