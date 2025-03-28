package src.View.Screen;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import src.DAO.DAO_Notification;
import src.Model.Model_Students;
import src.Service.Service_Student;
import src.View.SupScreen.Student.SupScreen_AddStudent;
import src.View.SupScreen.Student.SupScreen_DetailsStudent;
import src.View.SupScreen.Student.SupScreen_UpdateStudent;

public class View_Student extends javax.swing.JPanel {

    private Service_Student service;

    public View_Student() {
        initComponents();
        initStudentsData();
    }

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
                x.isGender() ? "Nam" : "Nữ",
                x.getAddress(),
                x.getAvatar()
            });
        }
        this.tblStudents.setModel(model);
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
        btnRefresh1 = new javax.swing.JButton();

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
            tblStudents.getColumnModel().getColumn(4).setPreferredWidth(20);
            tblStudents.getColumnModel().getColumn(5).setPreferredWidth(150);
        }

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnRemove.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnRemove.setText("REMOVE");
        btnRemove.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnSearch.setText("SEARCH");
        btnSearch.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnExport.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnExport.setText("EXPORT");
        btnExport.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnRefresh.setText("REFRESH");
        btnRefresh.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnDetails.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnDetails.setText("DETAILS");
        btnDetails.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailsActionPerformed(evt);
            }
        });

        btnRefresh1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnRefresh1.setText("OPTION");
        btnRefresh1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

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
                        .addComponent(btnRefresh1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(btnDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        SupScreen_AddStudent add = new SupScreen_AddStudent(this);
        add.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblStudents.getModel();
        int index = tblStudents.getSelectedRow();

        if (index == -1) {
            DAO_Notification.announceWarning("Cannot update student if not selected !");
            return;
        }

        String id = model.getValueAt(index, 0).toString();
        String name = model.getValueAt(index, 1).toString();
        String email = model.getValueAt(index, 2).toString();
        String phone = model.getValueAt(index, 3).toString();
        String genderStr = model.getValueAt(index, 4).toString();
        boolean gender = genderStr.equalsIgnoreCase("Nam");
        String address = model.getValueAt(index, 5).toString();
        String avatar = model.getValueAt(index, 6).toString();

        SupScreen_UpdateStudent updateForm = new SupScreen_UpdateStudent(id, name, email, phone, gender, address, avatar, this);
        updateForm.setVisible(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblStudents.getModel();
        int index = tblStudents.getSelectedRow();

        if (index == -1) {
            DAO_Notification.announceWarning("Cannot remove student if not selected !");
            return;
        }

        String id = model.getValueAt(index, 0).toString();
        String name = model.getValueAt(index, 1).toString();

        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete student " + name + " ?", "Notification", JOptionPane.YES_NO_OPTION);

        if (confirm != JOptionPane.YES_NO_OPTION) {
            return;
        }

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
                    DAO_Notification.announceInfo("Delete student " + name + " success!");
                    initStudentsData();
                    break;
                } else {
                    DAO_Notification.announceWarning("Delete student " + name + " failed!");
                    break;
                }
            } else {
                DAO_Notification.announceWarning("Name does not match please re-enter");
            }

        }


    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String input = txtSearch.getText().trim();
        if (input.isEmpty()) {
            initStudentsData();
        }
        DefaultTableModel model = (DefaultTableModel) tblStudents.getModel();
        model.setRowCount(0);
        boolean found = false;
        for (Model_Students s : service.getStudentData()) {
            if (s.getId().equalsIgnoreCase(input) || s.getName().equalsIgnoreCase(input)) {
                model.addRow(new Object[]{
                    s.getId(),
                    s.getName(),
                    s.getEmail(),
                    s.getPhone(),
                    s.isGender() ? "Male" : "Female",
                    s.getAddress(),
                    s.getAvatar()
                });
                found = true;
                break;
            }
        }

        if (!found) {
            DAO_Notification.announceWarning("No student found with Name or Id as: " + input);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        initStudentsData();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblStudents.getModel();
        int index = tblStudents.getSelectedRow();

        if (index == -1) {
            DAO_Notification.announceWarning("Cannot remove student if not selected !");
            return;
        }

        String id = model.getValueAt(index, 0).toString();
        String name = model.getValueAt(index, 1).toString();
        String email = model.getValueAt(index, 2).toString();
        String phone = model.getValueAt(index, 3).toString();
        String genderStr = model.getValueAt(index, 4).toString();
        boolean gender = genderStr.equalsIgnoreCase("Male");
        String address = model.getValueAt(index, 5).toString();
        String avatar = model.getValueAt(index, 6).toString();

        SupScreen_DetailsStudent detailsForm = new SupScreen_DetailsStudent(id, name, email, phone, gender, address, avatar, this);
        detailsForm.setVisible(true);
    }//GEN-LAST:event_btnDetailsActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed

    }//GEN-LAST:event_btnExportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDetails;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRefresh1;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblStudents;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
