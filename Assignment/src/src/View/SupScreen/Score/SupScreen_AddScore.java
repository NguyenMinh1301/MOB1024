package src.View.SupScreen.Score;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import src.Model.Model_Students;
import src.Service.Service_Score;
import src.Service.Service_Student;
import src.View.Screen.View_Score;

public class SupScreen_AddScore extends javax.swing.JFrame {

    private View_Score scorePanel;

    public SupScreen_AddScore(View_Score scorePanel) {
        this.scorePanel = scorePanel;
        initComponents();
        initStudentsData();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Student management V 1.0.0 | ADD");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        txtId.setEnabled(false);
        txtName.setEnabled(false);
        txtAvarage.setEnabled(false);
    }

    public void initStudentsData() {
        DefaultTableModel model = (DefaultTableModel) tblStudents.getModel();
        model.setRowCount(0);

        Service_Student service = new Service_Student();
        for (Model_Students s : service.getStudentIdAndName()) {
            model.addRow(new Object[]{
                s.getId(),
                s.getName()
            });
        }
    }
    
    private void updateAverage() {
        updateAverageFromFields(txtEnglish, txtComputer, txtPhysical, txtAvarage);
    }
    
    private void updateAverageFromFields(JTextField englishField, JTextField computerField, JTextField physicalField, JTextField averageField) {
        try {
            float english = Float.parseFloat(englishField.getText());
            float computer = Float.parseFloat(computerField.getText());
            float physical = Float.parseFloat(physicalField.getText());

            float average = (english + computer + physical) / 3f;
            averageField.setText(String.format("%.2f", average));

            setColorByScore(englishField, english);
            setColorByScore(computerField, computer);
            setColorByScore(physicalField, physical);
            setColorByScore(averageField, average);

        } catch (NumberFormatException ex) {
            averageField.setText("");
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

        lblAddScore = new javax.swing.JLabel();
        panAdd = new javax.swing.JPanel();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblEnglish = new javax.swing.JLabel();
        txtEnglish = new javax.swing.JTextField();
        txtComputer = new javax.swing.JTextField();
        lblComputer = new javax.swing.JLabel();
        txtPhysical = new javax.swing.JTextField();
        lblPhysical = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtAvarage = new javax.swing.JTextField();
        lblAvarage = new javax.swing.JLabel();
        panTableStudents = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudents = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAddScore.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblAddScore.setText("ADD SCORE");

        panAdd.setBorder(javax.swing.BorderFactory.createTitledBorder("ADD"));

        lblId.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblId.setText("ID");

        txtId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        txtName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblName.setText("NAME");

        lblEnglish.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblEnglish.setText("ENGLISH");

        txtEnglish.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtEnglish.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEnglishKeyReleased(evt);
            }
        });

        txtComputer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtComputer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtComputerKeyReleased(evt);
            }
        });

        lblComputer.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblComputer.setText("COMPUTER");

        txtPhysical.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPhysical.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhysicalKeyReleased(evt);
            }
        });

        lblPhysical.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPhysical.setText("PHYSICAL");

        txtAvarage.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        lblAvarage.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblAvarage.setText("AVERAGE");

        javax.swing.GroupLayout panAddLayout = new javax.swing.GroupLayout(panAdd);
        panAdd.setLayout(panAddLayout);
        panAddLayout.setHorizontalGroup(
            panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(panAddLayout.createSequentialGroup()
                        .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator1)
                                .addGroup(panAddLayout.createSequentialGroup()
                                    .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblId)
                                        .addComponent(lblName))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                                    .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                                        .addComponent(txtName))))
                            .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panAddLayout.createSequentialGroup()
                                    .addComponent(lblEnglish)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panAddLayout.createSequentialGroup()
                                    .addComponent(lblComputer)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtComputer, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panAddLayout.createSequentialGroup()
                                    .addComponent(lblPhysical)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPhysical, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panAddLayout.createSequentialGroup()
                        .addComponent(lblAvarage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAvarage, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panAddLayout.setVerticalGroup(
            panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnglish)
                    .addComponent(txtEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComputer)
                    .addComponent(txtComputer, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhysical)
                    .addComponent(txtPhysical, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvarage)
                    .addComponent(txtAvarage, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panTableStudents.setBorder(javax.swing.BorderFactory.createTitledBorder("TABLE STUDENTS"));

        tblStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id Student", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblStudents);

        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panTableStudentsLayout = new javax.swing.GroupLayout(panTableStudents);
        panTableStudents.setLayout(panTableStudentsLayout);
        panTableStudentsLayout.setHorizontalGroup(
            panTableStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTableStudentsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panTableStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE))
                .addContainerGap())
        );
        panTableStudentsLayout.setVerticalGroup(
            panTableStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTableStudentsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddScore)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panTableStudents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAddScore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panTableStudents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String idStudent = txtId.getText().trim();
        String name = txtName.getText().trim();
        String english = txtEnglish.getText().trim();
        String computer = txtComputer.getText().trim();
        String physical = txtPhysical.getText().trim();

        Service_Score service = new Service_Score();
        boolean addSuccess = service.addCheck(idStudent, name, english, computer, physical);
        if (addSuccess == true) {
            scorePanel.initScoreData();
            this.dispose();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void tblStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentsMouseClicked
        int index = tblStudents.getSelectedRow();
        if (index != -1) {
            String id = tblStudents.getValueAt(index, 0).toString();
            String name = tblStudents.getValueAt(index, 1).toString();

            txtId.setText(id);
            txtName.setText(name);
        }
    }//GEN-LAST:event_tblStudentsMouseClicked

    private void txtEnglishKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEnglishKeyReleased
        updateAverage();
    }//GEN-LAST:event_txtEnglishKeyReleased

    private void txtComputerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtComputerKeyReleased
        updateAverage();
    }//GEN-LAST:event_txtComputerKeyReleased

    private void txtPhysicalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhysicalKeyReleased
        updateAverage();
    }//GEN-LAST:event_txtPhysicalKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAddScore;
    private javax.swing.JLabel lblAvarage;
    private javax.swing.JLabel lblComputer;
    private javax.swing.JLabel lblEnglish;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhysical;
    private javax.swing.JPanel panAdd;
    private javax.swing.JPanel panTableStudents;
    private javax.swing.JTable tblStudents;
    private javax.swing.JTextField txtAvarage;
    private javax.swing.JTextField txtComputer;
    private javax.swing.JTextField txtEnglish;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhysical;
    // End of variables declaration//GEN-END:variables
}
