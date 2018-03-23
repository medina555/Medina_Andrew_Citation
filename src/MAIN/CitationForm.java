/*
 * @author Andrew Medina
 * 
 */
package MAIN;

import GUI.centerGUI;
import GUI.TitleGUI;
import GUI.rightGUI;
import MVC.CitationController;
import CITATIONDATA.CitationDataModel;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
//
/**
 *
 *
 */
public class CitationForm extends Application {
    centerGUI centerForm = new centerGUI();//the center part of the form contains all the  labels and fields and the display box
    rightGUI  paymentinfo = new rightGUI();//the text area that has the payment information it is set to the right side 
    TitleGUI maintitle = new TitleGUI();//this title of the program, the form
    CitationDataModel cdm = new CitationDataModel();
    @Override
    public void start(Stage primaryStage) {

        
        BorderPane root = new BorderPane();
        
 
       CitationController cbc = new CitationController(centerForm,cdm);
        root.setCenter(centerForm);
        root.setRight(paymentinfo);
        root.setTop(maintitle.getMainTitle());
        Scene scene = new Scene(root, 1250, 800);
        
        primaryStage.setTitle("Citaton Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
