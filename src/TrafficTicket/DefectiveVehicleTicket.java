package TrafficTicket;

/**
 *
 * @author Leighton Morgan
 */

public class DefectiveVehicleTicket extends Ticket {

  int VWeight;

  public DefectiveVehicleTicket(String TicketID, String courtDate, String daTeRecieved, String Vehicle, Person ticketHolder, int VWeight) {
    super(TicketID, courtDate, daTeRecieved, Vehicle, ticketHolder,"DV");
    this.VWeight = VWeight;

  }

  public int getVweight() {
    return VWeight;
  }

  @Override
  public double calcFee() {
    return (VWeight * 0.5);
  }

  public String toString() {
    return "Defective Vehicle Ticket " + getTicketID() + " Vehicle Weight " + getVweight() + "kg" + " Date Recieved "
        + getdaTeRecieved() + " Court Date " + getcourtDate() + " Fee $" + getFee();
  }
  public String fileToString() {
    return getTicketID() + " " + getcourtDate() + " " + getdaTeRecieved() + " " + getVehicle() + " " + getTicketHolder().getTRN() + " " + getType()
            + " " + getVweight();
  }

}
