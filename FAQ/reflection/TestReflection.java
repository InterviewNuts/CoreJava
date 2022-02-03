package com.sahu.spring.springCore.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflection {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Student s = new Student();

		Class cls = s.getClass();
		System.out.println("The name of class is " + cls.getName());

		Constructor constructor = cls.getConstructor(null);
		System.out.println("The name of constructor is " + constructor.getName());

		Method[] m = cls.getMethods();
		for (Method f : m) {
			System.out.println(f.getName());
		}

		Method declaredMethod = cls.getDeclaredMethod("method2", int.class);
		declaredMethod.invoke(s, 234);
		
		Method dis = cls.getDeclaredMethod("display");
//		dis.invoke(s);
		dis.setAccessible(true);
		 Field field = cls.getDeclaredField("id");
		 field.setAccessible(true);
		 field.set(s, 121);
		 field = cls.getDeclaredField("name");
		 field.setAccessible(true);
		 field.set(s, "JAVA SAHU");
		 
		dis.invoke(s);
	}

}
