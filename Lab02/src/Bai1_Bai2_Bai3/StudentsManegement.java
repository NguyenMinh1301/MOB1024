package Bai1_Bai2_Bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class StudentsManegement extends javax.swing.JFrame {

    List<Student> list = new ArrayList<>();
    DefaultTableModel tblModel;

    public StudentsManegement() {
        initComponents();
    }

    public void fillToTable() {
        String[] columns = {"Name", "Mark", "Course", "Grade", "Bonus"};
        tblModel = new DefaultTableModel(columns, 0);
        for (Student x : list) {
            Object[] info = {x.getName(), x.getMark(), x.getCourse(), x.getGrade(), x.isBonus() ? "Yes" : "No"};
            tblModel.addRow(info);
        }
        tblStudents.setModel(tblModel);
    }

    public void showDetail() {
        int index = tblStudents.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(this, "Please select a student to view details!");
            return;
        }
        Student sd = list.get(index);

        txtFullName.setText(sd.getName());
        txtMark.setText(String.valueOf(sd.getMark()));
        txtGrade.setText(sd.getGrade());
        cbbCourse.setSelectedItem(sd.getCourse());
        cbBonus.setSelected(sd.isBonus());
    }

    public void addStudents() {
        String name = txtFullName.getText().trim();
        String markText = txtMark.getText().trim();
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Name", "Erorr", 0);
            return;
        }
        if (markText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Mark", "Erorr", 0);
            return;
        }
        double mark = 0;
        try {
            mark = Double.parseDouble(markText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Mark must be number", "Erorr", 0);
            return;
        }
        if (mark < 0 || mark > 10) {
            JOptionPane.showMessageDialog(this, "Mark must be between 1 to 10", "Erorr", 0);
            return;
        }
        String course = (String) cbbCourse.getSelectedItem();

        if (mark >= 7.5) {
            cbBonus.setSelected(true);
        } else {
            cbBonus.setSelected(false);
        }

        list.add(new Student(name, mark, course));
    }

    public void removeStudents() {
        int index = tblStudents.getSelectedRow();
        if(index < 0){
            JOptionPane.showMessageDialog(this, "Choise student you want to remove", "Notification", 1);
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this student?", "Notification", JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION){
            list.remove(index);
            JOptionPane.showMessageDialog(this, "Remove student successfully", "Notification", 1);
        }
    }

    public void updateStudents() {
        int index = tblStudents.getSelectedRow();
        if(index < 0){
            JOptionPane.showMessageDialog(this, "Choise student you want to update", "Erorr", 0);
            return;
        }
        String name = txtFullName.getText().trim();
        String markText = txtMark.getText().trim();
        if(name.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter Name", "Erorr", 0);
            return;
        }
        if(markText.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter Mark", "Erorr", 0);
            return;
        }
        double mark = 0;
        try {
            mark = Double.parseDouble(markText);
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Mark must be number", "Erorr", 0);
            return;
        }
        if(mark < 0 || mark > 10) {
            JOptionPane.showMessageDialog(this, "Mark must be between 1 to 10", "Erorr", 0);
            return;
        }
        Student sd = list.get(index);
        sd.setName(name);
        sd.setMark(mark);
        sd.setCourse(cbbCourse.getSelectedItem().toString());
        txtGrade.setText(sd.getGrade());
        if(mark >= 7.5){
            cbBonus.setSelected(true);
        } else {
            cbBonus.setSelected(false);
        }
        
        JOptionPane.showMessageDialog(this, "Update successfully", "Notification", 1);
    }

    public void shortByMarks() {
        Comparator<Student> cmp = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getMark() > o2.getMark()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        };
        Collections.sort(list, cmp);
    }

    public void shortByName() {
        Comparator<Student> cmp = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        ;
        };
        Collections.sort(list, cmp);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFullName = new javax.swing.JLabel();
        lblMark = new javax.swing.JLabel();
        lblCourse = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblGrade = new javax.swing.JLabel();
        cbBonus = new javax.swing.JCheckBox();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudents = new javax.swing.JTable();
        txtFullName = new javax.swing.JTextField();
        txtMark = new javax.swing.JTextField();
        txtGrade = new javax.swing.JTextField();
        cbbCourse = new javax.swing.JComboBox<>();
        btnSortbyname = new javax.swing.JButton();
        btnSortbymark = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFullName.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblFullName.setText("FULL NAME");

        lblMark.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblMark.setText("MARK");

        lblCourse.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblCourse.setText("COURSE");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("STUDENTS MANEGEMENT");

        lblGrade.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblGrade.setText("GRADE");

        cbBonus.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cbBonus.setText("BONUS");

        btnAdd.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnRemove.setText("REMOVE");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnNew.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnNew.setText("NEW");

        tblStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Mark", "Course", "Grade", "Bonus"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblStudents);

        txtMark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarkActionPerformed(evt);
            }
        });

        txtGrade.setEditable(false);

        cbbCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JAVA", "C++", "HTML", "PHP", "PYTHON" }));

        btnSortbyname.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnSortbyname.setText("Short by name");
        btnSortbyname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortbynameActionPerformed(evt);
            }
        });

        btnSortbymark.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnSortbymark.setText("Short by mark");
        btnSortbymark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortbymarkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(166, 166, 166))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMark)
                            .addComponent(lblCourse)
                            .addComponent(lblFullName)
                            .addComponent(lblGrade))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMark, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                            .addComponent(txtGrade, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                            .addComponent(txtFullName)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAdd)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnUpdate)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnRemove)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnNew))
                                    .addComponent(cbBonus))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cbbCourse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18))
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSortbyname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSortbymark)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd, btnNew, btnRemove, btnUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtMark, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFullName)
                        .addGap(30, 30, 30)
                        .addComponent(lblMark)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCourse)
                    .addComponent(cbbCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblGrade)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbBonus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnNew)
                    .addComponent(btnUpdate)
                    .addComponent(btnRemove))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSortbyname)
                    .addComponent(btnSortbymark))
                .addGap(7, 7, 7))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtMarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarkActionPerformed

    }//GEN-LAST:event_txtMarkActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        this.addStudents();
        this.fillToTable();
    }//GEN-LAST:event_btnAddActionPerformed

    private void tblStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentsMouseClicked
        this.showDetail();
        fillToTable();
    }//GEN-LAST:event_tblStudentsMouseClicked

    private void btnSortbynameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortbynameActionPerformed
        shortByName();
        fillToTable();
    }//GEN-LAST:event_btnSortbynameActionPerformed

    private void btnSortbymarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortbymarkActionPerformed
        shortByMarks();
        fillToTable();
    }//GEN-LAST:event_btnSortbymarkActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        this.removeStudents();
        this.fillToTable();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        this.updateStudents();
        this.fillToTable();
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(StudentsManegement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentsManegement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentsManegement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentsManegement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentsManegement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSortbymark;
    private javax.swing.JButton btnSortbyname;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox cbBonus;
    private javax.swing.JComboBox<String> cbbCourse;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCourse;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblGrade;
    private javax.swing.JLabel lblMark;
    private javax.swing.JTable tblStudents;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtGrade;
    private javax.swing.JTextField txtMark;
    // End of variables declaration//GEN-END:variables
}
