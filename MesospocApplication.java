package com.epam.mesos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;



@SpringBootApplication


public class MesospocApplication {

		

		public static void main(String[] args) {
			SpringApplication.run(MesospocApplication.class);
		}
		
		
	}