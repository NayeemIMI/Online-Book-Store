/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.session.beans;

import javax.ejb.Local;

/**
 *
 * @author User
 */
@Local
public interface CartDaoLocal {
    
    void showCart();

    void placeOrder();
    
}
