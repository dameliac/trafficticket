package TrafficTicket;

/**
 * @author Leighton Morgan
 */


public class ParkingTicket extends Ticket {

  String Reason;

  public ParkingTicket(String TicketID, String courtDate, String daTeRecieved, String Vehicle, Person ticketHolder, String reason) {
    super(TicketID, courtDate, daTeRecieved, Vehicle, ticketHolder,"PT");//parking ticket
    this.Reason = reason;
  }

  public String getreason() {
    return Reason;
  }

  @Override
  public double calcFee() {
    double fee = 0.0;
    if (Reason.equals("BAD PARKING")) {
      fee = 1500.00;
    }
    if (Reason.equals("NO PARKING ZONE")) {
      fee = 2000.00;
    }
    return fee;
  }

  public String toString() {
    return "Parking Ticket " + getTicketID() + " Reason " + getreason() + " Date Recieved " + getdaTeRecieved()
        + " Court Date " + getcourtDate() + " Fee $" + getFee();
  }
  public String fileToString(){
    return getTicketID()+" "+getcourtDate()+" "+getdaTeRecieved()+" "+getVehicle()+" "+getTicketHolder().getTRN()+" "+ getType()
            +" "+getreason();
  }
}
