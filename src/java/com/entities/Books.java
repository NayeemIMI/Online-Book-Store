/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table
@NamedQueries(@NamedQuery(name = "Books.getAll", query = "SELECT e FROM Books e"))
public class Books {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    
    @Column
    private int isbn;
    @Column
    private String bookName;
    @Column
    private String author;
    @Column
    private int rating;
    @Column
    private int price;
    @Column
    private int available;

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public Books(int isbn, String bookName, String author, int rating, int price, int available) {
        this.isbn = isbn;
        this.bookName = bookName;
        this.author = author;
        this.rating = rating;
        this.price = price;
        this.available = available;
    }
    
    public Books() {}
}

