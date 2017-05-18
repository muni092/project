package com.eshop.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eshop.model.UserDetails;
@Repository
public class RegDao {
@Autowired
SessionFactory sessionfactory;
public void insertUser(UserDetails ud)
{
	Session s=sessionfactory.openSession();
	Transaction t=s.beginTransaction();
	s.save(ud);
	t.commit();
}
}
