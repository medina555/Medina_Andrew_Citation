/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITATIONDATA;

/**
 *
 * @author Andrew
 */
public class Citation {

    /**
     * @return the cpaid
     */
    public Boolean getCpaid() {
        return cpaid;
    }

    /**
     * @param cpaid the cpaid to set
     */
    public void setCpaid(Boolean cpaid) {
        this.cpaid = cpaid;
    }

    /**
     * @return the CitationStatus
     */
  
    
     /**
     * @return the PermitNum
     */
    public String getPermitNum() {
        return PermitNum;
    }

    /**
     * @param PermitNum the PermitNum to set
     */
    public void setPermitNum(String PermitNum) {
        this.PermitNum = PermitNum;
    }

    /**
     * @return the PaymentInfo
     */
 
    /**
     * @return the ticketnumber
     */
    public int getTicketnumber() {
        return ticketnumber;
    }

    /**
     * @param ticketnumber the ticketnumber to set
     */
    public void setTicketnumber(int ticketnumber) {
        this.ticketnumber = ticketnumber;
    }

    /**
     * @return the CarMake
     */
    public String getCarMake() {
        return CarMake;
    }

    /**
     * @param CarMake the CarMake to set
     */
    public void setCarMake(String CarMake) {
        this.CarMake = CarMake;
    }

    /**
     * @return the CarModel
     */
    public String getCarModel() {
        return CarModel;
    }

    /**
     * @param CarModel the CarModel to set
     */
    public void setCarModel(String CarModel) {
        this.CarModel = CarModel;
    }

    /**
     * @return the CarYear
     */
    public String getCarYear() {
        return CarYear;
    }

    /**
     * @param CarYear the CarYear to set
     */
    public void setCarYear(String CarYear) {
        this.CarYear = CarYear;
    }

    /**
     * @return the LicenseNum
     */
    public String getLicenseNum() {
        return LicenseNum;
    }

    /**
     * @param LicenseNum the LicenseNum to set
     */
    public void setLicenseNum(String LicenseNum) {
        this.LicenseNum = LicenseNum;
    }

    /**
     * @return the State
     */
    public String getState() {
        return State;
    }

    /**
     * @param State the State to set
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * @return the ViolationType
     */
    public String getViolationType() {
        return ViolationType;
    }

    /**
     * @param ViolationType the ViolationType to set
     */
    public void setViolationType(String ViolationType) {
        this.ViolationType = ViolationType;
    }

    /**
     * @return the Date
     */
    public String getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * @return the Time
     */
    public String getTime() {
        return Time;
    }

    /**
     * @param Time the Time to set
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * @return the Issuer
     */
    public String getIssuer() {
        return Issuer;
    }

    /**
     * @param Issuer the Issuer to set
     */
    public void setIssuer(String Issuer) {
        this.Issuer = Issuer;
    }

    /**
     * @return the Location
     */
    public String getLocation() {
        return Location;
    }

    /**
     * @param Location the Location to set
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }
    private int ticketnumber;  //ticket number for citation
    private String PermitNum;  //the permit number of the vehicle (if they have one)
    private String CarMake;   // the make of the vehicle
    private String CarModel;  // the model of the vehicle
    private String CarYear;   // the year of the vehicle
    private String LicenseNum; //the licenseplate number of the vehicle
    private String State;    // the state that the licenseplate belongs to
    private String Color;    // the color of the vehicle
    private String ViolationType; //the violation type that occured 
    private String Date;
    private String Time;
    private String Issuer;
    private String Location; 
    private Boolean cpaid = false;
   
    
    
    //Constructer for TicketClass
    public Citation(int ticketnumber,String CarMake,String CarModel,String CarYear,String PermitNum,String LicenseNum, String State, String Color, String ViolationType, String Date, String Time, String Issuer, String Location,Boolean cpaid) {
        this.ticketnumber = ticketnumber;
        this.CarMake = CarMake;
        this.CarModel = CarModel;
        this.CarYear = CarYear;
        this.LicenseNum = LicenseNum;
        this.State = State;
        this.Color = Color;
        this.ViolationType = ViolationType;
        this.Date = Date;
        this.Time = Time;
        this.Issuer = Issuer;
        this.Location = Location;
        this.PermitNum = PermitNum; 
        this.cpaid = cpaid; 
 
    }
    
    public Citation(){};
     
    
}
