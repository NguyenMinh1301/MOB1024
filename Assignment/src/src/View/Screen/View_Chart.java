package src.View.Screen;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import javax.swing.BorderFactory;
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
    
    //Tạo chart
    private ChartPanel createPieChartPanel(String title, List<String> rawData) {
        //Map để đếm số lượng từng giá trị xuất hiện trong danh sách
        Map<String, Integer> countMap = new HashMap<>();
        //Dùng for-each để duyệt qua toàn bộ danh sách
        for (String item : rawData) {
            //Nếu gặp item = null thì thay bằng Unknown
            item = item == null ? "Unknown" : item.trim();
            //Đếm số lần xuất hiện của từng mục
            countMap.put(item, countMap.getOrDefault(item, 0) + 1);
        }

        //Tạo dataset và tính tổng số lượng tất cả các mục để tính phần trăm
        DefaultPieDataset dataset = new DefaultPieDataset(); 
        int total = countMap.values().stream().mapToInt(i -> i).sum();

        //Tính phần trăm của từng loại dữ liệu sau đó đưa vào dưới dạng (Tên (xx.x%))
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            //Tính phần trăm và lưu vào biến
            double percent = (double) entry.getValue() / total * 100;
            dataset.setValue(entry.getKey() + " (" + String.format("%.1f", percent) + "%)", percent);
        }
        
        //Điều chỉnh giao diện của chart pie
        JFreeChart chart = ChartFactory.createPieChart(title, dataset, false, true, false);
        //Tạo biểu đồ tròn và lấy plot để tuỳ chỉnh giao diện
        PiePlot plot = (PiePlot) chart.getPlot();
        //Nền trong suốt
        plot.setBackgroundPaint(panChart.getBackground());
        //Ẩn viền
        plot.setOutlineVisible(false);
        //Font chữ
        plot.setLabelFont(new Font("Segoe UI", Font.PLAIN, 20));
        //Bỏ hiệu ứng bóng
        plot.setLabelBackgroundPaint(new Color(0, 0, 0, 0));
        plot.setLabelOutlinePaint(null);
        plot.setLabelShadowPaint(null);
        plot.setShadowPaint(null);
        
        //Tạo một ChartPanel để chứa biểu đồ chart
        ChartPanel panel = new ChartPanel(chart);
        //Tắt nền của chart
        panel.setOpaque(false);
        //Lấy màu nền của panel chứa chart
        panel.setBackground(panChart.getBackground());
        //Xoá viền của chart
        panel.setBorder(null);
        //Cho phép xoay chart
        panel.setMouseWheelEnabled(true);

        return panel;
    }

    //Xoá biểu đồ cũ hiện có và đưa biểu đồ mới lên panel và cập nhật lại giao diện
    private void showChart(ChartPanel panel) {
        panChart.removeAll();
        panel.setPreferredSize(panChart.getSize());
        panChart.setLayout(new java.awt.BorderLayout());
        panChart.add(panel, java.awt.BorderLayout.CENTER);
        panChart.revalidate();
        panChart.repaint();
    }
    
    //Truy xuất dữ liệu từ DAO sau đó truyền dữ liệu vào danh sách và gọi hàm tạo chart
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

    //Tạo hiệu ứng hover khi đưa chuột vào button
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
