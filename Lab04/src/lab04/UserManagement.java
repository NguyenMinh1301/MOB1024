package lab04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UserManagement extends javax.swing.JFrame {
    
    public List<Student> list = new ArrayList<Student>();
    private int current = 0;
    
    //Constructor
    public UserManagement() {
        initComponents();
        loadDataToArray();
        loadDataToJTable();
        
    }
    
    //Phương thức đẩy dữ liệu lên JTable
    public void loadDataToJTable() {
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        //Set toàn bộ dòng trong JTable về 0 (xoá dữ liệu trong bảng để tạo lại)
        model.setRowCount(0);
        
        //Try-catch bắt lỗi
        try (Connection con = DataBaseConnect.getConnection(); Statement stm = con.createStatement(); ResultSet rs = stm.executeQuery("SELECT * FROM Student")) {
            //Vòng lặp để duyệt qua tất cả dữ liệu trong SQL Server
            while (rs.next()) {
                String gender;
                
                //Lấy giá trị của giới tính
                try {
                    gender = rs.getBoolean("Gender") ? "Male" : "Female";
                } catch (Exception e) {
                    gender = rs.getString("Gender");
                }
                
                //Lưu các thông tin của sinh viên từ câu truy vấn
                Object[] row = {
                    rs.getString("ID"),
                    rs.getString("Name"),
                    rs.getString("Email"),
                    rs.getString("Phone"),
                    gender,
                    rs.getString("Address")
                };
                //Add thông tin vào JTable
                model.addRow(row);
            }

        } catch (SQLException ex) {
            System.out.println("Error when push data to table " + ex.getMessage());
            JOptionPane.showMessageDialog(this, "Error when push data to table", "Erorr", JOptionPane.ERROR);
        }
    }
    
    //Phương thức load dữ liệu vào mảng
    public void loadDataToArray() {
        //Try-catch bắt lỗi
        try (Connection con = DataBaseConnect.getConnection(); Statement stm = con.createStatement(); ResultSet rs = stm.executeQuery("SELECT * FROM Student")) {
            //Xoá dữ liệu trong danh sách cũ (nếu có)
            list.clear();
            while (rs.next()) {
                //Tạo đối tượng sinh viên
                Student sv = new Student();
                
                //Lưu thông tin vào model student
                sv.setId(rs.getString("ID"));
                sv.setName(rs.getString("Name"));
                sv.setEmail(rs.getString("Email"));
                sv.setPhone(rs.getString("Phone"));
                sv.setGender(rs.getBoolean("Gender"));
                sv.setAddress(rs.getString("Address"));
                
                //Add sinh viên vào list
                list.add(sv);
            }
            
            //Đóng Connection và Statement
            con.close();
            stm.close();

        } catch (Exception ex) {
            System.out.println("Error when load data to array " + ex.getMessage());
            JOptionPane.showMessageDialog(this, "Error when load data to array", "Erorr", JOptionPane.ERROR);
        }

    }

    public void display(int i) {
        //Tạo đối tượng Student từ danh sách list
        Student sv = list.get(i);
        
        //Đặt các thông tin của sinh viên lên textField tương ứng
        txtId.setText(sv.getId());
        txtName.setText(sv.getName());
        txtEmail.setText(sv.getEmail());
        txtPhone.setText(sv.getPhone());
        txtAddress.setText(sv.getAddress());
        
        //Lấy giá trị của giới tính
        boolean temp = sv.isGender();
        if (sv.isGender()) {
            rbMale.setSelected(true);
        } else {
            rbFemale.setSelected(true);
        }
    }

    //Phương thức add student
    public void addStudent() {
        //Xoá dữ liệu hiện có trên textField
        txtId.setText("");
        txtName.setText("");
        txtEmail.setText("");
        txtPhone.setText("");
        txtAddress.setText("");
        //Đặt con trỏ lên trên textField txtId
        txtId.requestFocus();
    }

    //Phương thức xoá sinh viên
    public void removeStudent() {
        //Nếu Id trống trong textField thả lỗi và dừng lại
        if (txtId.getText().equals("")) {
            System.out.println("Input student ID");
            JOptionPane.showMessageDialog(this, "Input student ID", "Erorr", JOptionPane.ERROR_MESSAGE);
            //Đặt con trỏ lên trên textField txtId
            txtId.requestFocus();
            return;
        }
        
        //Try-catch bắt lỗi
        try (Connection con = DataBaseConnect.getConnection(); PreparedStatement stm = con.prepareStatement("DELETE FROM Student WHERE ID = ?")) {
            
            //Set tham số cho câu truy vấn
            stm.setString(1, txtId.getText());
            
            //Thực hiện câu truy vấn
            stm.execute();
            JOptionPane.showMessageDialog(this, "Remove success", "Notification", JOptionPane.INFORMATION_MESSAGE);
            list.remove(current);   //Xoá sinh viên ra khỏi danh sách
            display(current--);     //Hiển thị thông tin sinh viên mới (sau khi xoá)
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Remove failed", "Notification", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex);
        }

    }

    //Phương thức chỉnh sửa thông tin sinh viên
    public void updateStudent() {
        try (Connection con = DataBaseConnect.getConnection(); PreparedStatement stm = con.prepareStatement(
                "UPDATE Student SET Name = ?, Email = ?, Phone = ?, Gender = ?, Address = ? WHERE ID = ?")) {
            
            //Set tham số cho câu truy vấn
            stm.setString(1, txtName.getText());    //Tên
            stm.setString(2, txtEmail.getText());   //Email
            stm.setString(3, txtPhone.getText());   //Số điện thoại
            stm.setBoolean(4, rbMale.isSelected()); //Giới tính
            stm.setString(5, txtAddress.getText()); //Địa chỉ
            stm.setString(6, txtId.getText());      //Id
            //Thực hiện câu truy vấn
            stm.executeUpdate();

            JOptionPane.showMessageDialog(this, "Update success", "Notification", JOptionPane.INFORMATION_MESSAGE);
            con.close();    //Đóng Connection
            loadDataToArray();  //Load dữ liệu mới vào mảng
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Remove failed", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex);
        }
    }

    //Phương thức lưu sinh viên
    public void saveStudent() {
        try (Connection con = DataBaseConnect.getConnection(); PreparedStatement stm = con.prepareStatement(
                "INSERT INTO Student (ID, Name, Email, Phone, Gender, Address) VALUES (?, ?, ?, ?, ?, ?)")) {
            
            //Set tham số cho câu truy vấn
            stm.setString(1, txtId.getText());      //Id
            stm.setString(2, txtName.getText());    //Tên
            stm.setString(3, txtEmail.getText());   //Email
            stm.setString(4, txtPhone.getText());   //Số điện thoại
            stm.setBoolean(5, rbMale.isSelected()); //Giới tính
            stm.setString(6, txtAddress.getText()); //Địa chỉ
            //Thực hiện câu truy vấn
            stm.executeUpdate();

            JOptionPane.showMessageDialog(this, "Save success", "Notification", JOptionPane.INFORMATION_MESSAGE);
            con.close();    //Đóng Connection
            loadDataToArray();  //Load dữ liệu mới vào mảng
            current++;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Save failed", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpGender = new javax.swing.ButtonGroup();
        lblUserManagement = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        lblGender = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblUserManagement.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblUserManagement.setText("USER MANAGEMENT");

        lblId.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblId.setText("ID");

        lblName.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblName.setText("NAME");

        lblEmail.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblEmail.setText("EMAIL");

        lblPhone.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblPhone.setText("PHONE");

        grpGender.add(rbMale);
        rbMale.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        rbMale.setText("MALE");

        grpGender.add(rbFemale);
        rbFemale.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        rbFemale.setText("FEMALE");

        lblGender.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblGender.setText("GENDER");

        lblAddress.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblAddress.setText("ADDRESS");

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Save.png"))); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Edit.png"))); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Add.png"))); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Delete.png"))); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnFirst.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnFirst.setText("FRIST");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnNext.setText("NEXT");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnLast.setText("LAST");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Email", "Phone", "Gender", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblData);
        if (tblData.getColumnModel().getColumnCount() > 0) {
            tblData.getColumnModel().getColumn(0).setResizable(false);
            tblData.getColumnModel().getColumn(0).setPreferredWidth(45);
            tblData.getColumnModel().getColumn(1).setResizable(false);
            tblData.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblData.getColumnModel().getColumn(2).setResizable(false);
            tblData.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblData.getColumnModel().getColumn(3).setResizable(false);
            tblData.getColumnModel().getColumn(4).setResizable(false);
            tblData.getColumnModel().getColumn(4).setPreferredWidth(50);
            tblData.getColumnModel().getColumn(5).setResizable(false);
            tblData.getColumnModel().getColumn(5).setPreferredWidth(180);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(lblUserManagement))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblName)
                                                .addComponent(lblId))
                                            .addComponent(lblEmail)
                                            .addComponent(lblPhone)
                                            .addComponent(lblGender))
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rbMale)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(rbFemale))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblAddress)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(btnFirst)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnBack)
                                                .addGap(9, 9, 9)
                                                .addComponent(btnNext)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnLast))))
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtEmail, txtId, txtName, txtPhone});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblEmail, lblId, lblName, lblPhone});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUserManagement)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblId, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblName)
                                .addGap(18, 18, 18)
                                .addComponent(lblEmail)
                                .addGap(18, 18, 18)
                                .addComponent(lblPhone)
                                .addGap(2, 2, 2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblGender)
                                .addComponent(rbMale))
                            .addComponent(rbFemale))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAddress)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFirst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtEmail, txtId, txtName, txtPhone});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblEmail, lblId, lblName, lblPhone});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        current = 0;
        display(current);
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        if (current == 0) {
            JOptionPane.showMessageDialog(null, "At the top of the list");
            return;
        }
        current--;
        display(current);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if (current == list.size() - 1) {
            JOptionPane.showMessageDialog(null, "At the end of the list");
            return;
        }
        current++;
        display(current);
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        current = list.size() - 1;
        display(current);
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        addStudent();
        loadDataToJTable();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        removeStudent();
        loadDataToJTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        updateStudent();
        loadDataToJTable();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        saveStudent();
        loadDataToJTable();
    }//GEN-LAST:event_btnSaveActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup grpGender;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblUserManagement;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
