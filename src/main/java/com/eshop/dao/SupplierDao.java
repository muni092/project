package com.eshop.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eshop.model.CategoryDetails;
import com.eshop.model.SupplierDetails;
@Repository
public class SupplierDao {
	@Autowired
	SessionFactory sessionfactory;
	public void insertSupplier(SupplierDetails sd)
	{
		Session s=sessionfactory.openSession();
		Transaction t=s.beginTransaction();
		s.save(sd);
		t.commit();
	}
	public List retrieveSup()
	{
	Session s=sessionfactory.openSession();
	Transaction t=s.beginTransaction();
	String hql = "FROM SupplierDetails" ;
	Query query = s.createQuery(hql);
	List result = query.list();
    return result;

	}
}

