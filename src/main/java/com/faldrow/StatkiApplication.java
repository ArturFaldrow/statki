package com.faldrow;

import com.faldrow.repo.ElementRepo;
import com.faldrow.service.PeopleClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class StatkiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StatkiApplication.class, args);
	}


	@Autowired
	private PeopleClient peopleClient;

	@EventListener(ApplicationReadyEvent.class)
	public void init(){
	peopleClient.save();
	}

}
