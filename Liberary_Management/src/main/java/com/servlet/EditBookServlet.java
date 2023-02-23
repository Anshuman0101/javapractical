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
import com.entity.Addtion;
import com.entity.User;
@WebServlet("/EditBook")
public class EditBookServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String author=req.getParameter("author");
		String edition=req.getParameter("edition");
		String date=req.getParameter("date");
		String valid=req.getParameter("valid");
		
		HttpSession session =req.getSession();
		User user=(User) session.getAttribute("loginUser");
		
		Addtion ad=new Addtion(name,author,edition,date,valid,user);
		ad.setId(id);
		AddtionDao dao=new AddtionDao(Hibernate_uttil.getSessionFactory());
		boolean f=dao.EditBook(ad);
		if(f) {
			session.setAttribute("msg", "Updated  Successfully");
			resp.sendRedirect("user/view_books.jsp");
				//System.out.println("Register Successfully");
			}else {
			//	System.out.println("Something Wrong on server");
				session.setAttribute("msg","Something Wrong on server");
				resp.sendRedirect("user/view_books.jsp");
			}
		
	}

	
	

}
