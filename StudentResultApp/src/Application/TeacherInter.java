/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Application;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
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

/**
 *
 * @author stevenodonoghue
 */
public class TeacherInter extends javax.swing.JFrame {
/*
    Connections to database - Fill in on all classes. 
*/
    private static final String username = "";
    private static final String password = "";
    private static final String dataCon = "jdbc:mysql://localhost:3306/ResultsSystem";
/*
    Constructors for database 
*/
    Connection sqlConn = null;
    PreparedStatement preStatement = null;
    ResultSet resultSet = null;
/*
    Creates new form TeacherInter
*/
    public TeacherInter() {
        initComponents();
    }
/*
    Getting data from Student table in database & add to app table
*/    
    public void inputDBStudInfo (){
    try {
       Class.forName("com.mysql.cj.jdbc.Driver");
       sqlConn = DriverManager.getConnection(dataCon,username,password);
       preStatement = sqlConn.prepareStatement("SELECT * FROM ResultsSystem.Student");
       resultSet = preStatement.executeQuery();
       ResultSetMetaData stData = resultSet.getMetaData();
       
       int q= stData.getColumnCount();
       DefaultTableModel RecordTable = (DefaultTableModel)studentListTable2.getModel();
       RecordTable.setRowCount (0);
       
       while (resultSet.next()){
           Vector columnData = new Vector();
           
           for(int i=1;i<=q;i++){
               columnData.add(resultSet.getString("firstName"));
               columnData.add(resultSet.getString("lastName"));
               columnData.add(resultSet.getString("studentId"));
               columnData.add(resultSet.getString("address"));
               columnData.add(resultSet.getString("phone"));
           }
        RecordTable.addRow(columnData);
        }
       }
    catch (Exception ex)
        {
        JOptionPane.showMessageDialog(null, ex);
        }            
    }
/*
    Getting data from StudentGrade table in database & add to app table
*/     
    public void inputDBStudentGrade () {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        sqlConn = DriverManager.getConnection(dataCon,username,password);
        preStatement = sqlConn.prepareStatement("SELECT * FROM ResultsSystem.StudentGrade");
        resultSet = preStatement.executeQuery();
        ResultSetMetaData stData = resultSet.getMetaData();
        
        int q = stData.getColumnCount();
        DefaultTableModel RecordTable = (DefaultTableModel)studGradeTable2.getModel();
        RecordTable.setRowCount (0);
        
        while (resultSet.next())
        {
            Vector columnData = new Vector();
            
            for (int i = 1; i <= q; i++){
                columnData.add(resultSet.getString("studentId"));
                columnData.add(resultSet.getString("subjectOne"));
                columnData.add(resultSet.getInt("precentOne"));
                columnData.add(resultSet.getString("subjectTwo"));
                columnData.add(resultSet.getInt("precentTwo"));
                columnData.add(resultSet.getString("subjectThree"));
                columnData.add(resultSet.getInt("precentThree"));
                columnData.add(resultSet.getString("subjectFour"));
                columnData.add(resultSet.getInt("precentFour"));
                columnData.add(resultSet.getString("subjectFive"));
                columnData.add(resultSet.getInt("precentFive"));
                columnData.add(resultSet.getString("subjectSix"));
                columnData.add(resultSet.getInt("precentSix"));
            }
        RecordTable.addRow(columnData);
        }
        
    }
    catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
//    
//NETBEANS MATERIAL - DO NOT EDIT
// 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentListTable2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTxtStudFirstName = new javax.swing.JTextField();
        jTxtStudAddress = new javax.swing.JTextField();
        jTxtStudLastName = new javax.swing.JTextField();
        jTxtStudNum = new javax.swing.JTextField();
        jTxtStudConNum = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        selectSub1 = new javax.swing.JTextField();
        selectSub3 = new javax.swing.JTextField();
        selectSub4 = new javax.swing.JTextField();
        selectSub5 = new javax.swing.JTextField();
        selectSub6 = new javax.swing.JTextField();
        selectSub2 = new javax.swing.JTextField();
        jTxtSub2Pre = new javax.swing.JTextField();
        jTxtSub3Pre = new javax.swing.JTextField();
        jTxtSub1Pre = new javax.swing.JTextField();
        jTxtSub5Pre = new javax.swing.JTextField();
        jTxtSub6Pre = new javax.swing.JTextField();
        jTxtSub4Pre = new javax.swing.JTextField();
        updateGrade = new javax.swing.JButton();
        jTxtStudGradeNum = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        studGradeTable2 = new javax.swing.JTable();
        teachLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Teacher Interface");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, -1, 38));

