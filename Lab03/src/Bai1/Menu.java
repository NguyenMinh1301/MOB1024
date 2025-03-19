package Bai1;

import java.awt.Color;
import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.text.html.HTML;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpColor = new javax.swing.ButtonGroup();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMain = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnNew = new javax.swing.JMenuItem();
        mnOpen = new javax.swing.JMenuItem();
        mnSave = new javax.swing.JMenuItem();
        mnColor = new javax.swing.JMenu();
        rdoRed = new javax.swing.JRadioButtonMenuItem();
        rdoGreen = new javax.swing.JRadioButtonMenuItem();
        rdoBlue = new javax.swing.JRadioButtonMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnTextColor = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        jButton1.setBackground(new java.awt.Color(246, 246, 246));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Notes.png"))); // NOI18N
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMargin(new java.awt.Insets(15, 15, 15, 15));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setBackground(new java.awt.Color(246, 246, 246));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/User.png"))); // NOI18N
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setMargin(new java.awt.Insets(15, 15, 15, 15));
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton3.setBackground(new java.awt.Color(246, 246, 246));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Exit.png"))); // NOI18N
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setMargin(new java.awt.Insets(15, 15, 15, 15));
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        txtMain.setColumns(20);
        txtMain.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMain.setRows(5);
        txtMain.setText("UỐNG NƯỚC NHỚ NGUỒN\n\nCong cha ngu nui thai son\nNghia me nhu nuoc trong nguon chay ra\nMot long tho me kinh cha\nCho tron chu hieu moi la dao con");
        jScrollPane1.setViewportView(txtMain);

        jTextField1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Fpoly - Java 2");
        jTextField1.setActionCommand("<Not Set>");
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jMenu1.setText("File");

        mnNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Notes.png"))); // NOI18N
        mnNew.setText("New");
        mnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNewActionPerformed(evt);
            }
        });
        jMenu1.add(mnNew);

        mnOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Open folder.png"))); // NOI18N
        mnOpen.setText("Open");
        mnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnOpenActionPerformed(evt);
            }
        });
        jMenu1.add(mnOpen);

        mnSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Save.png"))); // NOI18N
        mnSave.setText("Save");
        mnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSaveActionPerformed(evt);
            }
        });
        jMenu1.add(mnSave);

        jMenuBar1.add(jMenu1);

        mnColor.setText("Color");
        mnColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnColorActionPerformed(evt);
            }
        });

        grpColor.add(rdoRed);
        rdoRed.setSelected(true);
        rdoRed.setText("Red");
        rdoRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoRedActionPerformed(evt);
            }
        });
        mnColor.add(rdoRed);

        grpColor.add(rdoGreen);
        rdoGreen.setText("Green");
        rdoGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoGreenActionPerformed(evt);
            }
        });
        mnColor.add(rdoGreen);

        grpColor.add(rdoBlue);
        rdoBlue.setText("Blue");
        rdoBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoBlueActionPerformed(evt);
            }
        });
        mnColor.add(rdoBlue);
        mnColor.add(jSeparator1);

        mnTextColor.setText("Text Color");
        mnTextColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnTextColorActionPerformed(evt);
            }
        });
        mnColor.add(mnTextColor);

        jMenuBar1.add(mnColor);

        jMenu3.setText("System");

        jMenuItem1.setText("About us");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
            .addComponent(jTextField1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNewActionPerformed
        txtMain.setText(""); 
    }//GEN-LAST:event_mnNewActionPerformed

    private void mnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnOpenActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);
        if(result == JFileChooser.APPROVE_OPTION) {
            try {
                txtMain.setText("file:///" + fileChooser.getSelectedFile().getPath());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_mnOpenActionPerformed

    private void rdoGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoGreenActionPerformed
        jTextField1.setBackground(Color.green);
    }//GEN-LAST:event_rdoGreenActionPerformed

    private void rdoBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoBlueActionPerformed
        jTextField1.setBackground(Color.blue);
    }//GEN-LAST:event_rdoBlueActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtMain.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSaveActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);
        if(result == JFileChooser.APPROVE_OPTION) {
            File fname = fileChooser.getSelectedFile();
            try {
                PrintWriter pw = new PrintWriter(fname);
                pw.println(txtMain.getText());
                pw.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_mnSaveActionPerformed

    private void rdoRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoRedActionPerformed
        jTextField1.setBackground(Color.red);
    }//GEN-LAST:event_rdoRedActionPerformed

    private void mnColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnColorActionPerformed

    }//GEN-LAST:event_mnColorActionPerformed

    private void mnTextColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnTextColorActionPerformed
        Color c = JColorChooser.showDialog(null, "Color choiser", Color.black);
        System.out.println(c);
        txtMain.setForeground(c);
    }//GEN-LAST:event_mnTextColorActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        Date now = new Date();
        JOptionPane.showMessageDialog(rootPane, "Progtam Demo Menu \n Author: Nguyen Quang Minh \n Last Update: " + date.format(now) + " \n Education: Fpoly", "About me", 1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        Date now = new Date();
        JOptionPane.showMessageDialog(rootPane, "Progtam Demo Menu \n Author: Nguyen Quang Minh \n Last Update: " + date.format(now) + " \n Education: Fpoly", "About me", 1);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grpColor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenu mnColor;
    private javax.swing.JMenuItem mnNew;
    private javax.swing.JMenuItem mnOpen;
    private javax.swing.JMenuItem mnSave;
    private javax.swing.JMenuItem mnTextColor;
    private javax.swing.JRadioButtonMenuItem rdoBlue;
    private javax.swing.JRadioButtonMenuItem rdoGreen;
    private javax.swing.JRadioButtonMenuItem rdoRed;
    private javax.swing.JTextArea txtMain;
    // End of variables declaration//GEN-END:variables
}
