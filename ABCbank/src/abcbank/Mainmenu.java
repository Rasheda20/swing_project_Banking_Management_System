/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abcbank;

/**
 *
 * @author RASHEDA
 */
public class Mainmenu extends javax.swing.JFrame {

    /**
     * Creates new form Mainmenu
     */
    public Mainmenu() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        customer = new javax.swing.JMenuItem();
        account = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        deposit = new javax.swing.JMenuItem();
        withdraw = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        ac_to_ac = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        customer_details = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        check_balance = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setSize(new java.awt.Dimension(0, 0));

        jDesktopPane1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1366, 768));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ABC Bank");

        jTextPane1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jTextPane1.setText("In publishing and graphic design, Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document or a typeface without relying on meaningful content. Lorem ipsum may be used as a placeholder before final copy is available In publishing and graphic design, Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document or a typeface without relying on meaningful content. Lorem ipsum may be used as a placeholder before final copy is availableIn publishing and graphic design, Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document or a typeface without relying on meaningful content. Lorem ipsum may be used as a placeholder before final copy is availableIn publishing and graphic design, Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document or a typeface without relying on meaningful content. Lorem ipsum may be used as a placeholder before final copy is availableIn publishing and graphic design, Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document or a typeface without relying on meaningful content. Lorem ipsum may be used as a placeholder before final copy is availableIn publishing and graphic design, Lorem ipsum is a placeholder tex be used as a placehold");
        jScrollPane1.setViewportView(jTextPane1);

        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 102));

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N

        customer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        customer.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        customer.setText("Customer");
        customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerActionPerformed(evt);
            }
        });
        jMenu1.add(customer);

        account.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        account.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        account.setText("Account");
        account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountActionPerformed(evt);
            }
        });
        jMenu1.add(account);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Transaction");
        jMenu2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N

        deposit.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        deposit.setText("Deposit");
        deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositActionPerformed(evt);
            }
        });
        jMenu2.add(deposit);

        withdraw.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        withdraw.setText("Withdraw");
        withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawActionPerformed(evt);
            }
        });
        jMenu2.add(withdraw);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Transfer");
        jMenu3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N

        ac_to_ac.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        ac_to_ac.setText("Account to Account");
        ac_to_ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ac_to_acActionPerformed(evt);
            }
        });
        jMenu3.add(ac_to_ac);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Report");
        jMenu4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N

        customer_details.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        customer_details.setText("Customer details");
        customer_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_detailsActionPerformed(evt);
            }
        });
        jMenu4.add(customer_details);

        jMenuItem1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jMenuItem1.setText("Account details");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Balance");
        jMenu5.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N

        check_balance.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        check_balance.setText("Check Balance");
        check_balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_balanceActionPerformed(evt);
            }
        });
        jMenu5.add(check_balance);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountActionPerformed
        Account ac= new Account();
       jDesktopPane1.add(ac);
       ac.setVisible(true);
    }//GEN-LAST:event_accountActionPerformed

    private void ac_to_acActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ac_to_acActionPerformed
       Transfer tr= new Transfer();
        jDesktopPane1.add(tr);
        tr.setVisible(true);
    }//GEN-LAST:event_ac_to_acActionPerformed

    private void customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerActionPerformed
      Customer cs= new Customer();
       jDesktopPane1.add(cs);
       cs.setVisible(true);
    }//GEN-LAST:event_customerActionPerformed

    private void depositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositActionPerformed
        Deposit de= new Deposit();
        jDesktopPane1.add(de);
        de.setVisible(true);
    }//GEN-LAST:event_depositActionPerformed

    private void withdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawActionPerformed
        Withdraw wi= new Withdraw();
        jDesktopPane1.add(wi);
        wi.setVisible(true);
    }//GEN-LAST:event_withdrawActionPerformed

    private void check_balanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_balanceActionPerformed
        Balance b= new Balance();
        jDesktopPane1.add(b);
        b.setVisible(true);
    }//GEN-LAST:event_check_balanceActionPerformed

    private void customer_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_detailsActionPerformed
        // TODO add your handling code here:
        CustomerDetails c= new CustomerDetails();
        jDesktopPane1.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_customer_detailsActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       CustomerDetails c= new CustomerDetails();
        jDesktopPane1.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainmenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ac_to_ac;
    private javax.swing.JMenuItem account;
    private javax.swing.JMenuItem check_balance;
    private javax.swing.JMenuItem customer;
    private javax.swing.JMenuItem customer_details;
    private javax.swing.JMenuItem deposit;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JMenuItem withdraw;
    // End of variables declaration//GEN-END:variables
}
