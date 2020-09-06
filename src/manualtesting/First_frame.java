/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manualtesting;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @authors 
 * Piyush Rajendra Chaudhari <piyushrc26@gmail.com>
 * Rohit Balasaheb Bangar    <bangarrohit7057@gmail.com>
 * Shalakha Vijaykumar Bang  <shalakhabang99@gmail.com>
 * Mayuresh Rajesh Dindorkar <dmayuresh99@gmail.com>
 *
 * Project Name: FUN WITH NUMBERS Objective: Swing and AWT based Graphical User
 * Interface Java Application intended for learning Manual Testing.*
 *
 * Date: 05 September 2020. Day: Saturday
 */
public class First_frame extends javax.swing.JFrame {

    /**
     * Creates new form First_frame
     */
    public First_frame() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setResizable(true);
        Color c = new Color(229, 209, 255);
        this.getContentPane().setBackground(c);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        button_conversion = new javax.swing.JButton();
        button_mensuration = new javax.swing.JButton();
        button_arithmetic = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fun With Numbers");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("OPERATIONS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(580, 80, 250, 52);

        button_conversion.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        button_conversion.setText("CONVERSIONS");
        button_conversion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 0)));
        button_conversion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_conversionActionPerformed(evt);
            }
        });
        getContentPane().add(button_conversion);
        button_conversion.setBounds(590, 260, 220, 76);

        button_mensuration.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        button_mensuration.setText("MENSURATION");
        button_mensuration.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 0)));
        button_mensuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_mensurationActionPerformed(evt);
            }
        });
        getContentPane().add(button_mensuration);
        button_mensuration.setBounds(970, 260, 220, 76);

        button_arithmetic.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        button_arithmetic.setText("BASIC ARITHMETIC");
        button_arithmetic.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 0)));
        button_arithmetic.setFocusPainted(false);
        button_arithmetic.setOpaque(false);
        button_arithmetic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_arithmeticActionPerformed(evt);
            }
        });
        getContentPane().add(button_arithmetic);
        button_arithmetic.setBounds(220, 260, 220, 76);

        backbtn.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        backbtn.setText("BACK");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        getContentPane().add(backbtn);
        backbtn.setBounds(40, 640, 150, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_arithmeticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_arithmeticActionPerformed
        // TODO add your handling code here:
        Basic_Arithmetic b = new Basic_Arithmetic();
        b.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_arithmeticActionPerformed

    private void button_mensurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_mensurationActionPerformed
        // TODO add your handling code here:
        Mensuration m = new Mensuration();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_mensurationActionPerformed

    private void button_conversionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_conversionActionPerformed
        // TODO add your handling code here:
        Conversion c = new Conversion();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_conversionActionPerformed


    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        WelcomeUI w = new WelcomeUI();
        w.setVisible(true);
        this.dispose();
        //close();
    }//GEN-LAST:event_backbtnActionPerformed

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
            java.util.logging.Logger.getLogger(First_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(First_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(First_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(First_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new First_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JButton button_arithmetic;
    private javax.swing.JButton button_conversion;
    private javax.swing.JButton button_mensuration;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
