<%@page import="com.entity.Addtion"%>
<%@page import="com.dbconn.Hibernate_uttil"%>
<%@page import="com.dao.AddtionDao"%>
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
<%
int id=Integer.parseInt(request.getParameter("id"));
AddtionDao dao=new AddtionDao(Hibernate_uttil.getSessionFactory());
Addtion ad=dao.getAddtionById(id);


%>



<%@include file="../components/navbar.jsp"%>

<div class="container p-3 ">
<div class="row">
<div class="col-md-6 offset-md-3">
<div class="card card-sh">
<div class="card-header text-center">
<p class="fs-3">Edit Books</p>

</div>
<div class="card-body">
<form action="../EditBook"method="post">
<div class="mb-3">
<label>Book Name</label>
<input type="text"name="name"class="form-control" value="<%=ad.getName()%>">
</div>

<div class="mb-3">
<label>Book Author</label>
<input type="text"name="author"class="form-control"value="<%=ad.getAuthor()%>">
</div>
<div class="mb-3">
<label>Book Edition</label>
<input type="text"name="edition"class="form-control"value="<%=ad.getEdition()%>">
</div>
<div class="mb-3">
<label>Issue Date</label>
<input type="date"name="date"class="form-control"value="<%=ad.getDate()%>">
</div>
<div class="mb-3">
<label>Validation Expire</label>
<input type="date"name="valid"class="form-control"value="<%=ad.getValid()%>">
</div>
<input type="hidden"name="id"value="<%=ad.getId()  %>">
<button class="btn btn-primary col-md-12">Edit Books</button>
</form>
</div>
</div>

</div>
</div>
</div>

</body>
</html>