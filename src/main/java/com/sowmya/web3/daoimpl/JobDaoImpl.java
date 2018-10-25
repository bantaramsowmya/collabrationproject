package com.sowmya.web3.daoimpl;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.sowmya.web3.dao.JobDao;
import com.sowmya.web3.model.Job;
@Component
@Repository
@Transactional
public class JobDaoImpl implements JobDao
{
	SessionFactory sessionfactory;
	public JobDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionfactory=sessionFactory;
	}
	@Override
	public boolean apply_job(Job job) 
	{
		sessionfactory.getCurrentSession().save(job);
		return true;
	}

}
