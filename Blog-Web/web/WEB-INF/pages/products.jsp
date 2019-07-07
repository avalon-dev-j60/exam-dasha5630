<%-- 
    Document   : product
    Created on : 05.07.2019, 1:25:31
    Author     : fgh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="core" tagdir="/WEB-INF/tags/core/" %>

<core:layout title="Productds">
    <c:choose>
        <c:when test="${not empty products}">
    
    <c:forEach items="${products}" var="item">
        
     
        <div class="row">
             ${item}
        </div>
       
        
    </c:forEach>
        </c:when>
        <c:otherwise>
            <p>
                no products
            </p>
       </c:otherwise>
                </c:choose>
</core:layout>
