package Bai2;

import java.security.MessageDigest;
import javax.swing.JOptionPane;

public class OptionPane extends javax.swing.JFrame {

    public OptionPane() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bnt1 = new javax.swing.JToggleButton();
        bnt3 = new javax.swing.JToggleButton();
        bnt2 = new javax.swing.JToggleButton();
        bnt4 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bnt1.setText("Message Dialog");
        bnt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt1ActionPerformed(evt);
            }
        });

        bnt3.setText("Confirm Dialog");
        bnt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt3ActionPerformed(evt);
            }
        });

        bnt2.setText("Input Dialog");
        bnt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt2ActionPerformed(evt);
            }
        });

        bnt4.setText("Option Dialog");
        bnt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bnt2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bnt3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bnt4, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnt2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnt3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnt4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt2ActionPerformed
        String name = JOptionPane.showInputDialog("Your name is");
        
        if(name != null) {
            JOptionPane.showMessageDialog(this, "Your name is " + name);
        }
    }//GEN-LAST:event_bnt2ActionPerformed

    private void bnt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt1ActionPerformed
        JOptionPane.showMessageDialog(this, "Please input your name", "Message", 1);
    }//GEN-LAST:event_bnt1ActionPerformed

    private void bnt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt3ActionPerformed
        int choise = JOptionPane.showConfirmDialog(this, "Are you sure?", "Confirm", JOptionPane.YES_NO_OPTION, 0);
        
        if(choise == JOptionPane.YES_OPTION) {
            JOptionPane.showConfirmDialog(this, "I accept !", "Option", 1);
        } else {
            JOptionPane.showConfirmDialog(this, "I refuse", "Option", 0);
        }
    }//GEN-LAST:event_bnt3ActionPerformed

    private void bnt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt4ActionPerformed
        int option = JOptionPane.QUESTION_MESSAGE;
        String[] options = {"Java", "C++", "VB", "PHP", "Perl"};
        
        int code = JOptionPane.showOptionDialog(this, "What language do you prefer", "Option Dialog Box", 0, option, null, options, "PHP");
        
        try {
            if(code == 0) {
                JOptionPane.showMessageDialog(this, "Your language is Java !", "Option Dialog Box", 1);
            } else if (code == 1) {
                JOptionPane.showMessageDialog(this, "Your language is C++ !", "Option Dialog Box", 1);
            } else if (code == 2) {
                JOptionPane.showMessageDialog(this, "Your language is VB !", "Option Dialog Box", 1);
            } else if (code == 3) {
                JOptionPane.showMessageDialog(this, "Your language is PHP !", "Option Dialog Box", 1);
            } else if (code == 4) {
                JOptionPane.showMessageDialog(this, "Your language is Perl !", "Option Dialog Box", 1);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error", "Error", 0);
        }
    }//GEN-LAST:event_bnt4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bnt1;
    private javax.swing.JToggleButton bnt2;
    private javax.swing.JToggleButton bnt3;
    private javax.swing.JToggleButton bnt4;
    // End of variables declaration//GEN-END:variables
}
