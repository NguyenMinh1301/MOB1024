package src.View.Screen;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import src.Service.Service_Score;
import src.Model.Model_Score;
import src.View.SupScreen.Score.SupScreen_AddScore;

public class View_Score extends javax.swing.JPanel {

    public View_Score() {
        initComponents();
        initScoreData();

        txtIdStudent.setEditable(false);
        txtName.setEditable(false);
        txtEnglish.setEditable(false);
        txtComputer.setEditable(false);
        txtPhysical.setEditable(false);
        txtAverage.setEditable(false);
    }

    public void initScoreData() {
        DefaultTableModel model = (DefaultTableModel) tblScore.getModel();
        model.setRowCount(0);

        Service_Score service = new Service_Score();
        for (Model_Score s : service.getScoreData()) {
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

        btnRemove.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnRemove.setText("REMOVE");
        btnRemove.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnSearch.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnSearch.setText("SEARCH");
        btnSearch.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE))
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
