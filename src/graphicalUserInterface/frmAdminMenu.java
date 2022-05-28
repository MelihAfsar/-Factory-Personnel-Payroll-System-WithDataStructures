package graphicalUserInterface;

import SQLDataBase.DbManager;
import SQLDataBase.DbManagerManagement;
import factory.personnel.payroll.system.Employee;
import factory.personnel.payroll.system.Management;
import factory.personnel.payroll.system.Person;
import guiManager.FrameChangeSettings;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 * @author AFSAR 
 * This class displays the admin information and performs the update operations through the interface.
 */
public class frmAdminMenu extends javax.swing.JFrame {
    DbManager dbManager;
    DbManagerManagement dbManagerManagement;
    ArrayList<Management> managements;
    
    public frmAdminMenu() {
        initComponents();
        setLocationRelativeTo(null);
        populateFrame();
    }

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
        imgAdd = new javax.swing.JLabel();
        imgRemove = new javax.swing.JLabel();
        imgUpdate = new javax.swing.JLabel();
        imgView = new javax.swing.JLabel();
        imgNotes = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblAdmin1Name = new javax.swing.JLabel();
        lblAdmin1Surname = new javax.swing.JLabel();
        lblAdmin1eMail = new javax.swing.JLabel();
        lblAdmin1Department = new javax.swing.JLabel();
        lblAdmin1userName = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblAdmin2userName = new javax.swing.JLabel();
        lblAdmin2Department = new javax.swing.JLabel();
        lblAdmin2eMail = new javax.swing.JLabel();
        lblAdmin2Surname = new javax.swing.JLabel();
        lblAdmin2Name = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtNameUpdate = new javax.swing.JTextField();
        txtUpdateSurname = new javax.swing.JTextField();
        txtUpdateeMail = new javax.swing.JTextField();
        txtUpdateDepartment = new javax.swing.JTextField();
        txtUpdateUserName = new javax.swing.JTextField();
        txtUpdateUserPassword = new javax.swing.JTextField();
        comboBoxUpdate = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgLockOpen)
                .addContainerGap())
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

        imgAdmin.setBackground(new java.awt.Color(102, 102, 255));
        imgAdmin.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        imgAdmin.setForeground(new java.awt.Color(255, 255, 255));
        imgAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imgAdmin.png"))); // NOI18N
        imgAdmin.setText("      Admin");
        imgAdmin.setToolTipText("");
        imgAdmin.setOpaque(true);
        imgAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgAdminMouseClicked(evt);
            }
        });

        imgAdd.setBackground(new java.awt.Color(204, 204, 204));
        imgAdd.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        imgAdd.setForeground(new java.awt.Color(0, 0, 153));
        imgAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imgAdd.png"))); // NOI18N
        imgAdd.setText("       Add");
        imgAdd.setOpaque(true);
        imgAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgAddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgAddMouseExited(evt);
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

        imgUpdate.setBackground(new java.awt.Color(204, 204, 204));
        imgUpdate.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        imgUpdate.setForeground(new java.awt.Color(0, 0, 153));
        imgUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imgUpdate.png"))); // NOI18N
        imgUpdate.setText("       Update");
        imgUpdate.setOpaque(true);
        imgUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgUpdateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgUpdateMouseExited(evt);
            }
        });

        imgView.setBackground(new java.awt.Color(204, 204, 204));
        imgView.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        imgView.setForeground(new java.awt.Color(0, 0, 153));
        imgView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imgView.png"))); // NOI18N
        imgView.setText("    View");
        imgView.setOpaque(true);
        imgView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgViewMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgViewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgViewMouseExited(evt);
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
            .addComponent(imgAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblFooter1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(imgNotes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(imgHome)
                .addGap(18, 18, 18)
                .addComponent(imgNotes)
                .addGap(18, 18, 18)
                .addComponent(imgAdd)
                .addGap(18, 18, 18)
                .addComponent(imgUpdate)
                .addGap(18, 18, 18)
                .addComponent(imgView)
                .addGap(18, 18, 18)
                .addComponent(imgRemove)
                .addGap(18, 18, 18)
                .addComponent(imgAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(lblFooter1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblAdmin.setBackground(new java.awt.Color(255, 255, 255));
        lblAdmin.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblAdmin.setForeground(new java.awt.Color(0, 0, 153));
        lblAdmin.setText("Admin Menu");

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/person-circle (1).png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Surname :");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("eMail :");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Department :");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("userPassword :       *************************");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("userName :");

        lblAdmin1Name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAdmin1Name.setForeground(new java.awt.Color(255, 255, 255));
        lblAdmin1Name.setText("******************");

        lblAdmin1Surname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAdmin1Surname.setForeground(new java.awt.Color(255, 255, 255));
        lblAdmin1Surname.setText("******************");

        lblAdmin1eMail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAdmin1eMail.setForeground(new java.awt.Color(255, 255, 255));
        lblAdmin1eMail.setText("******************");

        lblAdmin1Department.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAdmin1Department.setForeground(new java.awt.Color(255, 255, 255));
        lblAdmin1Department.setText("******************");

        lblAdmin1userName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAdmin1userName.setForeground(new java.awt.Color(255, 255, 255));
        lblAdmin1userName.setText("******************");

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Admin 1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel7))
                            .addGap(55, 55, 55)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblAdmin1Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblAdmin1Surname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblAdmin1eMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblAdmin1Department, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblAdmin1userName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jLabel26))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel26)
                .addGap(63, 63, 63)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblAdmin1Name))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblAdmin1Surname))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblAdmin1eMail))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblAdmin1Department))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblAdmin1userName))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(102, 102, 255));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/person-circle (1).png"))); // NOI18N
        jLabel8.setOpaque(true);

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Name :");

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Surname :");

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("eMail :");

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Department :");

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("userName :");

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("userPassword :       **************************");

        lblAdmin2userName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAdmin2userName.setForeground(new java.awt.Color(255, 255, 255));
        lblAdmin2userName.setText("*******************");

        lblAdmin2Department.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAdmin2Department.setForeground(new java.awt.Color(255, 255, 255));
        lblAdmin2Department.setText("*******************");

        lblAdmin2eMail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAdmin2eMail.setForeground(new java.awt.Color(255, 255, 255));
        lblAdmin2eMail.setText("*******************");

        lblAdmin2Surname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAdmin2Surname.setForeground(new java.awt.Color(255, 255, 255));
        lblAdmin2Surname.setText("*******************");

        lblAdmin2Name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAdmin2Name.setForeground(new java.awt.Color(255, 255, 255));
        lblAdmin2Name.setText("*******************");

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Admin 2");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblAdmin2userName, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                    .addComponent(lblAdmin2Department, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAdmin2eMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAdmin2Surname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAdmin2Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel27)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel27)
                .addGap(60, 60, 60)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblAdmin2Name))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblAdmin2Surname))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lblAdmin2eMail))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lblAdmin2Department))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lblAdmin2userName))
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel15.setText("Name :");

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel16.setText("Surname :");

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel17.setText("eMail :");

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel18.setText("Department :");

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel19.setText("userName");

        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel25.setText("userPassword :");

        txtNameUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameUpdateActionPerformed(evt);
            }
        });

        comboBoxUpdate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin 1", "Admin 2" }));
        comboBoxUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxUpdateActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 0, 204));
        btnUpdate.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUpdateSurname)
                    .addComponent(txtUpdateeMail, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(txtNameUpdate))
                .addGap(177, 177, 177)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel19))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(380, 380, 380)
                                .addComponent(btnUpdate))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(comboBoxUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(51, 51, 51))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUpdateUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(46, 46, 46)
                                .addComponent(txtUpdateDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtUpdateUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel18)
                    .addComponent(txtNameUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUpdateDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel19)
                    .addComponent(txtUpdateSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUpdateUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel25)
                    .addComponent(txtUpdateeMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUpdateUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFooter2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(lblAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(27, 27, 27))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(59, 59, 59))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblAdmin)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblFooter2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imgHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgHomeMouseClicked
        FrameChangeSettings.setVisible(this,new frmHomePage());
    }//GEN-LAST:event_imgHomeMouseClicked

    private void imgNotesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgNotesMouseClicked
        FrameChangeSettings.setVisible(this,new frmNotesPage());
    }//GEN-LAST:event_imgNotesMouseClicked

    private void imgAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgAddMouseClicked
        FrameChangeSettings.setVisible(this,new frmPersonnelAdd());
    }//GEN-LAST:event_imgAddMouseClicked

    private void imgUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgUpdateMouseClicked
        FrameChangeSettings.setVisible(this,new frmPersonnelUpdate());
    }//GEN-LAST:event_imgUpdateMouseClicked

    private void imgViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgViewMouseClicked
        FrameChangeSettings.setVisible(this,new frmPersonViewing());
    }//GEN-LAST:event_imgViewMouseClicked

    private void imgRemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgRemoveMouseClicked
        FrameChangeSettings.setVisible(this,new frmPersonnelRemove());
    }//GEN-LAST:event_imgRemoveMouseClicked

    private void imgAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgAdminMouseClicked
        FrameChangeSettings.setVisible(this,new frmAdminMenu());
    }//GEN-LAST:event_imgAdminMouseClicked

    private void imgLockOpenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgLockOpenMouseClicked
        FrameChangeSettings.setVisible(this,new frmLogin());
    }//GEN-LAST:event_imgLockOpenMouseClicked

    private void comboBoxUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxUpdateActionPerformed

    private void txtNameUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameUpdateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int id = comboBoxUpdate.getSelectedIndex();
        String name = txtNameUpdate.getText();
        String surname = txtUpdateSurname.getText();
        String eMail = txtUpdateeMail.getText();
        String department = txtUpdateDepartment.getText();
        String userName = txtUpdateUserName.getText();
        String userPassword = txtUpdateUserPassword.getText();
        
        id+=1;
        
        dbManagerManagement = new DbManagerManagement();
        
        try {
            dbManagerManagement.updateData(id, name, surname, eMail, department,userName,userPassword);
            JOptionPane.showMessageDialog(null, "Personnel Updated.");
            populateFrame();
            
        } catch (SQLException ex) {
            Logger.getLogger(frmPersonnelUpdate.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("frmPersonnelUptade - btnUpdate error");
        }finally{
            txtNameUpdate.setText("");
            txtUpdateSurname.setText("");
            txtUpdateeMail.setText("");
            txtUpdateDepartment.setText("");
            txtUpdateUserName.setText("");
            txtUpdateUserPassword.setText("");
            
        }
               
    }//GEN-LAST:event_btnUpdateActionPerformed

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

    private void imgAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgAddMouseEntered
        imgAdd.setBackground(new java.awt.Color(153, 153, 255));
    }//GEN-LAST:event_imgAddMouseEntered

    private void imgAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgAddMouseExited
        imgAdd.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_imgAddMouseExited

    private void imgUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgUpdateMouseEntered
        imgUpdate.setBackground(new java.awt.Color(153, 153, 255));
    }//GEN-LAST:event_imgUpdateMouseEntered

    private void imgUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgUpdateMouseExited
        imgUpdate.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_imgUpdateMouseExited

    private void imgViewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgViewMouseEntered
        imgView.setBackground(new java.awt.Color(153, 153, 255));
    }//GEN-LAST:event_imgViewMouseEntered

    private void imgViewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgViewMouseExited
        imgView.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_imgViewMouseExited

    private void imgRemoveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgRemoveMouseEntered
        imgRemove.setBackground(new java.awt.Color(153, 153, 255));
    }//GEN-LAST:event_imgRemoveMouseEntered

    private void imgRemoveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgRemoveMouseExited
        imgRemove.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_imgRemoveMouseExited
  
    public void setLabel(ArrayList<Management> managements)
    {
        lblAdmin1Name.setText(managements.get(0).getName());    
        lblAdmin1Surname.setText(managements.get(0).getSurname());    
        lblAdmin1Department.setText(managements.get(0).getDepartment());
        lblAdmin1eMail.setText(managements.get(0).geteMail());
        lblAdmin1userName.setText(managements.get(0).getUserName());
        
        lblAdmin2Name.setText(managements.get(1).getName());    
        lblAdmin2Surname.setText(managements.get(1).getSurname());    
        lblAdmin2Department.setText(managements.get(1).getDepartment());
        lblAdmin2eMail.setText(managements.get(1).geteMail());
        lblAdmin2userName.setText(managements.get(1).getUserName());
    }
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
            java.util.logging.Logger.getLogger(frmAdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAdminMenu().setVisible(true);
            }
        });
    }
    
    private void populateFrame() {
        dbManagerManagement = new DbManagerManagement();
        try {
            ArrayList<Management> managements = dbManagerManagement.selectDemo();
            setLabel(managements);
        } catch (SQLException ex) {
            Logger.getLogger(frmAdminMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboBoxUpdate;
    private javax.swing.JLabel imgAdd;
    private javax.swing.JLabel imgAdmin;
    private javax.swing.JLabel imgHome;
    private javax.swing.JLabel imgLockOpen;
    private javax.swing.JLabel imgNotes;
    private javax.swing.JLabel imgRemove;
    private javax.swing.JLabel imgUpdate;
    private javax.swing.JLabel imgView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblAdmin1Department;
    private javax.swing.JLabel lblAdmin1Name;
    private javax.swing.JLabel lblAdmin1Surname;
    private javax.swing.JLabel lblAdmin1eMail;
    private javax.swing.JLabel lblAdmin1userName;
    private javax.swing.JLabel lblAdmin2Department;
    private javax.swing.JLabel lblAdmin2Name;
    private javax.swing.JLabel lblAdmin2Surname;
    private javax.swing.JLabel lblAdmin2eMail;
    private javax.swing.JLabel lblAdmin2userName;
    private javax.swing.JLabel lblFactoryName;
    private javax.swing.JLabel lblFooter1;
    private javax.swing.JLabel lblFooter2;
    private javax.swing.JTextField txtNameUpdate;
    private javax.swing.JTextField txtUpdateDepartment;
    private javax.swing.JTextField txtUpdateSurname;
    private javax.swing.JTextField txtUpdateUserName;
    private javax.swing.JTextField txtUpdateUserPassword;
    private javax.swing.JTextField txtUpdateeMail;
    // End of variables declaration//GEN-END:variables
}