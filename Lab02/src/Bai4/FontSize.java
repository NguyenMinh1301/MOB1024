/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Bai4;

import javax.swing.JOptionPane;

/**
 *
 * @author minhg
 */
public class FontSize extends javax.swing.JFrame {

    /**
     * Creates new form FontSize
     */
    public FontSize() {
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

        sldFontSize = new javax.swing.JSlider();
        lblValue = new javax.swing.JLabel();
        txtValue = new javax.swing.JTextField();
        lblFontSize = new javax.swing.JLabel();
        bntSetValue = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        sldFontSize.setMajorTickSpacing(5);
        sldFontSize.setMaximum(50);
        sldFontSize.setMinorTickSpacing(1);
        sldFontSize.setPaintLabels(true);
        sldFontSize.setPaintTicks(true);
        sldFontSize.setSnapToTicks(true);
        sldFontSize.setValue(25);
        sldFontSize.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldFontSizeStateChanged(evt);
            }
        });

        lblValue.setText("Value");

        lblFontSize.setText("Font Size");

        bntSetValue.setText("Set Value");
        bntSetValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSetValueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sldFontSize, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblValue)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntSetValue)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFontSize)
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sldFontSize, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValue)
                    .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntSetValue))
                .addGap(3, 3, 3)
                .addComponent(lblFontSize)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sldFontSizeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldFontSizeStateChanged
        int value = sldFontSize.getValue();
        txtValue.setText(String.valueOf(value));
        lblFontSize.setFont(new java.awt.Font("Inter", 1, value));
    }//GEN-LAST:event_sldFontSizeStateChanged

    private void bntSetValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSetValueActionPerformed
        if(txtValue.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter value", "Error", 0);
        } else {
            try {
                int value = Integer.valueOf(txtValue.getText());
                if(value < 0 || value > 50) {
                    JOptionPane.showConfirmDialog(this, "Value must between 0 to 50", "Erorr", 0);
                } else {
                    sldFontSize.setValue(value);
                    lblFontSize.setFont(new java.awt.Font("Inter", 1, value));
                }
            } catch (Exception ex) {
                JOptionPane.showConfirmDialog(this, "Value must be a number", "Erorr", 0);
            }
        }
    }//GEN-LAST:event_bntSetValueActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        int value = sldFontSize.getValue();
        txtValue.setText(String.valueOf(value));
        lblFontSize.setFont(new java.awt.Font("Inter", 1, value));
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(FontSize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FontSize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FontSize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FontSize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FontSize().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntSetValue;
    private javax.swing.JLabel lblFontSize;
    private javax.swing.JLabel lblValue;
    private javax.swing.JSlider sldFontSize;
    private javax.swing.JTextField txtValue;
    // End of variables declaration//GEN-END:variables
}
