package TrafficTicket;

import javax.swing.*;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Damelia Coleman
 */
public class EditTicket extends JFrame {
     // Variables declaration - do not modify                     
     private javax.swing.JTextField TicketID;
     private javax.swing.JTextField cdate;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JLabel jLabel4;
     private javax.swing.JLabel jLabel5;
     private javax.swing.JTextField offenderName;
     private JFrame frame;
     private javax.swing.JPanel jpanel1;
     private javax.swing.JButton Close;
     private javax.swing.JButton Save;

     dataManager dm = new dataManager();
     private ArrayList<Ticket> tlist = dm.loadTickets("./docs/tickets.txt");
     View newticket = new View();
     Ticket currTicket;
     
     // End of variables declaration 

    /**
     * Creates new form EditTicket
     */
    public EditTicket() {
        initComponents();
    }

    
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
      
        frame = new JFrame();
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TicketID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Close = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        cdate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        offenderName = new javax.swing.JTextField();
        jpanel1 = new JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Edit or Update Ticket");

        jLabel2.setText("Ticket ID:");

       
    

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Select the following you would like to update:");

        Close.setBackground(new java.awt.Color(204, 204, 204));
        Close.setText("Close");
        Close.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });

        Save.setBackground(new java.awt.Color(204, 204, 204));
        Save.setText("Save");
        Save.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        jLabel4.setText("Court Date:");

        jLabel5.setText("Offender's Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(jpanel1);
        jpanel1.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TicketID, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(offenderName, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cdate, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TicketID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(offenderName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Close)
                    .addComponent(Save))
                .addGap(14, 14, 14))
        );

        frame.getContentPane().add(jpanel1);
        frame.setVisible(true);
    }// </editor-fold>                        

    public void SaveActionPerformed(java.awt.event.ActionEvent evt) { 
        currTicket = tlist.get(dm.findTicket(tlist, TicketID.getText()) );
        String currdate = currTicket.getcourtDate(); 
        
        if (cdate.getText() != "") {
            currTicket.setCourtDate(cdate.getText());
            tlist.add(currTicket);
            dm.saveTicket(currTicket); 
  
        }
        if(offenderName.getText()!= ""){
            currTicket.setCourtDate(currdate);
            currTicket.getTicketHolder().setName(offenderName.getText());
            tlist.add(currTicket);
            dm.saveTicket(currTicket);
       }else{
        currTicket.setCourtDate(currdate);
        currTicket.getTicketHolder().setName(currTicket.getTicketHolder().getName());
        tlist.add(currTicket);
        dm.saveTicket(currTicket);

       }
       
       frame.setVisible(false);
        
    }

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {
        frame.setVisible(false);
    }  

                                        

    

                     
}


