/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import CITATIONDATA.Citation;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import java.util.ArrayList;
/**
 *
 * @author Andrew
 */
public class centerGUI extends GridPane{

    /**
     * @return the exitBtn
     */
    public Button getExitBtn() {
        return exitBtn;
    }

    /**
     * @param exitBtn the exitBtn to set
     */
    public void setExitBtn(Button exitBtn) {
        this.exitBtn = exitBtn;
    }

    /**
     * @return the ispaid
     */
    public boolean isIspaid() {
        return ispaid;
    }

    /**
     * @param ispaid the ispaid to set
     */
    public void setIspaid(boolean ispaid) {
        this.ispaid = ispaid;
    }

    /**
     * @return the unpayBTN
     */
    public Button getUnpayBTN() {
        return unpayBTN;
    }

    /**
     * @param unpayBTN the unpayBTN to set
     */
    public void setUnpayBTN(Button unpayBTN) {
        this.unpayBTN = unpayBTN;
    }

    /**
     * @return the FeedBack
     */
    public Label getFeedBack() {
        return FeedBack;
    }

    /**
     * @param FeedBack the FeedBack to set
     */
    public void setFeedBack(Label FeedBack) {
        this.FeedBack = FeedBack;
    }

    /**
     * @return the FeedBackArea
     */
    public TextArea getFeedBackArea() {
        return FeedBackArea;
    }

    /**
     * @param FeedBackArea the FeedBackArea to set
     */
    public void setFeedBackArea(TextArea FeedBackArea) {
        this.FeedBackArea = FeedBackArea;
    }

    /**
     * @return the deleteBTN
     */
    public Button getDeleteBTN() {
        return deleteBTN;
    }

    /**
     * @param deleteBTN the deleteBTN to set
     */
    public void setDeleteBTN(Button deleteBTN) {
        this.deleteBTN = deleteBTN;
    }

    /**
     * @return the payBTN
     */
    public Button getPayBTN() {
        return payBTN;
    }

    /**
     * @param payBTN the payBTN to set
     */
    public void setPayBTN(Button payBTN) {
        this.payBTN = payBTN;
    }

    /**
     * @return the myLabel
     */
    public TextArea getMyLabel() {
        return myLabel;
    }

    /**
     * @param myLabel the myLabel to set
     */
    public void setMyLabel(TextArea myLabel) {
        this.myLabel = myLabel;
    }

    /**
     * @return the printBTN
     */
    public Button getPrintBTN() {
        return printBTN;
    }

    /**
     * @param printBTN the printBTN to set
     */
    public void setPrintBTN(Button printBTN) {
        this.printBTN = printBTN;
    }

    /**
     * @return the addBTN
     */
    public Button getAddBTN() {
        return addBTN;
    }

    /**
     * @param addBTN the addBTN to set
     */
    public void setAddBTN(Button addBTN) {
        this.addBTN = addBTN;
    }

    /**
     * @return the leftBTN
     */
    public Button getLeftBTN() {
        return leftBTN;
    }

    /**
     * @param leftBTN the leftBTN to set
     */
    public void setLeftBTN(Button leftBTN) {
        this.leftBTN = leftBTN;
    }

    /**
     * @return the rightBTN
     */
    public Button getRightBTN() {
        return rightBTN;
    }

    /**
     * @param rightBTN the rightBTN to set
     */
    public void setRightBTN(Button rightBTN) {
        this.rightBTN = rightBTN;
    }

    /**
     * @return the CitationIndex
     */
    public int getCitationIndex() {
        return CitationIndex;
    }

    /**
     * @param CitationIndex the CitationIndex to set
     */
    public void setCitationIndex(int CitationIndex) {
        this.CitationIndex = CitationIndex;
    }

    /**
     * @return the DisplayLabel
     */
    public Label getDisplayLabel() {
        return DisplayLabel;
    }

    /**
     * @param DisplayLabel the DisplayLabel to set
     */
    public void setDisplayLabel(Label DisplayLabel) {
        this.DisplayLabel = DisplayLabel;
    }

