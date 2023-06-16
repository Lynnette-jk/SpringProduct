package com.june;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventPublisher implements ApplicationEventPublisherAware{
	private ApplicationEventPublisher publisher;
	   
	   public void setApplicationEventPublisher (ApplicationEventPublisher publisher) {
	      this.publisher = publisher;
	   }
	   public void publish() {
	      CustonEvent ce = new CustonEvent(this);
	      publisher.publishEvent(ce);
	   }

}
