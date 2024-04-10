package TrafficTicket;



/**
 * @author Leighton Morgan
 */

public class ExpiredLicenseTicket extends Ticket {
  private int exTime;

  public ExpiredLicenseTicket(String TicketID, String courtDate, String daTeRecieved, String Vehicle, Person ticketHolder, int exTime) {
    super(TicketID,courtDate, daTeRecieved, Vehicle, ticketHolder,"EL");
    this.exTime = exTime;
  }

  public int getexTime() {
    return exTime;
  }

  @Override
  public double calcFee() {
    return exTime * 10.50;
  }

  public String toString() {
    return "Expired License Ticket " + getTicketID() + " Date Recieved " + getdaTeRecieved() + " Expired Time "
        + getexTime() + " Court Date " + getcourtDate() + " Fee $" + getFee();
  }

  public String fileToString(){
    return getTicketID()+" "+getcourtDate()+" "+getdaTeRecieved()+" "+getVehicle()+" "+getTicketHolder().getTRN()+" "+
            getType()+" "+getexTime();
  }
}
