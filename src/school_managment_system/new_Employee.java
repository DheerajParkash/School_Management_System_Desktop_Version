/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_managment_system;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author DHEERAJ K'S PC
 */
public class new_Employee extends javax.swing.JFrame {

    /**
     * Creates new form new_teacher
     */
    String firstName;
    String lastName;
    String gender;
    String j_date;
    String designation;
    String cnic;
    String salary;
    String contact;
    String email;
    String address;
    String sql;
    Database db;
    CallableStatement mystmt;
    public new_Employee() {
        initComponents();
        email="abc@gmail.com";
        mystmt=null;
        db=new Database();
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

        jLabelFirstName11 = new javax.swing.JLabel();
        jTextFieldFirstName9 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButtonCancel = new javax.swing.JButton();
        jTextFieldFirstName = new javax.swing.JTextField();
        jLabelLastName = new javax.swing.JLabel();
        jTextFieldLastName = new javax.swing.JTextField();
        jLabelBirthDate = new javax.swing.JLabel();
        jDateChooserBirthDate = new com.toedter.calendar.JDateChooser();
        jComboBoxGender = new javax.swing.JComboBox();
        jComboBoxDesignation = new javax.swing.JComboBox();
        jLabelFirstName3 = new javax.swing.JLabel();
        jLabelAddress1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaAddress = new javax.swing.JTextArea();
        jButtonCancel1 = new javax.swing.JButton();
        jLabelFirstName8 = new javax.swing.JLabel();
        jTextField_Cnic = new javax.swing.JTextField();
        jTextFieldContact = new javax.swing.JTextField();
        jLabelFirstName9 = new javax.swing.JLabel();
        jLabelFirstName10 = new javax.swing.JLabel();
        jTextFieldSalary = new javax.swing.JTextField();
        jLabelFirstName12 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabelMin = new javax.swing.JLabel();
        jLabelRegister = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();

        jLabelFirstName11.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabelFirstName11.setForeground(new java.awt.Color(236, 240, 241));
        jLabelFirstName11.setText("Contact:");

        jTextFieldFirstName9.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldFirstName9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldFirstName9.setForeground(new java.awt.Color(228, 241, 254));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(42, 62, 80));

        jButtonCancel.setBackground(new java.awt.Color(242, 38, 19));
        jButtonCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCancel.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jTextFieldFirstName.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldFirstName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldFirstName.setForeground(new java.awt.Color(228, 241, 254));

        jLabelLastName.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabelLastName.setForeground(new java.awt.Color(236, 240, 241));
        jLabelLastName.setText("Last Name:");

        jTextFieldLastName.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldLastName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldLastName.setForeground(new java.awt.Color(228, 241, 254));

        jLabelBirthDate.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabelBirthDate.setForeground(new java.awt.Color(236, 240, 241));
        jLabelBirthDate.setText("Joining Date:");

        jDateChooserBirthDate.setBackground(new java.awt.Color(108, 122, 137));

        jComboBoxGender.setBackground(new java.awt.Color(108, 122, 137));
        jComboBoxGender.setEditable(true);
        jComboBoxGender.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jComboBoxGender.setForeground(new java.awt.Color(236, 240, 241));
        jComboBoxGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gender", "Male", "Female" }));

        jComboBoxDesignation.setBackground(new java.awt.Color(108, 122, 137));
        jComboBoxDesignation.setEditable(true);
        jComboBoxDesignation.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jComboBoxDesignation.setForeground(new java.awt.Color(236, 240, 241));
        jComboBoxDesignation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Designation", "Principle", "Teacher", "Clerck", "Peon" }));

        jLabelFirstName3.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabelFirstName3.setForeground(new java.awt.Color(236, 240, 241));
        jLabelFirstName3.setText("First Name:");

        jLabelAddress1.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabelAddress1.setForeground(new java.awt.Color(236, 240, 241));
        jLabelAddress1.setText("Address:  ");

        jTextAreaAddress.setBackground(new java.awt.Color(108, 122, 137));
        jTextAreaAddress.setColumns(20);
        jTextAreaAddress.setForeground(new java.awt.Color(228, 241, 254));
        jTextAreaAddress.setRows(5);
        jScrollPane2.setViewportView(jTextAreaAddress);

