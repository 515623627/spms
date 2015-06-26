package com.spms.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;

import com.spms.dao.BaseDAO;

@Component
@SuppressWarnings("unchecked")
public class BaseDAOImpl<T> implements BaseDAO<T,Serializable> {
	
	@Resource
	private SessionFactory sessionFactory;
	
	public Session getSession(){
		return this.sessionFactory.getCurrentSession();
	}
	@Override
	public T save(T object) {
		this.getSession().save(object);
		return object;
	}

	@Override
	public T saveOrUpdate(T object) {
		this.getSession().saveOrUpdate(object);
		return object;
	}

	@Override
	public T update(T object) {
		this.getSession().update(object);
		return object;
	}

	@Override
	public T merge(T object) {
		this.getSession().merge(object);
		return object;
	}

	@Override
	public void deleteObject(T object) {
		this.getSession().delete(object);
	}

	@Override
	public void delelteById(Class clazz,Serializable id) {
		this.getSession().delete(this.get(clazz,id));
		
	}

	@Override
	public void deleteAll(Collection<?> entities) {
		if(entities == null){
			return;
		}
		for (Object object : entities) {
			this.getSession().delete(object);
		}
	}

	@Override
	public boolean exists(Class clazz,Serializable id) {
		return this.get(clazz,id) != null;
	}

	@Override
	public T load(Class clazz,Serializable id) {
		return (T) this.getSession().load(clazz, id);
	}

	@Override
	public T get(Class clazz,Serializable id) {
		return (T) this.getSession().get(clazz, id);
	}

	@Override
	public int countAll(Object object) {
		Criteria criteria = this.createCriteria(object);
		if(criteria != null){
			criteria = criteria.setProjection(Projections.rowCount());
			Object rowNo = 
					criteria.uniqueResult();
			return (rowNo != null) ? Integer.parseInt(rowNo.toString()) : -1;
		}
		return -1;
	}

	@Override
	public int countAll(Criteria criteria) {
		
		String rowNo = criteria.setProjection(Projections.rowCount())
				.uniqueResult()
				.toString();
		
		return Integer.valueOf(rowNo);
	}

	@Override
	public List<T> findByExample(T object) {
		Example example = Example.create(object);
		Criteria criteria = this.createCriteria().add(example);
		return criteria.list();
	}

	@Override
	public T findUniqueObjectByProperty(String propertyName, Object value) {
		Criterion criterion = Restrictions.eq(propertyName, value);
		Criteria criteria = this.createCriteria(criterion);
		return  (T) criteria.uniqueResult();
	}

	@Override
	public T findUniqueObjectByProperty(Criterion... criterions) {
		Criteria criteria = this.createCriteria();
		return this.findUniqueObjectByProperty(criteria);
	}

	@Override
	public T findUniqueObjectByProperty(Criteria criteria) {
		return (T) criteria.uniqueResult();
	}

	@Override
	public List<T> list(Object object) {
		return this.createCriteria(object).list();
	}

	@Override
	public List<T> list(Criteria criteria) {
		return criteria.list();
	}

	@Override
	public List<T> list(DetachedCriteria criteria) {
		return (List<T>) criteria.getExecutableCriteria(getSession());
	}

	@Override
	public List<T> list(String orderBy, boolean isAsc) {
		Criteria criteria = this.createCriteria();
		if (isAsc){
			criteria.addOrder(Order.asc(orderBy));
		}else{
			criteria.addOrder(Order.desc(orderBy));
		}
		return criteria.list();
	}

	@Override
	public List<T> list(String propertyName, Object value) {
		Criterion criterion = Restrictions.like(propertyName, "%" + value + "%");
		return this.list(criterion);
	}

	@Override
	public List<T> list(Criterion criterion) {
		Criteria criteria = this.createCriteria();
		criteria.add(criterion);
		return criteria.list();
	}

	@Override
	public List<T> list(Criterion... criterions) {
		return this.createCriteria(criterions).list();
	}

	@Override
	public void flush() {
		this.getSession().flush();
	}

	@Override
	public void clear() {
		this.getSession().clear();
	}

	@Override
	public Criteria createCriteria(Object object) {
		return this.getSession().createCriteria(object.getClass());
	}

	@Override
	public Criteria createCriteria(Criterion... criterions) {
		Criteria criteria = this.createCriteria();
		for (Criterion criterion : criterions) {
			criteria.add(criterion);
		}
		return criteria;
	}

	@Override
	public List<T> findPage(Criteria criteria, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
