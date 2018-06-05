/**
 * 
 */
package edu.westga.cs.temp001;


import java.net.URL;

//import edu.westga.cs.temp001.model.World;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Main Class.
 *
 * @author Adam Nicholson
 * @version 06/04/2018
 *
 */
public class temp001 extends Application {

	private static final String GUI_RESOURCE = "edu/westga/cs/temp001/views/temp001GUI.fxml";
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		URL resource = classLoader.getResource(temp001.GUI_RESOURCE);
		FXMLLoader loader = new FXMLLoader(resource);
		Parent root = (Parent) loader.load();
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("temp001");
		primaryStage.show();
	}
	
	/**
	 * Starting point of the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		launch(args);
		
		/*
		World world = new World();
		System.out.println("Greetings:");
		System.out.println("\tEnglish:\t" + world.getGreeting("English"));
		System.out.println();
		System.out.println("\tSpanish:\t" + world.getGreeting("Spanish"));
		System.out.println();
		System.out.println("Farewells:");
		System.out.println("\tEnglish:\t" + world.getGoodbye("English"));
		System.out.println();
		System.out.println("\tSpanish:\t" + world.getGoodbye("Spanish"));
		*/
	}
}
