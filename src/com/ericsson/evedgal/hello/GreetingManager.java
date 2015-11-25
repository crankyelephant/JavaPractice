/**
 * 
 */
package com.ericsson.evedgal.hello;

/**
 * @author evedgal
 *
 */
public class GreetingManager {
	public GreetingManager(String defaultGreeting) {
		this.greeting = defaultGreeting;
	}
	
	private String greeting;

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	void greet() {
		System.out.print(getGreeting());
	}
	
	private String[] holidays = {"Xmas", "Easter", "4th July"};
	
	public String[] getHolidays() {
		return holidays;
	}
}
