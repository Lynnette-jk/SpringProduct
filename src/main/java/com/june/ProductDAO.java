package com.june;

import java.util.List;
import javax.sql.DataSource;


public interface ProductDAO {
   /** 
      * This is the method to be used to initialize
      * database resources ie. connection.
   */
   public void setDataSource(DataSource ds);
   
   /** 
      * This is the method to be used to create
      * a record in the Product table.PRODUCT_NAME, PRODUCT_PRICE
   */
   public void create(String PRODUCT_NAME, Integer PRODUCT_PRICE);
   
   /** 
      * This is the method to be used to list down
      * a record from the Product table corresponding
      * to a passed product id.
   */
   public Product getProduct(Integer PRODUCT_ID);
   
   /** 
      * This is the method to be used to list down
      * all the records from the Product table.PRODUCT_ID
   */
   public List<Product> listProducts();
   
   /** 
      * This is the method to be used to delete
      * a record from the Product table corresponding
      * to a passed Product id.
   */
   public void delete(Integer PRODUCT_ID);
   
   /** 
      * This is the method to be used to update
      * a record into the Product table.
   */
   public void update(Integer PRODUCT_ID, Integer PRODUCT_PRICE);
}

