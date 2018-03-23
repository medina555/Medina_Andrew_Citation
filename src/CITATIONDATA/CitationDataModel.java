/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITATIONDATA;

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
    
     private  ArrayList<Citation> citList = new ArrayList();
  Citation mycitation = new Citation();
  OutputStreamWriter out;
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
        
        public  CitationDataModel()
        {
            	try {
	out= new OutputStreamWriter(new BufferedOutputStream(
              new FileOutputStream("tickets.dat",true)));
			
		} catch (Exception e) {
		}
      
        }
        /**
         * 
         * This method takes a Citation object, and stores all of its data in an output file
         * 
         * @param currentcit the current citation object to be written to an output file
         */ 
        	public void storeTicketObject(Citation currentcit)
	{
            
           
		try {
                  
               out.write("Ticket Number\n");
                
                String  ticketnumber =Integer.toString(mycitation.getTicketnumber());
                out.write(ticketnumber);
                out.write("\n");
                  out.write("Car Make:\n");
		out.write(mycitation.getCarMake());
                 out.write("\n");
                 out.write("Car Model:\n");
		out.write( mycitation.getCarModel());
                  out.write("\n");
                   out.write("Car Year:\n");
		out.write(mycitation.getCarYear());
                  out.write("\n");
                        out.write("Permit Number:\n");
                out.write(mycitation.getPermitNum());
                out.write("\n");
                  out.write("License Number:\n");
		out.write(mycitation.getLicenseNum());
                out.write("\n");
                 out.write("Car State:\n");
		out.write( mycitation.getState());
                  out.write("\n");
                   out.write("Car Color:\n");
		out.write(mycitation.getColor());
                  out.write("\n");
                 out.write("ViolationType:\n");
                out.write(mycitation.getViolationType());
                out.write("\n");
                  out.write("Date:\n");
		out.write(mycitation.getDate());
                out.write("\n");
                 out.write("Time:\n");
		out.write( mycitation.getTime());
                  out.write("\n");
                   out.write("Issuer:\n");
		out.write(mycitation.getIssuer());
                  out.write("\n");
		  out.write("Location:\n");
		out.write( mycitation.getLocation());
                  out.write("\n");
                 
		     String str = String.valueOf(mycitation.getCpaid());
                      out.write("Paid Status:\n");
                      out.write(str);
                  out.write("\n");;
                    
		out.close();
                
		} catch (Exception e) {
		}

		
	}
        
        
        
        /**
         *  this function stores all the data from all of the elements in the Citation clist 
         * this is used to store all the data at once, after multiple submissions instead of each time after submission
         * @param clist the current arraylist datastructure of ArrayList of type Citation
         *
         */
        
        
         public void storeticketObjects(ArrayList<Citation> clist)
	{
           int count = 0; 
               clist = getCitList();
          
		try {
                
                    for (int i = 0; i <clist.size(); i++) 
                        
                    
   
               {
                out.write("Ticket Number\n");
                count ++; 
                
                String  ticketnumber =Integer.toString( count);
                out.write(ticketnumber);
                out.write("\n");
                  out.write("Car Make:\n");
		out.write(getCitList().get(i).getCarMake());
                out.write("\n");
                 out.write("Car Model:\n");
		out.write( clist.get(i).getCarModel());
                  out.write("\n");
                   out.write("Car Year:\n");
		out.write(clist.get(i).getCarYear());
                  out.write("\n");
                        out.write("Permit Number:\n");
                out.write(clist.get(i).getPermitNum());
                out.write("\n");
                  out.write("License Number:\n");
		out.write(clist.get(i).getLicenseNum());
                out.write("\n");
                 out.write("Car State:\n");
		out.write( clist.get(i).getState());
                  out.write("\n");
                   out.write("Car Color:\n");
		out.write(clist.get(i).getColor());
                  out.write("\n");
                 out.write("ViolationType:\n");
                out.write(clist.get(i).getViolationType());
                out.write("\n");
                  out.write("Date:\n");
		out.write(clist.get(i).getDate());
                out.write("\n");
                 out.write("Time:\n");
		out.write( clist.get(i).getTime());
                  out.write("\n");
                   out.write("Issuer:\n");
		out.write(clist.get(i).getIssuer());
                  out.write("\n");
		  out.write("Location:\n");
		out.write( clist.get(i).getLocation());
                  out.write("\n");
                 
		     String str = String.valueOf(clist.get(i).getCpaid());
                      out.write("Paid Status:\n");
                      out.write(str);
                  out.write("\n");
		                
                }   
		out.close();
                    
                    
		} 
                
                catch (Exception e) {
		}
           }
		
        /**
         * this method clears the tickets.dat file so that it can be emptied of its contents or the file can manually be deleted
         */
            public void cleardata()
        {try{
         PrintWriter writer = new PrintWriter("tickets.dat");
writer.print("");
    writer.close();
        }catch (Exception e){}
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
