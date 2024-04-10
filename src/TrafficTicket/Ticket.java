package TrafficTicket;
/**
 * @author Leighton Morgan
 */

public abstract class Ticket  {
  private String courtDate, daTeRecieved;
  private String Vehicle, TicketID;
  private double fee;
  private Person ticketHolder;
  private String type;

  public Ticket(){} //default constructor

  public Ticket(String TicketID, String courtDate, String daTeRecieved, String Vehicle, Person ticketHolder,String type) {
    this.ticketHolder = ticketHolder;
    this.Vehicle = Vehicle;
    this.courtDate = courtDate;
    this.daTeRecieved = daTeRecieved;
    this.TicketID = TicketID;
    this.type = type;
    

  }

  public String getType(){
    return type;
  }

  public String getcourtDate() {
    return courtDate;
  }

  public String getdaTeRecieved() {
    return daTeRecieved;
  }

  public String getVehicle() {
    return Vehicle;
  }

  public double getFee() {
    return fee;
  }

  public String getTicketID() {
    return TicketID;
  }

  public void setCourtDate(String Date) {
    this.courtDate = Date;
  }

  public Person getTicketHolder(){
    return ticketHolder;
  }

  public String toString() {
    return "Ticket " + getTicketID() + " Date Recieved " + getdaTeRecieved() + " Court Date " + getcourtDate()
        + " Fee $" + getFee();
  }

  public abstract double calcFee();

 

  public String fileToString() {
    return "";
  }
}