    /**
     * @return the Title
     */
   // public Label getTitle() {
    //    return Title;
   // }

    /**
     * @param Title the Title to set
     */
   // public void setTitle(Label Title) {
   //     this.Title = Title;
   // }

 
  


  

    /**
     * @return the PermitNum
     */
    public Label getPermitNum() {
        return PermitNum;
    }

    /**
     * @param PermitNum the PermitNum to set
     */
    public void setPermitNum(Label PermitNum) {
        this.PermitNum = PermitNum;
    }

    /**
     * @return the PermitNumTF
     */
    public TextField getPermitNumTF() {
        return PermitNumTF;
    }

    /**
     * @param PermitNumTF the PermitNumTF to set
     */
    public void setPermitNumTF(TextField PermitNumTF) {
        this.PermitNumTF = PermitNumTF;
    }

    /**
     * @return the CarMake
     */
    public Label getCarMake() {
        return CarMake;
    }

    /**
     * @param CarMake the CarMake to set
     */
    public void setCarMake(Label CarMake) {
        this.CarMake = CarMake;
    }

    /**
     * @return the CarMakeTF
     */
    public TextField getCarMakeTF() {
        return CarMakeTF;
    }

    /**
     * @param CarMakeTF the CarMakeTF to set
     */
    public void setCarMakeTF(TextField CarMakeTF) {
        this.CarMakeTF = CarMakeTF;
    }

    /**
     * @return the CarModel
     */
    public Label getCarModel() {
        return CarModel;
    }

    /**
     * @param CarModel the CarModel to set
     */
    public void setCarModel(Label CarModel) {
        this.CarModel = CarModel;
    }

    /**
     * @return the CarModelTF
     */
    public TextField getCarModelTF() {
        return CarModelTF;
    }

    /**
     * @param CarModelTF the CarModelTF to set
     */
    public void setCarModelTF(TextField CarModelTF) {
        this.CarModelTF = CarModelTF;
    }

    /**
     * @return the CarYear
     */
    public Label getCarYear() {
        return CarYear;
    }

    /**
     * @param CarYear the CarYear to set
     */
    public void setCarYear(Label CarYear) {
        this.CarYear = CarYear;
    }

    /**
     * @return the CarYearTF
     */
    public TextField getCarYearTF() {
        return CarYearTF;
    }

    /**
     * @param CarYearTF the CarYearTF to set
     */
    public void setCarYearTF(TextField CarYearTF) {
        this.CarYearTF = CarYearTF;
    }

    /**
     * @return the LNumber
     */
    public Label getLNumber() {
        return LNumber;
    }

    /**
     * @param LNumber the LNumber to set
     */
    public void setLNumber(Label LNumber) {
        this.LNumber = LNumber;
    }

    /**
     * @return the LNumberTF
     */
    public TextField getLNumberTF() {
        return LNumberTF;
    }

    /**
     * @param LNumberTF the LNumberTF to set
     */
    public void setLNumberTF(TextField LNumberTF) {
        this.LNumberTF = LNumberTF;
    }

    /**
     * @return the State
     */
    public Label getState() {
        return State;
    }

    /**
     * @param State the State to set
     */
    public void setState(Label State) {
        this.State = State;
    }

    /**
     * @return the StateTF
     */
    public TextField getStateTF() {
        return StateTF;
    }

    /**
     * @param StateTF the StateTF to set
     */
    public void setStateTF(TextField StateTF) {
        this.StateTF = StateTF;
    }

    /**
     * @return the Color
     */
    public Label getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(Label Color) {
        this.Color = Color;
    }

    /**
     * @return the ColorTF
     */
    public TextField getColorTF() {
        return ColorTF;
    }

    /**
     * @param ColorTF the ColorTF to set
     */
    public void setColorTF(TextField ColorTF) {
        this.ColorTF = ColorTF;
    }

    /**
     * @return the ViolationType
     */
    public Label getViolationType() {
        return ViolationType;
    }

    /**
     * @param ViolationType the ViolationType to set
     */
    public void setViolationType(Label ViolationType) {
        this.ViolationType = ViolationType;
    }

