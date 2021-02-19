/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.entities.Users;
import com.session.beans.UserDaoLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class userController extends HttpServlet {

    @EJB
    private UserDaoLocal userDaoLocal;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        
        String contactStr = request.getParameter("contact");
        int contact = Integer.parseInt(contactStr);
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String address = request.getParameter("address");
        String password = request.getParameter("password");
        
        Users user = new Users(contact, username, email, address, password);
        
        
        if("Login".equalsIgnoreCase(action)){
            userDaoLocal.login(contact, password);
        }else if("Registration".equalsIgnoreCase(action)){
            userDaoLocal.registration(user);
        }else if("Logout".equalsIgnoreCase(action)){
            userDaoLocal.logout();
        }
//            userDaoLocal.registration(user);
        
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
