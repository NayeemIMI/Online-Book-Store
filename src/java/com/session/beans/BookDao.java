/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.session.beans;

import com.entities.Books;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author User
 */
@Stateless
public class BookDao implements BookDaoLocal {

    @PersistenceContext
    private EntityManager em;
    
    @Override
    public void addToCart(int isbn) {
    }

    @Override
    public void bookDetail(int isbn) {
    }

    @Override
    public List<Books> searchBook() {
        return null;
    }

    @Override
    public List<Books> showAllBook() {
        return em.createNamedQuery("Books.getAll").getResultList();
    }
    
    
    
}
