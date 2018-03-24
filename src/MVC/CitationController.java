/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import CITATIONDATA.Citation;
import CITATIONDATA.CitationDataModel;
import GUI.centerGUI;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextArea;


/**
 *
 * @author Andrew
 */
public class CitationController {
    centerGUI centerGUI;
    CitationDataModel CitationDataModel;
   
  
    
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
     int ticketnumber = 0;  //ticket number for citation
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
                CitationDataModel.storeTicketObject(currentCit);
                
    
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
   	
                                centerGUI.myLabel.appendText(  "Ticket Number:" + (i +1) +
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
        
     
          
              
        centerGUI.getDeleteBTN().setOnAction(
               new EventHandler<ActionEvent>()
               {
                   @Override
                   public void handle (ActionEvent event)
                   {
                        ArrayList<Citation> currentList = CitationDataModel.getCitList();
                     if(!currentList.isEmpty())
                     {int value = centerGUI.getCitationIndex();
                         if(centerGUI.getCitationIndex()>0)
                         {    
                         currentList.remove(value);
                        centerGUI.clearDisplayLabel();
                        centerGUI.setCitationIndex(value-1);
                        
                             centerGUI.currentCitation(currentList,centerGUI.getCitationIndex());
                         }
                         
                         if(value==0)
                         {    
                         currentList.remove(value);
                          centerGUI.clearDisplayLabel();
                           centerGUI.currentCitation(currentList,centerGUI.getCitationIndex());
                         }
                         
                     }
                    
                    
                       if(currentList.isEmpty())
                       {centerGUI.getMyLabel().setText("There are no more tickets!!!");}
                       
                   }
               }
        );
          
          
          
          
          	centerGUI.getStoreallBTN().setOnAction(
			new EventHandler<ActionEvent>()
			{
			@Override
			public void handle(ActionEvent event) 
			{
			 //set the fields
			ArrayList<Citation> clist = CitationDataModel.getCitList();
			      System.out.println("it worked");
			CitationDataModel.storeticketObjects(clist);
			}
				
			}

		);
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                		centerGUI.getReadBTN().setOnAction(
			new EventHandler<ActionEvent>()
			{
			@Override
			public void handle(ActionEvent event) 
			{
			 //set the fields
			int count = 0;      
                         String alldata = "";
	
		           		try {
	FileReader in= new FileReader("tickets.dat");
       BufferedReader br = new BufferedReader(in);
       
  String line;
 

     while((line = br.readLine()) != null){
      String tn = br.readLine();
      int ticketnumber = Integer.parseInt(tn);//ticket number for citation
          br.readLine();
        
 
     
      String CarMake = br.readLine();  // the make of the vehicle
       br.readLine();
      String CarModel = br.readLine();  // the model of the vehicle
       br.readLine();
      String CarYear = br.readLine(); 
      br.readLine();
          String PermitNum =br.readLine();  //the permit number of the vehicle (if they have one)
      br.readLine();// the year of the vehicle
     String LicenseNum = br.readLine();
        br.readLine();//the licenseplate number of the vehicle
     String State = br.readLine();
     br.readLine();// the state that the licenseplate belongs to
     String Color = br.readLine();
     br.readLine();// the color of the vehicle
     String ViolationType = br.readLine();
     br.readLine();//the violation type that occured 
     String Date = br.readLine();
     br.readLine();
     String Time = br.readLine();
     br.readLine();
     String Issuer = br.readLine();
     br.readLine();
     String Location =br.readLine();
     br.readLine();
     String boolvalue = br.readLine();
     Boolean cpaid = Boolean.parseBoolean(boolvalue);

     Citation currentciation = new Citation(ticketnumber, CarMake, CarModel, CarYear, PermitNum, LicenseNum, State, Color, ViolationType, Date, Time, Issuer, Location, cpaid);
      CitationDataModel.setCurrentUser(currentciation);
    
         count++;
      centerGUI.clearFields();
                                  
                           
     
            
      
         
     }
                             
                           	    
			
        in.close();
		                                             
		}
                                    
                                        catch (Exception e) {
		}
               
	
	  // System.out.println(count);
			
			}
				
			}

		);
                
                
                
                
                
                
                
                
                
                
                
                /**
         * this button will clear all of the content of the specified outputfile
         */
          
          
          	centerGUI.getClrdataBTN().setOnAction(
			new EventHandler<ActionEvent>()
			{
			@Override
			public void handle(ActionEvent event) 
			{
			 //set the fields
			CitationDataModel.cleardata();
                        centerGUI.clearFields();
                        centerGUI.getMyLabel().clear();
			
			}
				
			}

		);
                
          
        
           
           
           
           
           
           
           
           
           
        }
    
    
}
