/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.session.beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author User
 */
@Stateless
public class CartDao implements CartDaoLocal {

    @PersistenceContext
    private EntityManager em;
    
    @Override
    public void showCart() {
    }

    @Override
    public void placeOrder() {
    }
    
}
