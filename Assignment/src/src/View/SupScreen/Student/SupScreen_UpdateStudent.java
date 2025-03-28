package src.View.SupScreen.Student;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import src.Service.Service_Student;
import src.View.Screen.View_Index;
import static src.View.Screen.View_Index.currentAdmin;
import src.View.Screen.View_Student;

public class SupScreen_UpdateStudent extends javax.swing.JFrame {

    private View_Student studentPanel;
    private String path = "";

    public SupScreen_UpdateStudent() {
        initComponents();
        setTitle("Student management V 1.0.0 | UPDATE");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public SupScreen_UpdateStudent(String id, String name, String email, String phone, boolean gender, String address, String avatar, View_Student studentPanel) {
        initComponents();
        this.studentPanel = studentPanel;
        setTitle("Student management V 1.0.0 | UPDATE | " + name);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        txtId.setText(id);
        txtId.setEnabled(false);
        txtName.setText(name);
        txtEmail.setText(email);
        txtPhone.setText(phone);
        txtAddress.setText(address);
        if (gender) {
            rdoMale.setSelected(true);
        } else {
            rdoFemale.setSelected(true);
        }

        this.path = avatar;
        lblImage.setIcon(new ImageIcon(avatar));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpGender = new javax.swing.ButtonGroup();
        lblUpdateStudent = new javax.swing.JLabel();
        panAdd = new javax.swing.JPanel();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        rdoMale = new javax.swing.JRadioButton();
        rdoFemale = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblUpdateStudent.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblUpdateStudent.setText("UPDATE STUDENT");

        panAdd.setBorder(javax.swing.BorderFactory.createTitledBorder("ADD"));

        lblId.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblId.setText("ID");

        txtId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblName.setText("NAME");

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblEmail.setText("EMAIL");

        lblPhone.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPhone.setText("PHONE");

        txtPhone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtAddress.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblAddress.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblAddress.setText("ADDRESS");

        lblGender.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblGender.setText("GENDER");

        lblImage.setText("ADD IMAGE");
        lblImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImageMouseClicked(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        grpGender.add(rdoMale);
        rdoMale.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdoMale.setText("MALE");

        grpGender.add(rdoFemale);
        rdoFemale.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdoFemale.setText("FEMALE");

        javax.swing.GroupLayout panAddLayout = new javax.swing.GroupLayout(panAdd);
        panAdd.setLayout(panAddLayout);
        panAddLayout.setHorizontalGroup(
            panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panAddLayout.createSequentialGroup()
                        .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPhone)
                            .addComponent(lblId)
                            .addComponent(lblName)
                            .addComponent(lblEmail))
                        .addGap(31, 31, 31)
                        .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panAddLayout.createSequentialGroup()
                        .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAddress)
                            .addComponent(lblGender))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panAddLayout.createSequentialGroup()
                                .addComponent(rdoMale)
                                .addGap(18, 18, 18)
                                .addComponent(rdoFemale))
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panAddLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAddress, txtEmail, txtId, txtName, txtPhone});

        panAddLayout.setVerticalGroup(
            panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panAddLayout.createSequentialGroup()
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panAddLayout.createSequentialGroup()
                        .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblId)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPhone)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGender)
                            .addComponent(rdoMale, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdoFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panAddLayout.createSequentialGroup()
                                .addComponent(lblAddress)
                                .addGap(0, 133, Short.MAX_VALUE))
                            .addComponent(txtAddress))))
                .addContainerGap())
        );

        panAddLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtEmail, txtId, txtName, txtPhone});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUpdateStudent)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUpdateStudent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String id = txtId.getText();
        String name = txtName.getText();
        String email = txtEmail.getText();
        String phone = txtPhone.getText();
        int gender = rdoMale.isSelected() ? 1 : 0;
        String address = txtAddress.getText();
        String avatar = path;

        Service_Student service = new Service_Student();
        boolean updateSuccess = service.updateCheck(id, name, email, phone, gender, address, avatar);
        if (updateSuccess == true) {
            studentPanel.initStudentsData();
            this.dispose();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void lblImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImageMouseClicked
        JFileChooser chooser = new JFileChooser();
        int choise = chooser.showOpenDialog(null);
        if (choise == JFileChooser.APPROVE_OPTION) {
            path = chooser.getSelectedFile().getPath();
            ImageIcon icon = new ImageIcon(path);
            lblImage.setIcon(icon);
            lblImage.setText("");
        }
        
    }//GEN-LAST:event_lblImageMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup grpGender;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblUpdateStudent;
    private javax.swing.JPanel panAdd;
    private javax.swing.JRadioButton rdoFemale;
    private javax.swing.JRadioButton rdoMale;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