    /**
     * @return the ViolationTypeTF
     */
    public TextField getViolationTypeTF() {
        return ViolationTypeTF;
    }

    /**
     * @param ViolationTypeTF the ViolationTypeTF to set
     */
    public void setViolationTypeTF(TextField ViolationTypeTF) {
        this.ViolationTypeTF = ViolationTypeTF;
    }

    /**
     * @return the Date
     */
    public Label getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(Label Date) {
        this.Date = Date;
    }

    /**
     * @return the DateTF
     */
    public TextField getDateTF() {
        return DateTF;
    }

    /**
     * @param DateTF the DateTF to set
     */
    public void setDateTF(TextField DateTF) {
        this.DateTF = DateTF;
    }

    /**
     * @return the Time
     */
    public Label getTime() {
        return Time;
    }

    /**
     * @param Time the Time to set
     */
    public void setTime(Label Time) {
        this.Time = Time;
    }

    /**
     * @return the TimeTF
     */
    public TextField getTimeTF() {
        return TimeTF;
    }

    /**
     * @param TimeTF the TimeTF to set
     */
    public void setTimeTF(TextField TimeTF) {
        this.TimeTF = TimeTF;
    }

    /**
     * @return the Issuer
     */
    public Label getIssuer() {
        return Issuer;
    }

    /**
     * @param Issuer the Issuer to set
     */
    public void setIssuer(Label Issuer) {
        this.Issuer = Issuer;
    }

    /**
     * @return the IssuerTF
     */
    public TextField getIssuerTF() {
        return IssuerTF;
    }

    /**
     * @param IssuerTF the IssuerTF to set
     */
    public void setIssuerTF(TextField IssuerTF) {
        this.IssuerTF = IssuerTF;
    }

    /**
     * @return the Location
     */
    public Label getLocation() {
        return Location;
    }

    /**
     * @param Location the Location to set
     */
    public void setLocation(Label Location) {
        this.Location = Location;
    }

    /**
     * @return the LocationTF
     */
    public TextField getLocationTF() {
        return LocationTF;
    }

    /**
     * @param LocationTF the LocationTF to set
     */
    public void setLocationTF(TextField LocationTF) {
        this.LocationTF = LocationTF;
    }

    /**
     * @return the DisplayText
     */
    public TextArea getDisplayText() {
        return DisplayText;
    }

    /**
     * @param DisplayText the DisplayText to set
     */
    public void setDisplayText(TextArea DisplayText) {
        this.DisplayText = DisplayText;
    }

    /**
     * @return the vboxform
     */
    public VBox getVboxform() {
        return vboxform;
    }

    /**
     * @param vboxform the vboxform to set
     */
    public void setVboxform(VBox vboxform) {
        this.vboxform = vboxform;
    }

    /**
     * @return the hboxform
     */
    public HBox getHboxform() {
        return hboxform;
    }

    /**
     * @param hboxform the hboxform to set
     */
    public void setHboxform(HBox hboxform) {
        this.hboxform = hboxform;
    }

    /**
     * @return the hboxform2
     */
    public HBox getHboxform2() {
        return hboxform2;
    }

    /**
     * @param hboxform2 the hboxform2 to set
     */
    public void setHboxform2(HBox hboxform2) {
        this.hboxform2 = hboxform2;
    }

    /**
     * @return the hboxform3
     */
    public HBox getHboxform3() {
        return hboxform3;
    }

    /**
     * @param hboxform3 the hboxform3 to set
     */
    public void setHboxform3(HBox hboxform3) {
        this.hboxform3 = hboxform3;
    }

    /**
     * @return the hboxform4
     */
    public HBox getHboxform4() {
        return hboxform4;
    }

    /**
     * @param hboxform4 the hboxform4 to set
     */
    public void setHboxform4(HBox hboxform4) {
        this.hboxform4 = hboxform4;
    }

    /**
     * @return the hboxform5
     */
    public HBox getHboxform5() {
        return hboxform5;
    }

    /**
     * @param hboxform5 the hboxform5 to set
     */
    public void setHboxform5(HBox hboxform5) {
        this.hboxform5 = hboxform5;
    }

