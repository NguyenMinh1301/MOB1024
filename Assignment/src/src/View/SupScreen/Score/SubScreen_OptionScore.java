package src.View.SupScreen.Score;

import java.util.List;
import src.Model.Model_Score;
import src.Service.Service_Sort;
import src.View.Screen.View_Score;

public class SubScreen_OptionScore extends javax.swing.JFrame {

    private View_Score viewScore;

    public SubScreen_OptionScore(View_Score viewScore) {
        this.viewScore = viewScore;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUpdateScore = new javax.swing.JLabel();
        panAdd1 = new javax.swing.JPanel();
        btnId = new javax.swing.JButton();
        btnName = new javax.swing.JButton();
        btnScore = new javax.swing.JButton();
        btnAverage = new javax.swing.JButton();
        panAdd2 = new javax.swing.JPanel();
        btnEnglishTOP = new javax.swing.JButton();
        btnComputerTOP = new javax.swing.JButton();
        btnPhysicalTOP = new javax.swing.JButton();
        btnAverageTOP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblUpdateScore.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblUpdateScore.setText("OPTION SCORE");

        panAdd1.setBorder(javax.swing.BorderFactory.createTitledBorder("SORT"));

        btnId.setFont(new java.awt.Font("Segoe UI", 0, 29)); // NOI18N
        btnId.setText("BY ID");
        btnId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdActionPerformed(evt);
            }
        });

        btnName.setFont(new java.awt.Font("Segoe UI", 0, 29)); // NOI18N
        btnName.setText("BY NAME");
        btnName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNameActionPerformed(evt);
            }
        });

        btnScore.setFont(new java.awt.Font("Segoe UI", 0, 29)); // NOI18N
        btnScore.setText("BY SCORE");
        btnScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScoreActionPerformed(evt);
            }
        });

        btnAverage.setFont(new java.awt.Font("Segoe UI", 0, 29)); // NOI18N
        btnAverage.setText("BY AVERAGE");
        btnAverage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAverageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panAdd1Layout = new javax.swing.GroupLayout(panAdd1);
        panAdd1.setLayout(panAdd1Layout);
        panAdd1Layout.setHorizontalGroup(
            panAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAdd1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnScore, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAverage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnId, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panAdd1Layout.setVerticalGroup(
            panAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panAdd1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnId, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnScore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAverage)
                .addContainerGap())
        );

        panAdd2.setBorder(javax.swing.BorderFactory.createTitledBorder("TOP 10"));

        btnEnglishTOP.setFont(new java.awt.Font("Segoe UI", 0, 29)); // NOI18N
        btnEnglishTOP.setText("ENGLISH");
        btnEnglishTOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnglishTOPActionPerformed(evt);
            }
        });

        btnComputerTOP.setFont(new java.awt.Font("Segoe UI", 0, 29)); // NOI18N
        btnComputerTOP.setText("COMPUTER");
        btnComputerTOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComputerTOPActionPerformed(evt);
            }
        });

        btnPhysicalTOP.setFont(new java.awt.Font("Segoe UI", 0, 29)); // NOI18N
        btnPhysicalTOP.setText("PHYSICAL");
        btnPhysicalTOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhysicalTOPActionPerformed(evt);
            }
        });

        btnAverageTOP.setFont(new java.awt.Font("Segoe UI", 0, 29)); // NOI18N
        btnAverageTOP.setText("AVERAGE");
        btnAverageTOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAverageTOPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panAdd2Layout = new javax.swing.GroupLayout(panAdd2);
        panAdd2.setLayout(panAdd2Layout);
        panAdd2Layout.setHorizontalGroup(
            panAdd2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAdd2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAdd2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnComputerTOP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPhysicalTOP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAverageTOP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEnglishTOP, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panAdd2Layout.setVerticalGroup(
            panAdd2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panAdd2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEnglishTOP, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnComputerTOP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPhysicalTOP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAverageTOP)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUpdateScore)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUpdateScore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panAdd2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panAdd1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdActionPerformed
        dispose();
        List<Model_Score> sortedList = new Service_Sort().sortById();
        viewScore.tableSorted(sortedList);
    }//GEN-LAST:event_btnIdActionPerformed

    private void btnNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNameActionPerformed
        dispose();
        List<Model_Score> sortedList = new Service_Sort().sortByName();
        viewScore.tableSorted(sortedList);
    }//GEN-LAST:event_btnNameActionPerformed

    private void btnScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScoreActionPerformed
        dispose();
        List<Model_Score> sortedList = new Service_Sort().sortByScore();
        viewScore.tableSorted(sortedList);
    }//GEN-LAST:event_btnScoreActionPerformed

    private void btnAverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAverageActionPerformed
        dispose();
        List<Model_Score> sortedList = new Service_Sort().sortByAverage();
        viewScore.tableSorted(sortedList);
    }//GEN-LAST:event_btnAverageActionPerformed

    private void btnEnglishTOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnglishTOPActionPerformed
        dispose();
        List<Model_Score> topList = new Service_Sort().top10English();
        viewScore.tableSorted(topList);
    }//GEN-LAST:event_btnEnglishTOPActionPerformed

    private void btnComputerTOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComputerTOPActionPerformed
        dispose();
        List<Model_Score> topList = new Service_Sort().top10Computer();
        viewScore.tableSorted(topList);
    }//GEN-LAST:event_btnComputerTOPActionPerformed

    private void btnPhysicalTOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhysicalTOPActionPerformed
        dispose();
        List<Model_Score> topList = new Service_Sort().top10Physical();
        viewScore.tableSorted(topList);
    }//GEN-LAST:event_btnPhysicalTOPActionPerformed

    private void btnAverageTOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAverageTOPActionPerformed
        dispose();
        List<Model_Score> topList = new Service_Sort().top10Average();
        viewScore.tableSorted(topList);
    }//GEN-LAST:event_btnAverageTOPActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAverage;
    private javax.swing.JButton btnAverageTOP;
    private javax.swing.JButton btnComputerTOP;
    private javax.swing.JButton btnEnglishTOP;
    private javax.swing.JButton btnId;
    private javax.swing.JButton btnName;
    private javax.swing.JButton btnPhysicalTOP;
    private javax.swing.JButton btnScore;
    private javax.swing.JLabel lblUpdateScore;
    private javax.swing.JPanel panAdd1;
    private javax.swing.JPanel panAdd2;
    // End of variables declaration//GEN-END:variables
}
