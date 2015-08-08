package com.spms.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.spms.entity.TGoodsbaseinfo;

public class CriterionTools {

	public static List<Criterion> generateCriterion(Object object) {
		// 获取object对象对应类中的所有属性域
		Field[] fields = object.getClass().getDeclaredFields();
		List<Criterion> crts = new ArrayList<Criterion>();
		for (int i = 0, len = fields.length; i < len; i++) {
			// 对于每个属性，获取属性名
			String varName = fields[i].getName();
			try {
				// 获取原来的访问控制权限
				boolean accessFlag = fields[i].isAccessible();
				// 修改访问控制权限
				fields[i].setAccessible(true);
				// 获取在对象object中属性fields[i]对应的对象中的变量
				Object value = fields[i].get(object);
				System.out.println("传入的对象中包含一个如下的变量：" + varName + " = " + value);
				if(value != null && !"".equals(value)){
					if(value instanceof String){
						crts.add(Restrictions.like(varName, "%" + value + "%"));
					}
					//TODO
				}
				// 恢复访问控制权限
				fields[i].setAccessible(accessFlag);
			} catch (IllegalArgumentException ex) {
				ex.printStackTrace();
			} catch (IllegalAccessException ex) {
				ex.printStackTrace();
			}
		}
		return crts;
	}

	public static void main(String[] args) {
		TGoodsbaseinfo goods = new TGoodsbaseinfo();
		goods.setGoodsId("001");
		goods.setGoodsName("MII");
		//setAllComponentsName(goods);
	}

}
