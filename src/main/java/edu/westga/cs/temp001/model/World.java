/**
 * 
 */
package edu.westga.cs.temp001.model;

/**
 * Gets a greeting for English/Spanish.
 *
 * @author Adam Nicholson
 * @version 06/04/2018
 *
 */
public class World {
	
	public World() {
	}
	
	/**
	 * Accepts a language argument that, if not null or empty, will determine a string
	 * to be returned.
	 * 
	 * 
	 * @precondition lang != null, lang != ""
	 * @postcondition greeting is returned based on lang input
	 * 
	 * @param lang String representation of a language.
	 * @return greeting String greeting.
	 */
	public String getGreeting(String lang) {
		if (lang == null) {
			throw new IllegalArgumentException("Language cannot be null");
		}
		if (lang == "") {
			throw new IllegalArgumentException("Language cannot be empty");
		}
		
		String greeting = "";
		
		if (lang == "English") {
			greeting = "Hello World!";
		} 
		else if (lang == "Spanish") {
			greeting = "Hola Mundo!";
		} 
		else {
			return "Invalid language.";
		}
		
		return greeting;
	}
	
	/**
	 * Accepts a language argument that, if not null or empty, will determine a string
	 * to be returned.
	 * 
	 * 
	 * @precondition lang != null, lang != ""
	 * @postcondition farewell is returned based on lang input
	 * 
	 * @param lang String representation of a language.
	 * @return farewell String farewell.
	 */
	public String getGoodbye(String lang) {
		
		if (lang == "English") {
			return "Goodbye World!";
		}
		else if (lang == "Spanish") {
			return "Hasta Luego Mundo!";
		}
		else {
			return "Invalid language.";
		}
	}
}
