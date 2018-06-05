/**
 * 
 */
package edu.westga.cs.temp001.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import edu.westga.cs.temp001.model.World;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 * ADD LATER.
 *
 * @author Adam Nicholson
 * @version 06/05/2018
 *
 */
public class Temp001Controller implements Initializable {
	private World world = new World();
	private String currentLang = "English";
	private boolean isGreeting = true;
	
    @FXML
    private Label langLabel;
    
    @FXML
    private Button englishButton;

    @FXML
    private Button spanishButton;
    
    @FXML
    private CheckBox greetingCheckBox;

    @FXML
    private CheckBox farewellCheckBox;
	
	/* (non-Javadoc)
	 * @see javafx.fxml.Initializable#initialize(java.net.URL, java.util.ResourceBundle)
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.langLabel.setText("Click a button to change me!");
	}
	
    @FXML
    void englishButtonOnMouseClicked(MouseEvent event) {
    	this.currentLang = "English";
    	
    	if (this.isGreeting) {
        	this.langLabel.setText(this.world.getGreeting(this.currentLang));	
    	} 
    	else {
    		this.langLabel.setText(this.world.getGoodbye(this.currentLang));
    	}

    }

    @FXML
    void spanishButtonOnMouseClicked(MouseEvent event) {
    	this.currentLang = "Spanish";
    	
    	if (this.isGreeting) {
        	this.langLabel.setText(this.world.getGreeting(this.currentLang));	
    	} 
    	else {
    		this.langLabel.setText(this.world.getGoodbye(this.currentLang));
    	}
    }
    
    @FXML
    void farewellCheckBoxOnMouseClicked(MouseEvent event) {
    	if (this.farewellCheckBox.isSelected()) {
    		this.greetingCheckBox.selectedProperty().set(false);
    		this.langLabel.setText(this.world.getGoodbye(this.currentLang));
    		this.isGreeting = false;
    	}
    	else {
    		this.greetingCheckBox.selectedProperty().set(true);
    		this.langLabel.setText(this.world.getGreeting(this.currentLang));
    		this.isGreeting = true;
    	}
    }

    @FXML
    void greetingCheckBoxOnMouseClicked(MouseEvent event) {
    	if (this.greetingCheckBox.isSelected()) {
    		this.farewellCheckBox.selectedProperty().set(false);
    		this.langLabel.setText(this.world.getGreeting(this.currentLang));
    		this.isGreeting = true;
    	}
    	else {
    		this.farewellCheckBox.selectedProperty().set(true);
    		this.langLabel.setText(this.world.getGoodbye(this.currentLang));
    		this.isGreeting = false;
    	}
    }
}
