<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="fr.wildcodeschool.githubtracker.model.Githuber" %><%--
  Created by IntelliJ IDEA.
  User: val
  Date: 16/07/19
  Time: 09:58
  To change this template use File | Settings | File Templates.
--%>
<%@include file="/header.jsp" %>
        <c:forEach items="${requestScope['users']}" var="user">
            <p>Nom : ${user.name}</p>
            <p>Email : ${user.email}</p>
            <p>Login : ${user.login}</p>
            <p>Id : ${user.id}</p>
            <p>Url : ${user.avatarUrl}</p>
            <br>
        </c:forEach>
    </body>
</html>
