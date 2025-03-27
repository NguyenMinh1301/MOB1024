package src.View.Screen;

import com.formdev.flatlaf.FlatDarkLaf;
import src.DAO.DAO_Notification;

public class View_Index extends javax.swing.JFrame {

    public static String currentAdmin;
    
    public View_Index() {
        DAO_Notification.announceError("An error occurred, please log in again");
        this.setVisible(false);
        View_Login lg = new View_Login();
        lg.setVisible(true);
    }
    
    public View_Index(String s) {
        initComponents();
        initDefaultData(s);
        panScreen.setLayout(new java.awt.CardLayout());
    }
    
    public void initDefaultData(String s) {
        this.setTitle("Student management V 1.0.0 | " + s);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        View_Index.currentAdmin = s;
        lblUserName.setText("username: " + currentAdmin);
        closeAll();
        View_Student studentPanel = new View_Student();  
        panScreen.add(studentPanel); 
    }

    public void closeAll() {
        panScreen.removeAll();
        panScreen.revalidate();
        panScreen.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIconUser = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblRoll = new javax.swing.JLabel();
        lblNameVersion = new javax.swing.JLabel();
        btnStudent = new javax.swing.JButton();
        btnScore = new javax.swing.JButton();
        btnChart = new javax.swing.JButton();
        lblIconStudentManagement = new javax.swing.JLabel();
        lblStudentManagement = new javax.swing.JLabel();
        lblVersion = new javax.swing.JLabel();
        panScreen = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblIconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/picture/user.png"))); // NOI18N
        lblIconUser.setText("jLabel2");

        lblUserName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUserName.setText("Username:");

        lblRoll.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRoll.setText("Role:");

        lblNameVersion.setText("Student Management (V 1.0.0)");

        btnStudent.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnStudent.setText("STUDENT");
        btnStudent.setActionCommand("");
        btnStudent.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });

        btnScore.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnScore.setText("SCORE");
        btnScore.setActionCommand("");
        btnScore.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScoreActionPerformed(evt);
            }
        });

        btnChart.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnChart.setText("CHART");
        btnChart.setActionCommand("");
        btnChart.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChartActionPerformed(evt);
            }
        });

        lblIconStudentManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/picture/logo.png"))); // NOI18N
        lblIconStudentManagement.setText("jLabel2");

        lblStudentManagement.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblStudentManagement.setText("Student Management");

        lblVersion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblVersion.setText("(V 1.0.0)");

        javax.swing.GroupLayout panScreenLayout = new javax.swing.GroupLayout(panScreen);
        panScreen.setLayout(panScreenLayout);
        panScreenLayout.setHorizontalGroup(
            panScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1031, Short.MAX_VALUE)
        );
        panScreenLayout.setVerticalGroup(
            panScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblIconStudentManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnChart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(lblNameVersion)
                            .addComponent(lblRoll)
                            .addComponent(lblUserName)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblStudentManagement)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(lblVersion)))
                                .addGap(22, 22, 22))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(lblIconUser, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnScore, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(panScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIconStudentManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStudentManagement)
                .addGap(4, 4, 4)
                .addComponent(lblVersion)
                .addGap(28, 28, 28)
                .addComponent(btnStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnScore, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnChart, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblIconUser, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUserName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRoll)
                .addGap(21, 21, 21)
                .addComponent(lblNameVersion)
                .addContainerGap())
            .addComponent(panScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScoreActionPerformed
        closeAll();  
        View_Score scorePanel = new View_Score();  
        panScreen.add(scorePanel); 
    }//GEN-LAST:event_btnScoreActionPerformed

    private void btnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentActionPerformed
        closeAll();  
        View_Student studentPanel = new View_Student();  
        panScreen.add(studentPanel);  
    }//GEN-LAST:event_btnStudentActionPerformed

    private void btnChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChartActionPerformed
        System.out.println("This feature is under development...");
    }//GEN-LAST:event_btnChartActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChart;
    private javax.swing.JButton btnScore;
    private javax.swing.JButton btnStudent;
    private javax.swing.JLabel lblIconStudentManagement;
    private javax.swing.JLabel lblIconUser;
    private javax.swing.JLabel lblNameVersion;
    private javax.swing.JLabel lblRoll;
    private javax.swing.JLabel lblStudentManagement;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblVersion;
    private javax.swing.JPanel panScreen;
    // End of variables declaration//GEN-END:variables
}
