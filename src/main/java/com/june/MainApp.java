package com.june;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.june.ProductJDBCTemplate;


public class MainApp {
   public static void main(String[] args) {
	   ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

	      ProductJDBCTemplate productJDBCTemplate = 
	         (ProductJDBCTemplate)context.getBean("productJDBCTemplate");
	      
	      System.out.println("------Records Creation--------" );
	      productJDBCTemplate.create("Glaze", 23699);
	      productJDBCTemplate.create("Royal", 23694);
	      productJDBCTemplate.create("CTC", 22399);
	      /** 
	       * This is the method  record in the Product table.PRODUCT_NAME, PRODUCT_PRICE, PRODUCT_ID
	    */
	      System.out.println("------Listing Multiple Records--------" );
	      List<Product> products = productJDBCTemplate.listProducts();
	      
	      for (Product record : products) {
	         System.out.print("PRODUCT_ID : " + record.getPRODUCT_ID() );
	         System.out.print(", PRODUCT_NAME : " + record.getPRODUCT_NAME() );
	         System.out.println(", PRODUCT_PRICE : " + record.getPRODUCT_PRICE());
	      }

	      System.out.println("----Updating Record with PRODUCT_ID = 2 -----" );
	      productJDBCTemplate.update(2, 20);

	      System.out.println("----Listing Record with PRODUCT_ID = 2 -----" );
	      Product product = productJDBCTemplate.getProduct(2);
	      System.out.print("PRODUCT_ID : " + product.getPRODUCT_ID() );
	      System.out.print(", PRODUCT_NAME : " + product.getPRODUCT_NAME() );
	      System.out.println(", PRODUCT_PRICE : " + product.getPRODUCT_PRICE());
   }
}