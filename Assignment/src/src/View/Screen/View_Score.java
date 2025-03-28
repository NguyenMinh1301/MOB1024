package src.View.Screen;

import java.util.List;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import src.Service.Service_Score;
import src.Model.Model_Score;
import src.View.SupScreen.Score.SupScreen_AddScore;
import src.View.SupScreen.Score.SupScreen_UpdateScore;
import src.DAO.HandleNotification;

public class View_Score extends javax.swing.JPanel {

    private Service_Score service;

    public View_Score() {
        initComponents();
        this.service = new Service_Score();
        initScoreData();
        initSearch();
        addHint(txtSearch, "Id or name");

        txtIdStudent.setEditable(false);
        txtName.setEditable(false);
        txtEnglish.setEditable(false);
        txtComputer.setEditable(false);
        txtPhysical.setEditable(false);
        txtAverage.setEditable(false);
        
        addHoverEffect(btnAdd);
        addHoverEffect(btnUpdate);
        addHoverEffect(btnRemove);
        addHoverEffect(btnSearch);
        addHoverEffect(btnOption);
        addHoverEffect(btnRefresh);
        
    }

    public void initScoreData() {
        DefaultTableModel model = (DefaultTableModel) tblScore.getModel();
        model.setRowCount(0);

        for (Model_Score s : this.service.getScoreData()) {
            model.addRow(new Object[]{
                s.getIdStudent(),
                s.getName(),
                s.getEnglish(),
                s.getComputer(),
                s.getPhysical()
            });
        }
    }

