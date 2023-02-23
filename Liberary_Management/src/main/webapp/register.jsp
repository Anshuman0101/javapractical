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
<p class="text-center fs-3">Register</p>

<c:if test="${not empty msg }">
<p class="text-center text-success fs-4">${msg }</p>
<c:remove var="msg"/>
</c:if>
</div>
<div class="card-body">
<form action="UserRegister"method="post">
<div class="mb-3">
<lebal>Enter Full Name</lebal>
<input type="text"name="fullName"class="form-control">
</div>

<div class="mb-3">
<lebal>Email</lebal>
<input type="email"name="email"class="form-control">
</div>

<div class="mb-3">
<lebal>Password</lebal>
<input type="password"name="password"class="form-control">
</div>
<div class="mb-3">
<lebal>Stream</lebal>
<input type="text"name="stream"class="form-control">
</div>
<button class="btn btn-primary  col-md-12">Register</button>
</form>
</div>
</div>
</div>
</div>
</div>
</body>
</html>