    /**
     * @return the hboxform6
     */
    public HBox getHboxform6() {
        return hboxform6;
    }

    /**
     * @param hboxform6 the hboxform6 to set
     */
    public void setHboxform6(HBox hboxform6) {
        this.hboxform6 = hboxform6;
    }

    /**
     * @return the hboxform7
     */
    public HBox getHboxform7() {
        return hboxform7;
    }

    /**
     * @param hboxform7 the hboxform7 to set
     */
    public void setHboxform7(HBox hboxform7) {
        this.hboxform7 = hboxform7;
    }

    /**
     * @return the hboxform8
     */
    public HBox getHboxform8() {
        return hboxform8;
    }

    /**
     * @param hboxform8 the hboxform8 to set
     */
    public void setHboxform8(HBox hboxform8) {
        this.hboxform8 = hboxform8;
    }
   
    
       // private Label Title = new Label("Parking Citation Form");
       
       
        
        private Label PermitNum = new Label("Permit Number");
        private TextField PermitNumTF = new TextField();
        
        private Label CarMake = new Label("Car Make");  
        private TextField CarMakeTF = new TextField();
        
        private Label CarModel = new Label("Car Model");
        private TextField CarModelTF = new TextField();
        
         private Label CarYear = new Label("Car Year");  
        private TextField CarYearTF = new TextField();
        
        private Label LNumber = new Label("License Plate Number");
        private TextField LNumberTF = new TextField();
        
         private Label State = new Label("Vehicle State");
        private TextField StateTF = new TextField();
        
         private Label Color = new Label("Vehicle Color");
        private TextField ColorTF = new TextField();
        
         private Label ViolationType = new Label("Violation:" );
        private TextField ViolationTypeTF = new TextField();
        
         private Label Date = new Label("Date of Citation");
        private TextField DateTF = new TextField();
        
         private Label Time = new Label("Time of Citation");
        private TextField TimeTF = new TextField();
        
         private Label Issuer = new Label("Issuer of Citation");
        private TextField IssuerTF = new TextField();
        
         private Label Location = new Label("Location of Citation");
        private TextField LocationTF = new TextField();
        
        
         private Label FeedBack = new Label("Enter Additional Feedback");
        private TextArea FeedBackArea = new TextArea();
        
        
        private TextArea DisplayText = new TextArea();
        private Label DisplayLabel = new Label("");
        
        
        
    public TextArea myLabel= new TextArea("");
    private Button printBTN = new Button("Print Citation");
    private Button addBTN = new Button("Add Citation");
    private Button leftBTN = new Button("<<");
    private Button rightBTN = new Button(">>");
    private Button deleteBTN = new Button("Delete Citation");
    private Button payBTN = new Button ("Set Citation to Paid");
      private Button unpayBTN = new Button ("Set Citation to Unpaid");
      
     private Button exitBtn = new Button("Exit");
      
    private int CitationIndex = 0; 
    
   private String FB;
    private int CitationNum = 1;
        
              
      public void currentCitation(ArrayList<Citation> citlist1, int index)
    {
     
        if(!citlist1.isEmpty())
        {
            
            myLabel.setText("Citation Number: " + (CitationIndex + 1)+"\n"+   
                                                "Vehicle Make: " +citlist1.get(index).getCarMake() +"\n" +
                                                "Vehicle Model: " +citlist1.get(index).getCarModel() +"\n"+
                                                "Vehicle Year: " +citlist1.get(index).getCarYear()+"\n"+
                                       
                                                "Permit Number: " +citlist1.get(index).getPermitNum()+"\n"+ 
                                                "License Plate Number: " +citlist1.get(index).getLicenseNum()+"\n"+
                                                
                                                "Vehicle State: " +citlist1.get(index).getState()+"\n"+
                                                "Vehicle Color: " +citlist1.get(index).getColor()+"\n"+
                                                "Date of Citation: " +citlist1.get(index).getDate()+"\n"+
                                                "Time of Citation: " +citlist1.get(index).getTime()+"\n"+
                                                "Issuer of Citation: " +citlist1.get(index).getIssuer()+"\n"+
                                                "Location of Citation: " +citlist1.get(index).getLocation()+"\n"+
                                                "Violation: " +citlist1.get(index).getViolationType()+"\n"+
                                                 cStatus(citlist1.get(index).getCpaid()) +"\n" +
                                                 "Feedback Information: " );
                                                        
                                                    //going to return 0 or 1 and will determinte if ticket is paid or unpaid 
                                                    
        }
    }
    
        
   
        
        
        
        //bool function that returns wheter the ticket is paid or unpaid 
        
