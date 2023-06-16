package com.june;

import org.springframework.context.ApplicationListener;

public class CustomEventClassHandler implements ApplicationListener<CustonEvent> {
	public void onApplicationEvent(CustonEvent event) {
	      System.out.println(event.toString());
	   }
	

}
