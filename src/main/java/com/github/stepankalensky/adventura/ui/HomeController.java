package com.github.stepankalensky.adventura.ui;



import com.github.stepankalensky.adventura.logika.IHra;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
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
	@FXML private TextArea textVypis;
    @FXML private Button odesli;
	private IHra hra;
	
	/**
	 * Metoda čte příkaz ze vstupního textového pole
	 * a zpracuje ho...
	 */
	public void odesliPrikaz() {
		 String vypis = hra.zpracujPrikaz(textVstup.getText());
		 textVypis.appendText("\n--------\n"+textVstup.getText()+"\n-------\n");
		 textVypis.appendText(vypis);
		 textVstup.setText("");
		 
		 if(hra.konecHry()) {
			  textVypis.appendText("\n\n Konec hry \n");
			  textVstup.setDisable(true);
			  odesli.setDisable(true);
			  
			}

		
	}
	public void inicializuj(IHra hra) {
		this.hra = hra;
		textVypis.setText(hra.vratUvitani());
	}
	

}