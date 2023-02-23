 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page isELIgnored="false" %>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Liberary    <i class="fa-solid fa-book-atlas"></i>  <i class="fa-solid fa-book"></i>   Management</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
       <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="Home.jsp"><i class="fa-solid fa-house"></i>Home</a>
        </li>
        
        <c:if test="${not empty loginUser }">
        
         <li class="nav-item">
          <a class="nav-link active" href="add_books.jsp"></i>Add  <i class="fa-solid fa-book"></i>  Books</a>
        </li>
      
        <li class="nav-item">
          <a class="nav-link  active" href="view_books.jsp" tabindex="-1" ></i> View  <i class="fa-solid fa-book-open"></i> Books</a>
        </li>
        
        
        </c:if>
      
      </ul>
     
      
      
 <%--when user is login or coorect user ..  --%> 
  
      <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
      <c:if test="${not empty loginUser }">
       <li class="nav-item">
          <a class="nav-link active" href="#"><i class="fa-solid fa-circle-user"></i>${loginUser.fullname }</a>
        </li>
      
        <li class="nav-item">
          <a class="nav-link  active" href="../logout" tabindex="-1" ><i class="fa-solid fa-right-from-bracket"></i>Logout</a>
        </li>
 </ul>
 </c:if>  
  
 <%--when user is not valid  ..  --%>  
 <c:if test="${ empty loginUser }">  
        <li class="nav-item">
          <a class="nav-link active" href="login.jsp"><i class="fa-solid fa-right-to-bracket"></i>Login</a>
        </li>
      
        <li class="nav-item">
          <a class="nav-link  active" href="register.jsp" tabindex="-1" ><i class="fa-solid fa-user-plus"></i>Register</a>
        </li>
         </c:if>
      </ul>
     
    </div>
  </div>
</nav>
