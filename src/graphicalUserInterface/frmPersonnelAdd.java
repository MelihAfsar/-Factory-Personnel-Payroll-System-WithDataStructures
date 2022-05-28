package graphicalUserInterface;

import SQLDataBase.DbManager;
import factory.personnel.payroll.system.EmployeeManager;
import factory.personnel.payroll.system.PersonManager;
import guiManager.FrameChangeSettings;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author AFSAR 
 * This class performs the insertion to the database with the interface.
 */
public class frmPersonnelAdd extends javax.swing.JFrame {
    public frmPersonnelAdd() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    DbManager dbManager;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        imgLockOpen = new javax.swing.JLabel();
        lblFactoryName = new javax.swing.JLabel();
        lblFooter2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblFooter1 = new javax.swing.JLabel();
        imgHome = new javax.swing.JLabel();
        imgAdmin = new javax.swing.JLabel();
        imgPersonnelAdd = new javax.swing.JLabel();
        imgRemove = new javax.swing.JLabel();
        imgPersonnelUpdate = new javax.swing.JLabel();
        imgPersonnelView = new javax.swing.JLabel();
        imgNotes = new javax.swing.JLabel();
        lblAdd = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblPersonnelID = new javax.swing.JLabel();
        lblPersonnelName = new javax.swing.JLabel();
        lblSurname = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lbleMail = new javax.swing.JLabel();
        lblDepartment = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblWorkingHours = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txteMail = new javax.swing.JTextField();
        comboDepartment = new javax.swing.JComboBox<>();
        txtAddress = new javax.swing.JTextField();
        txtWorkingHours = new javax.swing.JTextField();
        txtHourlyWage = new javax.swing.JTextField();
        radioFemale = new javax.swing.JRadioButton();
        radioMale = new javax.swing.JRadioButton();
        btnAdd = new javax.swing.JButton();
        lblHourlyWage = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        lblSalary = new javax.swing.JLabel();
        lblGrossSalary = new javax.swing.JLabel();
        lblGSalary = new javax.swing.JLabel();
        lblSSalary = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        jPanel2.setBackground(new java.awt.Color(0, 0, 155));

        imgLockOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imgLockOpen.png"))); // NOI18N
        imgLockOpen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgLockOpenMouseClicked(evt);
            }
        });

        lblFactoryName.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        lblFactoryName.setForeground(new java.awt.Color(255, 255, 255));
        lblFactoryName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFactoryName.setText("                      ABC FACTORY Personnel Payroll System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFactoryName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(imgLockOpen)
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgLockOpen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFactoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        lblFooter2.setBackground(new java.awt.Color(255, 255, 255));
        lblFooter2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblFooter2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFooter2.setText("ABC Company © 2021 - 2022");
        lblFooter2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        lblFooter1.setBackground(new java.awt.Color(255, 255, 255));
        lblFooter1.setFont(new java.awt.Font("Times New Roman", 2, 16)); // NOI18N
        lblFooter1.setForeground(new java.awt.Color(0, 0, 153));
        lblFooter1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFooter1.setText("Developed by Melih Afsar");
        lblFooter1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        imgHome.setBackground(new java.awt.Color(204, 204, 204));
        imgHome.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        imgHome.setForeground(new java.awt.Color(0, 0, 153));
        imgHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imgHome.png"))); // NOI18N
        imgHome.setText("      Home");
        imgHome.setToolTipText("");
        imgHome.setOpaque(true);
        imgHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgHomeMouseExited(evt);
            }
        });

        imgAdmin.setBackground(new java.awt.Color(204, 204, 204));
        imgAdmin.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        imgAdmin.setForeground(new java.awt.Color(0, 0, 153));
        imgAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imgAdmin.png"))); // NOI18N
        imgAdmin.setText("      Admin");
        imgAdmin.setToolTipText("");
        imgAdmin.setOpaque(true);
        imgAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgAdminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgAdminMouseExited(evt);
            }
        });

        imgPersonnelAdd.setBackground(new java.awt.Color(102, 102, 255));
        imgPersonnelAdd.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        imgPersonnelAdd.setForeground(new java.awt.Color(255, 255, 255));
        imgPersonnelAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imgAdd.png"))); // NOI18N
        imgPersonnelAdd.setText("       Add");
        imgPersonnelAdd.setOpaque(true);
        imgPersonnelAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgPersonnelAddMouseClicked(evt);
            }
        });

        imgRemove.setBackground(new java.awt.Color(204, 204, 204));
        imgRemove.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        imgRemove.setForeground(new java.awt.Color(0, 0, 153));
        imgRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imgRemove.png"))); // NOI18N
        imgRemove.setText("     Remove");
        imgRemove.setOpaque(true);
        imgRemove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgRemoveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgRemoveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgRemoveMouseExited(evt);
            }
        });

        imgPersonnelUpdate.setBackground(new java.awt.Color(204, 204, 204));
        imgPersonnelUpdate.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        imgPersonnelUpdate.setForeground(new java.awt.Color(0, 0, 153));
        imgPersonnelUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imgUpdate.png"))); // NOI18N
        imgPersonnelUpdate.setText("      Update");
        imgPersonnelUpdate.setOpaque(true);
        imgPersonnelUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgPersonnelUpdateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgPersonnelUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgPersonnelUpdateMouseExited(evt);
            }
        });

        imgPersonnelView.setBackground(new java.awt.Color(204, 204, 204));
        imgPersonnelView.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        imgPersonnelView.setForeground(new java.awt.Color(0, 0, 153));
        imgPersonnelView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imgView.png"))); // NOI18N
        imgPersonnelView.setText("   View");
        imgPersonnelView.setOpaque(true);
        imgPersonnelView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgPersonnelViewMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgPersonnelViewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgPersonnelViewMouseExited(evt);
            }
        });

        imgNotes.setBackground(new java.awt.Color(204, 204, 204));
        imgNotes.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        imgNotes.setForeground(new java.awt.Color(0, 0, 153));
        imgNotes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imgEdit.png"))); // NOI18N
        imgNotes.setText("       Notes");
        imgNotes.setOpaque(true);
        imgNotes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgNotesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgNotesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgNotesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgPersonnelAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgPersonnelUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblFooter1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(imgNotes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgPersonnelView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(imgHome)
                .addGap(18, 18, 18)
                .addComponent(imgNotes)
                .addGap(18, 18, 18)
                .addComponent(imgPersonnelAdd)
                .addGap(18, 18, 18)
                .addComponent(imgPersonnelUpdate)
                .addGap(18, 18, 18)
                .addComponent(imgPersonnelView)
                .addGap(18, 18, 18)
                .addComponent(imgRemove)
                .addGap(18, 18, 18)
                .addComponent(imgAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(lblFooter1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblAdd.setBackground(new java.awt.Color(255, 255, 255));
        lblAdd.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblAdd.setForeground(new java.awt.Color(0, 0, 153));
        lblAdd.setText("Personnel Add Menu");

        lblPersonnelID.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        lblPersonnelID.setText("Personnel ID :");

        lblPersonnelName.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        lblPersonnelName.setText("Personnel Name :");

        lblSurname.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        lblSurname.setText("Personnel Surname :");

        lblGender.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        lblGender.setText("Personnel Gender :");

        lblAge.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        lblAge.setText("Personnel Age :");

        lbleMail.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        lbleMail.setText("Personnel eMail :");

        lblDepartment.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        lblDepartment.setText("Personnel Department :");

        lblAddress.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        lblAddress.setText("Personnel Address :");

        lblWorkingHours.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        lblWorkingHours.setText("Personnel Working Hours :");

        txtID.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N

        txtName.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N

        txtSurname.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N

        txtAge.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N

        txteMail.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N

        comboDepartment.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        comboDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kalıp-Bakım", "Yemek", "Enjeksiyon", "Nakliye", "Finans", "AR-GE", "Halkla İlişkiler", "İnsan Kaynakları", "Pazarlama", "Muhasebe" }));

        txtAddress.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N

        txtWorkingHours.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N

        txtHourlyWage.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        txtHourlyWage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHourlyWageActionPerformed(evt);
            }
        });

        radioFemale.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        radioFemale.setText("Female");
        radioFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFemaleActionPerformed(evt);
            }
        });

        radioMale.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        radioMale.setText("Male");
        radioMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMaleActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(0, 0, 204));
        btnAdd.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lblHourlyWage.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        lblHourlyWage.setText("Personnel Hourly Wage :");

        btnReset.setBackground(new java.awt.Color(0, 0, 204));
        btnReset.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnReset)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPersonnelID)
                            .addComponent(lblPersonnelName)
                            .addComponent(lblSurname)
                            .addComponent(lblGender)
                            .addComponent(lblAge)
                            .addComponent(lbleMail)
                            .addComponent(lblDepartment)
                            .addComponent(lblAddress)
                            .addComponent(lblWorkingHours)
                            .addComponent(lblHourlyWage))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtID)
                            .addComponent(txtName)
                            .addComponent(txtSurname)
                            .addComponent(txtAge)
                            .addComponent(txteMail)
                            .addComponent(comboDepartment, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAddress)
                            .addComponent(txtWorkingHours)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(radioFemale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radioMale))
                            .addComponent(txtHourlyWage, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(46, 46, 46))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtID)
                    .addComponent(lblPersonnelID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtName)
                    .addComponent(lblPersonnelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSurname)
                    .addComponent(lblSurname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGender)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioFemale)
                        .addComponent(radioMale)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAge)
                    .addComponent(lblAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txteMail)
                    .addComponent(lbleMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboDepartment)
                    .addComponent(lblDepartment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAddress)
                    .addComponent(lblAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtWorkingHours)
                    .addComponent(lblWorkingHours, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHourlyWage)
                    .addComponent(txtHourlyWage, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        lblSalary.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        lblSalary.setText("Personnel Sallary :");

        lblGrossSalary.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        lblGrossSalary.setText("Personnel GrossSalary :");

        lblGSalary.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblGSalary.setForeground(new java.awt.Color(0, 0, 204));

        lblSSalary.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblSSalary.setForeground(new java.awt.Color(0, 0, 204));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/person-circle2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGrossSalary)
                            .addComponent(lblSalary))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblGSalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSSalary, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblGSalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblGrossSalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSSalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblFooter2, javax.swing.GroupLayout.PREFERRED_SIZE, 1430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblAdd)
                        .addGap(81, 81, 81)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(lblFooter2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1691, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imgPersonnelAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPersonnelAddMouseClicked
        FrameChangeSettings.setVisible(this,new frmPersonnelAdd());
    }//GEN-LAST:event_imgPersonnelAddMouseClicked

    private void imgHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgHomeMouseClicked
        FrameChangeSettings.setVisible(this,new frmHomePage());
    }//GEN-LAST:event_imgHomeMouseClicked

    private void imgNotesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgNotesMouseClicked
        FrameChangeSettings.setVisible(this,new frmNotesPage());
    }//GEN-LAST:event_imgNotesMouseClicked

    private void imgPersonnelUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPersonnelUpdateMouseClicked
        FrameChangeSettings.setVisible(this,new frmPersonnelUpdate());
    }//GEN-LAST:event_imgPersonnelUpdateMouseClicked

    private void imgPersonnelViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPersonnelViewMouseClicked
        FrameChangeSettings.setVisible(this,new frmPersonViewing());
    }//GEN-LAST:event_imgPersonnelViewMouseClicked

    private void imgRemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgRemoveMouseClicked
        FrameChangeSettings.setVisible(this,new frmPersonnelRemove());
    }//GEN-LAST:event_imgRemoveMouseClicked

    private void imgAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgAdminMouseClicked
        FrameChangeSettings.setVisible(this,new frmAdminMenu());
    }//GEN-LAST:event_imgAdminMouseClicked

    private void imgLockOpenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgLockOpenMouseClicked
        FrameChangeSettings.setVisible(this,new frmLogin());
    }//GEN-LAST:event_imgLockOpenMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        int id = Integer.valueOf(txtID.getText());
        String name = txtName.getText();
        String surname = txtSurname.getText();
        String gender = null;
        if(radioFemale.isSelected()){
            gender = "female";
        }
        if(radioMale.isSelected()){
            gender = "male";
        }
        
        int age = Integer.valueOf(txtAge.getText());
        String eMail = txteMail.getText();
        String department = (String) comboDepartment.getSelectedItem();
        String address = txtAddress.getText();
        Double tax = 0.0;
        double hourlyWage = Double.valueOf(txtHourlyWage.getText());
        int workingHours = Integer.valueOf(txtWorkingHours.getText());
        
        Double grossSalary = ((hourlyWage * workingHours) + tax);
        Double salary = PersonManager.salaryCalculator(hourlyWage, workingHours, tax);
        
        lblGSalary.setText(String.valueOf(grossSalary));
        lblSSalary.setText(String.valueOf(salary));
        
        dbManager = new DbManager();
        try {
            dbManager.insertData(id,name,surname,gender,age,eMail,department,address,salary,grossSalary,tax,hourlyWage,workingHours);
            JOptionPane.showMessageDialog(null, "Personnel Added.");
        } catch (SQLException ex) {
            Logger.getLogger(frmPersonnelAdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void radioFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFemaleActionPerformed
        if(radioFemale.isSelected()){
            radioMale.setSelected(false);
        }    
    }//GEN-LAST:event_radioFemaleActionPerformed

    private void txtHourlyWageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHourlyWageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHourlyWageActionPerformed

    private void radioMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMaleActionPerformed
        if(radioMale.isSelected()){
            radioFemale.setSelected(false);
        }
    }//GEN-LAST:event_radioMaleActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtID.setText("");
        txtName.setText("");
        txtSurname.setText("");
        txtAge.setText("");
        txteMail.setText("");
        txtAddress.setText("");
        txtHourlyWage.setText("");
        txtWorkingHours.setText("");
        lblSSalary.setText("");
        lblGSalary.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void imgHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgHomeMouseEntered
        imgHome.setBackground(new java.awt.Color(153, 153, 255));
    }//GEN-LAST:event_imgHomeMouseEntered

    private void imgHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgHomeMouseExited
        imgHome.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_imgHomeMouseExited

    private void imgNotesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgNotesMouseEntered
        imgNotes.setBackground(new java.awt.Color(153, 153, 255));
    }//GEN-LAST:event_imgNotesMouseEntered

    private void imgNotesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgNotesMouseExited
        imgNotes.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_imgNotesMouseExited

    private void imgPersonnelUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPersonnelUpdateMouseEntered
        imgPersonnelUpdate.setBackground(new java.awt.Color(153, 153, 255));
    }//GEN-LAST:event_imgPersonnelUpdateMouseEntered

    private void imgPersonnelUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPersonnelUpdateMouseExited
        imgPersonnelUpdate.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_imgPersonnelUpdateMouseExited

    private void imgPersonnelViewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPersonnelViewMouseEntered
        imgPersonnelView.setBackground(new java.awt.Color(153, 153, 255));
    }//GEN-LAST:event_imgPersonnelViewMouseEntered

    private void imgPersonnelViewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPersonnelViewMouseExited
        imgPersonnelView.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_imgPersonnelViewMouseExited

    private void imgRemoveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgRemoveMouseEntered
        imgRemove.setBackground(new java.awt.Color(153, 153, 255));
    }//GEN-LAST:event_imgRemoveMouseEntered

    private void imgRemoveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgRemoveMouseExited
        imgRemove.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_imgRemoveMouseExited

    private void imgAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgAdminMouseEntered
        imgAdmin.setBackground(new java.awt.Color(153, 153, 255));
    }//GEN-LAST:event_imgAdminMouseEntered

    private void imgAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgAdminMouseExited
        imgAdmin.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_imgAdminMouseExited

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
            java.util.logging.Logger.getLogger(frmPersonnelAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPersonnelAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPersonnelAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPersonnelAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPersonnelAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> comboDepartment;
    private javax.swing.JLabel imgAdmin;
    private javax.swing.JLabel imgHome;
    private javax.swing.JLabel imgLockOpen;
    private javax.swing.JLabel imgNotes;
    private javax.swing.JLabel imgPersonnelAdd;
    private javax.swing.JLabel imgPersonnelUpdate;
    private javax.swing.JLabel imgPersonnelView;
    private javax.swing.JLabel imgRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblAdd;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblDepartment;
    private javax.swing.JLabel lblFactoryName;
    private javax.swing.JLabel lblFooter1;
    private javax.swing.JLabel lblFooter2;
    private javax.swing.JLabel lblGSalary;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblGrossSalary;
    private javax.swing.JLabel lblHourlyWage;
    private javax.swing.JLabel lblPersonnelID;
    private javax.swing.JLabel lblPersonnelName;
    private javax.swing.JLabel lblSSalary;
    private javax.swing.JLabel lblSalary;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JLabel lblWorkingHours;
    private javax.swing.JLabel lbleMail;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtHourlyWage;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSurname;
    private javax.swing.JTextField txtWorkingHours;
    private javax.swing.JTextField txteMail;
    // End of variables declaration//GEN-END:variables

}
