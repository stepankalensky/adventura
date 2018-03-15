/* Soubor je ulozen v kodovani UTF-8.
 * Kontrola kódování: Příliš žluťoučký kůň úpěl ďábelské ódy. */
package com.github.stepankalensky.adventura.main;



import com.github.stepankalensky.adventura.logika.*;
import com.github.stepankalensky.adventura.ui.HomeController;
import com.github.stepankalensky.adventura.ui.TextoveRozhrani;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*******************************************************************************
 * Třída {@code Start} je hlavní třídou projektu,
 * který ...
 *
 * @author    Filip Vencovský
 * @version   0.00.000
 */
public class Start extends Application
{
    /***************************************************************************
     * Metoda, prostřednictvím níž se spouští celá aplikace.
     *
     * @param args Parametry příkazového řádku
     */
    public static void main(String[] args)
    {
//		  TODO parametrické spuštění hry
//        IHra hra = new Hra();
//        TextoveRozhrani ui = new TextoveRozhrani(hra);
//        ui.hraj();
    	
    	launch(args);
    }
    
    /**
	 * Metoda, ve které se konstruuje okno, kontroler a hra,
	 * která se předává kontroleru
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(getClass().getResource("../ui/MainWindow.fxml"));    	
    	Parent root = loader.load();

 //		TODO předání hry kontroleru
     	HomeController controller = loader.getController();
   	    IHra hra = new Hra();
		controller.inicializuj(hra);
    	
    	primaryStage.setScene(new Scene(root));
    	primaryStage.show();
    	primaryStage.setTitle("Základní adventura");
		
	}
}
