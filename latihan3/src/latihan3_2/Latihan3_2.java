/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3_2;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author daffa
 */
public class Latihan3_2 extends javax.swing.JFrame {

    /**
     * Creates new form Latihan3_2
     */
    public Latihan3_2() {
        initComponents();
        txtoutput.setLineWrap(true);
        txtoutput.setWrapStyleWord(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtjudul = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtoutput = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbhuruf = new javax.swing.JComboBox<>();
        cbukuran = new javax.swing.JComboBox<>();
        cbwarna = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtjudul.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtjudul.setText("Latihan 3.2");

        txtoutput.setColumns(20);
        txtoutput.setRows(5);
        jScrollPane1.setViewportView(txtoutput);

        jLabel2.setText("Jenis Font");

        jLabel3.setText("Ukuran");

        jLabel4.setText("Warna");

        cbhuruf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arial", "Tahoma", "Verdana" }));
        cbhuruf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbhurufActionPerformed(evt);
            }
        });

        cbukuran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12", "14", "18", "24" }));
        cbukuran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbukuranActionPerformed(evt);
            }
        });

        cbwarna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hitam", "Merah", "Biru" }));
        cbwarna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbwarnaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(txtjudul)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbhuruf, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbukuran, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbwarna, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(txtjudul)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbhuruf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbukuran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbwarna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(103, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbhurufActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbhurufActionPerformed
        // TODO add your handling code here:
        if(cbhuruf.getSelectedItem()=="Arial"){
            txtoutput.setFont(new Font("Arial",Font.PLAIN,Integer.valueOf(cbukuran.getSelectedItem().toString())));
        } else if(cbhuruf.getSelectedItem() == "Tahoma") {
            txtoutput.setFont(new Font("Tahoma",Font.PLAIN,Integer.valueOf(cbukuran.getSelectedItem().toString())));
        } else if(cbhuruf.getSelectedItem() == "Verdana"){
            txtoutput.setFont(new Font("Verdana",Font.PLAIN,Integer.valueOf(cbukuran.getSelectedItem().toString())));
        }
    }//GEN-LAST:event_cbhurufActionPerformed

    private void cbukuranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbukuranActionPerformed
        // TODO add your handling code here:
        if(cbukuran.getSelectedItem() == "12"){
            txtoutput.setFont(new Font("", Font.PLAIN,12));
        } else if(cbukuran.getSelectedItem() == "14"){
            txtoutput.setFont(new Font("", Font.PLAIN, 14));
        } else if(cbukuran.getSelectedItem() == "18"){
            txtoutput.setFont(new Font("", Font.PLAIN, 18));
        } else if(cbukuran.getSelectedItem() == "24"){
            txtoutput.setFont(new Font("", Font.PLAIN, 24));
        }
    }//GEN-LAST:event_cbukuranActionPerformed

    private void cbwarnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbwarnaActionPerformed
        // TODO add your handling code here:
        if(cbwarna.getSelectedItem() == "Hitam"){
            txtoutput.setForeground(Color.BLACK);
        } else if(cbwarna.getSelectedItem() == "Merah"){
            txtoutput.setForeground(Color.RED);
        } else if(cbwarna.getSelectedItem()=="Biru"){
            txtoutput.setForeground(Color.BLUE);
        }
    }//GEN-LAST:event_cbwarnaActionPerformed

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
            java.util.logging.Logger.getLogger(Latihan3_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan3_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan3_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan3_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan3_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbhuruf;
    private javax.swing.JComboBox<String> cbukuran;
    private javax.swing.JComboBox<String> cbwarna;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtjudul;
    private javax.swing.JTextArea txtoutput;
    // End of variables declaration//GEN-END:variables
}
