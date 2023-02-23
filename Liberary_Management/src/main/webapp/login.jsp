<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="components/all_css.jsp"%>
<style type="text/css">
.card-sh{
box-shadow: 0 0 6px 0 rgba(0 ,0,0,10);
}
</style>
</head>
<body class="bg-light">
<%@include file="components/navbar.jsp"%>
<div class="container p-5">
<div class="row">
<div class="col-md-6 offset-md-3">
<div class="card card-sh">
<div class="card-header">
<p class="text-center fs-3">Login</p>
<c:if test="${not empty msg }">
<p class="text-center text-danger fs-4">${msg }</p>
<c:remove var="msg"/>
</c:if>
</div>
<div class="card-body">
<form action="login"method="post">


<div class="mb-3">
<lebal>Email</lebal>
<input type="email"name="email"class="form-control">
</div>

<div class="mb-3">
<lebal>Password</lebal>
<input type="password"name="password"class="form-control">
</div>

<button class="btn btn-primary  col-md-12">Login</button>
<div class="text-center mt-2">Don't have account<a href="register.jsp" class="text-decoration-none">  Create one</a></div>
</form>
</div>
</div>
</div>
</div>
</div>
</body>
</html>