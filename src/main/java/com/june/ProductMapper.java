package com.june;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class ProductMapper implements RowMapper<Product> {
	
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
	      Product product = new Product();
	      product.setPRODUCT_ID(rs.getInt("PRODUCT_ID"));
	      product.setPRODUCT_NAME(rs.getString("PRODUCT_NAME"));
	      product.setPRODUCT_PRICE(rs.getInt("PRODUCT_PRICE"));
	      
	      return product;
	   }
	
}
