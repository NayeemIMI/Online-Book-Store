/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.session.beans;

import com.entities.Users;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author User
 */
@Stateless
public class UserDao implements UserDaoLocal {

    @PersistenceContext
    private EntityManager em;
    
    @Override
    public void registration(Users user) {
        em.persist(user);
    }
    
    @Override
    public void login(int contact, String password) {
    }
    
    @Override
    public void logout() {
    }
}
