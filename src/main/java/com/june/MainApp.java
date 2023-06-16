package com.june;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      Product objA = (Product) context.getBean("product");
      objA.getMessage1();
      objA.getMessage2();
     
      ProductDrinks objB = (ProductDrinks) context.getBean("productDrinks");
      objB.getMessage1();
      objB.getMessage2();
      objB.getMessage3();
   }
}