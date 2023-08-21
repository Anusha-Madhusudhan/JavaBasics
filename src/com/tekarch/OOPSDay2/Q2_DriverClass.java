package com.tekarch.OOPSDay2;

public class Q2_DriverClass {

	public static void main(String[] args) {
		
		Logger consoleLogger=new ConsoleLogger();
		
		Logger fileLogger=new FileLogger();
		
		
		consoleLogger.log("calling log method of ConsoleLogger class");
		
		fileLogger.log("calling log method of FileLogger class");

	}

}
