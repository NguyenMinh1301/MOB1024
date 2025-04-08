package src.View.Screen;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import src.Model.Model_Students;
import src.Service.Service_Student;
import src.View.SupScreen.Student.SubScreen_AddStudent;
import src.View.SupScreen.Student.SubScreen_DetailsStudent;
import src.View.SupScreen.Student.SubScreen_UpdateStudent;
import src.Service.Service_ExportHelper;
import src.Service.Handle_Notification;

public class View_Student extends javax.swing.JPanel {

    private Service_Student service;

    public View_Student() {
        initComponents();
        //Add giữ liệu Student vào bảng
        initStudentsData();
        //Add hint cho txtField tìm kiếm
        addHint(txtSearch, "Id or name");
        //Listener cho phép tìm kiếm theo thời gian thực
        initSearch();
        
        //Khởi tạo hiệu ứng hover cho từng nút
        addHoverEffect(btnAdd);
        addHoverEffect(btnUpdate);
        addHoverEffect(btnRemove);
        addHoverEffect(btnSearch);
        addHoverEffect(btnExport);
        addHoverEffect(btnDetails);
        addHoverEffect(btnRefresh);
    }
    
    //Lấy dữ liệu từ database sau đó xuất lên table
    public void initStudentsData() {
        this.service = new Service_Student();
        DefaultTableModel model = (DefaultTableModel) tblStudents.getModel();
        model.setRowCount(0);
        for (Model_Students x : service.getStudentData()) {
            model.addRow(new Object[]{
                x.getId(),
                x.getName(),
                x.getEmail(),
                x.getPhone(),
                x.isGender() ? "Male" : "Female",
                x.getAddress(),
                x.getAvatar()
            });
        }
        this.tblStudents.setModel(model);
    }
    
    //Listener để tìm kiếm ngay khi có sự thay đổi trong txtField người dùng nhập
    public void initSearch() {
        txtSearch.getDocument().addDocumentListener(new DocumentListener() {
            
            //Người dùng nhập thêm chữ
            @Override
            public void insertUpdate(DocumentEvent e) {
                performLiveSearch();
            }
            
            //Người dùng xoá chữ
            @Override
            public void removeUpdate(DocumentEvent e) {
                performLiveSearch();
            }
            
            //Người dùng sửa chữ
            @Override
            public void changedUpdate(DocumentEvent e) {
                performLiveSearch();
            }

            //Hàm nội bộ dùng để tìm kiếm
            private void performLiveSearch() {
                //Lấy keyword từ txtField người dùng nhập
                String keyword = txtSearch.getText().trim();
                //Tránh tìm kiếm trùng với hint trên txtField
                if (keyword.equals("Id or name") || !txtSearch.hasFocus()) {
                    return;
                }
                
                //Gọi DAO thông qua service để tìm kiếm tên hoặc id. Nếu có tồn tại tên hoặc id trùng với keyword lưu vào danh sách
                List<Model_Students> result = new Service_Student().searchStudent(keyword);
                
                //Xoá danh sách cũ đang có
                DefaultTableModel model = (DefaultTableModel) tblStudents.getModel();
                model.setRowCount(0);
                
                //Add dữ liệu trong danh sách mới vào bảng
                for (Model_Students s : result) {
                    model.addRow(new Object[]{
                        s.getId(),
                        s.getName(),
                        s.getEmail(),
                        s.getPhone(),
                        s.isGender() ? "Male" : "Female",
                        s.getAddress(),
                        s.getAvatar()
                    });
                }
            }
        });

    }
    
