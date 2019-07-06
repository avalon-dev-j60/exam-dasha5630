/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.blog.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity(name = "Products")
public class Products implements Serializable{
    
    @Id
    @GeneratedValue 
    private long id;
    
    @Column(nullable = false)
    private String title;
    
    private String content;
    

    public Products(String title, String content) {
        this.title = title;
        this.content = content;
    }

    protected Products() {
    }
    

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    
    
    
    
}
