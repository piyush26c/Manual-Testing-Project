/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manualtesting;

/**
 *
 * @author Piyush
 */
public class WelcomeUI extends javax.swing.JFrame {

    /**
     * Creates new form WelcomeUI
     */
    public WelcomeUI() {
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

        nextButton = new javax.swing.JButton();
        copyrightName = new javax.swing.JLabel();
        applicationTitle = new javax.swing.JLabel();
        userAgeInfo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setPreferredSize(new java.awt.Dimension(750, 480));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        getContentPane().add(nextButton);
        nextButton.setBounds(320, 380, 140, 60);

        copyrightName.setText("Copyright @prsm");
        getContentPane().add(copyrightName);
        copyrightName.setBounds(10, 420, 90, 20);

        applicationTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        applicationTitle.setText("FUN WITH NUMBERS");
        getContentPane().add(applicationTitle);
        applicationTitle.setBounds(270, 20, 240, 50);

        userAgeInfo.setText("For Age Group (8-12)");
        getContentPane().add(userAgeInfo);
        userAgeInfo.setBounds(10, 370, 110, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Page_1_Images.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 750, 450);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nextButtonActionPerformed

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
            java.util.logging.Logger.getLogger(WelcomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel applicationTitle;
    private javax.swing.JLabel copyrightName;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel userAgeInfo;
    // End of variables declaration//GEN-END:variables
}
