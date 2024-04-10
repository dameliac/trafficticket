package TrafficTicket;

/**
 * @author Leighton Morgan
 */

public class Person {
  private String name, dLicense;
  private int TRN;
  private String LicenseExDate; 
  protected String password;

  //default constructor 
  public Person() {
  };

  public Person(String name){
    this.name = name;
  }

  public Person(String name, int TRN, String dLicense, String LicenseExDate) {
    this.name = name;

    this.TRN = TRN;
    this.LicenseExDate = LicenseExDate;
    this.dLicense = dLicense;
  }

  public String getName() {
    return name;
  }

  public String getDLicense() {
    return dLicense;
  }

  /*public double getTicketBal() {
    return TicketBal;
  }*/

  public int getTRN() {
    return TRN;
  }

  public String getLicenseExpDate() {
    return LicenseExDate;
  }

  public String getFname() {
    String[] nameparts = name.split(" ");
    return nameparts[0];
  }

  public String getLName() {
    String[] nameparts = name.split(" ");
    return nameparts[1];
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setLicenseXDate(String Date) {
    LicenseExDate = Date;
  }

  public String toString() {
    return "Full Name " + getFname() + " " + getLName() + " TRN # " + getTRN() + " Driver's License # " + getDLicense()
        + " Expiring Date " + getLicenseExpDate();
  }

  public String fileToString(){
    return getName()+" "+getTRN()+" "+getDLicense()+" "+getLicenseExpDate();
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPassword() {
    return this.password;
  }
}
