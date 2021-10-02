/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swing.login;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author user2
 */
public class HomeFrom extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    public HomeFrom() {
    initComponents(); 
    setimg();
    }
    
    public void setimg(){
    
        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("img/img1.jpg"));
        Image img = ic.getImage().getScaledInstance(720, 582, Image.SCALE_SMOOTH);
        ImageIcon ic1 = new ImageIcon(img);
        pic.setIcon(ic1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        log = new javax.swing.JLabel();
        reg = new javax.swing.JLabel();
        signin = new javax.swing.JButton();
        signup = new javax.swing.JButton();
        pic = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setText("Welcome to");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 130, 30));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 1, 25)); // NOI18N
        jLabel4.setText("ABC BANK");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        log.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 20)); // NOI18N
        log.setText("Already Have An Account ?");
        getContentPane().add(log, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 250, 30));

        reg.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 20)); // NOI18N
        reg.setText("New in Here?");
        getContentPane().add(reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, -1, -1));

        signin.setBackground(new java.awt.Color(0, 0, 102));
        signin.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 15)); // NOI18N
        signin.setForeground(new java.awt.Color(255, 255, 255));
        signin.setText("Sign In");
        signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinActionPerformed(evt);
            }
        });
        getContentPane().add(signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        signup.setBackground(new java.awt.Color(0, 0, 102));
        signup.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 15)); // NOI18N
        signup.setForeground(new java.awt.Color(255, 255, 255));
        signup.setText("Sign Up");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        getContentPane().add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, -1, -1));

        pic.setMaximumSize(null);
        getContentPane().add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 582));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinActionPerformed
        
        
         this.setVisible(false);
        new LoginForm().setVisible(true);
    }//GEN-LAST:event_signinActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        this.setVisible(false);
        new RegistrationForm().setVisible(true);
    }//GEN-LAST:event_signupActionPerformed

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
            java.util.logging.Logger.getLogger(HomeFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel log;
    private javax.swing.JLabel pic;
    private javax.swing.JLabel reg;
    private javax.swing.JButton signin;
    private javax.swing.JButton signup;
    // End of variables declaration//GEN-END:variables
}
