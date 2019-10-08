package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performer.Juggler;
import com.zensar.spring.performer.Performer;

public class ZensarIdol {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("performers.xml");
	Performer p=ctx.getBean("Pyare Mohan", Performer.class);
	p.perform();
	Performer p1=ctx.getBean("Katrina Kaif",Performer.class);
	p1.perform();
}
}
