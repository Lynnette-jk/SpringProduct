package com.june;
import org.springframework.context.annotation.*;

@Configuration
public class ProductConfig {
   @Bean 
   public Product product(){
      return new Product();
   }
}