package com.k9.example.spring.conditional;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.k9.example.spring.conditional.service.DataService;

/**
 * @author basantkumar.h
 *
 */
public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/k9/example/spring/conditional/config/application-context.xml");
		DataService service = context.getBean(DataService.class, "dataService");
		System.out.println(service.getData());

	}
}
