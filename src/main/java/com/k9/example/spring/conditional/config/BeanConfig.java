package com.k9.example.spring.conditional.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.k9.example.spring.conditional.DevDataCondition;
import com.k9.example.spring.conditional.QADataCondition;
import com.k9.example.spring.conditional.service.DataService;
import com.k9.example.spring.conditional.service.DevDataService;
import com.k9.example.spring.conditional.service.QADataService;

@Configuration
@PropertySource(value = { "classpath:application.properties" })
public class BeanConfig {


	@Bean(name = "dataService")
	@Conditional(value = QADataCondition.class)
	public DataService getQAData() {
		return new QADataService();
	}

	@Bean(name = "dataService")
	@Conditional(value = DevDataCondition.class)
	public DataService getDevData() {
		return new DevDataService();
	}
}
