package com.msg.ruralsourcing.jmsdemo2.service.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import com.msg.ruralsourcing.jmsdemo2.pojos.BookOrder;

@Service
public class WarehouseReceiver {

	private static final Logger LOGGER = LoggerFactory.getLogger(WarehouseReceiver.class);
	
	@JmsListener(destination = "book.order.queue")
	public void receive(BookOrder bookOrder) {
		LOGGER.info("received a message");
		LOGGER.info("Message is == " + bookOrder );
		
	
		
		
	}
}