        jButtonCancel1.setBackground(new java.awt.Color(34, 167, 240));
        jButtonCancel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCancel1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancel1.setText("Confirm");
        jButtonCancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancel1ActionPerformed(evt);
            }
        });

        jLabelFirstName8.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabelFirstName8.setForeground(new java.awt.Color(236, 240, 241));
        jLabelFirstName8.setText("   CNIC:");

        jTextField_Cnic.setBackground(new java.awt.Color(108, 122, 137));
        jTextField_Cnic.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField_Cnic.setForeground(new java.awt.Color(228, 241, 254));

        jTextFieldContact.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldContact.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldContact.setForeground(new java.awt.Color(228, 241, 254));

        jLabelFirstName9.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabelFirstName9.setForeground(new java.awt.Color(236, 240, 241));
        jLabelFirstName9.setText("Salary:");

        jLabelFirstName10.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabelFirstName10.setForeground(new java.awt.Color(236, 240, 241));
        jLabelFirstName10.setText("Contact:");

        jTextFieldSalary.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldSalary.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldSalary.setForeground(new java.awt.Color(228, 241, 254));

        jLabelFirstName12.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabelFirstName12.setForeground(new java.awt.Color(236, 240, 241));
        jLabelFirstName12.setText("Email:");

        jTextFieldEmail.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldEmail.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldEmail.setForeground(new java.awt.Color(228, 241, 254));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabelBirthDate)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jDateChooserBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(40, 40, 40)
                                    .addComponent(jComboBoxDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabelFirstName3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(jLabelLastName)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelAddress1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(89, 89, 89)
                                        .addComponent(jButtonCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jTextField_Cnic, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelFirstName10)
                                    .addComponent(jLabelFirstName8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldContact, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelFirstName9)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelFirstName12)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLastName)
                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFirstName3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelBirthDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jDateChooserBirthDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFirstName8)
                    .addComponent(jTextField_Cnic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFirstName9)
                    .addComponent(jTextFieldSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFirstName10)
                    .addComponent(jTextFieldContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFirstName12)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

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

        jLabelRegister.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelRegister.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegister.setText("Employee Form");

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
                .addContainerGap(551, Short.MAX_VALUE)
                .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(jLabelRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(371, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(587, Short.MAX_VALUE)
                    .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(9, 9, 9)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelMin, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabelRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabelClose, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        Selection scl=new Selection();
        scl.setVisible(true);
        scl.pack();
        scl.setLocationRelativeTo(null);
        scl.setDefaultCloseOperation(RegisterForm.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonCancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancel1ActionPerformed
        firstName=jTextFieldFirstName.getText();
        lastName=jTextFieldLastName.getText();
        gender=jComboBoxGender.getSelectedItem().toString();
        Date dateFromDateChooser = jDateChooserBirthDate.getDate();
        j_date=String.format("%1$ty-%1$tm-%1$td", dateFromDateChooser);
        designation=jComboBoxDesignation.getSelectedItem().toString();
        cnic=jTextField_Cnic.getText();
        salary=jTextFieldSalary.getText();
        contact=jTextFieldContact.getText();
        email=jTextFieldEmail.getText();
        address=jTextAreaAddress.getText();
        boolean check=true;
        if(firstName.length() !=0 && lastName.length() !=0 && !(gender.equals("Gender")) && !(designation.equals("Designation")) && contact.length() !=0
                && cnic.length() !=0 && salary.length() !=0 && !(j_date.equals("null-null-null")) && address.length() !=0){
            try{
                mystmt=db.con.prepareCall("{call employee_insert(?,?,?,?,?,?,?,?,?,?,?)}");
                mystmt.setString(1,firstName);
                mystmt.setString(2,lastName);
                mystmt.setString(3,gender);
                mystmt.setString(4,j_date);
                mystmt.setString(5,designation);
                mystmt.setString(6,cnic);
                mystmt.setString(7,salary);
                mystmt.setString(8,contact);
                mystmt.setString(9,email);
                mystmt.setString(10,address);
                mystmt.registerOutParameter(11,Types.INTEGER);
                boolean hasresult=mystmt.execute();
                if(!hasresult){
                    int e_id=mystmt.getInt(11);
                    
                    JOptionPane.showMessageDialog(this, "Data Saved Successfully  "+e_id);
                    employee_details sd;
                    sd = new employee_details(e_id);
                    sd.setVisible(true);
                    sd.pack();
                    sd.setLocationRelativeTo(null);
                    this.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(this," Student Data not saved ","Try Again",JOptionPane.WARNING_MESSAGE);
                }
            }catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButtonCancel1ActionPerformed

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

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
            java.util.logging.Logger.getLogger(new_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(new_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(new_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(new_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new new_Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCancel1;
    private javax.swing.JComboBox jComboBoxDesignation;
    private javax.swing.JComboBox jComboBoxGender;
    private com.toedter.calendar.JDateChooser jDateChooserBirthDate;
    private javax.swing.JLabel jLabelAddress1;
    private javax.swing.JLabel jLabelBirthDate;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelFirstName10;
    private javax.swing.JLabel jLabelFirstName11;
    private javax.swing.JLabel jLabelFirstName12;
    private javax.swing.JLabel jLabelFirstName3;
    private javax.swing.JLabel jLabelFirstName8;
    private javax.swing.JLabel jLabelFirstName9;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelRegister;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaAddress;
    private javax.swing.JTextField jTextFieldContact;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldFirstName9;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldSalary;
    private javax.swing.JTextField jTextField_Cnic;
    // End of variables declaration//GEN-END:variables
}
