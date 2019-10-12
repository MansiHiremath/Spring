package com.zensar.spring.performers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.zensar.spring.exceptions.PerformanceException;

@Component("Mansi")
public class Juggler implements Performer {
	@Value("2")
	private int beanBags;

	@Override
	public void perform() throws PerformanceException {
		// TODO Auto-generated method stub
		if (beanBags < 3)
			throw new PerformanceException("No of bean bags are not sufficient");
		else
			System.out.println("Juggler juggling bean bags " + beanBags);
	}

}
