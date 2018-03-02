/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

/**
 *
 * @author Andrew
 */
public class TitleGUI  {

    /**
     * @return the mainTitle
     */
    public Label getMainTitle() {
        return mainTitle;
    }

    /**
     * @param mainTitle the mainTitle to set
     */
    public void setMainTitle(Label mainTitle) {
        this.mainTitle = mainTitle;
    }
    private Label mainTitle = new Label("Parking Citation Form");
         
     
    public TitleGUI()
    {
         
        mainTitle.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 40));
        mainTitle.setAlignment(Pos.TOP_CENTER);
        mainTitle.setPadding(new Insets(0, 0, 50, 325));
    }
    
    
}
