/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITATIONDATA;

import DATABASE.Database;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Andrew
 */
public class CitationDataModel {

    /**
     * @return the mydatabase
     */
    public Database getMydatabase() {
        return mydatabase;
    }

    /**
     * @param mydatabase the mydatabase to set
     */
    public void setMydatabase(Database mydatabase) {
        this.mydatabase = mydatabase;
    }
    
     private  ArrayList<Citation> citList = new ArrayList();
  Citation mycitation = new Citation();
  private Database mydatabase = Database.getSingletonOfdatabase();

 /**
 * Sets the Current Citation object and adds it to the ArrayLIst DataType all at once
 * @param citation the citation object to be set and then added to the list
 */
    public void setCurrentUser(Citation citation )
	{
		this.mycitation =citation;
		citList.add(citation);	
	}
	
	public Citation getCurrentUser()
	{
		return mycitation;
	}
        
       
        
        
        
        
        
        
        

    /**
     * @return the citList
     */
    public ArrayList<Citation> getCitList() {
        return citList;
    }

     
    public void setCitList(ArrayList<Citation> citList) {
        this.citList = citList;
    }
  
}
