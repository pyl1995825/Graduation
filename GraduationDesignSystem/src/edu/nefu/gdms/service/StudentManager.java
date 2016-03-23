package edu.nefu.gdms.service;

import org.hibernate.HibernateException;

import edu.nefu.gdms.beans.StudentBean;

public interface StudentManager {

	public void regUser(StudentBean student) throws HibernateException;
}
