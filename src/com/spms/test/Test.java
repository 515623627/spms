package com.spms.test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.apache.log4j.Logger;

class A<String>{}

public class Test<T> extends A<String>{

	Class<T> clazz;
	Type type = null;
	public Test(){
		this.type = this.getClass();
		System.out.println(type);
		
		Type[] params = ((ParameterizedType) this.type).getActualTypeArguments();
		for (Type t : params) {
			System.out.println(t.toString());
		}
	}
	
	
	public static void main(String[] args) {
		Test<Integer> t = new Test<Integer>();
		
	}

}
