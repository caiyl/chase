package com.league.chase;

import com.league.chase.annotation.EnableDefImport;
import com.league.chase.service.SayHelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDefImport
public class ChaseApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ChaseApplication.class, args);
		SayHelloService bean = context.getBean(SayHelloService.class);
		System.out.println(bean.sayHello("chase"));
	}

}