        public String cStatus(boolean stat)
        {
            String temp = "";
            if (stat ==true)
            {
                 temp = "Citation is Paid";
            }
            if (stat ==false)
            {
                 temp = "Citation is Unpaid";
            }
            return temp; 
        }
        
        
public void clearFields()
	{
		       CarMakeTF.clear();
                 CarModelTF.clear();
                 CarYearTF.clear();
                 PermitNumTF.clear();
                 LNumberTF.clear();
                 StateTF.clear();
                 ColorTF.clear();
                 ViolationTypeTF.clear();
                 DateTF.clear();
                 TimeTF.clear();
                 IssuerTF.clear();
                 LocationTF.clear();
                 getFeedBackArea().clear();
	}
        
        

public void clearDisplayLabel()
{
    myLabel.clear();
}
        
        
        
        
        
        
        
        private VBox vboxform = new VBox(10);
        
          private VBox vboxform1 = new VBox(10);
                 private VBox vboxform2 = new VBox(10);
        private VBox buttonvbox = new VBox(10);
        private HBox hboxform = new HBox(355);
        private HBox hboxform2 = new HBox(10);
        private HBox hboxform3 = new HBox(85);
        private HBox hboxform4 = new HBox(10);
         private HBox hboxform5 = new HBox(90);
        private HBox hboxform6 = new HBox(10);
        private HBox hboxform7 = new HBox(80);
        private HBox hboxform8 = new HBox(10);
        private int myCstatus = 0; 
        private boolean ispaid = false; //by default the ticket is set to upaid 
        
 public centerGUI()
 {
       //this lambda action event will close the program 
     FeedBackArea.setPrefHeight(100);
     FeedBackArea.setPrefWidth(40);
        //this will control the addiing of the citations to the list, and will create a new citaiton object that has the data the user entered 

        
       //this function  
   
        
       
      
        
        //this button will go to the next item inthe Citation Array only if the list isnt empy and the Current Ciation is less then the total size of the array -1
      
       
        
        
        
    
        
        
        
    
     
     
     
     
     
     
     
     
     
     
     
     //Title.setAlignment(Pos.TOP_CENTER);
     //Title.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 40));
       
      
     
     
     this.setHgap(10);
     this.setVgap(10);
     this.setAlignment(Pos.TOP_CENTER);
     //this hbox will have the navigage left and right buttons
     hboxform.getChildren().addAll(leftBTN,rightBTN);
   
      //i set up two vboxes that hold all the labels and text fields
      vboxform1.getChildren().addAll(CarMake,CarMakeTF,CarYear,CarYearTF,PermitNum,PermitNumTF,State,StateTF,Date,DateTF,ViolationType,ViolationTypeTF);
      vboxform2.getChildren().addAll(CarModel,CarModelTF,LNumber,LNumberTF,Color,ColorTF,Issuer,IssuerTF,Time,TimeTF,Location,LocationTF,FeedBack,FeedBackArea);
      
      
      
      
      
      
 
   buttonvbox.setAlignment(Pos.CENTER_LEFT);
   myLabel.setPrefHeight(300);
   
     vboxform.getChildren().addAll(myLabel,hboxform);
     buttonvbox.getChildren().addAll(printBTN,addBTN,deleteBTN,payBTN,unpayBTN,exitBtn);
    
     this.addRow(1,buttonvbox);
     this.add(vboxform1,1,1);
     this.add(vboxform2, 3, 1);
     this.add(vboxform,2,1);
    
    
 }       
        
  
}
