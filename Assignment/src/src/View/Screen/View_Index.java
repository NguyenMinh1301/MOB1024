    package src.View.Screen;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import src.Model.Model_User;
import src.Service.Handle_Notification;

public class View_Index extends javax.swing.JFrame {

    //Lưu thông tin người dùng đang đăng nhập hiện tại
    private Model_User currentUser;

    //Báo lỗi nếu vào chương trình mà không qua bước đăng nhập
    public View_Index() {
        Handle_Notification.announceError("An error occurred, please log in again");
        this.setVisible(false);
        View_Login lg = new View_Login();
        lg.setVisible(true);
    }

    
    public View_Index(Model_User user) {
        this.currentUser = user;
        initComponents();
        closeAll();
        addHoverEffect(btnStudent);
        addHoverEffect(btnScore);
        addHoverEffect(btnChart);
        addHoverEffect(btnLogOut);

        checkPermission();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        panScreen.setLayout(new java.awt.CardLayout());
    }

    //Kiểm tra quyền của người dùng
    private void checkPermission() {
        //Lấy thông tin của người dùng (username, role)
        String username = currentUser.getUsername();
        int role = currentUser.getRole();
        String roleName = "";

        //1 = admin | 2 = teacher | 3 = user
        switch (role) {
            case 1:
                roleName = "admin";
                break;
            case 2:
                roleName = "teacher";
                break;
            case 3:
                roleName = "user";
                break;
            default:
                roleName = "unknown";
                break;
        }

        if (role == 1) { //Admin
            View_Student studentPanel = new View_Student();
            panScreen.add(studentPanel);
        }
        if (role == 2) { //Teacher
            btnStudent.setVisible(false);
            View_Score scorePanel = new View_Score(currentUser);
            panScreen.add(scorePanel);
        }
        if (role == 3) { //User
            btnStudent.setVisible(false);
            btnChart.setVisible(false);
            View_Score scorePanel = new View_Score(currentUser);
            panScreen.add(scorePanel);
        }

        //Hiện thông tin của người dùng bên trong giao diện
        this.setTitle("Student management V 1.0.0 | " + username);
        lblUserName.setText("username: " + username);
        lblRole.setText("role: " + roleName);
    }
    
    //Xoá màn hình cũ vẽ lại giao diện mới
    public void closeAll() {
        panScreen.removeAll();
        panScreen.revalidate();
        panScreen.repaint();
    }
    
    //Tạo hiệu ứng hover khi đưa chuột vào button
    public static void addHoverEffect(JButton btn) {
        btn.putClientProperty("JButton.buttonType", "roundRect");
        btn.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        btn.setFocusPainted(true);

        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btn.setBackground(new Color(100, 149, 237));
                btn.setOpaque(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btn.setBackground(null);
                btn.setOpaque(false);
            }
        });
    }
    
    //Đổi theme cho chương trình
    public void switchTheme(boolean dark) {
        try {
            if (dark) {
                FlatDarkLaf.setup();
            } else {
                FlatLightLaf.setup();
            }

            FlatLaf.updateUI();

        } catch (Exception ex) {
            System.err.println("Failed to initialize theme.");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpTheme = new javax.swing.ButtonGroup();
        lblNameVersion = new javax.swing.JLabel();
        btnStudent = new javax.swing.JButton();
        btnScore = new javax.swing.JButton();
        btnChart = new javax.swing.JButton();
        lblIconStudentManagement = new javax.swing.JLabel();
        lblStudentManagement = new javax.swing.JLabel();
        lblVersion = new javax.swing.JLabel();
        panScreen = new javax.swing.JPanel();
        btnLogOut = new javax.swing.JButton();
        btnLight = new javax.swing.JToggleButton();
        btnDark = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        lblUserName = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNameVersion.setText("Student Management (v1.0.0)");

        btnStudent.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnStudent.setText("STUDENT");
        btnStudent.setActionCommand("");
        btnStudent.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });

        btnScore.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnScore.setText("SCORE");
        btnScore.setActionCommand("");
        btnScore.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnScore.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScoreActionPerformed(evt);
            }
        });

        btnChart.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnChart.setText("CHART");
        btnChart.setActionCommand("");
        btnChart.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnChart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        lblVersion.setText("(v1.0.0)");

        javax.swing.GroupLayout panScreenLayout = new javax.swing.GroupLayout(panScreen);
        panScreen.setLayout(panScreenLayout);
        panScreenLayout.setHorizontalGroup(
            panScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1037, Short.MAX_VALUE)
        );
        panScreenLayout.setVerticalGroup(
            panScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnLogOut.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnLogOut.setText("LOG OUT");
        btnLogOut.setActionCommand("");
        btnLogOut.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        grpTheme.add(btnLight);
        btnLight.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnLight.setText("LIGHT");
        btnLight.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLightActionPerformed(evt);
            }
        });

        grpTheme.add(btnDark);
        btnDark.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnDark.setText("DARK");
        btnDark.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDark.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarkActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("INFO"));

        lblUserName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUserName.setText("username:");

        lblRole.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRole.setText("role:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUserName)
                    .addComponent(lblRole))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblUserName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRole)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnLogOut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnLight, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19)
                                        .addComponent(btnDark, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(btnStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnScore, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnChart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblNameVersion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblStudentManagement)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(lblVersion)))
                                .addGap(10, 10, 10))
                            .addComponent(lblIconStudentManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(44, 44, 44)
                .addComponent(btnScore, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnChart, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLight, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDark, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNameVersion)
                .addContainerGap())
            .addComponent(panScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScoreActionPerformed
        closeAll();
        //Hiển thị panel Score
        View_Score scorePanel = new View_Score(currentUser);
        panScreen.add(scorePanel);
    }//GEN-LAST:event_btnScoreActionPerformed

    private void btnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentActionPerformed
        closeAll();
        //Hiển thị panel Student
        View_Student studentPanel = new View_Student();
        panScreen.add(studentPanel);
    }//GEN-LAST:event_btnStudentActionPerformed

    private void btnChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChartActionPerformed
        closeAll();
        //Hiển thị panel Chart
        View_Chart chartPanel = new View_Chart();
        panScreen.add(chartPanel);
    }//GEN-LAST:event_btnChartActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        //Tắt màn hình hiện tại và gọi lại màn Login
        this.setVisible(false);
        View_Login lg = new View_Login();
        lg.setVisible(true);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnLightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLightActionPerformed
        //Đổi theme Light
        switchTheme(false);
    }//GEN-LAST:event_btnLightActionPerformed

    private void btnDarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarkActionPerformed
        //Đổi theme Dark
        switchTheme(true);
    }//GEN-LAST:event_btnDarkActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChart;
    private javax.swing.JToggleButton btnDark;
    private javax.swing.JToggleButton btnLight;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnScore;
    private javax.swing.JButton btnStudent;
    private javax.swing.ButtonGroup grpTheme;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblIconStudentManagement;
    private javax.swing.JLabel lblNameVersion;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblStudentManagement;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblVersion;
    private javax.swing.JPanel panScreen;
    // End of variables declaration//GEN-END:variables
}
