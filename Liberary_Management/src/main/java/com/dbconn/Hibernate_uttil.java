package com.dbconn;

import java.lang.module.Configuration;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.entity.Addtion;
import com.entity.User;

public class Hibernate_uttil {
	private static SessionFactory sessionFactory;
	public static SessionFactory getSessionFactory() {
		if(sessionFactory==null) {
    org.hibernate.cfg.Configuration configuration=new org.hibernate.cfg.Configuration();
		Properties properties=new Properties();
		properties.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver" );
		properties.put(Environment.URL,"jdbc:mysql://localhost:3306/Liberary_Managemet" );
		properties.put(Environment.USER,"root");
		properties.put(Environment.PASS,"010101");
		properties.put(Environment.DIALECT,"org.hibernate.dialect.MySQL8Dialect");
		properties.put(Environment.HBM2DDL_AUTO,"update");
		properties.put(Environment.SHOW_SQL,true);
		configuration.setProperties(properties);
		configuration.addAnnotatedClass(User.class);
		configuration.addAnnotatedClass(Addtion.class);
		
		
		
		
		ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		sessionFactory=configuration.buildSessionFactory(serviceRegistry);
		
		
		}
		return sessionFactory;
	}

}
