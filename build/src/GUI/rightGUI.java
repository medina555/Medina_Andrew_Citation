/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

/**
 *
 * @author Andrew
 */
public class rightGUI extends VBox{
    private String  payInfo =  //for now payment informattion is an information field, lists all the informatino on the back of the citation from the example 
             "Tickets can be paid at: \n"
            + "Business Office, Tandy 107\n"  
            +"Monday Thru Thursday 8:00am to 5:00pm\n"
            + "$25 Dollars Per Citation, other fees may apply\n"
            + "$100 for Boot Removal\n\n"
            + "Payment can be mailed to the following address:\n"
            + "TSC\n"
            + "C/O Finance Dept\n"
            + "Attn:Parking Enforcement\n"
            + "80 Fort Brown\n"
            + "Brownsville,TX 78520\n"
            + "DO NOT MAIL IN CASH\n"
            + "For more information on parking citations please visit\n"
            + "www.tsc.edu/parking\n";
    private TextArea paymentInfo = new TextArea(payInfo);
    private Label pInfo = new Label("Payment Information");
   
             
    
   public rightGUI()
   {
            pInfo.setAlignment(Pos.TOP_RIGHT);
     pInfo.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 30));
       
       
       this.setPadding(new Insets(10));
      paymentInfo.setPrefHeight(350);
      paymentInfo.setPrefWidth(300);
       this.setAlignment(Pos.TOP_RIGHT);
       this.getChildren().addAll(pInfo,paymentInfo);

    
   }
    
}
