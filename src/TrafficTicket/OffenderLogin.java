package TrafficTicket;

import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JFrame;
import java.util.Scanner;
import java.util.ArrayList;

public class OffenderLogin extends JFrame {

  // Variables declaration - do not modify
  private javax.swing.JButton Login;
  private javax.swing.JButton Exit;
  private javax.swing.JButton CreateAcc;
  private javax.swing.JCheckBox NPassword;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JTextField Name;
  private javax.swing.JTextField Password;
  private ArrayList<Person> plist = new ArrayList<Person>();
  dataManager dManager = new dataManager();
  private OffenderLogin thisform;
  // End of variables declaration

  /**
   * Creates new form AdminLogin
   */
  public OffenderLogin() {
    thisform = this;
    initComponents();
  }


  // <editor-fold defaultstate="collapsed" desc="Generated Code">
  private void initComponents() {

    Name = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    Login = new javax.swing.JButton();
    NPassword = new javax.swing.JCheckBox();
    Exit = new javax.swing.JButton();
    Password = new javax.swing.JTextField();
    CreateAcc = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBackground(java.awt.Color.lightGray);
    setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    setForeground(new java.awt.Color(255, 255, 255));

    Name.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
    //Name.setText("Enter Name");
    

    jLabel2.setText("Password:");

    jLabel3.setText("Name:");

    jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
    jLabel4.setText("LOGIN");

    Login.setBackground(new java.awt.Color(204, 204, 204));
    Login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    Login.setText("LOGIN");
    Login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    Login.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    Login.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        LoginActionPerformed(evt);
      }
    });

    NPassword.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
    NPassword.setText("New Password?");
    NPassword.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        NPasswordActionPerformed(evt);
      }
    });

    Exit.setBackground(new java.awt.Color(204, 204, 204));
    Exit.setText("Exit");
    Exit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    Exit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    Exit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        ExitActionPerformed(evt);
      }
    });

    Password.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
    //Password.setText("Enter Password");
    

    CreateAcc.setBackground(new java.awt.Color(204, 204, 204));
    CreateAcc.setText("Create Account");
    CreateAcc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    CreateAcc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    CreateAcc.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        CreateAccActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Password, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 189,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(NPassword))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 178,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CreateAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 178,
                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(124, Short.MAX_VALUE)));
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(21, 21, 21)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NPassword)
                .addGap(18, 18, 18)
                .addComponent(Login)
                .addGap(18, 18, 18)
                .addComponent(CreateAcc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Exit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

    pack();
  }// </editor-fold>

  private void NPasswordActionPerformed(java.awt.event.ActionEvent evt) {
    // TODO add your handling code here:
    new ResetPassword().setVisible(true);
  }

  

  private void ExitActionPerformed(java.awt.event.ActionEvent evt) {
    // TODO add your handling code here:
    new Display();
    setVisible(false);
  }

  private void LoginActionPerformed(java.awt.event.ActionEvent evt) {
    // TODO add your handling code here:
    Security();
  }

  private void CreateAccActionPerformed(java.awt.event.ActionEvent evt) {
    // TODO add your handling code here:
    new SignUp().setVisible(true);
  }

  public void Security (){
    try{ 
     
      plist = dManager.loadPersons();
      for(Person P : plist){
        if (Name.getText().equals(P.getName()) &&  Integer.parseInt(Password.getText()) == P.getTRN()){
          new OffenderView(thisform);
          setVisible(false);

        }
      }
      
    
      ;
    }catch (NumberFormatException exception){}
  
  }

  public String getOffenderName(){
    return Name.getText();
  }


 
  

}

