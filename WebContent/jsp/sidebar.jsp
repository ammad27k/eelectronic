<%@ include file="/taglib/taglib.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="box">
    <div class="box-heading"><h2>Categories</h2></div>
    <div class="category-content">
        <div class="box-category">
            <ul>
                <s:if test="#session.sidebarMenu != null">
                    <s:iterator value="#session.sidebarMenu" var="brands">
                        <li>
                            <a href="${pageContext.request.contextPath}/phones/<s:property value="#brands.slug"/><s:property value="#brands.id"/>"><s:property value="#brands.title" /> <span class='dropdown'>+</span></a>
                        </li>
                    </s:iterator>
                </s:if>
            </ul>
        </div>

    </div>
</div>