        jTabbedPane1.setBackground(new java.awt.Color(204, 255, 255));
        jTabbedPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 4, true));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 4, true));

        studentListTable2.setBackground(new java.awt.Color(204, 204, 255));
        studentListTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Student Number", "Address", "Contact Number"
            }
        ));
        studentListTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentListTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(studentListTable2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 1010, 400));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 4, true));

        jLabel2.setText("First Name");

        jLabel3.setText("Last Name");

        jLabel4.setText("Address");

        jLabel5.setText("Contact Number");

        jLabel6.setText("Student Number");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTxtStudFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTxtStudLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTxtStudAddress))
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtStudNum, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtStudConNum)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jTxtStudFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtStudLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtStudNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jTxtStudAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtStudConNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 1010, 120));

        jTabbedPane1.addTab("Student List", jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 4, true));

        jLabel7.setText("Student Number");

        jLabel8.setText("Subject 4");

        jLabel9.setText("Subject 1");

        jLabel10.setText("Subject 2");

        jLabel11.setText("Subject 3");

        jLabel12.setText("Subject 5");

        jLabel13.setText("Subject 6");

        jTxtSub2Pre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtSub2Pre.setText("0");

        jTxtSub3Pre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtSub3Pre.setText("0");

        jTxtSub1Pre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtSub1Pre.setText("0");

        jTxtSub5Pre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtSub5Pre.setText("0");

        jTxtSub6Pre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtSub6Pre.setText("0");

        jTxtSub4Pre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtSub4Pre.setText("0");

        updateGrade.setText("Add Grade");
        updateGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateGradeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTxtStudGradeNum, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                    .addComponent(selectSub3)
                                    .addComponent(selectSub2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(selectSub1, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTxtSub2Pre)
                            .addComponent(jTxtSub3Pre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(jTxtSub1Pre, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(31, 31, 31))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(selectSub4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(selectSub6, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtSub6Pre, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtSub5Pre, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtSub4Pre, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(selectSub5, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jTxtSub4Pre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTxtStudGradeNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(selectSub4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12)
                    .addComponent(selectSub1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectSub5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtSub1Pre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtSub5Pre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13)
                    .addComponent(selectSub6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectSub2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtSub2Pre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtSub6Pre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(selectSub3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtSub3Pre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateGrade))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 1010, 180));

        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 4, true));

        studGradeTable2.setBackground(new java.awt.Color(204, 204, 255));
        studGradeTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Sudent Number", "Subject 1", "% 1", "Subject 2", "% 2", "Subject 3", "% 3", "Subject 4", "% 4", "Subject 5", "% 5", "Subject 6", "% 6"
            }
        ));
        studGradeTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studGradeTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(studGradeTable2);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 1010, 340));

        jTabbedPane1.addTab("Grade", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 1100, 630));

        teachLogout.setText("Logout");
        teachLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teachLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(teachLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//
//AUTHOR MATERIAL
//
/*
    Populate textboxes when a row is clicked on in student list table.
*/    
    private void studentListTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentListTable2MouseClicked
       DefaultTableModel RecordTable = (DefaultTableModel)studentListTable2.getModel();
       int SelectedRows = studentListTable2.getSelectedRow();
       
       jTxtStudFirstName.setText(RecordTable.getValueAt(SelectedRows,0).toString());
       jTxtStudLastName.setText(RecordTable.getValueAt(SelectedRows,1).toString());
       jTxtStudNum.setText(RecordTable.getValueAt(SelectedRows,2).toString());
       jTxtStudAddress.setText(RecordTable.getValueAt(SelectedRows,3).toString());
       jTxtStudConNum.setText(RecordTable.getValueAt(SelectedRows,4).toString());
    }//GEN-LAST:event_studentListTable2MouseClicked
