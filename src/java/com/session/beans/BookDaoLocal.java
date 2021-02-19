/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.session.beans;

import com.entities.Books;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author User
 */
@Local
public interface BookDaoLocal {
    
    void addToCart(int isbn);

    void bookDetail(int isbn);

    List<Books> searchBook();

    List<Books> showAllBook();
    
}
