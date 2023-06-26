package com.june;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
public class ProductJDBCTemplate implements ProductDAO {
	
	private DataSource dataSource;
	   private JdbcTemplate jdbcTemplateObject;
	   
	   public void setDataSource(DataSource dataSource) {
	      this.dataSource = dataSource;
	      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	   }
	   /** 
	     * This is the method  record in the Product table.PRODUCT_NAME, PRODUCT_PRICE, PRODUCT_ID
	  */
	   public void create(String PRODUCT_NAME, Integer PRODUCT_PRICE) {
	      String SQL = "insert into Product (PRODUCT_NAME, PRODUCT_PRICE) values (?, ?)";
	      jdbcTemplateObject.update( SQL, PRODUCT_NAME, PRODUCT_PRICE);
	      System.out.println("Created Record PRODUCT_NAME = " + PRODUCT_NAME + " Age = " + PRODUCT_PRICE);
	      return;
	   }
	   public Product getProduct(Integer PRODUCT_ID) {
	      String SQL = "select * from Product where PRODUCT_ID = ?";
	      Product product = jdbcTemplateObject.queryForObject(SQL, 
	         new Object[]{PRODUCT_ID}, new ProductMapper());
	      
	      return product;
	   }
	   public List<Product> listProducts() {
	      String SQL = "select * from Product";
	      List <Product> products = jdbcTemplateObject.query(SQL, new ProductMapper());
	      return products;
	   }
	   public void delete(Integer PRODUCT_ID) {
	      String SQL = "delete from Product where PRODUCT_ID = ?";
	      jdbcTemplateObject.update(SQL, PRODUCT_ID);
	      System.out.println("Deleted Record with PRODUCT_ID = " + PRODUCT_ID );
	      return;
	   }
	   public void update(Integer PRODUCT_ID, Integer PRODUCT_PRICE){
	      String SQL = "update Product set PRODUCT_PRICE = ? where PRODUCT_ID = ?";
	      jdbcTemplateObject.update(SQL, PRODUCT_PRICE, PRODUCT_ID);
	      System.out.println("Updated Record with PRODUCT_ID = " + PRODUCT_ID );
	      return;
	   }

}
