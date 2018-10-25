package com.sowmya.web3.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.sowmya.web3.dao.BlogDao;
import com.sowmya.web3.model.Blog;
@Component
@Repository
@Transactional
public class BlogDaoImpl implements BlogDao
{
@Autowired
SessionFactory sessionfactory;
public BlogDaoImpl(SessionFactory sessionFactory)
{
	this.sessionfactory=sessionFactory;
}
	@Override
	public boolean save_blog(Blog blog) 
	{
		sessionfactory.getCurrentSession().save(blog);
		
	

		return true;
	}
	@Override
	public List getBlogDetails() {
		Session session=sessionfactory.openSession();
		Query query=session.createQuery("from Blog");
		List bloglist=query.list();
		session.close();
		return bloglist;
	}

}
