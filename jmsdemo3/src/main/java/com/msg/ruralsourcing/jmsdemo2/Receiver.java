package com.msg.ruralsourcing.jmsdemo2;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

// @Component will make the class available to the spring context and allows other spring beans to find it. 

@Component 
public class Receiver {

	@JmsListener(destination="order-queue")
	public void receiveMessage(String message) {
		System.out.println("Order received is: " + message );
		
		// Receiver class 
		
	}
}
