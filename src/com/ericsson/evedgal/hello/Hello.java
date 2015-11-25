/**
 * 
 */
package com.ericsson.evedgal.hello;

import java.lang.reflect.Array;

/**
 * @author evedgal
 *
 */
public class Hello {
	
	static private String defaultGreeting;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GreetingManager gm = new GreetingManager(args[0]);
		
		System.out.print("Default greeting: ");
		if (args.length == 0) {
			defaultGreeting = "Not even a default greeting! BLAH!";
		} else {
			defaultGreeting = args[0];
		}
		System.out.println(defaultGreeting);
		
		gm.setGreeting("Set greeting...I mean, hello!");
		System.out.println("This is call by getter: " + gm.getGreeting());
		System.out.print("This is call by greet(): ");
		gm.greet();
		System.out.println();
		
		System.out.print("These are some of the holidays: " + gm.getHolidays()[0] + ", " + gm.getHolidays()[Array.getLength(gm.getHolidays())-1]);
	}

}