    //Tạo hint cho textField
    private void addHint(JTextField field, String hint) {
        field.setForeground(Color.GRAY);
        field.setText(hint);

        field.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (field.getText().equals(hint)) {
                    field.setText("");
                    field.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (field.getText().isEmpty()) {
                    field.setText(hint);
                    field.setForeground(Color.GRAY);
                }
            }
        });
    }
    
    //Tạo hiệu ứng hover cho button
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudents = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnExport = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnDetails = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1037, 0));

        tblStudents.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblStudents.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        tblStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Student", "Name", "Email", "Phone", "Gender", "Address", "Avatar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblStudents);
        if (tblStudents.getColumnModel().getColumnCount() > 0) {
            tblStudents.getColumnModel().getColumn(0).setPreferredWidth(70);
            tblStudents.getColumnModel().getColumn(1).setPreferredWidth(170);
            tblStudents.getColumnModel().getColumn(2).setPreferredWidth(200);
            tblStudents.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblStudents.getColumnModel().getColumn(4).setPreferredWidth(50);
            tblStudents.getColumnModel().getColumn(5).setPreferredWidth(150);
        }

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnRemove.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnRemove.setText("REMOVE");
        btnRemove.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnRemove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnSearch.setText("SEARCH");
        btnSearch.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnExport.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnExport.setText("EXPORT");
        btnExport.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnExport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnRefresh.setText("REFRESH");
        btnRefresh.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnDetails.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnDetails.setText("DETAILS");
        btnDetails.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        //Gọi cửa sổ add lên màn hình
        SubScreen_AddStudent add = new SubScreen_AddStudent(this);
        add.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        //Lấy địa chỉ dòng người dùng đang chọn
        DefaultTableModel model = (DefaultTableModel) tblStudents.getModel();
        int index = tblStudents.getSelectedRow();

        //Nếu người dùng không chọn sinh viên update báo lỗi và huỷ thao tác
        if (index == -1) {
            Handle_Notification.announceWarning("Cannot update student if not selected !");
            return;
        }

        //Lấy thông tin trước khi update của sinh viên
        String id = model.getValueAt(index, 0).toString();
        String name = model.getValueAt(index, 1).toString();
        String email = model.getValueAt(index, 2).toString();
        String phone = model.getValueAt(index, 3).toString();
        String genderStr = model.getValueAt(index, 4).toString();
        boolean gender = genderStr.equalsIgnoreCase("Male");
        String address = model.getValueAt(index, 5).toString();
        String avatar = model.getValueAt(index, 6).toString();

        //Gọi cửa sổ update và truyền dữ liệu của sinh viên
        SubScreen_UpdateStudent updateForm = new SubScreen_UpdateStudent(id, name, email, phone, gender, address, avatar, this);
        updateForm.setVisible(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        //Lấy vị trí người dùng chọn
        DefaultTableModel model = (DefaultTableModel) tblStudents.getModel();
        int index = tblStudents.getSelectedRow();

        //Nếu người dùng không chọn sinh viên remove báo lỗi và huỷ thao tác
        if (index == -1) {
            Handle_Notification.announceWarning("Cannot remove student if not selected !");
            return;
        }

        String id = model.getValueAt(index, 0).toString();
        String name = model.getValueAt(index, 1).toString();

        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete student " + name + " ?", "Notification", JOptionPane.YES_NO_OPTION);

        if (confirm != JOptionPane.YES_NO_OPTION) {
            return;
        }

        //Mời người dùng nhập lại tên của sinh viên nếu nhập đúng mới thực hiện xoá
        boolean isName = false;
        while (true) {
            String inputName = JOptionPane.showInputDialog(this, "Please re-enter student name " + name + " to confirm");

            if (inputName == null) {
                return;
            }

            if (inputName.trim().equalsIgnoreCase(name)) {
                isName = true;

                Service_Student service = new Service_Student();
                boolean deleted = service.deleteStudentById(id);
                if (deleted) {
                    Handle_Notification.announceInfo("Delete student " + name + " success!");
                    initStudentsData();
                    break;
                } else {
                    Handle_Notification.announceWarning("Delete student " + name + " failed!");
                    break;
                }
            } else {
                Handle_Notification.announceWarning("Name does not match please re-enter");
            }

        }


    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        //Tìm kiếm theo id hoặc name
        String keyword = txtSearch.getText().trim();
        if (keyword.equals("Id or name") || keyword.isEmpty()) {
            initStudentsData();
            return;
        }

        List<Model_Students> result = new Service_Student().searchStudents(keyword);
        DefaultTableModel model = (DefaultTableModel) tblStudents.getModel();
        model.setRowCount(0);

        for (Model_Students s : result) {
            model.addRow(new Object[]{
                s.getId(),
                s.getName(),
                s.getEmail(),
                s.getPhone(),
                s.isGender() ? "Male" : "Female",
                s.getAddress(),
                s.getAvatar()
            });

        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        //Gọi lại hàm xuất data lên table
        initStudentsData();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsActionPerformed
        //Lấy vị trí người dùng chọn
        DefaultTableModel model = (DefaultTableModel) tblStudents.getModel();
        int index = tblStudents.getSelectedRow();

        //Nếu người dùng không chọn sinh viên remove báo lỗi và huỷ thao tác
        if (index == -1) {
            Handle_Notification.announceWarning("Cannot show details student if not selected !");
            return;
        }
        
        //Lấy dữ liệu của sinh viên
        String id = model.getValueAt(index, 0).toString();
        String name = model.getValueAt(index, 1).toString();
        String email = model.getValueAt(index, 2).toString();
        String phone = model.getValueAt(index, 3).toString();
        String genderStr = model.getValueAt(index, 4).toString();
        boolean gender = genderStr.equalsIgnoreCase("Male");
        String address = model.getValueAt(index, 5).toString();
        String avatar = model.getValueAt(index, 6).toString();
        
        //Gọi cửa sổ Details lên màn hình
        SubScreen_DetailsStudent detailsForm = new SubScreen_DetailsStudent(id, name, email, phone, gender, address, avatar, this);
        detailsForm.setVisible(true);
    }//GEN-LAST:event_btnDetailsActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        //Gọi service Export ra file excel
        try {
            Service_ExportHelper.exportToCSV(tblStudents);
        } catch (IOException ex) {
            Logger.getLogger(View_Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDetails;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblStudents;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
