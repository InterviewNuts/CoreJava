package com.sahu.spring.springCore;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
			Employee ee = (Employee)ctx.getBean("emp1");
			System.out.println(ee.getName());
			System.out.println(ee.getId());
			System.out.println(ee.getAdd().toString());
			
			
			
//		ClassPathResource resource=new ClassPathResource("config.xml");  
//		BeanFactory factory=new XmlBeanFactory(resource);  
//		Employee ee = (Employee)factory.getBean("emp");
//		System.out.println(ee.getName());
//		System.out.println(ee.getId());
		
	}

}
