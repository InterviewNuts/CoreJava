package com.sahu.spring.springCore.set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {

		Resource r = new ClassPathResource("com/sahu/spring/springCore/set/config_set.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		Question_set q = (Question_set) factory.getBean("q2");
//		q.displayInfo();
//		System.out.println(q.getAnswers().getClass().getName());
		System.out.println(q);

	}

}
