package com.tb.dao;

import org.hibernate.Session;

import com.tb.model.Student;
import com.tb.util.HibernateUtil;

public class StudentDao implements DataDao<Student> {

	@Override
	public void insert(Student entity) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		session.save(entity);

		session.getTransaction().commit();
		session.close();

		HibernateUtil.shutdown();

	}

}
