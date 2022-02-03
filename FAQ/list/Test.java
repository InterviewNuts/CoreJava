package com.sahu.spring.springCore.list;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {

		  Resource r=new ClassPathResource("com/sahu/spring/springCore/map/config_map.xml");  
		    BeanFactory factory=new XmlBeanFactory(r);  
		      
		    Question q=(Question)factory.getBean("q3");  
		    q.displayInfo();
		    System.out.println(q.getAnswers().getClass().getName());
		
	}

}
