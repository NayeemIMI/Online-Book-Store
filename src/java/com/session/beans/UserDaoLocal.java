/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.session.beans;

import com.entities.Users;
import javax.ejb.Local;

/**
 *
 * @author User
 */
@Local
public interface UserDaoLocal {
    
    void registration(Users user);
    
    void login(int contact, String password);

    void logout();
}
