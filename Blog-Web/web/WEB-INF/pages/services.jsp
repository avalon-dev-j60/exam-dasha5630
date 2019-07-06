<%-- 
    Document   : product
    Created on : 05.07.2019, 1:25:31
    Author     : fgh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="core" tagdir="/WEB-INF/tags/core/" %>

<core:layout title="Services">
    <c:choose>
        <c:when test="${not empty services}">
    
    <c:forEach items="${services}" var="item">
        
     
        <div class="row">
             ${item}
        </div>
       
        
    </c:forEach>
        </c:when>
        <c:otherwise>
            <p>
                no services
            </p>
       </c:otherwise>
                </c:choose>
</core:layout>
