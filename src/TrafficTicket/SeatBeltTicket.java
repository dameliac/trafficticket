package TrafficTicket;
/**
 * @author Leighton Morgan
 */

public class SeatBeltTicket extends Ticket {


   private int Vcapacity;
   private int numPassengers;

    public SeatBeltTicket(String TicketID,String courtDate,String daTeRecieved,String Vehicle, Person ticketHolder, int Vcapacity,int numPassengers){
        super(TicketID,courtDate, daTeRecieved, Vehicle, ticketHolder,"SB");
        this.Vcapacity=Vcapacity;
        this.numPassengers=numPassengers;

    }

   public int getVcapacity(){
    return Vcapacity;
   }

   public int getnumPassengers(){
    return numPassengers;
   }

   public double calcFee(){
    double fee=((numPassengers-Vcapacity)*500);
    return fee;
   }

   public String toString(){
    return "SeatBelt Ticket "+ getTicketID()+" Date Recieved " +getdaTeRecieved()+ " Court Date "+ getcourtDate() +" Vehicle Capacity "+getVcapacity()+" Number of Passengers"+getnumPassengers()+ " Fee $"+getFee();
   }
   public String fileToString(){
        return getTicketID()+" "+getcourtDate()+" "+getdaTeRecieved()+" "+getVehicle()+" "+getTicketHolder().getTRN()+" "+ getType();
   }
}
