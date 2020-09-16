<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Please Log In" />
    </jsp:include>
</head>
<body>
<jsp:include page="partials/navbar.jsp" />
<div class="container">
    <h1>Please Log In</h1>
    <form action="/login" method="POST">
        <div class="form-group">
            <label for="username">Username</label>
            <input id="username" name="username" class="form-control" type="text">
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input id="password" name="password" class="form-control" type="password">
        </div>
        <input type="submit" class="btn btn-primary btn-block" value="Log In">
    </form>
    <% if(request.getParameter("username") == null || request.getParameter("password") == null ) {

    } else if(request.getParameter("username").equalsIgnoreCase("admin") && request.getParameter("pass").equalsIgnoreCase("password")) {
            response.sendRedirect("/profile.jsp");
    } else {
        response.getWriter().println("<h1>incorrect input</h1>");
    } %>

</div>
</body>
</html>