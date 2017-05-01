package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
      TestingBean auto=(TestingBean) ctx.getBean("test");
      //System.out.println("hello"+auto.getMessage());
      /**
       * wiring
       * two types 1.Explicit wiring
       * 2.implicit wiring
       *  */
      auto.show();
      
	}
}
