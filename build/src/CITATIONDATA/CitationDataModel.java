/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITATIONDATA;

import java.util.ArrayList;

/**
 *
 * @author Andrew
 */
public class CitationDataModel {
    
    
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
   private  ArrayList<Citation> citList = new ArrayList();
  Citation mycitation = new Citation();
    
}
