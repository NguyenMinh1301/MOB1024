package Bai3;

import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUserName = new javax.swing.JLabel();
        lblPassWord = new javax.swing.JLabel();
        lblLoginForm = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassWord = new javax.swing.JPasswordField();
        cbRememberMe = new javax.swing.JCheckBox();
        bntLogin = new javax.swing.JButton();
        bntReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblUserName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUserName.setText("Username");

        lblPassWord.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPassWord.setText("Password");

        lblLoginForm.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblLoginForm.setForeground(new java.awt.Color(102, 102, 255));
        lblLoginForm.setText("LOGIN FORM");

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        txtPassWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassWordActionPerformed(evt);
            }
        });

        cbRememberMe.setText("Remember me?");
        cbRememberMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRememberMeActionPerformed(evt);
            }
        });

        bntLogin.setText("Login");
        bntLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntLoginActionPerformed(evt);
            }
        });

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
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUserName)
                    .addComponent(lblPassWord))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLoginForm)
                        .addGap(181, 193, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUserName)
                            .addComponent(txtPassWord))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bntLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bntReset))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(cbRememberMe)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLoginForm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassWord)
                    .addComponent(txtPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbRememberMe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntLogin)
                    .addComponent(bntReset))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private boolean checkUserInfo() {
        if(this.txtUserName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Username", "Error", 0);
            txtUserName.requestFocus();
            return false;
        } else if (new String(txtPassWord.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Password", "Error", 0);
            txtPassWord.requestFocus();
            return false;
        } else if(txtUserName.getText().equalsIgnoreCase(new String(txtPassWord.getPassword()))) {
            JOptionPane.showMessageDialog(this, "Username and Password cannot be the same", "Error", 0);
            return false;
        }
        return true;
    }
    
    public boolean checkUserFpoly() {
        if(txtUserName.getText().equalsIgnoreCase("fpt") && new String (txtPassWord.getPassword()).equalsIgnoreCase("polytechnic")) {
            return true;
        }
        return false;
    }
    
    private void clearUserInfo() {
        this.txtUserName.setText("");
        this.txtPassWord.setText("");
    }
    
    private void checkBoxOn() {
        cbRememberMe.setSelected(true);
    }
    
    private void cbRememberMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRememberMeActionPerformed
            
    }//GEN-LAST:event_cbRememberMeActionPerformed
    
    private void bntLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLoginActionPerformed
        if(checkUserInfo()) {
            if(checkUserFpoly()) {
                JOptionPane.showMessageDialog(this, "Login susuccessful", "Notification", 1);
                JOptionPane.showMessageDialog(this, "Your account has been remember", "Notification", 1);
            } else {
                JOptionPane.showMessageDialog(this, "Login failed", "Notification", 0);
            }
        }
        
    }//GEN-LAST:event_bntLoginActionPerformed

    private void bntResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntResetActionPerformed
        clearUserInfo();
        checkBoxOn();
    }//GEN-LAST:event_bntResetActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtPassWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassWordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassWordActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntLogin;
    private javax.swing.JButton bntReset;
    private javax.swing.JCheckBox cbRememberMe;
    private javax.swing.JLabel lblLoginForm;
    private javax.swing.JLabel lblPassWord;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPasswordField txtPassWord;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
