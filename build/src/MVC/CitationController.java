/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import CITATIONDATA.Citation;
import CITATIONDATA.CitationDataModel;
import GUI.centerGUI;
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
                         centerGUI.currentCitation(currentList,centerGUI.getCitationIndex());
                        // centerGUI.getMyLabel().setText("test");
                         System.out.println(currentList.get(1).getCarYear());
                   
                       
                     
                     
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
          
          
          
          
          
          
          
          
          
        
           
           
           
           
           
           
           
           
           
        }
    
    
}
