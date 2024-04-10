package TrafficTicket;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class dataManager {
    private dataManager manager;
    private Scanner scanner;
    private PrintStream outputStream;
    private ArrayList<Ticket> tickets = new ArrayList<Ticket>();
    private ArrayList<Person> offenders =  new ArrayList<Person>();

    public dataManager(){
    }


    public ArrayList<Person> loadPersons(){
        try{
            scanner = new Scanner(new File("./docs/persons.txt"));
            while (scanner.hasNext()) {
                String[] nextLine = scanner.nextLine().split(" ");
                String Fname = nextLine[0];
                String Lname = nextLine[1];
                String name = Fname+" "+Lname;
                int TRN = Integer.parseInt(nextLine[2]);
                String dLicense = nextLine[3];
                String LicenseExDate = nextLine[4];
                
                //String password = nextLine[6];
                Person p = new Person(name,TRN,dLicense,LicenseExDate);
                offenders.add(p);


            }
        } catch (FileNotFoundException e) {
        }catch (NumberFormatException nfe){
            }
        return offenders;
    }

    public void savePersons(Person P) {
        try {
            FileWriter writer = new FileWriter("./docs/persons.txt", true);
            String output = "";
            //String[] Person;
            //String bkName="";
            offenders.add(P);
            for(Person p : offenders) {
                output = p.fileToString();
                writer.write("\n"+output);
                }
            writer.close();
            } catch (IOException ex) {
        }
      
    }

    public int findTicket(ArrayList<Ticket> list, String tid){
        int pos = -1;
        int curr = 0;

        while ((curr<list.size())&&(pos == -1)){
        
          if (list.get(curr).getTicketID().equals(tid))
          {
              pos = curr;
          }
          curr++;
        }
        return pos;
}

    public ArrayList<Ticket> loadTickets(String pfile){
        try{
            scanner = new Scanner(new File(pfile));
            
            while (scanner.hasNext()) {
                //(String TicketID, int courtDate, int daTeRecieved, String Vehicle, Person ticketHolder,String type
                String[] nextLine = scanner.nextLine().split(" ");
                String TicketID = nextLine[0];
                String courtDate = nextLine[1];
                String daTeReceived = nextLine[2];
                String Vehicle = nextLine[3];
                String Fname = "";
                String Lname = "";
                             
                ///int ticketHolderTRN = Integer.parseInt(nextLine[4]);
                String type = nextLine[5];
                Person ticketHolder;
                int vcapacity;
                int numPassengers;
                String reason = "";
                int exTime;
                int vweight;
                Ticket t;
                if (type.equals("SB")){
                    
                
                    vcapacity = Integer.parseInt(nextLine[6]);
                    numPassengers = Integer.parseInt(nextLine[7]);
                    Fname = nextLine[8];
                    Lname = nextLine[9];
                 
                    ticketHolder = new Person(Fname+" "+Lname);
                    t = new SeatBeltTicket(TicketID,courtDate,daTeReceived,Vehicle,ticketHolder,vcapacity,numPassengers);
                    tickets.add(t);
                } else if (type.equals("PT")){
                    if (nextLine.length == 11){
                        reason = nextLine[6] + " "+nextLine[7] + " "+ nextLine[8];
                        Fname = nextLine[9];
                        Lname = nextLine[10];
                    }else{
                        reason = nextLine[6] + " "+nextLine[7];
                        Fname = nextLine[8];
                        Lname = nextLine[9]; 
                    }
                    ticketHolder = new Person(Fname +" "+Lname);
                    t = new ParkingTicket(TicketID,courtDate,daTeReceived,Vehicle,ticketHolder,reason);
                    tickets.add(t);
                }else if (type.equals("EL")){
                   exTime = Integer.parseInt(nextLine[6]);
                   Fname = nextLine[7];
                   Lname = nextLine[8];
                   ticketHolder = new Person(Fname +" "+Lname);
                   t = new ExpiredLicenseTicket(TicketID,courtDate,daTeReceived,Vehicle,ticketHolder, exTime);
                    tickets.add(t);
                }else if (type.equals("DV")) {
                    vweight = Integer.parseInt(nextLine[6]);
                    Fname = nextLine[7];
                    Lname = nextLine[8];
                    ticketHolder = new Person(Fname +" "+Lname);
                    t = new ExpiredLicenseTicket(TicketID, courtDate, daTeReceived, Vehicle, ticketHolder, vweight);
                    tickets.add(t);
                }
            }

            
          
            
        } catch (FileNotFoundException e) {
        }catch (Exception e){
        }
        return tickets;
    }


    public void saveTickets(ArrayList<Ticket> ticket) {
        try {
            FileWriter writer = new FileWriter("./docs/tickets.txt", true);
            //outputStream = new PrintStream(new FileOutputStream("./docs/newtickets.txt"));
            String output = "";
            for(Ticket t: ticket) {
                output = t.fileToString() + " "+ t.getTicketHolder().getName();
                //outputStream.println(output);
                writer.write("\n" + output);
            }
            writer.close();
        } catch (FileNotFoundException ex) {
        }catch (IOException exception){}
        //outputStream.close();
    }

    
    public void saveTicket(Ticket ticket) {
        try {
            FileWriter writer = new FileWriter("./docs/tickets.txt", true);
            //outputStream = new PrintStream(new FileOutputStream("./docs/newtickets.txt"));
            String output = "";
            output = ticket.fileToString() + " "+ ticket.getTicketHolder().getName();
                //outputStream.println(output);
                writer.write("\n"+output);
           
            writer.close();
        } catch (FileNotFoundException ex) {
        }catch (IOException exception){}
        //outputStream.close();
    }
}
