package com.june;

public class Product {
	/** 
     * This is the method  record in the Product table.PRODUCT_NAME, PRODUCT_PRICE, PRODUCT_ID
  */
	private Integer PRODUCT_PRICE;
	   private String PRODUCT_NAME;
	   private Integer PRODUCT_ID;

	   public void setPRODUCT_PRICE(Integer PRODUCT_PRICE) {
	      this.PRODUCT_PRICE = PRODUCT_PRICE;
	   }
	   public Integer getPRODUCT_PRICE() {
	      return PRODUCT_PRICE;
	   }
	   public void setPRODUCT_NAME(String PRODUCT_NAME) {
	      this.PRODUCT_NAME = PRODUCT_NAME;
	   }
	   public String getPRODUCT_NAME() {
	      return PRODUCT_NAME;
	   }
	   public void setPRODUCT_ID(Integer PRODUCT_ID) {
	      this.PRODUCT_ID = PRODUCT_ID;
	   }
	   public Integer getPRODUCT_ID() {
	      return PRODUCT_ID;
	   }

}
