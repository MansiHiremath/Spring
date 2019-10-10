package com.zensar.spring;

import org.springframework.stereotype.Component;

@Component("festival") //replaces bean definition
public class FestivalGreeting implements Greeting {
public FestivalGreeting() {
	// TODO Auto-generated constructor stub
System.out.println("Festival Greeting is created");
}
	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return "Happy Dusshera";
	}

}
