<%-- 
    Document   : profile
    Created on : 06.07.2019, 7:10:32
    Author     : fgh
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@taglib prefix="core" tagdir="/WEB-INF/tags/core/" %>

<form action="${pageContext.servletContext.contextPath}/profile"
      method="post">

    <p class="row gap-bottom">
        <input type="product"
               name="product"
               value="${param.product}"
               placeholder="product"
               required>
    </p>

    
    <p class="row">
        <button class="pull-right">
            add
        </button>
    </p>
    
</form>