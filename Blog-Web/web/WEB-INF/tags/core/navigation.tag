<%-- 
    Document   : navigation
    Created on : 29.06.2019, 14:25:54
    Author     : JAVA
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@taglib prefix="core" tagdir="/WEB-INF/tags/core/" %>

<fmt:setBundle basename="resources.labels"/>

<nav>
    <ul>
        <li>
            <c:choose>
                <c:when test="${not empty sessionScope.user}">
                    <core:link location="/profile">                                      
                        <jsp:attribute name = "title">
                             <fmt:message key="menu.profile"/>
                         </jsp:attribute>
                         </core:link>
                </c:when>
                
                <c:otherwise>
                </c:otherwise>
            </c:choose>
        </li>
        <li>
            <core:link location="/">
                
                <jsp:attribute name = "title">
                    <fmt:message key="menu.home"/>
                </jsp:attribute>
                </core:link>
        </li>
        <li>
            <core:link location="/about">
                
                <jsp:attribute name = "title">
                    <fmt:message key="menu.about"/>
                </jsp:attribute>
                </core:link>
        </li>
        <li>
            <core:link location="/services">
                
               <jsp:attribute name = "title">
                    <fmt:message key="menu.services"/>
                </jsp:attribute>
                </core:link>
        </li>
        
        <li>
            <core:link location="/products">
                
               <jsp:attribute name = "title">
                    <fmt:message key="menu.products"/>
                </jsp:attribute>
                </core:link>
        </li>
        
        
        
        <li class="pull-right">
            <c:choose>
                <c:when test="${not empty sessionScope.user}">
                    <core:link location="/sign-out">
                                        
                        <jsp:attribute name = "title">
                             <fmt:message key="menu.sign-out"/>
                         </jsp:attribute>
                         </core:link>
                </c:when>
                
                <c:otherwise>
                       <core:link location="/sign-in">
                                        
                        <jsp:attribute name = "title">
                             <fmt:message key="menu.sign-in"/>
                         </jsp:attribute>
                         </core:link>
                </c:otherwise>
            </c:choose>    

        </li>
    </ul>
</nav>