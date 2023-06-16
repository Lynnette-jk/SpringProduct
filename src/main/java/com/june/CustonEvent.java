package com.june;

import org.springframework.context.ApplicationEvent;

public class CustonEvent extends ApplicationEvent{
	public CustonEvent(Object source) {
	      super(source);
	   }
	   public String toString(){
	      return "My Custom Event";
	   }
}
