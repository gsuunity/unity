/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class signup extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    PreparedStatement pst2 = null;
    
    public signup() {
        con = connsql.ConnecrDB();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        getemail = new javax.swing.JTextField();
        getpw = new javax.swing.JPasswordField();
        Btn_sign = new javax.swing.JButton();
        NICKNAME = new javax.swing.JLabel();
        nickname = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up");

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setText("Welcome");

        jLabel2.setText("GSU EMAIL:");

        jLabel3.setText("PASSWORD:");

        getemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getemailActionPerformed(evt);
            }
        });

        getpw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                getpwKeyPressed(evt);
            }
        });

        Btn_sign.setText("Sign Up");
        Btn_sign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_signActionPerformed(evt);
            }
        });

        NICKNAME.setText("NICKNAME:");

        nickname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nicknameKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(NICKNAME)
                                .addGap(18, 18, 18)
                                .addComponent(nickname))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(getemail, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Btn_sign)
                                    .addComponent(getpw))))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(getemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(getpw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NICKNAME)
                    .addComponent(nickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(Btn_sign)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void getemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getemailActionPerformed

    private void Btn_signActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_signActionPerformed
        // TODO add your handling code here:
        String mail = getemail.getText();
        String pass = getpw.getText();
        
        try {
            String query = "Select gsuemail, pw, nicknam from log ";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            
            if(mail.equals(rs.getString("gsuemail"))) {
                JOptionPane.showMessageDialog(null, "it's already existed");
            } 
            if(mail != (rs.getString("gsuemail"))) {
                if(!mail.contains("student.gsu.edu")){
                    JOptionPane.showMessageDialog(null, "email should be gsuemail");
                }
                else {
                String query2 = "insert into log (gsuemail, pw, nicknam) values (?, ?, ?);";
                pst2 = con.prepareStatement(query2);
                pst2.setString(1, getemail.getText());
                pst2.setString(2, getpw.getText());
                pst2.setString(3, nickname.getText());
                pst2.execute();
                JOptionPane.showMessageDialog(null, "successfully signed up");
                this.dispose();
                pst2.close();
                new login().setVisible(true);
                }
            }
            
            else {
                JOptionPane.showMessageDialog(null, " failed");
                dispose();
            }
            pst.close();
            rs.close();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_Btn_signActionPerformed

    private void getpwKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_getpwKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_getpwKeyPressed

    private void nicknameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nicknameKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String mail = getemail.getText();
            
        
        try {
            String query = "Select gsuemail, pw, nicknam from log ";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            
            if(mail.equals(rs.getString("gsuemail"))) {
                JOptionPane.showMessageDialog(null, "it's already existed");
            } 
            if(mail != (rs.getString("gsuemail"))) {
                if(!mail.contains("student.gsu.edu")){
                    JOptionPane.showMessageDialog(null, "email should be gsuemail");
                }
                else {
                String query2 = "insert into log (gsuemail, pw, nicknam) values (?, ?, ?);";
                pst2 = con.prepareStatement(query2);
                pst2.setString(1, getemail.getText());
                pst2.setString(2, getpw.getText());
                pst2.setString(3, nickname.getText());
                pst2.execute();
                JOptionPane.showMessageDialog(null, "successfully signed up");
                this.dispose();
                pst2.close();
                }
            }
            
            else {
                JOptionPane.showMessageDialog(null, " failed");
                dispose();
            }
            pst.close();
            rs.close();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_nicknameKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_sign;
    private javax.swing.JLabel NICKNAME;
    private javax.swing.JTextField getemail;
    private javax.swing.JPasswordField getpw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nickname;
    // End of variables declaration//GEN-END:variables
}
