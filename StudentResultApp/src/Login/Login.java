/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import Login.TeacherInter;
import Login.AdminInter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableColumn;
import java.awt.event.WindowEvent;

/**
 *
 * @author stevenodonoghue
 */
public class Login extends javax.swing.JFrame {
    String username = "root";
    String password = "Pa55w0rd!";
    String dataCon = "jdbc:mysql://localhost:3306/ResultsSystem";
    
    Connection sqlCon = null;
    PreparedStatement preState = null;
    ResultSet resultSet = null;
    
    int q, i;
    
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        textAdminPassword = new javax.swing.JPasswordField();
        textAdminEmail = new javax.swing.JTextField();
        labAdminEmail = new javax.swing.JLabel();
        labAdminPassword = new javax.swing.JLabel();
        buttAdminLogin = new javax.swing.JButton();
        buttAdminReset = new javax.swing.JButton();
        buttAdminExit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        labTeachEmail = new javax.swing.JLabel();
        labTeachPassword = new javax.swing.JLabel();
        textTeachPassword = new javax.swing.JPasswordField();
        textTeachEmail = new javax.swing.JTextField();
        buttTeachLogin = new javax.swing.JButton();
        buttTeachReset = new javax.swing.JButton();
        buttTeachExit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(102, 102, 255));

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textAdminPassword.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jPanel2.add(textAdminPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 220, -1));

        textAdminEmail.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jPanel2.add(textAdminEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 220, -1));

        labAdminEmail.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        labAdminEmail.setText("Email");
        jPanel2.add(labAdminEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        labAdminPassword.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        labAdminPassword.setText("Password");
        jPanel2.add(labAdminPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        buttAdminLogin.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        buttAdminLogin.setText("Login");
        buttAdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttAdminLoginActionPerformed(evt);
            }
        });
        jPanel2.add(buttAdminLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        buttAdminReset.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        buttAdminReset.setText("Reset");
        buttAdminReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttAdminResetActionPerformed(evt);
            }
        });
        jPanel2.add(buttAdminReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        buttAdminExit.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        buttAdminExit.setText("Exit");
        buttAdminExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttAdminExitActionPerformed(evt);
            }
        });
        jPanel2.add(buttAdminExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        jTabbedPane1.addTab("Administration", jPanel2);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labTeachEmail.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        labTeachEmail.setText("Email");
        jPanel1.add(labTeachEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        labTeachPassword.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        labTeachPassword.setText("Password");
        jPanel1.add(labTeachPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        textTeachPassword.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        textTeachPassword.setToolTipText("");
        jPanel1.add(textTeachPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 220, -1));

        textTeachEmail.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jPanel1.add(textTeachEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 220, -1));

        buttTeachLogin.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        buttTeachLogin.setText("Login");
        buttTeachLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttTeachLoginActionPerformed(evt);
            }
        });
        jPanel1.add(buttTeachLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        buttTeachReset.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        buttTeachReset.setText("Reset");
        buttTeachReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttTeachResetActionPerformed(evt);
            }
        });
        jPanel1.add(buttTeachReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        buttTeachExit.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        buttTeachExit.setText("Exit");
        buttTeachExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttTeachExitActionPerformed(evt);
            }
        });
        jPanel1.add(buttTeachExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        jTabbedPane1.addTab("Teacher", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 410, 250));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel2.setText("Terminal Exam Entry Point");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Exit system on Teacher Login
    private void buttTeachExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttTeachExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttTeachExitActionPerformed

    //Exit system on Admin Login
    private void buttAdminExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttAdminExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttAdminExitActionPerformed

    //Reset fields on Teacher Login
    private void buttTeachResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttTeachResetActionPerformed
        textTeachEmail.setText(null);
        textTeachPassword.setText(null);
    }//GEN-LAST:event_buttTeachResetActionPerformed

    //Reset fields on Admin Login
    private void buttAdminResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttAdminResetActionPerformed
        textAdminEmail.setText(null);
        textAdminPassword.setText(null);
    }//GEN-LAST:event_buttAdminResetActionPerformed

    //Teacher Login Button Function
    private void buttTeachLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttTeachLoginActionPerformed
       //String teachPassword = textTeachPassword.getText();
       //String teachEmail = textTeachEmail.getText();
       
       try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlCon = DriverManager.getConnection(dataCon,username,password);
            preState = sqlCon.prepareStatement("SELECT * FROM ResultsSystem.Teacher WHERE email = ? AND password = ?");
            preState.setString(1, textTeachEmail.getText());
            preState.setString(2, textTeachPassword.getText());
            resultSet = preState.executeQuery();
            
            if (resultSet.next())
                {
                    textTeachPassword.setText(null);
                    textTeachEmail.setText(null);
                    systemExit();

                    TeacherInter interfaceTeach = new TeacherInter();
                    interfaceTeach.setVisible(true);
                    interfaceTeach.inputDBStudInfo();
                    interfaceTeach.inputDBStudentGrade();
           
          //Need to create the teacher page and then add the login in material. 
                }
            else 
                {
                JOptionPane.showMessageDialog(null,"Invalid Login Details", "Login Error", JOptionPane.ERROR_MESSAGE);
                textTeachPassword.setText(null);
                textTeachEmail.setText(null);
                }
            
            }
       catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
       
    }//GEN-LAST:event_buttTeachLoginActionPerformed

    //Admin Login Button Function
    private void buttAdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttAdminLoginActionPerformed
        //String adminPassword = textAdminPassword.getText();
        //String adminEmail = textAdminEmail.getText();
        
        
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlCon = DriverManager.getConnection(dataCon,username,password);
            preState = sqlCon.prepareStatement("SELECT * FROM ResultsSystem.Administrator WHERE adminEmail = ? AND password = ?");
            preState.setString(1, textAdminEmail.getText());
            preState.setString(2, textAdminPassword.getText());
            resultSet = preState.executeQuery();
            
            if (resultSet.next())
                {
                    textAdminPassword.setText(null);
                    textAdminEmail.setText(null);
                    systemExit();

                   AdminInter interfaceAdmin = new AdminInter();
                    interfaceAdmin.setVisible(true);
                    interfaceAdmin.uploadDBStudentGrade();
                    interfaceAdmin.uploadDBStudentInfo();
                    interfaceAdmin.uploadDBTeacherInfo();
           
          //Need to create the teacher page and then add the login in material. 
                }
            else 
                {
                JOptionPane.showMessageDialog(null,"Invalid Login Details", "Login Error", JOptionPane.ERROR_MESSAGE);
                textTeachPassword.setText(null);
                textTeachEmail.setText(null);
                }
            
            }
       catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
       
    }//GEN-LAST:event_buttAdminLoginActionPerformed

    //Interface Variables & Settings
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttAdminExit;
    private javax.swing.JButton buttAdminLogin;
    private javax.swing.JButton buttAdminReset;
    private javax.swing.JButton buttTeachExit;
    private javax.swing.JButton buttTeachLogin;
    private javax.swing.JButton buttTeachReset;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labAdminEmail;
    private javax.swing.JLabel labAdminPassword;
    private javax.swing.JLabel labTeachEmail;
    private javax.swing.JLabel labTeachPassword;
    private javax.swing.JTextField textAdminEmail;
    private javax.swing.JPasswordField textAdminPassword;
    private javax.swing.JTextField textTeachEmail;
    private javax.swing.JPasswordField textTeachPassword;
    // End of variables declaration//GEN-END:variables

    private void systemExit()
    {
    WindowEvent winClosing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    }
            

}
