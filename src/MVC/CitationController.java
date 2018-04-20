/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import CITATIONDATA.Citation;
import CITATIONDATA.CitationDataModel;
import DATABASE.Database;
import GUI.centerGUI;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextArea;
import java.sql.*;


/**
 *
 * @author Andrew
 */
public class CitationController {
    centerGUI centerGUI;
    CitationDataModel CitationDataModel;
    Database mydb; 
   
  
    
    	public CitationController(centerGUI centerGUI, CitationDataModel CitationDataModel) {
		this.CitationDataModel= CitationDataModel;
		this.centerGUI = centerGUI;
		attachHandlers();
	}
    
        
        public void attachHandlers()
        {
           centerGUI.getAddBTN().setOnAction(
                   
                    new EventHandler<ActionEvent>()
         {
             @Override
             public void handle (ActionEvent event)
             {
     int ticketnumber = Integer.parseInt(centerGUI.getTicketNumTF().getText());  //ticket number for citation
     String PermitNum = centerGUI.getPermitNumTF().getText();  //the permit number of the vehicle (if they have one)
     String CarMake = centerGUI.getCarMakeTF().getText();   // the make of the vehicle
     String CarModel = centerGUI.getCarModelTF().getText();  // the model of the vehicle
     String CarYear = centerGUI.getCarYearTF().getText();   // the year of the vehicle
     String LicenseNum = centerGUI.getLNumberTF().getText(); //the licenseplate number of the vehicle
     String State = centerGUI.getStateTF().getText();    // the state that the licenseplate belongs to
     String Color = centerGUI.getColorTF().getText();    // the color of the vehicle
     String ViolationType = centerGUI.getViolationTypeTF().getText(); //the violation type that occured 
     String Date = centerGUI.getDateTF().getText();
     String Time = centerGUI.getTimeTF().getText();
     String Issuer = centerGUI.getIssuerTF().getText();
     String Location = centerGUI.getLocationTF().getText(); 
     Boolean cpaid = false;
                Citation currentCit = new Citation(ticketnumber,CarMake,CarModel,CarYear,PermitNum,LicenseNum,
                                                    State,Color,ViolationType,Date,Time,Issuer,Location,cpaid);
                  String FB = centerGUI.getFeedBackArea().getText();
              
             	CitationDataModel.setCurrentUser(currentCit);
                
		centerGUI.clearFields();
            
                
    
         }
         }
                   
           
           );
           
           
           
                centerGUI.getPrintBTN().setOnAction(
             new EventHandler <ActionEvent>()
             {
                 @Override
                 public void handle(ActionEvent event)
                 {
                     ArrayList<Citation> currentList = CitationDataModel.getCitList();
                     //Citation currentCitation = CitationDataModel.getCurrentUser();
			
                    // ArrayList<Citation> currentlist = new ArrayList();
                    // currentlist = CitationDataModel.getCitList();
			
                         centerGUI.setCitationIndex(0);
                         centerGUI.currentCitation(currentList,0);
                        // centerGUI.getMyLabel().setText("test");
                        
                   
                       
                     
                     
                 }
                 
             
             }
                
        );
                
                
                    centerGUI.getPrintAllBTN().setOnAction(
             new EventHandler <ActionEvent>()
             {
                 @Override
                 public void handle(ActionEvent event)
                 {
                     centerGUI.myLabel.clear();
                
                    ArrayList<Citation> citlist1 = CitationDataModel.getCitList();
	                       for(int i = 0 ; i< citlist1.size();i++){
   	
                                centerGUI.myLabel.appendText(  "Ticket Number:" + citlist1.get(i).getTicketnumber() +
                                            "Vehicle Make: " +citlist1.get(i).getCarMake() +"\n" +
                                                "Vehicle Model: " +citlist1.get(i).getCarModel() +"\n"+
                                                "Vehicle Year: " +citlist1.get(i).getCarYear()+"\n"+
                                       
                                                "Permit Number: " +citlist1.get(i).getPermitNum()+"\n"+ 
                                                "License Plate Number: " +citlist1.get(i).getLicenseNum()+"\n"+
                                                
                                                "Vehicle State: " +citlist1.get(i).getState()+"\n"+
                                                "Vehicle Color: " +citlist1.get(i).getColor()+"\n"+
                                                "Date of Citation: " +citlist1.get(i).getDate()+"\n"+
                                                "Time of Citation: " +citlist1.get(i).getTime()+"\n"+
                                                "Issuer of Citation: " +citlist1.get(i).getIssuer()+"\n"+
                                                "Location of Citation: " +citlist1.get(i).getLocation()+"\n"+
                                                "Violation: " +citlist1.get(i).getViolationType()+"\n"+
                                                 centerGUI.cStatus(citlist1.get(i).getCpaid()) +"\n" );
           
                                        }   
                
                
                 }
             }
                    );
                
                
                
                
                
                
                
                
                
                
                
                
           
          centerGUI.getExitBtn().setOnAction(e -> Platform.exit());   
           
           
                    
        centerGUI.getLeftBTN().setOnAction(
             new EventHandler <ActionEvent>()
             {
                 @Override
                 public void handle(ActionEvent event)
                 {
                    ArrayList<Citation> currentList = CitationDataModel.getCitList();
                       if(!currentList.isEmpty())
                   { 
                       int value = centerGUI.getCitationIndex();
                        if (value> 0){
                            centerGUI.setCitationIndex(value-1);
                            centerGUI.currentCitation(currentList,centerGUI.getCitationIndex());
                         
                    
                        
                        }
                            
                          
                   }
                     
                 }
                 
             
             }
                
        );
        
        
          centerGUI.getRightBTN().setOnAction(
             new EventHandler <ActionEvent>()
             {
                 @Override
                 public void handle(ActionEvent event)
                 {
                    ArrayList<Citation> currentList = CitationDataModel.getCitList();
                       if(!currentList.isEmpty())
                   { 
                 int value = centerGUI.getCitationIndex();
                        if (value<currentList.size()-1){
                            centerGUI.setCitationIndex(value+1);
                           
                            centerGUI.currentCitation(currentList,centerGUI.getCitationIndex());
                             
                        
                        }
                            //currentCitation(getCitationIndex());
                          
                   }
                     
                 }
                 
             
             }
                
        );
        
                       
        centerGUI.getPayBTN().setOnAction(
             new EventHandler <ActionEvent>()
             {
                 @Override
                 public void handle(ActionEvent event)
                 {
                            ArrayList<Citation> currentList = CitationDataModel.getCitList();
                    if(!currentList.isEmpty()){
                        
                       currentList.get(centerGUI.getCitationIndex()).setCpaid(true);
                       centerGUI.currentCitation(currentList,centerGUI.getCitationIndex());
                    // currentCitation(getCitationIndex());
                    }
                    
                    
                     
                 
                 
             
             }
                    
                 }
                 
             
                
        );
        
        
        
        
        
        
      centerGUI.getUnpayBTN().setOnAction(
             new EventHandler <ActionEvent>()
             {
                 @Override
                 public void handle(ActionEvent event)
                 {
                      ArrayList<Citation> currentList = CitationDataModel.getCitList();
                    if(!currentList.isEmpty()){
                       currentList.get(centerGUI.getCitationIndex()).setCpaid(false);
                       centerGUI.currentCitation(currentList,centerGUI.getCitationIndex());
                    // currentCitation(getCitationIndex());
                    }
                     
                 }
                 
             
             }
                
        );
        
      
            centerGUI.getUnpayBTN().setOnAction(
             new EventHandler <ActionEvent>()
             {
                 @Override
                 public void handle(ActionEvent event)
                 {
                      ArrayList<Citation> currentList = CitationDataModel.getCitList();
                    if(!currentList.isEmpty()){
                       currentList.get(centerGUI.getCitationIndex()).setCpaid(false);
                       centerGUI.currentCitation(currentList,centerGUI.getCitationIndex());
                    // currentCitation(getCitationIndex());
                    }
                     
                 }
                 
             
             }
                
        );
      
     
          
              
        centerGUI.getClrdataBTN().setOnAction(
               new EventHandler<ActionEvent>()
               {
                   @Override
                   public void handle (ActionEvent event)
                   {
                      centerGUI.clearFields();
                       
                   }
               }
        );
          
          
          
          
          	centerGUI.getStorecurrentBTN().setOnAction(
			new EventHandler<ActionEvent>()
			{
			@Override
			public void handle(ActionEvent event) 
			{
                            centerGUI.emptyFields();
			 //set int idnum = 0; 
                 Database mydb =  Database.getSingletonOfdatabase();
                 ArrayList<Citation> citlist1 = CitationDataModel.getCitList();
                                 int ticketnumber = Integer.parseInt(centerGUI.getTicketNumTF().getText());  //ticket number for citation
     String PermitNum = centerGUI.getPermitNumTF().getText();  //the permit number of the vehicle (if they have one)
     String CarMake = centerGUI.getCarMakeTF().getText();   // the make of the vehicle
     String CarModel = centerGUI.getCarModelTF().getText();  // the model of the vehicle
     String CarYear = centerGUI.getCarYearTF().getText();   // the year of the vehicle
     String LicenseNum = centerGUI.getLNumberTF().getText(); //the licenseplate number of the vehicle
     String State = centerGUI.getStateTF().getText();    // the state that the licenseplate belongs to
     String Color = centerGUI.getColorTF().getText();    // the color of the vehicle
     String ViolationType = centerGUI.getViolationTypeTF().getText(); //the violation type that occured 
     String Date = centerGUI.getDateTF().getText();
     String Time = centerGUI.getTimeTF().getText();
     String Issuer = centerGUI.getIssuerTF().getText();
     String Location = centerGUI.getLocationTF().getText(); 
     Boolean cpaid = false;
                Citation currentCit = new Citation(ticketnumber,CarMake,CarModel,CarYear,PermitNum,LicenseNum,
                                                    State,Color,ViolationType,Date,Time,Issuer,Location,cpaid);
                  String FB = centerGUI.getFeedBackArea().getText();
              
             	CitationDataModel.setCurrentUser(currentCit);
                
		centerGUI.clearFields();
                
               
                 try {   
                      Connection conn = mydb.getConn();
                      PreparedStatement mystmt = conn.prepareStatement("INSERT into citations VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                      ResultSet myrs = mydb.getMyRs();
                      while (myrs.next())
                      {
                          if (citlist1.get(centerGUI.getCitationIndex()).getTicketnumber()== myrs.getInt("ticketnumber"))
                          {
                              centerGUI.getMyLabel().setText("There already exists a ticket with primarykey(ticketnumber)" + myrs.getInt("ticketnumber") + "in the database");
                              break;
                          }
                      }
                      myrs.beforeFirst();
                      mystmt.setInt(1, citlist1.get(centerGUI.getCitationIndex()).getTicketnumber());
                      mystmt.setString(2, citlist1.get(centerGUI.getCitationIndex()).getCarMake());
                      mystmt.setString(3, citlist1.get(centerGUI.getCitationIndex()).getCarModel());
                      mystmt.setString(4, citlist1.get(centerGUI.getCitationIndex()).getCarYear());
                      mystmt.setString(5, citlist1.get(centerGUI.getCitationIndex()).getPermitNum());
                      mystmt.setString(6, citlist1.get(centerGUI.getCitationIndex()).getLicenseNum());
                      mystmt.setString(7, citlist1.get(centerGUI.getCitationIndex()).getState());
                      mystmt.setString(8, citlist1.get(centerGUI.getCitationIndex()).getColor());
                      mystmt.setString(9, citlist1.get(centerGUI.getCitationIndex()).getViolationType());
                      mystmt.setString(10, citlist1.get(centerGUI.getCitationIndex()).getDate());
                      mystmt.setString(11, citlist1.get(centerGUI.getCitationIndex()).getTime());
                      mystmt.setString(12, citlist1.get(centerGUI.getCitationIndex()).getIssuer());
                      mystmt.setString(13, citlist1.get(centerGUI.getCitationIndex()).getLocation());
                      mystmt.setString(14, centerGUI.cStatus(citlist1.get(centerGUI.getCitationIndex()).getCpaid()));
                     
                
                     mystmt.executeUpdate();
                 } catch (Exception e) {
                     
                 }
               
			
			}
				
			}

		);
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                		centerGUI.getReadBTN().setOnAction(
			new EventHandler<ActionEvent>()
			{
			@Override
			public void handle(ActionEvent event) 
			{
                            centerGUI.clearFields();
                            Database mydb = CitationDataModel.getMydatabase();
                           
                               try
                 {
                      boolean exist = false; 
                             centerGUI.clearFields();
                    
                     ResultSet myRs = mydb.getMyRs();
                         while(myRs.next())
                     {
                         System.out.println("IT worked");
                         
                         System.out.println(myRs.getInt("ticketnumber"));
                         int ticketnumber = myRs.getInt("ticketnumber");
                         for (int i = 0; i < CitationDataModel.getCitList().size(); i++) 
                         {
                             if (myRs.getInt("ticketnumber")==CitationDataModel.getCitList().get(i).getTicketnumber())
                             {
                                 exist = true;
                              
                             }
                         }
                         String CarMake = myRs.getString("CarMake");
                         String CarModel = myRs.getString("CarModel");
                         String CarYear = myRs.getString("CarYear");
                         String PermitNum = myRs.getString("PermitNum");
                         String LicenseNum = myRs.getString("LicenseNum");
                         String State = myRs.getString("State");
                         String Color = myRs.getString("Color");
                         String ViolationType = myRs.getString("ViolationType");
                         String Date = myRs.getString("TDate");
                         String Time = myRs.getString("TTime");
                         String Issuer = myRs.getString("Issuer");
                         String Location = myRs.getString("Location");
                         boolean cpaid =false; 
                         if (myRs.getString("TStatus").equals("Citation is Unpaid"))
                         {
                              cpaid = false;
                         }
                         else 
                         {
                              cpaid = true; 
                         }
                          
                           
                                     
                                     
                            
                            
                    
                         
                        
                        
                              if(exist==true)
                              {
                                    centerGUI.getMyLabel().appendText("There already exists a ticket with ticketnumber" + myRs.getInt("ticketnumber")+ "in the local list!!\n");
                                   exist =false; 
                              }
                              
                              if (exist ==false){
                                                          Citation currentciation = new Citation(ticketnumber, CarMake, CarModel, CarYear, PermitNum, LicenseNum, State, Color, ViolationType, Date, Time, Issuer, Location, cpaid);
                                                          CitationDataModel.setCurrentUser(currentciation);
                               centerGUI.getMyLabel().appendText(
                                   "Citation Number: " + ticketnumber +"\n"+   
                                                "Vehicle Make: " +CarMake +"\n" +
                                                "Vehicle Model: " +CarModel +"\n"+
                                                "Vehicle Year: " +CarYear+"\n"+
                                       
                                                "Permit Number: " +PermitNum+"\n"+ 
                                                "License Plate Number: " +LicenseNum+"\n"+
                                                
                                                "Vehicle State: " +State+"\n"+
                                                "Vehicle Color: " +Color+"\n"+
                                                "Date of Citation: " +Date+"\n"+
                                                "Time of Citation: " +Time+"\n"+
                                                "Issuer of Citation: " +Issuer+"\n"+
                                                "Location of Citation: " +Location+"\n"+
                                                "Violation: " +ViolationType+"\n"+
                                                 centerGUI.cStatus(cpaid) +"\n" +
                                                 "Feedback Information: " + "\n");
                              }
                            
                     }
                         myRs.beforeFirst();
                 }
                         catch(Exception e){}
                  
                     
                 }
                        }
                  );
                            
			 //set the fields


     
    
         
   
                                  
                           
     
            
      
         
     }
                             
                           	    
			
      
		                                             
		
                
                
                
                
                
                
                
                
                
                
                /**
         * this button will clear all of the content of the specified outputfile
         */
          
          
          
                
          
        
           
           
           
           
           
           
           
           
           
        }
    
    

