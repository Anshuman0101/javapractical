package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.AddtionDao;
import com.dbconn.Hibernate_uttil;
@WebServlet("/deleteBooks")
public class deleteBookServlet  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		AddtionDao dao=new AddtionDao(Hibernate_uttil.getSessionFactory());
	
		boolean f=dao.deleteBooks(id);
		HttpSession session=req.getSession();
		
		if(f) {
			session.setAttribute("msg","Delete Sucessfully");
			resp.sendRedirect("user/view_books.jsp");
		}else {
			session.setAttribute("msg","Something Wrong on server");
			resp.sendRedirect("user/view_books.jsp");
			
		}
		
	}
	

}
