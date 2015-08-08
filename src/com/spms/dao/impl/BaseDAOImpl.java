package com.spms.dao.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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
import com.spms.util.PageBean;

@Component
@SuppressWarnings("unchecked")
public class BaseDAOImpl<T> implements BaseDAO<T, Serializable> {

	@Resource
	private SessionFactory sessionFactory;

	private Log log = LogFactory.getLog(BaseDAOImpl.class);
	
	public int totalRecord = -1;
	
	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}

	@Override
	public T save(T object) {
		log.info("save(T object)");
		this.getSession().save(object);
		return object;
	}

	@Override
	public T saveOrUpdate(T object) {
		log.info("saveOrUpdate(T object)");
		this.getSession().saveOrUpdate(object);
		return object;
	}

	@Override
	public T update(T object) {
		log.info("update(T object)");
		this.getSession().update(object);
		return object;
	}

	@Override
	public T merge(T object) {
		log.info("merge(T object)");
		this.getSession().merge(object);
		return object;
	}

	@Override
	public void deleteObject(T object) {
		log.info("deleteObject(T object)");
		this.getSession().delete(object);
	}

	@Override
	public void delelteById(Class<T> clazz, Serializable id) {
		log.info("delelteById(Class clazz,Serializable id)");
		this.getSession().delete(this.get(clazz, id));

	}

	@Override
	public void deleteAll(Collection<?> entities) {
		log.info("deleteAll(Collection<?> entities)");
		if (entities == null) {
			return;
		}
		for (Object object : entities) {
			this.getSession().delete(object);
		}
	}

	@Override
	public boolean exists(Class<T> clazz, Serializable id) {
		log.info("exists(Class clazz,Serializable id)");
		return this.get(clazz, id) != null;
	}

	@Override
	public T load(Class<T> clazz, Serializable id) {
		log.info("load(Class clazz,Serializable id)");
		return (T) this.getSession().load(clazz, id);
	}

	@Override
	public T get(Class<T> clazz, Serializable id) {
		log.info("get(Class clazz,Serializable id)");
		return (T) this.getSession().get(clazz, id);
	}

	@Override
	public int countAll(Object object) {
		log.info("countAll(Object object)");
		Criteria criteria = this.createCriteria(object);
		if (criteria != null) {
			criteria = criteria.setProjection(Projections.rowCount());
			Object rowNo = criteria.uniqueResult();
			return (rowNo != null) ? Integer.parseInt(rowNo.toString()) : -1;
		}
		return -1;
	}

	@Override
	@Deprecated
	public int countAll(Criteria criteria) {
		
		log.info("countAll(Criteria criteria)");
		System.out.println(Projections.rowCount());
		String rowNo = criteria.setProjection(Projections.rowCount())
				.uniqueResult().toString();
		return Integer.valueOf(rowNo);
	}

	@Override
	public List<T> findByExample(T object) {
		log.info("findByExample(T object)");
		Example example = Example.create(object);
		Criteria criteria = this.createCriteria().add(example);
		return criteria.list();
	}

	@Override
	public T findUniqueObjectByProperty(String propertyName, Object value) {
		log.info("findUniqueObjectByProperty(String propertyName, Object value)");
		Criterion criterion = Restrictions.eq(propertyName, value);
		Criteria criteria = this.createCriteria(criterion);
		return (T) criteria.uniqueResult();
	}

	@Override
	public T findUniqueObjectByProperty(Criterion... criterions) {
		log.info("findUniqueObjectByProperty(Criterion... criterions)");
		Criteria criteria = this.createCriteria();
		return this.findUniqueObjectByProperty(criteria);
	}

	@Override
	public T findUniqueObjectByProperty(Criteria criteria) {
		log.info("findUniqueObjectByProperty(Criteria criteria)");
		return (T) criteria.uniqueResult();
	}

	@Override
	public List<T> list(Object object) {
		log.info("list(Object object)");
		return this.createCriteria(object).list();
	}

	@Override
	public List<T> list(Criteria criteria) {
		log.info("list(Criteria criteria)");
		return criteria.list();
	}

	@Override
	public List<T> list(DetachedCriteria criteria) {
		log.info("list(DetachedCriteria criteria)");
		return (List<T>) criteria.getExecutableCriteria(getSession());
	}

	@Override
	public List<T> list(String orderBy, boolean isAsc) {
		log.info("list(String orderBy, boolean isAsc)");
		Criteria criteria = this.createCriteria();
		if (isAsc) {
			criteria.addOrder(Order.asc(orderBy));
		} else {
			criteria.addOrder(Order.desc(orderBy));
		}
		return criteria.list();
	}

	@Override
	public List<T> list(String propertyName, Object value) {
		log.info("list(String propertyName, Object value)");
		Criterion criterion = Restrictions
				.like(propertyName, "%" + value + "%");
		return this.list(criterion);
	}

	@Override
	public List<T> list(Criterion criterion) {
		log.info("list(Criterion criterion)");
		Criteria criteria = this.createCriteria();
		criteria.add(criterion);
		return criteria.list();
	}

	@Override
	public List<T> list(Criterion... criterions) {
		log.info("list(Criterion... criterions)");
		return this.createCriteria(criterions).list();
	}

	@Override
	public void flush() {
		log.info("flush()");
		this.getSession().flush();
	}

	@Override
	public void clear() {
		log.info("clear()");
		this.getSession().clear();
	}

	@Override
	public Criteria createCriteria(Object object) {
		log.info("Criteria createCriteria(Object object)");
		return this.getSession().createCriteria(object.getClass());
	}

	@Override
	public Criteria createCriteria(Criterion... criterions) {
		log.info("createCriteria(Criterion... criterions)");
		// TODO
		Criteria criteria = this.createCriteria();
		for (Criterion criterion : criterions) {
			criteria.add(criterion);
		}
		return criteria;
	}

	private List<T> findPage(Criteria criteria, int currentPage, int pageSize) {
		log.info("findPage(Criteria criteria, int currentPage, int pageSize)");
		if (criteria != null) {
			criteria = criteria.setFirstResult((currentPage - 1) * pageSize);
			criteria = criteria.setMaxResults(pageSize);
			return list(criteria);
		}
		return null;
	}
	
	@Override
	public PageBean findPage(Object object, int currentPage, int pageSize) {
		Criteria c = this.createCriteria(object);
		List<T> list = null;
		list = this.findPage(c, currentPage, pageSize);
		totalRecord = this.countAll(object);
		PageBean pageBean = new PageBean();
		pageBean.setCurrentPage(currentPage);
		pageBean.setPageSize(pageSize);
		pageBean.setTotalRecord(totalRecord);
		pageBean.setTotalPage(PageBean.countTotalPage(pageSize, totalRecord));
		pageBean.setList(list);
		pageBean.init();
		return pageBean;
		
	}
	
	@Override
	public PageBean findPage(Object object, int currentPage, int pageSize,
			List<Criterion> crts) {
		Criteria criteria = this.createCriteria(object);
		List<T> list = null;
		for (int i = 0; i < crts.size(); i++) {
			criteria.add(crts.get(i));
		}
		list = this.findPage(criteria, currentPage, pageSize);

		/**
		 * 此处为了防止countAll(Criteria criteria)报空指针异常做如下判断
		 */
		//按条件查询
		if(crts.size() > 0){
			if(currentPage == 1){
				totalRecord = this. countAll(criteria);
			}
		}
		//查询全部
		else{
			if(currentPage == 1){
				totalRecord = this.countAll(object);
			}
		}
		 
		PageBean pageBean = new PageBean();
		pageBean.setCurrentPage(currentPage);
		pageBean.setPageSize(pageSize);
		pageBean.setTotalRecord(totalRecord);
		pageBean.setTotalPage(PageBean.countTotalPage(pageSize, totalRecord));
		pageBean.setList(list);
		pageBean.init();
		return pageBean;

	}

}
