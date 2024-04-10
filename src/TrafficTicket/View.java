package TrafficTicket;
import javax.swing.table.DefaultTableModel; 

import javax.swing.JTable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

/**
 *
 * @author Damelia Coleman
 */
public class View extends javax.swing.JFrame {
     // Variables declaration - do not modify 
     
    private javax.swing.JButton Delete;                    
     private javax.swing.JButton Exit;
     private javax.swing.JButton SortByCdate;
     private javax.swing.JButton SortByTicketID;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JTable jTable1;
     private DefaultTableModel model;
     private ArrayList<Ticket> tlist;
     //private ArrayList<Ticket> newtlist;
     // End of variables declaration    

    /**
     * Creates new form View
     */
    public View() {
        initComponents();
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        SortByTicketID = new javax.swing.JButton();
        SortByCdate = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        dataManager workarea = new dataManager();
        tlist = workarea.loadTickets("./docs/tickets.txt");
       

        String [] columnNames = {
            "Ticket ID", "Court Date", "Date Received", "Offender's Name", "Vehicle Type"
        };

        model = (new DefaultTableModel(columnNames, 0));
        jTable1 = new JTable(model);
        showTable(tlist);
        
        jScrollPane1.setViewportView(jTable1);

        SortByTicketID.setBackground(new java.awt.Color(153, 153, 255));
        SortByTicketID.setText("Sort by Ticket ID");
        SortByTicketID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SortByTicketID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortByTicketIDActionPerformed(evt);
            }
        });

        SortByCdate.setBackground(new java.awt.Color(153, 153, 255));
        SortByCdate.setText("Sort by Court Date");
        SortByCdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SortByCdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortByCdateActionPerformed(evt);
            }
        });

        Exit.setBackground(new java.awt.Color(153, 153, 255));
        Exit.setText("Exit");
        Exit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(153, 153, 255));
        Delete.setText("Delete");
        Delete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(SortByTicketID, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(SortByCdate, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SortByTicketID)
                    .addComponent(Exit)
                    .addComponent(SortByCdate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

   
    public void addToTable(Ticket t) //adds one ticket to the table.
    {
    
        String[] item={t.getTicketID(),""+ t.getcourtDate(),""+t.getdaTeRecieved(),""+ t.getTicketHolder().getName(),""+ t.getVehicle()};
        model.addRow(item);       

    }

    private void showTable(ArrayList<Ticket> tlist) //displays a list of tickets in a table.
    { 
       if (tlist.size()>0)
       {
        for (int i = 0; i< tlist.size(); i++)
        {
            addToTable(tlist.get(i)); //adds one ticket at a time to the table.
        }
       }

    }
   
   
   
    private void SortByTicketIDActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        model.setRowCount(0); //removes the rows from the table.
        Collections.sort(tlist, new Comparator<Ticket>(){
            public int compare(Ticket a, Ticket b) {
                return a.getTicketID().compareTo(b.getTicketID());
            } //Sorts the ticket ID in alphabetical order.
        } );
        showTable(tlist); //displays the sorted list to the table.
    }                                              

    private void SortByCdateActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        model.setRowCount(0); // removes the all the rows from the table.
        Collections.sort(tlist, new Comparator<Ticket>(){
            public int compare(Ticket a, Ticket b) {
                String[] DateParts1=a.getcourtDate().split("/");
                String[] DateParts2=b.getcourtDate().split("/");
                int year1=Integer.parseInt(DateParts1[0]);
                int year2=Integer.parseInt(DateParts2[0]);
                int month1=Integer.parseInt(DateParts1[1]);
                int month2=Integer.parseInt(DateParts2[1]);
                int day1=Integer.parseInt(DateParts1[2]);
                int day2=Integer.parseInt(DateParts2[2]);
                if (year1>year2)
                    return -1;
                else if ((year1==year2) && (month1> month2))
                    return -1;
                else if ((month1==month2) && day1>day2)
                    return -1;
                else 
                    return 1;
            }
        });//sort the list of persons by court date.
        showTable(tlist); // display the new list using showtable.
    }                                           

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        model.setRowCount(0); // removes the all the rows from the table.
        tlist.remove(tlist.size()-1);
        showTable(tlist);

    }                                      

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        setVisible(false);
    } 

 
   
    
}

