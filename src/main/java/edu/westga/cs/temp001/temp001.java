/**
 * 
 */
package edu.westga.cs.temp001;

import edu.westga.cs.temp001.model.World;

/**
 * Main Class.
 *
 * @author Adam Nicholson
 * @version 06/04/2018
 *
 */
public class temp001 {

	/**
	 * Starting point of the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		World world = new World();
		System.out.println("English:\t" + world.getGreeting("English"));
		System.out.println();
		System.out.println("Spanish:\t" + world.getGreeting("Spanish"));
	}
}
