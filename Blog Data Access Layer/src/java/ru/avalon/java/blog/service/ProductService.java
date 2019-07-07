/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.blog.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import ru.avalon.java.blog.entities.Products;

/**
 *
 * @author fgh
 */
@Stateless
public class ProductService {
    @PersistenceContext(unitName = "Blog-PU")
    EntityManager em;
    
    public void create(Products products) {
        em.persist(products);
                em.flush();
    }
    
}