/*
    Populate textboxes when a row is clicked on in student grade table.
*/  
    private void studGradeTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studGradeTable2MouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel)studGradeTable2.getModel();
       int SelectedRows = studGradeTable2.getSelectedRow();
       
       jTxtStudGradeNum.setText(RecordTable.getValueAt(SelectedRows,0).toString());
       selectSub1.setText(RecordTable.getValueAt(SelectedRows,1).toString());
       jTxtSub1Pre.setText(RecordTable.getValueAt(SelectedRows,2).toString());
       selectSub2.setText(RecordTable.getValueAt(SelectedRows,3).toString());
       jTxtSub2Pre.setText(RecordTable.getValueAt(SelectedRows,4).toString());
       selectSub3.setText(RecordTable.getValueAt(SelectedRows,5).toString());
       jTxtSub3Pre.setText(RecordTable.getValueAt(SelectedRows,6).toString());
       selectSub4.setText(RecordTable.getValueAt(SelectedRows,7).toString());
       jTxtSub4Pre.setText(RecordTable.getValueAt(SelectedRows,8).toString());
       selectSub5.setText(RecordTable.getValueAt(SelectedRows,9).toString());
       jTxtSub5Pre.setText(RecordTable.getValueAt(SelectedRows,10).toString());
       selectSub6.setText(RecordTable.getValueAt(SelectedRows,11).toString());
       jTxtSub6Pre.setText(RecordTable.getValueAt(SelectedRows,12).toString());
    }//GEN-LAST:event_studGradeTable2MouseClicked

/*
    Update function to change percentage of a student grade.
*/
    private void updateGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateGradeActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataCon,username,password);
            preStatement = sqlConn.prepareStatement("UPDATE ResultsSystem.StudentGrade SET precentOne = ?, precentTwo = ?, precentThree = ?, precentFour = ?, precentFive = ?, precentSix = ? WHERE studentId = ?");           
            preStatement.setString (1, jTxtSub1Pre.getText());           
            preStatement.setString (2, jTxtSub2Pre.getText());            
            preStatement.setString (3, jTxtSub3Pre.getText());            
            preStatement.setString (4, jTxtSub4Pre.getText());
            preStatement.setString (5, jTxtSub5Pre.getText());            
            preStatement.setString (6, jTxtSub6Pre.getText());
            preStatement.setString (7, jTxtStudGradeNum.getText());
            
            preStatement.executeUpdate();
            JOptionPane.showMessageDialog(this, "Student Grade updated info updated");
            inputDBStudentGrade();
        }
        catch (ClassNotFoundException ex) 
        {
            java.util.logging.Logger.getLogger(AdminInter.class.getName()).log
                    (java.util.logging.Level.SEVERE,null, ex);
        }
        catch (SQLException ex) 
        {
            java.util.logging.Logger.getLogger(AdminInter.class.getName()).log
                    (java.util.logging.Level.SEVERE,null, ex);
        }
    }//GEN-LAST:event_updateGradeActionPerformed
/*
   Function to return to login interfaces (Logout Button) 
*/  
    private void teachLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teachLogoutActionPerformed
        // TODO add your handling code here:
        LoginInter returnLogin = new LoginInter();
        returnLogin.setVisible(true);
        systemExitNewFrame();
    }//GEN-LAST:event_teachLogoutActionPerformed

/*
Function to close the pervious window when a new interface is created. 
*/    
    private void systemExitNewFrame()
        {
        WindowEvent winClosing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosing);
    }
//    
//NETBEANS MATERIAL - DO NOT EDIT
// 
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
            java.util.logging.Logger.getLogger(TeacherInter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherInter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherInter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherInter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherInter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTxtStudAddress;
    private javax.swing.JTextField jTxtStudConNum;
    private javax.swing.JTextField jTxtStudFirstName;
    private javax.swing.JTextField jTxtStudGradeNum;
    private javax.swing.JTextField jTxtStudLastName;
    private javax.swing.JTextField jTxtStudNum;
    private javax.swing.JTextField jTxtSub1Pre;
    private javax.swing.JTextField jTxtSub2Pre;
    private javax.swing.JTextField jTxtSub3Pre;
    private javax.swing.JTextField jTxtSub4Pre;
    private javax.swing.JTextField jTxtSub5Pre;
    private javax.swing.JTextField jTxtSub6Pre;
    private javax.swing.JTextField selectSub1;
    private javax.swing.JTextField selectSub2;
    private javax.swing.JTextField selectSub3;
    private javax.swing.JTextField selectSub4;
    private javax.swing.JTextField selectSub5;
    private javax.swing.JTextField selectSub6;
    private javax.swing.JTable studGradeTable2;
    private javax.swing.JTable studentListTable2;
    private javax.swing.JButton teachLogout;
    private javax.swing.JButton updateGrade;
    // End of variables declaration//GEN-END:variables
}
