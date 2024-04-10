
package TrafficTicket;

import java.util.Scanner;
import javax.swing.JFrame;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

/**
 *
 * @author UWI Student
 */
public class AdminLogin extends JFrame {

  // Variables declaration - do not modify
  private javax.swing.JButton Exit;
  private javax.swing.JButton LoginButton;
  private javax.swing.JTextField Name;
  private javax.swing.JCheckBox NewPassword;
  private javax.swing.JTextField Password;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  
  // End of variables declaration

  /**
   * Creates new form AdminLogin
   */
  public AdminLogin() {
    initComponents();
  }


  // <editor-fold defaultstate="collapsed" desc="Generated Code">
  private void initComponents() {

    Name = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    LoginButton = new javax.swing.JButton();
    NewPassword = new javax.swing.JCheckBox();
    Exit = new javax.swing.JButton();
    Password = new javax.swing.JTextField();

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

    LoginButton.setBackground(new java.awt.Color(153, 153, 255));
    LoginButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    LoginButton.setText("LOGIN");
    LoginButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    LoginButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        LoginButtonActionPerformed(evt);
      }
    });

    NewPassword.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
    NewPassword.setText("New Password?");
    NewPassword.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        NewPasswordActionPerformed(evt);
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

    Password.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
   // Password.setText("Enter Password");
    

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(NewPassword)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING,
                        javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE,
                        189, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Exit, javax.swing.GroupLayout.Alignment.TRAILING,
                            javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LoginButton, javax.swing.GroupLayout.Alignment.TRAILING,
                            javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                    .addComponent(Password, javax.swing.GroupLayout.Alignment.LEADING))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NewPassword)
                .addGap(18, 18, 18)
                .addComponent(LoginButton)
                .addGap(18, 18, 18)
                .addComponent(Exit)
                .addContainerGap(26, Short.MAX_VALUE)));

    pack();
  }// </editor-fold>

  private void NewPasswordActionPerformed(java.awt.event.ActionEvent evt) {
    // TODO add your handling code here:
  // new ResetPassword();
  }

  private void ExitActionPerformed(java.awt.event.ActionEvent evt) {
    // TODO add your handling code here:
    new Display();
    setVisible(false);
  }

  private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {
    // TODO add your handling code here:
    Security();
  }

   public String getfile(){return "./docs/adminpass.txt";}

  public void Security (){
   
         
    
    try{
      Scanner scan = new Scanner(new File("./docs/adminpass.txt"));
      String name = " ";
      String password = " ";
      while (scan.hasNext()) {
        String[] nextLine = scan.nextLine().split(" ");
        name = nextLine[0] + " " + nextLine[1];
        password = nextLine[2];
      }
    
      if (name.equals(Name.getText()) && Password.getText().equals(password))
      {
        new EntryScreen().setVisible(true);
        setVisible(false);
      
      }
      else{
        JOptionPane.showMessageDialog(null, "Name or/and Password is incorrect");
      }
      scan.close();
      
    }
    catch(FileNotFoundException exception){
      System.out.println ("File not found");
    }
  }
}

 




  


