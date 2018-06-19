package com.k9.example.spring.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;


public class DevDataCondition implements Condition {

	public boolean matches(ConditionContext context, AnnotatedTypeMetadata arg1) {
		String activeKey = context.getEnvironment().getProperty("active.env");
		return activeKey.equalsIgnoreCase("dev");
	}

}
