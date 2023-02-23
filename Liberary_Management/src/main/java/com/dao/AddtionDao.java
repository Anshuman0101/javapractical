package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.entity.Addtion;
import com.entity.User;

public class AddtionDao {
	private SessionFactory factory=null;
	private Session session=null;
	private Transaction tx=null;

	public AddtionDao(SessionFactory factory) {
		super();
		this.factory = factory;
	}
	public boolean saveAddtion(Addtion ad) {
		boolean f=false;
		
		try {
			session=factory.openSession();
		tx=	session.beginTransaction();
		session.save(ad);
		tx.commit();
			f=true;
			
			
		} catch (Exception e) {
			if(tx!=null) {
				f=false;
				e.printStackTrace();
			}
			
		}
		
		return f;
		
		}
	
public  List<Addtion>getAllAddtionByUser(User user){
	List<Addtion>list=new ArrayList<Addtion>();
	try {
		session=factory.openSession();
		Query q=session.createQuery("from Addtion where user=:us");
		q.setParameter("us", user);
		list=q.list();
		
	} catch (Exception e) {
	e.printStackTrace();
	}
	return list;
}
public Addtion getAddtionById(int id) {
	Addtion ad=null;
	
	try {
		
		session=factory.openSession();
		Query q=session.createQuery("from Addtion where id=:id");
		q.setParameter("id", id);
		ad=(Addtion) q.uniqueResult();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return ad;
}
public boolean EditBook(Addtion ad) {
	boolean f=false;
	
	try {
		session=factory.openSession();
	tx=	session.beginTransaction();
	session.saveOrUpdate(ad);
	tx.commit();
		f=true;
		
		
	} catch (Exception e) {
		if(tx!=null) {
			f=false;
			e.printStackTrace();
		}
		
	}
	
	return f;
	
	}
public boolean deleteBooks(int id) {
	boolean f=false;
	try {
		session=factory.openSession();
		tx=session.beginTransaction();
		Addtion ad=session.get(Addtion.class,id);
		session.delete(ad);
		tx.commit();
		f=true;
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return f;
}

}
