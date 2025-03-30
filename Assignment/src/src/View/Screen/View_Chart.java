package src.View.Screen;

import java.awt.Color;
import java.awt.Font;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import javax.swing.JButton;
import src.DAO.DAO_Chart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class View_Chart extends javax.swing.JPanel {

    public View_Chart() {
        initComponents();
        
        addHoverEffect(btnGender);
        addHoverEffect(btnLocation);
        addHoverEffect(btnEnglish);
        addHoverEffect(btnComputer);
        addHoverEffect(btnPhysical);
        addHoverEffect(btnAverage);
    }

    private ChartPanel createPieChartPanel(String title, List<String> rawData) {
        Map<String, Integer> countMap = new HashMap<>();
        for (String item : rawData) {
            item = item == null ? "Unknown" : item.trim();
            countMap.put(item, countMap.getOrDefault(item, 0) + 1);
        }

        DefaultPieDataset dataset = new DefaultPieDataset();
        int total = countMap.values().stream().mapToInt(i -> i).sum();

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            double percent = (double) entry.getValue() / total * 100;
            dataset.setValue(entry.getKey() + " (" + String.format("%.1f", percent) + "%)", percent);
        }

        JFreeChart chart = ChartFactory.createPieChart(title, dataset, false, true, false);
        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setBackgroundPaint(panChart.getBackground());
        plot.setOutlineVisible(false);
        plot.setLabelFont(new Font("Segoe UI", Font.PLAIN, 20));
        plot.setLabelBackgroundPaint(new Color(0, 0, 0, 0));
        plot.setLabelOutlinePaint(null);
        plot.setLabelShadowPaint(null);
        plot.setShadowPaint(null);

        ChartPanel panel = new ChartPanel(chart);
        panel.setOpaque(false);
        panel.setBackground(panChart.getBackground());
        panel.setBorder(null);
        panel.setMouseWheelEnabled(true);

        return panel;
    }

    private void showChart(ChartPanel panel) {
        panChart.removeAll();
        panel.setPreferredSize(panChart.getSize());
        panChart.setLayout(new java.awt.BorderLayout());
        panChart.add(panel, java.awt.BorderLayout.CENTER);
        panChart.revalidate();
        panChart.repaint();
    }

    private ChartPanel createGenderChartPanel() {
        DAO_Chart dao = new DAO_Chart() {
        };
        List<String> data = dao.getGenderList();
        return createPieChartPanel("STUDENT GENDER", data);
    }

    private ChartPanel createLocationChartPanel() {
        DAO_Chart dao = new DAO_Chart() {
        };
        List<String> data = dao.getLocationList();
        return createPieChartPanel("STUDENT LOCATION", data);
    }

    private ChartPanel createEnglishChartPanel() {
        DAO_Chart dao = new DAO_Chart() {
        };
        List<String> data = dao.getEnglishScores();
        return createPieChartPanel("ENGLISH SCORE", data);
    }

    private ChartPanel createComputerChartPanel() {
        DAO_Chart dao = new DAO_Chart() {
        };
        List<String> data = dao.getComputerScores();
        return createPieChartPanel("COMPUTER SCORE", data);
    }

    private ChartPanel createPhysicalChartPanel() {
        DAO_Chart dao = new DAO_Chart() {
        };
        List<String> data = dao.getPhysicalScores();
        return createPieChartPanel("PHYSICAL SCORE", data);
    }

    private ChartPanel createAverageChartPanel() {
        DAO_Chart dao = new DAO_Chart() {
        };
        List<String> data = dao.getAverageScores();
        return createPieChartPanel("AVERAGE SCORE", data);
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

        jPanel1 = new javax.swing.JPanel();
        panStudent = new javax.swing.JPanel();
        btnGender = new javax.swing.JButton();
        btnLocation = new javax.swing.JButton();
        panScore = new javax.swing.JPanel();
        btnEnglish = new javax.swing.JButton();
        btnComputer = new javax.swing.JButton();
        btnPhysical = new javax.swing.JButton();
        btnAverage = new javax.swing.JButton();
        panChart = new javax.swing.JPanel();

        panStudent.setBorder(javax.swing.BorderFactory.createTitledBorder("STUDENT"));

        btnGender.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnGender.setText("GENDER");
        btnGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenderActionPerformed(evt);
            }
        });

        btnLocation.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnLocation.setText("LOCATION");
        btnLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panStudentLayout = new javax.swing.GroupLayout(panStudent);
        panStudent.setLayout(panStudentLayout);
        panStudentLayout.setHorizontalGroup(
            panStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panStudentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLocation, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))
                .addContainerGap())
        );
        panStudentLayout.setVerticalGroup(
            panStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panStudentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGender, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panScore.setBorder(javax.swing.BorderFactory.createTitledBorder("SCORE"));

        btnEnglish.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnEnglish.setText("ENGLISH");
        btnEnglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnglishActionPerformed(evt);
            }
        });

        btnComputer.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnComputer.setText("COMPUTER");
        btnComputer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComputerActionPerformed(evt);
            }
        });

        btnPhysical.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnPhysical.setText("PHYSICAL");
        btnPhysical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhysicalActionPerformed(evt);
            }
        });

        btnAverage.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnAverage.setText("AVERAGE");
        btnAverage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAverageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panScoreLayout = new javax.swing.GroupLayout(panScore);
        panScore.setLayout(panScoreLayout);
        panScoreLayout.setHorizontalGroup(
            panScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panScoreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEnglish, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                    .addComponent(btnComputer, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                    .addComponent(btnPhysical, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                    .addComponent(btnAverage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))
                .addContainerGap())
        );
        panScoreLayout.setVerticalGroup(
            panScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panScoreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnComputer, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPhysical, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAverage, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panStudent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panChartLayout = new javax.swing.GroupLayout(panChart);
        panChart.setLayout(panChartLayout);
        panChartLayout.setHorizontalGroup(
            panChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 702, Short.MAX_VALUE)
        );
        panChartLayout.setVerticalGroup(
            panChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panChart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenderActionPerformed
        showChart(createGenderChartPanel());
    }//GEN-LAST:event_btnGenderActionPerformed

    private void btnLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocationActionPerformed
        showChart(createLocationChartPanel());
    }//GEN-LAST:event_btnLocationActionPerformed

    private void btnEnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnglishActionPerformed
        showChart(createEnglishChartPanel());
    }//GEN-LAST:event_btnEnglishActionPerformed

    private void btnComputerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComputerActionPerformed
        showChart(createComputerChartPanel());
    }//GEN-LAST:event_btnComputerActionPerformed

    private void btnPhysicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhysicalActionPerformed
        showChart(createPhysicalChartPanel());
    }//GEN-LAST:event_btnPhysicalActionPerformed

    private void btnAverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAverageActionPerformed
        showChart(createAverageChartPanel());
    }//GEN-LAST:event_btnAverageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAverage;
    private javax.swing.JButton btnComputer;
    private javax.swing.JButton btnEnglish;
    private javax.swing.JButton btnGender;
    private javax.swing.JButton btnLocation;
    private javax.swing.JButton btnPhysical;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panChart;
    private javax.swing.JPanel panScore;
    private javax.swing.JPanel panScreen;
    private javax.swing.JPanel panStudent;
    // End of variables declaration//GEN-END:variables
}
