package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDao;
import com.dbconn.Hibernate_uttil;
import com.entity.User;

@WebServlet("/UserRegister")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	String  fullName=	req.getParameter("fullName");
	String  email=	req.getParameter("email");
	String  password=	req.getParameter("password");
	String  stream=	req.getParameter("stream");
		
	User u=new User(fullName, email, password, stream);
	
	
	UserDao dao=new UserDao(Hibernate_uttil.getSessionFactory());
	boolean f=dao.saveuser(u);
	HttpSession session=req.getSession();
	if(f) {
	session.setAttribute("msg", "Register Successfully");
	resp.sendRedirect("register.jsp");
		//System.out.println("Register Successfully");
	}else {
	//	System.out.println("Something Wrong on server");
		session.setAttribute("msg","Something Wrong on server");
		resp.sendRedirect("register.jsp");
	}
	}

}
