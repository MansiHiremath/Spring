package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performers.Performer;

public class ZensarIdolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ctx=new ClassPathXmlApplicationContext("performers.xml");
Performer p=ctx.getBean("Mansi", Performer.class);
p.perform();
//shutting down spring ioc container
ConfigurableApplicationContext cfgctx=(ConfigurableApplicationContext) ctx;
cfgctx.close();
	}

}
