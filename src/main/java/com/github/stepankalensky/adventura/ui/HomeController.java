package com.github.stepankalensky.adventura.ui;


import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


public class HomeController extends GridPane {
	
	@FXML private TextField textVstup;
	
	public void odesli() {
		System.out.println(textVstup).getText());
		
	}
	

}
