<%@page import="org.hibernate.SessionFactory"%>
<%@page import="com.dbconn.Hibernate_uttil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="components/all_css.jsp"%>
</head>
<body>
<%@include file="components/navbar.jsp"%>



<div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="img/lib3.webp" class="d-block w-100" alt="..." width="100%"height="600vh">
    </div>
    <div class="carousel-item">
      <img src="img/lib1.jpg" class="d-block w-100" alt="..."width="100%"height="600vh">
    </div>
    <div class="carousel-item">
      <img src="img/lib2.jpg" class="d-block w-100" alt="..."width="100%"height="600vh">
    </div>
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>

</body>
</html>