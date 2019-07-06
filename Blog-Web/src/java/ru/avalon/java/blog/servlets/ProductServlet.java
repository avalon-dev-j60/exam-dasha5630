/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.blog.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/products")
public class ProductServlet extends HttpServlet {
    
    private String[] products = {
        "Принтеры",
        "Комплектующие",
    };
    
    private static final String JSP = "/WEB-INF/pages/products.jsp";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {
        request.setAttribute("products", products);
        request.getRequestDispatcher(JSP).forward(request, responce);
     }
    
    
}
