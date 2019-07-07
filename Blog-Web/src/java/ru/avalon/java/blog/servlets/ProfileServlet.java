/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.blog.servlets;

import java.io.IOException;
import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import ru.avalon.java.blog.entities.Products;
import ru.avalon.java.blog.exception.ValidationException;
import ru.avalon.java.blog.helpers.RedirectHelper;
import ru.avalon.java.blog.service.ProductService;
import ru.avalon.java.blog.service.UserService;

/**
 *
 * @author fgh
 */
@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {
    
        @EJB ProductService productService;
    
    @Inject HttpSession session;
   
        private static final String JSP = "/WEB-INF/pages/profile.jsp";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {
        request.getRequestDispatcher(JSP).forward(request, responce);
     }   
    
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String title = request.getParameter("title");      
        productService.create(new Products(0, title, title));
        
        request.setAttribute("products", title);
        request.getRequestDispatcher("/WEB-INF/pages/products.jsp").forward(request, response);

    }
}