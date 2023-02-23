<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="../components/all_css.jsp"%>
<style type="text/css">
.card-sh{
box-shadow: 0 0 6px 0 rgba(0 ,0,0,10);
}
</style>
</head>
<body class="bg-light">
<c:if test="${empty loginUser }">
<c:redirect url="../login.jsp"></c:redirect>
</c:if>
<%@include file="../components/navbar.jsp"%>

<div class="container p-3 ">
<div class="row">
<div class="col-md-6 offset-md-3">
<div class="card card-sh">
<div class="card-header text-center">
<p class="fs-3">Add Books</p>
<c:if test="${not empty msg }">
<p class="text-center text-success fs-4">${msg }</p>
<c:remove var="msg"/>
</c:if>
</div>
<div class="card-body">
<form action="../saveAddtion"method="post">
<div class="mb-3">
<label>Book Name</label>
<input type="text"name="name"class="form-control">
</div>

<div class="mb-3">
<label>Book Author</label>
<input type="text"name="author"class="form-control">
</div>
<div class="mb-3">
<label>Book Edition</label>
<input type="text"name="edition"class="form-control">
</div>
<div class="mb-3">
<label>Issue Date</label>
<input type="date"name="date"class="form-control">
</div>
<div class="mb-3">
<label>Validation Expire</label>
<input type="date"name="valid"class="form-control">
</div>
<button class="btn btn-primary col-md-12">Add</button>
</form>
</div>
</div>

</div>
</div>
</div>

</body>
</html>