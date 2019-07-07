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

/**
 *
 * @author fgh
 */
@WebServlet("/about")
public class AboutServlet extends HttpServlet {
   
    private String messege = "Целью создания нашей фирмы ООО «B-level-Printers» является сборка и продажа 3D-принтеров для отечественного потребителя, а также оказание услуг 3D-печати. ООО «B-level-Printers» занимается производством и торговлей в СЗФО, данное предприятие зарегистрировано как общество с ограниченной ответственностью.";

        private static final String JSP = "/WEB-INF/pages/about.jsp";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {
        request.setAttribute("about", messege);
        request.getRequestDispatcher(JSP).forward(request, responce);
     }   
}

