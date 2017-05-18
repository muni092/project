package com.eshop.dao;

import java.util.List;

import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.eshop.model.CategoryDetails;
@Repository
public class CategoryDao {
	
	@Autowired
	
	SessionFactory sessionfactory;
	public void insertCategory(CategoryDetails cd)
	{
		Session s=sessionfactory.openSession();
		Transaction t=s.beginTransaction();
		s.save(cd);
		t.commit();
	}
		public List retrieveCategory()
		{

			Session s=sessionfactory.openSession();
			Transaction t=s.beginTransaction();
			String hql = "FROM CategoryDetails" ;
			Query query = s.createQuery(hql);
			List result = query.list();

				return result;
	}
}
	

