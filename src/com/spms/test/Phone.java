package com.spms.test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class Phone {

	private Class entityClass;
	
	public Phone(){
		Type genType = getClass().getGenericSuperclass();

		ParameterizedType paramType = (ParameterizedType) genType;
//		Type[] params = paramType.getActualTypeArguments();
//
//		entityClass = (Class) params[0];
//		
//		System.out.println(entityClass.getName());
		
	}
}
