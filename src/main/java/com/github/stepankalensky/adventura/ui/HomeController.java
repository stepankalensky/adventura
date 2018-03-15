package com.github.stepankalensky.adventura.ui;

import com.github.stepankalensky.adventura.logika.IHra;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 * Kontroler, který zprostředkovává komunikaci mezi grafikou
 * a logikou adventury
 * 
 * @author Filip Vencovsky
 *
 */
public class HomeController extends GridPane {
	
	@FXML private TextField textVstup;
	
	/**
	 * Metoda čte příkaz ze vstupního textového pole
	 * a zpracuje ho...
	 */
	public void odesliPrikaz() {
//		TODO zpracovat příkaz a vepsat výsledek do výstupní oblasti
		System.out.println(textVstup.getText());
		
	}
	public void inicializuj(IHra hra) {
		
	}
	

}