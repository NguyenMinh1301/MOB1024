package src.View.SupScreen.Score;

import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import src.Service.Service_Score;
import src.View.Screen.View_Score;
import src.Service.Handle_Notification;

public class SubScreen_UpdateScore extends javax.swing.JFrame {

    private View_Score scorePanel;

    public SubScreen_UpdateScore(String idStudent, String name, String english, String computer, String physical, View_Score scorePanel) {
        this.scorePanel = scorePanel;
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Student management V 1.0.0 | UPDATE");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        txtId.setText(idStudent);
        txtName.setText(name);
        txtEnglishOld.setText(english);
        txtComputerOld.setText(computer);
        txtPhysicalOld.setText(physical);

        txtId.setEnabled(false);
        txtName.setEnabled(false);
        txtEnglishOld.setEditable(false);
        txtComputerOld.setEditable(false);
        txtPhysicalOld.setEditable(false);
        txtAvarageNew.setEnabled(false);
        txtAvarageOld.setEnabled(false);

        scoreListener(txtEnglishNew);
        scoreListener(txtComputerNew);
        scoreListener(txtPhysicalNew);
        
        updateAverageOld();
    }

    private void updateAverageOld() {
        updateAverageFromFields(txtEnglishOld, txtComputerOld, txtPhysicalOld, txtAvarageOld);
    }

    private void updateAverageNew() {
        updateAverageFromFields(txtEnglishNew, txtComputerNew, txtPhysicalNew, txtAvarageNew);
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
    
    public void scoreListener(JTextField txt) {
        Font baseFont = txt.getFont();

        txt.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                validate();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                validate();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                validate();
            }

            private void validate() {
                String text = txt.getText().trim();
                boolean isValid = false;

                try {
                    float score = Float.parseFloat(text);
                    if (score >= 0 && score <= 10) {
                        isValid = true;
                    }
                } catch (NumberFormatException ignored) {
                }

                Map attributes = baseFont.getAttributes();
                attributes.put(TextAttribute.STRIKETHROUGH, !isValid);
                txt.setFont(baseFont.deriveFont(attributes));
                txt.setForeground(isValid ? Color.BLACK : Color.RED);
                txt.setToolTipText(isValid ? null : "Score must between 0-10");
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panAdd = new javax.swing.JPanel();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblEnglish = new javax.swing.JLabel();
        txtEnglishOld = new javax.swing.JTextField();
        txtComputerOld = new javax.swing.JTextField();
        lblComputer = new javax.swing.JLabel();
        txtPhysicalOld = new javax.swing.JTextField();
        lblPhysical = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtAvarageOld = new javax.swing.JTextField();
        lblAvarage = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        txtEnglishNew = new javax.swing.JTextField();
        txtComputerNew = new javax.swing.JTextField();
        txtPhysicalNew = new javax.swing.JTextField();
        lblArrow = new javax.swing.JLabel();
        txtAvarageNew = new javax.swing.JTextField();
        lblUpdateScore = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panAdd.setBorder(javax.swing.BorderFactory.createTitledBorder("ADD"));

        lblId.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblId.setText("ID");

        txtId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        txtName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblName.setText("NAME");

        lblEnglish.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblEnglish.setText("ENGLISH");

        txtEnglishOld.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        txtComputerOld.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        lblComputer.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblComputer.setText("COMPUTER");

        txtPhysicalOld.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        lblPhysical.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPhysical.setText("PHYSICAL");

        txtAvarageOld.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        lblAvarage.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblAvarage.setText("AVERAGE");

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtEnglishNew.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtEnglishNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEnglishNewKeyReleased(evt);
            }
        });

        txtComputerNew.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtComputerNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtComputerNewKeyReleased(evt);
            }
        });

        txtPhysicalNew.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPhysicalNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhysicalNewKeyReleased(evt);
            }
        });

        lblArrow.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblArrow.setText("→");

        txtAvarageNew.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout panAddLayout = new javax.swing.GroupLayout(panAdd);
        panAdd.setLayout(panAddLayout);
        panAddLayout.setHorizontalGroup(
            panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addGroup(panAddLayout.createSequentialGroup()
                        .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panAddLayout.createSequentialGroup()
                                .addComponent(lblPhysical)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(txtPhysicalOld, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panAddLayout.createSequentialGroup()
                                .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblComputer)
                                    .addComponent(lblEnglish))
                                .addGap(18, 18, 18)
                                .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEnglishOld, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                    .addComponent(txtComputerOld))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panAddLayout.createSequentialGroup()
                                .addComponent(lblArrow)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEnglishNew)
                                    .addComponent(txtComputerNew, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtPhysicalNew, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panAddLayout.createSequentialGroup()
                        .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panAddLayout.createSequentialGroup()
                                .addComponent(lblAvarage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAvarageOld, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(txtAvarageNew, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1)
                            .addGroup(panAddLayout.createSequentialGroup()
                                .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblId)
                                    .addComponent(lblName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                                .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                                    .addComponent(txtName))))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panAddLayout.createSequentialGroup()
                        .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEnglish)
                            .addComponent(txtEnglishOld, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblComputer)
                            .addComponent(txtComputerOld, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPhysical)
                            .addComponent(txtPhysicalOld, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhysicalNew, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panAddLayout.createSequentialGroup()
                        .addComponent(txtEnglishNew, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblArrow)
                            .addComponent(txtComputerNew, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvarage)
                    .addComponent(txtAvarageOld, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAvarageNew, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblUpdateScore.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblUpdateScore.setText("UPDATE SCORE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUpdateScore)
                    .addComponent(panAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUpdateScore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEnglishNewKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEnglishNewKeyReleased
        updateAverageNew();
    }//GEN-LAST:event_txtEnglishNewKeyReleased

    private void txtComputerNewKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtComputerNewKeyReleased
        updateAverageNew();
    }//GEN-LAST:event_txtComputerNewKeyReleased

    private void txtPhysicalNewKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhysicalNewKeyReleased
        updateAverageNew();
    }//GEN-LAST:event_txtPhysicalNewKeyReleased

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String idStudent = txtId.getText();
        String name = txtName.getText();
        String english = txtEnglishNew.getText();
        String computer = txtComputerNew.getText();
        String physical = txtPhysicalNew.getText();

        Service_Score service = new Service_Score();
        boolean updateSuccess = service.updateCheck(idStudent, name, english, computer, physical);
        if (updateSuccess == true) {
            Handle_Notification.announceInfo("<html>Successfully updated score for student <u>" + name + "</u> !</html>");
            scorePanel.initScoreData();
            this.dispose();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblArrow;
    private javax.swing.JLabel lblAvarage;
    private javax.swing.JLabel lblComputer;
    private javax.swing.JLabel lblEnglish;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhysical;
    private javax.swing.JLabel lblUpdateScore;
    private javax.swing.JPanel panAdd;
    private javax.swing.JTextField txtAvarageNew;
    private javax.swing.JTextField txtAvarageOld;
    private javax.swing.JTextField txtComputerNew;
    private javax.swing.JTextField txtComputerOld;
    private javax.swing.JTextField txtEnglishNew;
    private javax.swing.JTextField txtEnglishOld;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhysicalNew;
    private javax.swing.JTextField txtPhysicalOld;
    // End of variables declaration//GEN-END:variables
}
