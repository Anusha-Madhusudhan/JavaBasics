package com.tekarch.OOPSDay2;

public class ConsoleLogger implements Logger{

	@Override
	public void log(String message) {
		
		System.out.println(message);
		
	}

}
