/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manualtesting;

import java.awt.Color;
import javax.swing.JOptionPane;
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
public class Rectangle_Frame extends javax.swing.JFrame {

    /**
     * Creates new form Rectangle_Frame
     */
    public Rectangle_Frame() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setResizable(true);
        this.getContentPane().setBackground(new Color(229, 209, 255));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        length = new javax.swing.JTextField();
        breadth = new javax.swing.JTextField();
        perimeter = new javax.swing.JRadioButton();
        area = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        result = new javax.swing.JTextField();
        backbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fun With Numbers");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Rectangle");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(590, 60, 180, 50);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setText(" Length:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(500, 160, 80, 30);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setText("Breadth:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(510, 240, 80, 30);

        length.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        length.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthActionPerformed(evt);
            }
        });
        getContentPane().add(length);
        length.setBounds(720, 150, 220, 40);

        breadth.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        getContentPane().add(breadth);
        breadth.setBounds(720, 230, 220, 40);

        buttonGroup3.add(perimeter);
        perimeter.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        perimeter.setText("Perimeter");
        getContentPane().add(perimeter);
        perimeter.setBounds(720, 310, 110, 35);

        buttonGroup3.add(area);
        area.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        area.setText("Area");
        getContentPane().add(area);
        area.setBounds(850, 310, 80, 35);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setText("Select option:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(510, 300, 120, 50);

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton1.setText("Result");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(610, 460, 140, 40);

        result.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        getContentPane().add(result);
        result.setBounds(570, 390, 220, 40);

        backbtn.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        backbtn.setText("BACK");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        getContentPane().add(backbtn);
        backbtn.setBounds(40, 600, 130, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        //Result btnn clicked
        String lengthval = length.getText().replaceAll("\\s", "");
        String breadthval = breadth.getText().replaceAll("\\s", "");

        if (isFloat(lengthval) && isFloat(breadthval)) {

            if (perimeter.isSelected()) {
                float resultval = 2 * (Float.parseFloat(lengthval) + Float.parseFloat(breadthval));
                String output = String.format("%.3f", resultval);
                result.setText(output);
            } else if (area.isSelected()) {
                float resultval = (Float.parseFloat(lengthval) * Float.parseFloat(breadthval));
                String output = String.format("%.3f", resultval);
                result.setText(output);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Enter valid input!", "Warning!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lengthActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        Mensuration m = new Mensuration();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_backbtnActionPerformed

    public static boolean isFloat(String s) {
        try {
            Float.parseFloat(s);
        } catch (Exception e) {
            return false;
        }
        // only got here if we didn't return false
        return true;
    }

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
            java.util.logging.Logger.getLogger(Rectangle_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rectangle_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rectangle_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rectangle_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rectangle_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton area;
    private javax.swing.JButton backbtn;
    private javax.swing.JTextField breadth;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField length;
    private javax.swing.JRadioButton perimeter;
    private javax.swing.JTextField result;
    // End of variables declaration//GEN-END:variables
}
