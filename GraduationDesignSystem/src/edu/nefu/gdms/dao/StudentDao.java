package edu.nefu.gdms.dao;

import org.hibernate.HibernateException;

public interface StudentDao {
	
	public void save(Object obj) throws HibernateException;
}
