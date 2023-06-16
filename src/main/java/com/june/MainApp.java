package com.june;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.annotation.*;


public class MainApp {
   public static void main(String[] args) {
      ApplicationContext ctx = new AnnotationConfigApplicationContext(ProductConfig.class);
      Product product = ctx.getBean(Product.class);
      product.setMessage("Hello World!");
      product.getMessage();
   }
}