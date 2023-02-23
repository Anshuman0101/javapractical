<%@page import="com.entity.Addtion"%>
<%@page import="java.util.List"%>
<%@page import="com.entity.User"%>
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
<%@include file="../components/navbar.jsp"%>
<div class="container p-2">
<div class="row">
<div class="col-md-8 offset-md-2">
<div class="card card-sh">
<div class="card-header text-center">
<p class="fs-3">Added Books</p>
<c:if test="${not empty msg }">
<p class="text-center text-success fs-4">${msg }</p>
<c:remove var="msg"/>
</c:if>
</div>
<div class="card-body ">

<table class="table">
  <thead>
    <tr>
      <th scope="col">Books </th>
      <th scope="col">Author</th>
      <th scope="col">Edition</th>
      <th scope="col"> Issue Date</th>
       <th scope="col">Validation Expire</th>
        <th scope="col">     Action</th>
    </tr>
  </thead>
  <tbody>
   
   <%
   User user=(User)session.getAttribute("loginUser");
   AddtionDao dao=new AddtionDao(Hibernate_uttil.getSessionFactory());
   List<Addtion> list=dao.getAllAddtionByUser(user);
   for(Addtion ad:list){
	 %>  
	   <tr>
	      <th scope="row"><%=ad.getName() %></th>
	      <td><%=ad.getAuthor()%></td>
	      <td><%=ad.getEdition()%></td>
	      <td><%=ad.getDate()%></td>
	      <td><%=ad.getValid()%></td>
	      <td>
	      <a href="edit_Book.jsp?id=<%=ad.getId() %>" class="btn btn-sm btn-success me-1">Edit Book</a>
	      <a href="../deleteBooks?id=<%=ad.getId() %>" class="btn btn-sm btn-danger me-1">Delete</a>
	      </td>
	      
	    </tr>
	 <%   
   }
   %>
   
   
    
    
   
    
  </tbody>
</table>

</div>



</div>
</div>
</div>
</div>

</body>
</html>