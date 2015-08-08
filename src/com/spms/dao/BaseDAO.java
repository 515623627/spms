package com.spms.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.DetachedCriteria;

import com.spms.util.PageBean;

/**
 * 定义了基本CURD操作的接口
 * @author Bert 强伟伟
 * @version 2015年6月7日 上午11:59:46
 * @param <T>
 * @param <PK>
 */
public interface BaseDAO<T,PK extends Serializable> {

	/**
	 * 保存一个对象
	 * @param object
	 * @return
	 */
	public T save(T object);
	/**
	 * 保存或者更新一个对象
	 * @param object
	 * @return
	 */
	public T saveOrUpdate(T object);
	/**
	 * 更新一个对象
	 * @param object
	 * @return
	 */
	
	public T update(T object);
	
	/**合并一个对象
	 * 
	 * @param object
	 * @return
	 */
	public T merge(T object);
	
	/**
	 * 删除一个对象
	 * @param object
	 */
	public void deleteObject(T object);
	
	/**
	 * 根据id删除一个对象
	 * @param id
	 */
	public void delelteById(Class<T> clazz,PK id);
	
	/**
	 * 删除多个对象
	 * @param entities
	 */
	public void deleteAll(Collection<?> entities);
	
	
	/**
	 * 根据id判断对象是否存在
	 * @param id
	 * @return
	 */
	public boolean exists(Class<T> clazz,PK id);
	
	/**
	 * 根据id加载一个对象
	 * @param id
	 * @return
	 */
	public T load(Class<T> clazz,PK id);
	
	/**
	 * 根据id获取一个对象
	 * @param id
	 * @return
	 */
	public T get(Class<T> clazz,PK id);
	
	/**
	 * 获取对象总条数
	 * @return
	 */
	public int countAll(Object object);
	
	/**
	 * 根据criteria条件，获取对象总条数
	 * @param criteria
	 * @return
	 */
	public int countAll(Criteria criteria);
	
	
	/**
	 * 根据对象获取一个对象
	 * @param object
	 * @return
	 */
	public List<T> findByExample(T object);
	
	/**
	 * 根据属性值获取唯一对象（匹配方式为相等）
	 * @param propertyName
	 * @param value
	 * @return
	 */
	public T findUniqueObjectByProperty(String propertyName, Object value);
	
	/**
	 * 根据criterion查询唯一对象
	 * @param criterions
	 * @return
	 */
	public T findUniqueObjectByProperty(Criterion... criterions);
	
	/**
	 * 根据criteria查询唯一对象
	 * @param criteria
	 * @return
	 */
	public T findUniqueObjectByProperty(Criteria criteria);
	
	/**
	 * 获取所有对象
	 * @return
	 */
	public List<T> list(Object object);
	
	/**
	 * 根据criteria获取所有对象
	 * @param criteria
	 * @return
	 */
	public List<T> list(Criteria criteria);
	
	/**
	 * 根据criteria获取所有对象（离线查询）
	 * @param criteria
	 * @return
	 */
	public List<T> list(DetachedCriteria criteria);
	
	/**
	 * 获取排序后的所有对象
	 * @param orderBy
	 * @param isAsc
	 * @return
	 */
	public List<T> list(String orderBy, boolean isAsc);
	
	/**
	 * 根据属性获取对象集合
	 * @param propertyName
	 * @param value
	 * @return
	 */
	public List<T> list(String propertyName, Object value);
	
	/**
	 * 根据criterion获取对象集合
	 * @param criterion
	 * @return
	 */
	public List<T> list(Criterion criterion);
	
	/**
	 * 根据criterion集合获取对象集合
	 * @param criterions
	 * @return
	 */
	public List<T> list(Criterion... criterions);
	
	/**
	 * 刷新session对象
	 */
	public void flush();
	
	/**
	 * 清空session对象
	 */
	public void clear();

	/**
	 * 创建Criteria实例
	 * @return
	 */
	public Criteria createCriteria(Object object);

	/**
	 * 根据Criterion条件创建Criteria
	 * @param criterions 数量可变的Criterion
	 * @return
	 */
	public Criteria createCriteria(Criterion... criterions);

	/**
	 * 分页查询
	 * @param object
	 * @param currentPage
	 * @param pageSize
	 * @param crts
	 * @return
	 */
	public PageBean findPage(Object object, int currentPage, int pageSize,
			List<Criterion> crts);
	
	/**
	 * 分页查询
	 * @param object
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	public PageBean findPage(Object object, int currentPage, int pageSize);
	
}
