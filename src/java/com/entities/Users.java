/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table
public class Users implements Serializable{
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    
    @Column
    private int contact;
    @Column
    private String username;
    @Column
    private String email;
    @Column
    private String address;
    @Column
    private String password;

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Users(int contact, String username, String email, String address, String password) {
        this.contact = contact;
        this.username = username;
        this.email = email;
        this.address = address;
        this.password = password;
    }
    
    public Users() {}
}
