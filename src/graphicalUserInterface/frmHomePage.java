package graphicalUserInterface;

import factory.personnel.payroll.system.EmployeeManager;
import factory.personnel.payroll.system.PersonManager;
import guiManager.FrameChangeSettings;

/* @author AFSAR */
public class frmHomePage extends javax.swing.JFrame {
    public frmHomePage() {
        initComponents();
        setLocationRelativeTo(null);
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
        lblHome = new javax.swing.JLabel();
        lblTotalPersonnel = new javax.swing.JLabel();
        lblFemalePersonnel = new javax.swing.JLabel();
        lblMalePersonnel = new javax.swing.JLabel();
        lblSalaryPaid = new javax.swing.JLabel();

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

        imgHome.setBackground(new java.awt.Color(102, 102, 255));
        imgHome.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        imgHome.setForeground(new java.awt.Color(255, 255, 255));
        imgHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imgHome.png"))); // NOI18N
        imgHome.setText("      Home");
        imgHome.setToolTipText("");
        imgHome.setOpaque(true);
        imgHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgHomeMouseClicked(evt);
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
        imgUpdate.setText("      Update");
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
        imgView.setText("   View");
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
            .addComponent(imgHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgRemove, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblFooter1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(imgNotes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

        lblHome.setBackground(new java.awt.Color(255, 255, 255));
        lblHome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHome.setForeground(new java.awt.Color(0, 0, 204));
        lblHome.setText("Home");

        lblTotalPersonnel.setBackground(new java.awt.Color(255, 153, 0));
        lblTotalPersonnel.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblTotalPersonnel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalPersonnel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/totalPersonnel.png"))); // NOI18N
        lblTotalPersonnel.setText(" Total Personnel :");
        lblTotalPersonnel.setOpaque(true);
        lblTotalPersonnel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTotalPersonnelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTotalPersonnelMouseExited(evt);
            }
        });

        lblFemalePersonnel.setBackground(new java.awt.Color(255, 51, 51));
        lblFemalePersonnel.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblFemalePersonnel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFemalePersonnel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/femalePersonnel.png"))); // NOI18N
        lblFemalePersonnel.setText("Female Personnel :");
        lblFemalePersonnel.setOpaque(true);
        lblFemalePersonnel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblFemalePersonnelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblFemalePersonnelMouseExited(evt);
            }
        });

        lblMalePersonnel.setBackground(new java.awt.Color(0, 204, 204));
        lblMalePersonnel.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblMalePersonnel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMalePersonnel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/malePersonnel.png"))); // NOI18N
        lblMalePersonnel.setText("Male Personnel :");
        lblMalePersonnel.setOpaque(true);
        lblMalePersonnel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMalePersonnelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMalePersonnelMouseExited(evt);
            }
        });

        lblSalaryPaid.setBackground(new java.awt.Color(0, 153, 51));
        lblSalaryPaid.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblSalaryPaid.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSalaryPaid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salaryPaid.png"))); // NOI18N
        lblSalaryPaid.setText("Salary Paid :");
        lblSalaryPaid.setOpaque(true);
        lblSalaryPaid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSalaryPaidMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSalaryPaidMouseExited(evt);
            }
        });

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
                        .addGap(50, 50, 50)
                        .addComponent(lblFooter2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblHome, javax.swing.GroupLayout.DEFAULT_SIZE, 1382, Short.MAX_VALUE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblSalaryPaid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblTotalPersonnel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(lblFemalePersonnel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(lblMalePersonnel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(117, 117, 117))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblHome)
                        .addGap(73, 73, 73)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotalPersonnel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFemalePersonnel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMalePersonnel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSalaryPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(lblFooter2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void imgNotesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgNotesMouseClicked
        FrameChangeSettings.setVisible(this,new frmNotesPage());
    }//GEN-LAST:event_imgNotesMouseClicked

    private void imgHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgHomeMouseClicked
        FrameChangeSettings.setVisible(this,new frmHomePage());
    }//GEN-LAST:event_imgHomeMouseClicked

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

    private void lblTotalPersonnelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTotalPersonnelMouseEntered
        lblTotalPersonnel.setText(String.valueOf(setPersonnelLabel(0)));
    }//GEN-LAST:event_lblTotalPersonnelMouseEntered

    private void lblTotalPersonnelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTotalPersonnelMouseExited
        lblTotalPersonnel.setText("Total Personnel :");
    }//GEN-LAST:event_lblTotalPersonnelMouseExited

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

    private void imgAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgAdminMouseEntered
        imgAdmin.setBackground(new java.awt.Color(153, 153, 255));
    }//GEN-LAST:event_imgAdminMouseEntered

    private void imgAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgAdminMouseExited
        imgAdmin.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_imgAdminMouseExited

    private void lblFemalePersonnelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFemalePersonnelMouseEntered
        lblFemalePersonnel.setText(String.valueOf(setPersonnelLabel(1)));
    }//GEN-LAST:event_lblFemalePersonnelMouseEntered

    private void lblFemalePersonnelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFemalePersonnelMouseExited
        lblFemalePersonnel.setText("Female Personnel :");
    }//GEN-LAST:event_lblFemalePersonnelMouseExited

    private void lblMalePersonnelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMalePersonnelMouseEntered
       lblMalePersonnel.setText(String.valueOf(setPersonnelLabel(2)));
    }//GEN-LAST:event_lblMalePersonnelMouseEntered

    private void lblMalePersonnelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMalePersonnelMouseExited
        lblMalePersonnel.setText("Male Personnel :");
    }//GEN-LAST:event_lblMalePersonnelMouseExited

    private void lblSalaryPaidMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalaryPaidMouseEntered
        lblSalaryPaid.setText(String.valueOf(setSalaryPaidLabel()));
    }//GEN-LAST:event_lblSalaryPaidMouseEntered

    private void lblSalaryPaidMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalaryPaidMouseExited
        lblSalaryPaid.setText("Salary Paid :");
    }//GEN-LAST:event_lblSalaryPaidMouseExited

    
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
            java.util.logging.Logger.getLogger(frmHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgAdd;
    private javax.swing.JLabel imgAdmin;
    private javax.swing.JLabel imgHome;
    private javax.swing.JLabel imgLockOpen;
    private javax.swing.JLabel imgNotes;
    private javax.swing.JLabel imgRemove;
    private javax.swing.JLabel imgUpdate;
    private javax.swing.JLabel imgView;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblFactoryName;
    private javax.swing.JLabel lblFemalePersonnel;
    private javax.swing.JLabel lblFooter1;
    private javax.swing.JLabel lblFooter2;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblMalePersonnel;
    private javax.swing.JLabel lblSalaryPaid;
    private javax.swing.JLabel lblTotalPersonnel;
    // End of variables declaration//GEN-END:variables

    private int setPersonnelLabel(int i) {
        PersonManager personManager = new PersonManager();
        int[] array = personManager.totalPersonnelCounter();
        int result = array[i];
        return result;
    }
    
    private double setSalaryPaidLabel() {
        EmployeeManager employeeManager = new EmployeeManager();
        return employeeManager.totalSalaryPaid();
    }
    
}
