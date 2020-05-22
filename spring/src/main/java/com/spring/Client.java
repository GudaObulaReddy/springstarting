package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		//Resource resource=new ClassPathResource("spring.xml");
		//BeanFactory context=new XmlBeanFactory(resource);
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		FirstSpring s1=(FirstSpring)context.getBean("fir1");
	  FirstSpring s2=context.getBean("fir2", FirstSpring.class);
	  System.out.println(s1);
	  System.out.println(s2);
	  ClassPathXmlApplicationContext ctx=(ClassPathXmlApplicationContext)context;
	  ctx.close();
	  
	}

}
