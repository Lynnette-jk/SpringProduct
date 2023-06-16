package com.june;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
   public static void main(String[] args) {
	   ConfigurableApplicationContext context = 
		         new ClassPathXmlApplicationContext("Beans.xml");
	// Let us raise a start event.
	      context.start();
		  
	      Product obj = (Product) context.getBean("product");
	      obj.getMessage();

	      // Let us raise a stop event.
	      context.stop();
   }
}