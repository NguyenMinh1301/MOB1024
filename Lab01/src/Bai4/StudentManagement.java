package Bai4;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class StudentManagement extends javax.swing.JFrame {

    public StudentManagement() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpSex = new javax.swing.ButtonGroup();
        grpHobby = new javax.swing.ButtonGroup();
        lblName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblSex = new javax.swing.JLabel();
        lblHobby = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        cbReading = new javax.swing.JCheckBox();
        cbSinging = new javax.swing.JCheckBox();
        cbDancing = new javax.swing.JCheckBox();
        bntValidate = new javax.swing.JToggleButton();
        bntReset = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblName.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblName.setText("Name");

        lblAddress.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblAddress.setText("Address");

        lblSex.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblSex.setText("Sex");

        lblHobby.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblHobby.setText("Hobby");

        txtName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txtAddress.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        grpSex.add(rbMale);
        rbMale.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        rbMale.setText("Male");

        grpSex.add(rbFemale);
        rbFemale.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        rbFemale.setText("Female");
        rbFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemaleActionPerformed(evt);
            }
        });

        grpHobby.add(cbReading);
        cbReading.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        cbReading.setText("Reading");

        grpHobby.add(cbSinging);
        cbSinging.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        cbSinging.setText("Singing");

        grpHobby.add(cbDancing);
        cbDancing.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        cbDancing.setText("Dancing");
        cbDancing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDancingActionPerformed(evt);
            }
        });

        bntValidate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        bntValidate.setText("Validate");
        bntValidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntValidateActionPerformed(evt);
            }
        });

        bntReset.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        bntReset.setText("Reset");
        bntReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddress)
                    .addComponent(lblName)
                    .addComponent(lblSex))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbFemale)
                            .addComponent(rbMale)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bntValidate)
                                .addGap(27, 27, 27)
                                .addComponent(bntReset)
                                .addGap(8, 8, 8))
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addComponent(lblHobby)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbReading)
                            .addComponent(cbSinging)
                            .addComponent(cbDancing))
                        .addGap(0, 50, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddress)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHobby)
                            .addComponent(cbReading))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSinging)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbDancing)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSex)
                    .addComponent(rbMale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbFemale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntValidate)
                    .addComponent(bntReset))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean checkStudentInfoName() {
        if(txtName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Name cannot be empty", "Error", 0);
            txtName.requestFocus();
            return false;
        }
        return true;
    }
    
    public boolean checkStudentInfoAddress() {
        if(txtAddress.getText().isEmpty()) {
            JOptionPane.showConfirmDialog(this, "Address cannot be empty", "Error", 0);
            txtAddress.requestFocus();
            return false;
        }
        return true;
    }
    
    public String getSelectedSex() {
        if(rbMale.isSelected()){
            return "Nam";
        } else if(rbFemale.isSelected()){
            return "Nữ";
        } else {
            JOptionPane.showMessageDialog(this, "Please select Sex", "Error", 0);
            return "";
        }
    }
    
    public String getSelectedHobby() {
        String hobby = null;
        if(cbReading.isSelected()){
            hobby = "Reading";
        }
        if(cbSinging.isSelected()){
            hobby = "Singing";
        }
        if(cbDancing.isSelected()){
            hobby = "Dancing";
        }
        return hobby;
    }
    
    public void printStudentInfo(String sex, String hobby) {
        String info = "Name: " + txtName.getText() 
                  + "\nAddress: " + txtAddress.getText() 
                  + "\nSex: " + sex 
                  + "\nHobby: " + hobby;
        JOptionPane.showMessageDialog(this, info, "Student Information", 1);
    }
    
    private void rbFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFemaleActionPerformed

    private void cbDancingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDancingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDancingActionPerformed

    private void bntValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntValidateActionPerformed
        if(checkStudentInfoName() && checkStudentInfoAddress()) {
            String hobby = getSelectedHobby();
            String sex = getSelectedSex();
            
            if(hobby.isEmpty()){
                JOptionPane.showMessageDialog(this, "Not entered hobby", "Error", 0);
                return;
            }
            
            if(sex.isEmpty()){
                return;
            }
            printStudentInfo(sex, hobby);
        }
    }//GEN-LAST:event_bntValidateActionPerformed

    private void bntResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntResetActionPerformed
        txtName.setText("");
        txtAddress.setText("");
        rbMale.setSelected(false);
        rbFemale.setSelected(false);
        cbReading.setSelected(false);
        cbSinging.setSelected(false);
        cbDancing.setSelected(false);
    }//GEN-LAST:event_bntResetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bntReset;
    private javax.swing.JToggleButton bntValidate;
    private javax.swing.JCheckBox cbDancing;
    private javax.swing.JCheckBox cbReading;
    private javax.swing.JCheckBox cbSinging;
    private javax.swing.ButtonGroup grpHobby;
    private javax.swing.ButtonGroup grpSex;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblHobby;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSex;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
