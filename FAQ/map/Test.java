package com.sahu.spring.springCore.map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		Resource rs = new ClassPathResource("com/sahu/spring/springCore/map/config_map.xml");
		BeanFactory fac = new XmlBeanFactory(rs);
		Question_map q = (Question_map) fac.getBean("q2");
		System.out.println(q);
		q.displayInfo();

	}

}
