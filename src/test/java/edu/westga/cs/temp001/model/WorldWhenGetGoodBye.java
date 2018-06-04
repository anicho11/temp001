package edu.westga.cs.temp001.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WorldWhenGetGoodBye {

	private World world;
	
	@Before
	public void setup() {
		this.world = new World();		
	}
	
	/**
	 * Confirm that passing "English" to {@link World#getGoodbye(String)}
	 * returns "Goodbye World!"
	 */
	@Test
	public void shouldGetGoodbyeWorld() {
		assertEquals("Goodbye World!", this.world.getGoodbye("English"));
	}
	
	/**
	 * Confirm that passing "Spanish" to {@link World#getGoodbye(String)}
	 * returns "Hasta Luego Mundo!"
	 */
	@Test
	public void shouldGetHastaLuegoMundo() {
		assertEquals("Hasta Luego Mundo!", this.world.getGoodbye("Spanish"));
	}
	
	/**
	 * Confirm that passing non-Spanish/English languages to {@link World#getGoodbye(String)}
	 * returns "Invalid language".
	 */
	@Test
	public void shouldGetInvalidLanguage() {
		assertEquals("Invalid language.", this.world.getGoodbye("Greek"));
		assertEquals("Invalid language.", this.world.getGoodbye("French"));
		assertEquals("Invalid language.", this.world.getGoodbye("Russian"));
		assertEquals("Invalid language.", this.world.getGoodbye("German"));
		assertEquals("Invalid language.", this.world.getGoodbye("Mandarin"));
		assertEquals("Invalid language.", this.world.getGoodbye("Vietnamese"));
	}
}