    public void initSearch() {
    txtSearch.getDocument().addDocumentListener(new DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) {
            performLiveSearch();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            performLiveSearch();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            performLiveSearch();
        }
    });
}
    
    private void performLiveSearch() {
    String keyword = txtSearch.getText().trim();
    if (keyword.equals("Id or name") || keyword.isEmpty()) {
        initScoreData(); // Hiển thị lại toàn bộ nếu ô rỗng
        return;
    }

    List<Model_Score> result = service.searchScore(keyword);
    DefaultTableModel model = (DefaultTableModel) tblScore.getModel();
    model.setRowCount(0);

    for (Model_Score s : result) {
        model.addRow(new Object[]{
            s.getIdStudent(),
            s.getName(),
            s.getEnglish(),
            s.getComputer(),
            s.getPhysical()
        });
    }
}

    private void setColorByScore(JTextField field, float score) {
        if (score < 5.0f) {
            field.setForeground(Color.RED);
        } else if (score < 7.0f) {
            field.setForeground(Color.ORANGE);
        } else {
            field.setForeground(new Color(0, 128, 0));
        }
    }

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

    public void addHoverEffect(JButton button) {
        Color normal = button.getBackground();
        Color hover = new Color(100, 149, 237);

        button.setContentAreaFilled(true);
        button.setOpaque(true);
        button.setFocusPainted(false);
        button.setBackground(normal);

        button.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button.setBackground(hover);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button.setBackground(normal);
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblScore = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();
        lblIdStudent = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblEnglish = new javax.swing.JLabel();
        lblComputer = new javax.swing.JLabel();
        lblPhysical = new javax.swing.JLabel();
        btnOption = new javax.swing.JButton();
        lblAverage = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtIdStudent = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtEnglish = new javax.swing.JTextField();
        txtComputer = new javax.swing.JTextField();
        txtPhysical = new javax.swing.JTextField();
        txtAverage = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1037, 0));

        tblScore.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblScore.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        tblScore.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Student", "Student", "English", "Computer", "Physical"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblScore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblScoreMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblScore);
        if (tblScore.getColumnModel().getColumnCount() > 0) {
            tblScore.getColumnModel().getColumn(0).setPreferredWidth(70);
            tblScore.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblScore.getColumnModel().getColumn(2).setPreferredWidth(70);
            tblScore.getColumnModel().getColumn(3).setPreferredWidth(70);
            tblScore.getColumnModel().getColumn(4).setPreferredWidth(70);
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

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnRefresh.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnRefresh.setText("REFRESH");
        btnRefresh.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        lblIdStudent.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblIdStudent.setText("ID STUDENT");

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblName.setText("NAME");

        lblEnglish.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblEnglish.setText("ENGLISH");

        lblComputer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblComputer.setText("COMPUTER");

        lblPhysical.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPhysical.setText("PHYSICAL");

        btnOption.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnOption.setText("OPTION");
        btnOption.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lblAverage.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAverage.setText("AVERAGE");

        txtIdStudent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txtName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txtEnglish.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txtComputer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txtPhysical.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txtAverage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEnglish, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtComputer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(txtPhysical, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearch))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAverage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAverage, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 4, Short.MAX_VALUE)
                                .addComponent(btnOption, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblComputer)
                                    .addComponent(lblEnglish)
                                    .addComponent(lblPhysical))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblIdStudent)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtIdStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAverage, txtComputer, txtIdStudent, txtName, txtPhysical});

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOption, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdStudent)
                            .addComponent(lblIdStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEnglish))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtComputer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblComputer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPhysical, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPhysical))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAverage, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAverage))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtAverage, txtComputer, txtIdStudent, txtName, txtPhysical});

    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        SupScreen_AddScore add = new SupScreen_AddScore(this);
        add.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        initScoreData();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void tblScoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblScoreMouseClicked
        int index = tblScore.getSelectedRow();
        if (index != -1) {
            String idStudent = tblScore.getValueAt(index, 0).toString();
            String name = tblScore.getValueAt(index, 1).toString();
            float english = Float.parseFloat(tblScore.getValueAt(index, 2).toString());
            float computer = Float.parseFloat(tblScore.getValueAt(index, 3).toString());
            float physical = Float.parseFloat(tblScore.getValueAt(index, 4).toString());

            float average = (english + computer + physical) / 3f;

            txtIdStudent.setText(idStudent);
            txtName.setText(name);
            txtEnglish.setText(String.valueOf(english));
            txtComputer.setText(String.valueOf(computer));
            txtPhysical.setText(String.valueOf(physical));
            txtAverage.setText(String.format("%.2f", average));

            setColorByScore(txtEnglish, english);
            setColorByScore(txtComputer, computer);
            setColorByScore(txtPhysical, physical);
            setColorByScore(txtAverage, average);
        }
    }//GEN-LAST:event_tblScoreMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblScore.getModel();
        int index = tblScore.getSelectedRow();

        if (index == -1) {
            HandleNotification.announceWarning("Cannot update student if not selected !");
            return;
        }

        String idStudent = model.getValueAt(index, 0).toString();
        String name = model.getValueAt(index, 1).toString();
        String english = model.getValueAt(index, 2).toString();
        String computer = model.getValueAt(index, 3).toString();
        String physical = model.getValueAt(index, 4).toString();

        SupScreen_UpdateScore updateForm = new SupScreen_UpdateScore(idStudent, name, english, computer, physical, this);
        updateForm.setVisible(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblScore.getModel();
        int index = tblScore.getSelectedRow();

        if (index == -1) {
            HandleNotification.announceWarning("Cannot remove student if not selected !");
            return;
        }

        String idStudent = model.getValueAt(index, 0).toString();
        String name = model.getValueAt(index, 1).toString();

        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete score of student " + name + " ?", "Notification", JOptionPane.YES_NO_OPTION);

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

                Service_Score service = new Service_Score();
                boolean deleted = service.deleteScoreById(idStudent);
                if (deleted) {
                    HandleNotification.announceInfo("Delete score of student " + name + " success!");
                    initScoreData();
                    break;
                } else {
                    HandleNotification.announceWarning("Delete score of student " + name + " failed!");
                    break;
                }
            } else {
                HandleNotification.announceWarning("Name does not match please re-enter");
            }

        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String keyword = txtSearch.getText().trim();
        if (keyword.isEmpty()) {
            HandleNotification.announceWarning("Please enter ID or Name to search.");
            return;
        }

        List<Model_Score> result = new Service_Score().searchScore(keyword);
        DefaultTableModel model = (DefaultTableModel) tblScore.getModel();
        model.setRowCount(0);

        for (Model_Score s : result) {
            model.addRow(new Object[]{
                s.getIdStudent(),
                s.getName(),
                s.getEnglish(),
                s.getComputer(),
                s.getPhysical()
            });
        }
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnOption;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAverage;
    private javax.swing.JLabel lblComputer;
    private javax.swing.JLabel lblEnglish;
    private javax.swing.JLabel lblIdStudent;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhysical;
    private javax.swing.JTable tblScore;
    private javax.swing.JTextField txtAverage;
    private javax.swing.JTextField txtComputer;
    private javax.swing.JTextField txtEnglish;
    private javax.swing.JTextField txtIdStudent;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhysical;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
