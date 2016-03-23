package edu.nefu.gdms.serviceImpl;

import org.hibernate.HibernateException;

import edu.nefu.gdms.beans.StudentBean;
import edu.nefu.gdms.dao.StudentDao;

public class StudentManagerImpl implements edu.nefu.gdms.service.StudentManager {

	private StudentDao dao;
	
	@Override
	public void regUser(StudentBean student) throws HibernateException {
		// TODO Auto-generated method stub
//		StudentBean student = new StudentBean();
		
	}

	public StudentDao getDao() {
		return dao;
	}

	public void setDao(StudentDao dao) {
		this.dao = dao;
	}

}
