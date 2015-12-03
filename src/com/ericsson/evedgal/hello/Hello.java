/**
 * 
 */
package com.ericsson.evedgal.hello;

import java.lang.reflect.Array;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

/**
 * @author evedgal
 *
 */
public class Hello {
	
	static private String defaultGreeting;
	
	static final String BASE_URI = "http://localhost:8080/myapp/";
	
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
		
		System.out.print("These are some of the holidays: " + gm.getHolidays()[0] + ", " + gm.getHolidays()[Array.getLength(gm.getHolidays())-1] + "\n");
		
//		testing web service...
//		start the web server beforehand (Main in 'simple-service' project) - the client connects to it
		
		Client c = ClientBuilder.newClient();
		WebTarget target = c.target(BASE_URI);
		
		String responseMsg = target.path("myresource").request().get(String.class);
		System.out.println(responseMsg);
		
		responseMsg = target.path("myresource2").request().get(String.class);
		System.out.println(responseMsg);
	}

}
