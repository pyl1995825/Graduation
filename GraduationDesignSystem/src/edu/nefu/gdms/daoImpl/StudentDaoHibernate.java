package edu.nefu.gdms.daoImpl;

import org.hibernate.HibernateException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.nefu.gdms.dao.StudentDao;

public class StudentDaoHibernate extends HibernateDaoSupport implements StudentDao {

	@Override
	public void save(Object obj) throws HibernateException {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(obj);
	}

}
