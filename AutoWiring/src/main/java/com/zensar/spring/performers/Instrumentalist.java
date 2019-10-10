package com.zensar.spring.performers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.zensar.spring.instruments.Instrument;
@Component("Pyare Mohan")
public class Instrumentalist implements Performer {
	@Autowired //create obj of instrumentalist and inject guitar,property to instrumntalist
@Qualifier("guitar")
	private Instrument instrument;            //complex type
@Value("Saki Saki")
private String song;

	@Override
	public void perform() {
		// TODO Auto-generated method stub
System.out.println("Instrumentalist is playing a song "+song);
instrument.play();
	}

}
