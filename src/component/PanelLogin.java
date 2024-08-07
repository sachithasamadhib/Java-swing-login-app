package component;
 
import javax.swing.JOptionPane;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
public class PanelLogin extends javax.swing.JLayeredPane {
   
    private Timer timer;
    private static final int TIMEOUT = 60000;
    public PanelLogin() {
        initComponents();
        userlogin.setVisible(false);
        adminlogin.setVisible(true);
        addDocumentListeners();
}
         private void addDocumentListeners() {
         txtadminusername.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                startTimerForAdminLogin();
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                startTimerForAdminLogin();
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                startTimerForAdminLogin();
            }
        });

        txtadminpass.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                startTimerForAdminLogin();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                startTimerForAdminLogin();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                startTimerForAdminLogin();
            }
        });

        txtusername.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                startTimerForUserLogin();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                startTimerForUserLogin();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                startTimerForUserLogin();
            }
        });

        txtuserpassword.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                startTimerForUserLogin();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                startTimerForUserLogin();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                startTimerForUserLogin();
            }
        });
    }

    private void startTimerForAdminLogin() {
        resetTimer();
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                SwingUtilities.invokeLater(() -> {
                    txtadminusername.setText("");
                    txtadminpass.setText("");
                    JOptionPane.showMessageDialog(null, "Session timed out. Please try again.");
                });
            }
        }, TIMEOUT);
    }

    private void startTimerForUserLogin() {
        resetTimer();
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                SwingUtilities.invokeLater(() -> {
                    txtusername.setText("");
                    txtuserpassword.setText("");
                    JOptionPane.showMessageDialog(null, "Session timed out. Please try again.");
                });
            }
        }, TIMEOUT);
    }
    
    private void resetTimer() {
        if (timer != null) {
            timer.cancel();
            timer.purge();
        }
    }

    private void stopTimer() {
        if (timer != null) {
            timer.cancel();
        }
    }
    public void showRegister(boolean show) {
        if (show) {
            adminlogin.setVisible(true);
            userlogin.setVisible(false);
        } else {
            adminlogin.setVisible(false);
            userlogin.setVisible(true);
        }
    }
    
    public void dbconnectuser(){
        if(txtusername.getText().equals("")|| txtuserpassword.getText().equals(""))
        {
          JOptionPane.showMessageDialog(null,"Please Insert All valus");
        }
        
        else{
        
        }
    }
    
    public void   dbconnectadmin(){
        if(txtadminusername.getText().equals("")|| txtadminpass.getText().equals(""))
        {
          JOptionPane.showMessageDialog(null,"Please Insert All valus");
        }
        
        else{
        
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userlogin = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        btnlogin = new javax.swing.JButton();
        txtuserpassword = new javax.swing.JPasswordField();
        lblforgot = new javax.swing.JLabel();
        adminlogin = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnlogin1 = new javax.swing.JButton();
        txtadminusername = new javax.swing.JTextField();
        txtadminpass = new javax.swing.JPasswordField();

        setLayout(new java.awt.CardLayout());

        userlogin.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 102));
        jLabel2.setText(" Login as Cashier");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("User name :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Password :");

        btnlogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(102, 0, 153));
        btnlogin.setText("Login");
        btnlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlogin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnloginMouseMoved(evt);
            }
        });
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        lblforgot.setBackground(new java.awt.Color(0, 153, 153));
        lblforgot.setForeground(new java.awt.Color(0, 153, 153));
        lblforgot.setText("Forgot your password");
        lblforgot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblforgot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblforgotMousePressed(evt);
            }
        });

        javax.swing.GroupLayout userloginLayout = new javax.swing.GroupLayout(userlogin);
        userlogin.setLayout(userloginLayout);
        userloginLayout.setHorizontalGroup(
            userloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userloginLayout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(userloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userloginLayout.createSequentialGroup()
                        .addGroup(userloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(userloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtusername)
                            .addComponent(txtuserpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
                        .addGap(165, 165, 165))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userloginLayout.createSequentialGroup()
                        .addComponent(lblforgot)
                        .addGap(217, 217, 217))))
            .addGroup(userloginLayout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        userloginLayout.setVerticalGroup(
            userloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userloginLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel2)
                .addGap(67, 67, 67)
                .addGroup(userloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(userloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtuserpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblforgot)
                .addGap(26, 26, 26)
                .addComponent(btnlogin)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        add(userlogin, "card3");

        adminlogin.setBackground(new java.awt.Color(204, 255, 204));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 102));
        jLabel5.setText(" Login as Admin");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Password :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("User name :");

        btnlogin1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnlogin1.setForeground(new java.awt.Color(102, 0, 153));
        btnlogin1.setText("Login");
        btnlogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogin1ActionPerformed(evt);
            }
        });

        txtadminusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtadminusernameActionPerformed(evt);
            }
        });

        txtadminpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtadminpassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminloginLayout = new javax.swing.GroupLayout(adminlogin);
        adminlogin.setLayout(adminloginLayout);
        adminloginLayout.setHorizontalGroup(
            adminloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminloginLayout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(adminloginLayout.createSequentialGroup()
                .addGroup(adminloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminloginLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(adminloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(adminloginLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtadminpass))
                            .addGroup(adminloginLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtadminusername, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(adminloginLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(btnlogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        adminloginLayout.setVerticalGroup(
            adminloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminloginLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel5)
                .addGap(61, 61, 61)
                .addGroup(adminloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtadminusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(adminloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtadminpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(btnlogin1)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        add(adminlogin, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void txtadminusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtadminusernameActionPerformed
         
    }//GEN-LAST:event_txtadminusernameActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
          dbconnectuser();
          stopTimer();
    }//GEN-LAST:event_btnloginActionPerformed

    private void btnlogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogin1ActionPerformed
          dbconnectadmin();
          stopTimer();
    }//GEN-LAST:event_btnlogin1ActionPerformed

    private void txtadminpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtadminpassActionPerformed
        
    }//GEN-LAST:event_txtadminpassActionPerformed

    private void lblforgotMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblforgotMousePressed
       
        JOptionPane.showMessageDialog(null,"Please Contact System Administrator And reset your Password");
    }//GEN-LAST:event_lblforgotMousePressed

    private void btnloginMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btnloginMouseMoved

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adminlogin;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnlogin1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblforgot;
    private javax.swing.JPasswordField txtadminpass;
    private javax.swing.JTextField txtadminusername;
    private javax.swing.JTextField txtusername;
    private javax.swing.JPasswordField txtuserpassword;
    private javax.swing.JPanel userlogin;
    // End of variables declaration//GEN-END:variables
}
