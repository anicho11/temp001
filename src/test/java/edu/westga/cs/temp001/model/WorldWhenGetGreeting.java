/**
 * 
 */
package edu.westga.cs.temp001.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test for {@link World#getGreeting(String)} 
 *
 * @author Adam Nicholson
 * @version 06/04/2018
 */
public class WorldWhenGetGreeting {

	/**
	 * Confirm that passing "English" to {@link World#getGreeting(String)} 
	 * returns "Hello World!"
	 */
	@Test
	public void shouldGetHelloWorld() {
		World world = new World();
		
		assertEquals("Hello World!", world.getGreeting("English"));
	}
	
	/**
	 * Confirm that passing "Spanish" to {@link World#getGreeting(String)} 
	 * returns "Hola Mundo!"
	 */
	@Test
	public void shouldGetHolaMundo() {
		World world = new World();
		
		assertEquals("Hola Mundo!", world.getGreeting("Spanish"));
	}
	
	/**
	 * Confirm that passing "Greek" to {@link World#getGreeting(String)} 
	 * returns "Invalid language."
	 */
	@Test
	public void shouldGetInvalidLanguage() {
		World world = new World();
		
		assertEquals("Invalid language.", world.getGreeting("Greek"));
	}
}
