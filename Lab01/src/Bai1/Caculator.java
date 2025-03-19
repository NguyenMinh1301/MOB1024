package Bai1;

import javax.swing.JOptionPane;

public class Caculator extends javax.swing.JFrame {

    public Caculator() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public boolean checkInput() {
        try {
            if (this.txtInput1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Input 1 cannot be null !!", "Error", 0);
                return false;
            } else {
                if (this.txtInput2.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Input 2 cannot be null !!", "Error", 0);
                    return false;
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error !!", "Error", 0);
            return false;
        }

        double input1;
        try {
            input1 = Double.parseDouble(this.txtInput1.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Please enter a number !!", "Error", 0);
            return false;
        }

        double input2;
        try {
            input2 = Double.parseDouble(this.txtInput2.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Please enter a number !!", "Error", 0);
            return false;
        }

        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblInput1 = new javax.swing.JLabel();
        lblCaculator = new javax.swing.JLabel();
        lblInput2 = new javax.swing.JLabel();
        txtInput1 = new javax.swing.JTextField();
        txtInput2 = new javax.swing.JTextField();
        lblResult = new javax.swing.JLabel();
        txtResult = new javax.swing.JTextField();
        bntCong = new javax.swing.JButton();
        bntTru = new javax.swing.JButton();
        bntNhan = new javax.swing.JButton();
        bntChia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblInput1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblInput1.setText("Input 1");

        lblCaculator.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCaculator.setText("CACULATOR");

        lblInput2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblInput2.setText("Input 2");

        txtInput1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInput1ActionPerformed(evt);
            }
        });

        txtInput2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInput2ActionPerformed(evt);
            }
        });

        lblResult.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblResult.setText("Result");

        txtResult.setEditable(false);
        txtResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultActionPerformed(evt);
            }
        });

        bntCong.setText("+");
        bntCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCongActionPerformed(evt);
            }
        });

        bntTru.setText("-");
        bntTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntTruActionPerformed(evt);
            }
        });

        bntNhan.setText("x");
        bntNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNhanActionPerformed(evt);
            }
        });

        bntChia.setText("/");
        bntChia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntChiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblInput1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInput1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblResult)
                            .addComponent(lblInput2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtInput2)
                            .addComponent(txtResult)))
                    .addComponent(lblCaculator)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(bntCong, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntTru, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntChia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCaculator)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInput1)
                    .addComponent(txtInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInput2)
                    .addComponent(txtInput2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResult)
                    .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntCong, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntTru, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntChia, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtInput2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInput2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInput2ActionPerformed

    private void txtResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultActionPerformed

    private void bntChiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntChiaActionPerformed
        if (this.txtInput2.getText().equals("0")) {
            JOptionPane.showMessageDialog(this, "Input 2 cannot be 0 !!", "Error", 0);
        } else {
            double input1, input2, result;
            try {
                input1 = Double.valueOf(this.txtInput1.getText());
                input2 = Double.valueOf(this.txtInput2.getText());

                result = input1 / input2;

                txtResult.setText(String.valueOf(result));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error !!", "Error", 0);
            }
        }
    }//GEN-LAST:event_bntChiaActionPerformed

    private void bntNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNhanActionPerformed
        if (checkInput()) {
            double input1, input2, result;
            try {
                input1 = Double.valueOf(this.txtInput1.getText());
                input2 = Double.valueOf(this.txtInput2.getText());

                result = input1 * input2;

                txtResult.setText(String.valueOf(result));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error !!", "Error", 0);
            }
        }
    }//GEN-LAST:event_bntNhanActionPerformed

    private void bntTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntTruActionPerformed
        if (checkInput()) {
            double input1, input2, result;
            try {
                input1 = Double.valueOf(this.txtInput1.getText());
                input2 = Double.valueOf(this.txtInput2.getText());

                result = input1 - input2;

                txtResult.setText(String.valueOf(result));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error !!", "Error", 0);
            }
        }
    }//GEN-LAST:event_bntTruActionPerformed

    private void bntCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCongActionPerformed
        if (checkInput()) {
            double input1, input2, result;
            try {
                input1 = Double.valueOf(this.txtInput1.getText());
                input2 = Double.valueOf(this.txtInput2.getText());

                result = input1 + input2;

                txtResult.setText(String.valueOf(result));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error !!", "Error", 0);
            }
        }
    }//GEN-LAST:event_bntCongActionPerformed

    private void txtInput1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInput1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInput1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntChia;
    private javax.swing.JButton bntCong;
    private javax.swing.JButton bntNhan;
    private javax.swing.JButton bntTru;
    private javax.swing.JLabel lblCaculator;
    private javax.swing.JLabel lblInput1;
    private javax.swing.JLabel lblInput2;
    private javax.swing.JLabel lblResult;
    private javax.swing.JTextField txtInput1;
    private javax.swing.JTextField txtInput2;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}
