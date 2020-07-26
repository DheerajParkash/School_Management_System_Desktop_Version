/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_managment_system;

/**
 *
 * @author DHEERAJ K'S PC
 */
public class Selection extends javax.swing.JFrame {

    /**
     * Creates new form Selection
     */
    public Selection() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelMin = new javax.swing.JLabel();
        jLabelSchoolName = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelAddNewStudent1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelAddNewEmployee = new javax.swing.JLabel();
        jLabelReports = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelAddNewSubject = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelAddStudentResult = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelReports1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelReports2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelReports3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelAddNewSubject1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabelMin.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText(" -");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        jLabelSchoolName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelSchoolName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSchoolName.setText("Cambridge Publuc Higher Secondary School");

        jLabelClose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText(" X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(jLabelSchoolName, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(96, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(46, Short.MAX_VALUE)
                    .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(9, 9, 9)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelMin, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabelSchoolName, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabelClose, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel2.setBackground(new java.awt.Color(42, 62, 80));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(236, 240, 241));
        jLabel1.setText("Add New Student");

        jLabelAddNewStudent1.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabelAddNewStudent1.setForeground(new java.awt.Color(236, 240, 241));
        jLabelAddNewStudent1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/school_managment_system/Images/NewCust.png"))); // NOI18N
        jLabelAddNewStudent1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAddNewStudent1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(236, 240, 241));
        jLabel2.setText("Add New Employee");

        jLabelAddNewEmployee.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabelAddNewEmployee.setForeground(new java.awt.Color(236, 240, 241));
        jLabelAddNewEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/school_managment_system/Images/index - Copy.jpg"))); // NOI18N
        jLabelAddNewEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAddNewEmployeeMouseClicked(evt);
            }
        });

        jLabelReports.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabelReports.setForeground(new java.awt.Color(236, 240, 241));
        jLabelReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/school_managment_system/Images/ProdReport.png"))); // NOI18N
        jLabelReports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelReportsMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(236, 240, 241));
        jLabel3.setText("Generate Reports");

        jLabelAddNewSubject.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabelAddNewSubject.setForeground(new java.awt.Color(236, 240, 241));
        jLabelAddNewSubject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/school_managment_system/Images/subject.jpg"))); // NOI18N
        jLabelAddNewSubject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAddNewSubjectMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(236, 240, 241));
        jLabel5.setText("Add New Subject");

        jLabelAddStudentResult.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabelAddStudentResult.setForeground(new java.awt.Color(236, 240, 241));
        jLabelAddStudentResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/school_managment_system/Images/result.jpg"))); // NOI18N
        jLabelAddStudentResult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAddStudentResultMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(236, 240, 241));
        jLabel4.setText("Add Student Result");

        jLabelReports1.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabelReports1.setForeground(new java.awt.Color(236, 240, 241));
        jLabelReports1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/school_managment_system/Images/promot1.jpg"))); // NOI18N
        jLabelReports1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelReports1MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(236, 240, 241));
        jLabel6.setText("Promote students");

        jLabelReports2.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabelReports2.setForeground(new java.awt.Color(236, 240, 241));
        jLabelReports2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/school_managment_system/Images/fees.jpg"))); // NOI18N
        jLabelReports2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelReports2MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(236, 240, 241));
        jLabel7.setText("update new month fees");

        jLabelReports3.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabelReports3.setForeground(new java.awt.Color(236, 240, 241));
        jLabelReports3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/school_managment_system/Images/Salary.jpg"))); // NOI18N
        jLabelReports3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelReports3MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(236, 240, 241));
        jLabel8.setText("update new month fees");

        jLabelAddNewSubject1.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabelAddNewSubject1.setForeground(new java.awt.Color(236, 240, 241));
        jLabelAddNewSubject1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/school_managment_system/Images/graduation.jpg"))); // NOI18N
        jLabelAddNewSubject1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAddNewSubject1MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(236, 240, 241));
        jLabel10.setText("Generate Certificate");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(92, 92, 92))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabelAddStudentResult))
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1))
                                .addGap(86, 86, 86))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabelAddNewStudent1))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabelReports2)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(jLabel3))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGap(45, 45, 45)
                                                    .addComponent(jLabelAddNewEmployee))))
                                        .addGap(9, 9, 9))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabelReports)
                                        .addGap(45, 45, 45)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(89, 89, 89)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(jLabelAddNewSubject))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabelReports1)
                                        .addGap(29, 29, 29)))
                                .addContainerGap(92, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabelReports3))
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabelAddNewSubject1)
                                        .addGap(37, 37, 37)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelAddNewSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelAddNewStudent1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelAddNewEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelAddStudentResult, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelReports, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelReports1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelReports2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelReports3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelAddNewSubject1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(5, 5, 5)))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        // TODO add your handling code here:
        this.setState(Log_in_form.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelAddNewStudent1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAddNewStudent1MouseClicked
        New_Addmission adm=new New_Addmission();
        adm.setVisible(true);
        adm.pack();
        adm.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabelAddNewStudent1MouseClicked

    private void jLabelAddNewEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAddNewEmployeeMouseClicked
       new_Employee emp=new new_Employee();
       emp.setVisible(true);
       emp.pack();
       emp.setLocationRelativeTo(null);
       this.dispose();
        
    }//GEN-LAST:event_jLabelAddNewEmployeeMouseClicked

    private void jLabelReportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReportsMouseClicked
        Reports rep=new Reports();
        rep.setVisible(true);
        rep.pack();
        rep.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabelReportsMouseClicked

    private void jLabelAddNewSubjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAddNewSubjectMouseClicked
        new_subject sbj=new new_subject();
        sbj.setVisible(true);
        sbj.pack();
        sbj.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabelAddNewSubjectMouseClicked

    private void jLabelAddStudentResultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAddStudentResultMouseClicked
        Result_Enrollment re=new Result_Enrollment();
        re.setVisible(true);
        re.pack();
        re.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabelAddStudentResultMouseClicked

    private void jLabelReports1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReports1MouseClicked
        Promote pmt=new Promote();
        pmt.setVisible(true);
        pmt.pack();
        pmt.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabelReports1MouseClicked

    private void jLabelReports2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReports2MouseClicked
        Fees_Allocate fa=new Fees_Allocate();
        fa.setVisible(true);
        fa.pack();
        fa.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabelReports2MouseClicked

    private void jLabelReports3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReports3MouseClicked
        Salary_Allocate sa=new Salary_Allocate();
        sa.setVisible(true);
        sa.pack();
        sa.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabelReports3MouseClicked

    private void jLabelAddNewSubject1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAddNewSubject1MouseClicked
        Create_Certificate cc=new Create_Certificate();
        cc.setVisible(true);
        cc.pack();
        cc.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabelAddNewSubject1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelAddNewEmployee;
    private javax.swing.JLabel jLabelAddNewStudent1;
    private javax.swing.JLabel jLabelAddNewSubject;
    private javax.swing.JLabel jLabelAddNewSubject1;
    private javax.swing.JLabel jLabelAddStudentResult;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelReports;
    private javax.swing.JLabel jLabelReports1;
    private javax.swing.JLabel jLabelReports2;
    private javax.swing.JLabel jLabelReports3;
    private javax.swing.JLabel jLabelSchoolName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
