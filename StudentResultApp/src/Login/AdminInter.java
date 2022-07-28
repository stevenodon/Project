/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;
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
public class AdminInter extends javax.swing.JFrame {
    private static final String username = "root";
    private static final String password = "Pa55w0rd!";
    private static final String dataCon = "jdbc:mysql://localhost:3306/ResultsSystem";

    Connection sqlCon = null;
    PreparedStatement preState = null;
    ResultSet resultSet = null;
    
    int q, i;
    /**
     * Creates new form AdminInter
     */
    
//Creating the Admin User Interface & populate data
    public AdminInter() {
        initComponents();
    }
    
//Adds all students grades to adminstrators interface
    public void uploadDBStudentGrade () {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        sqlCon = DriverManager.getConnection(dataCon,username,password);
        preState = sqlCon.prepareStatement("SELECT * FROM ResultsSystem.StudentGrade");
        resultSet = preState.executeQuery();
        ResultSetMetaData stData = resultSet.getMetaData();
        
        q = stData.getColumnCount();
        DefaultTableModel RecordTable = (DefaultTableModel)jTable2.getModel();
        RecordTable.setRowCount (0);
        
        while (resultSet.next())
        {
            Vector columnData = new Vector();
            
            for (i = 1; i <= q; i++){
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

//Adds all students info to adminstrators interface
    public void uploadDBStudentInfo (){
    try {
       Class.forName("com.mysql.cj.jdbc.Driver");
       preState = sqlCon.prepareStatement("SELECT * FROM ResultsSystem.Student");
       resultSet = preState.executeQuery();
       ResultSetMetaData stData = resultSet.getMetaData();
       
       q =stData.getColumnCount();
       DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
       RecordTable.setRowCount (0);
       
       while (resultSet.next()){
           Vector columnData = new Vector();
           
           for(i=1;i<=q;i++){
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
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        addStudInfo = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTxtStudFirstName = new javax.swing.JTextField();
        jTxtStudAddress = new javax.swing.JTextField();
        jTxtStudLastName = new javax.swing.JTextField();
        jTxtStudConNum = new javax.swing.JTextField();
        jTxtStudNum = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        selectSub2 = new javax.swing.JComboBox<>();
        selectSub1 = new javax.swing.JComboBox<>();
        selectSub3 = new javax.swing.JComboBox<>();
        jTxtSub1Pre = new javax.swing.JTextField();
        jTxtSub2Pre = new javax.swing.JTextField();
        jTxtSub3Pre = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTxtSub4Pre = new javax.swing.JTextField();
        selectSub4 = new javax.swing.JComboBox<>();
        selectSub5 = new javax.swing.JComboBox<>();
        selectSub6 = new javax.swing.JComboBox<>();
        jTxtSub5Pre = new javax.swing.JTextField();
        jTxtSub6Pre = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1118, 675));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("AdminInter");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 1010, 350));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel2.setText("First Name");

        jLabel3.setText("Last Name");

        jLabel4.setText("Address");

        jLabel5.setText("Contact Number");

        jLabel6.setText("Student Number");

        addStudInfo.setText("Add");
        addStudInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudInfoActionPerformed(evt);
            }
        });

        jButton6.setText("Update");

        jButton7.setText("Delete");

        jTxtStudFirstName.setText("jTextField1");

        jTxtStudAddress.setText("jTextField2");

        jTxtStudLastName.setText("jTextField3");

        jTxtStudConNum.setText("jTextField4");

        jTxtStudNum.setText("jTextField5");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtStudAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtStudFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(183, 183, 183)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(257, 257, 257)
                                .addComponent(jLabel6))
                            .addComponent(jLabel5)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTxtStudLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(addStudInfo)
                                    .addGap(51, 51, 51)
                                    .addComponent(jButton6)
                                    .addGap(68, 68, 68)
                                    .addComponent(jButton7)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(285, 285, 285)
                                .addComponent(jTxtStudConNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jTxtStudNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jTxtStudFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtStudLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtStudNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jTxtStudAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtStudConNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addStudInfo)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 1010, 160));

        jTabbedPane1.addTab("Student List", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel9.setText("Subject 1");

        jLabel10.setText("Subject 2");

        jLabel11.setText("Subject 3");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        selectSub2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Subject ", "English", "Irish", "Mathematics", "Biology", "Physics", "Chemistry", "French", "German" }));

        selectSub1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Subject ", "English", "Irish", "Mathematics", "Biology", "Physics", "Chemistry", "French", "German", " " }));

        selectSub3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Subject ", "English", "Irish", "Mathematics", "Biology", "Physics", "Chemistry", "French", "German", " " }));

        jTxtSub1Pre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtSub1Pre.setText("0");

        jTxtSub2Pre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtSub2Pre.setText("0");

        jTxtSub3Pre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtSub3Pre.setText("0");

        jLabel17.setText("Subject 4");

        jLabel18.setText("Subject 5");

        jLabel19.setText("Subject 6");

        jTxtSub4Pre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtSub4Pre.setText("0");

        selectSub4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Subject ", "English", "Irish", "Mathematics", "Biology", "Physics", "Chemistry", "French", "German" }));

        selectSub5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Subject ", "English", "Irish", "Mathematics", "Biology", "Physics", "Chemistry", "French", "German" }));

        selectSub6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Subject ", "English", "Irish", "Mathematics", "Biology", "Physics", "Chemistry", "French", "German" }));

        jTxtSub5Pre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtSub5Pre.setText("0");
        jTxtSub5Pre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtSub5PreActionPerformed(evt);
            }
        });

        jTxtSub6Pre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtSub6Pre.setText("0");

        jButton8.setText("Update");

        jButton9.setText("Delete");

        jLabel20.setText("Student Number");

        jTextField9.setText("jTextField9");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(selectSub1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selectSub2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(selectSub3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(84, 84, 84)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTxtSub3Pre, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(jTxtSub2Pre)
                            .addComponent(jTxtSub1Pre))
                        .addGap(84, 84, 84)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectSub5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectSub4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectSub6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtSub6Pre, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(jTxtSub4Pre)
                            .addComponent(jTxtSub5Pre))
                        .addGap(110, 110, 110))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jButton1)
                .addGap(98, 98, 98)
                .addComponent(jButton8)
                .addGap(75, 75, 75)
                .addComponent(jButton9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(selectSub3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtSub3Pre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectSub1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtSub1Pre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(jTxtSub4Pre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectSub4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectSub2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtSub2Pre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(selectSub5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtSub5Pre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(selectSub6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtSub6Pre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1030, 230));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Student Number", "Subject 1", "% 1", "Subject 2", "% 2", "Subject 3", "% 3", "Subject 4", " % 4", "Subject 5", "% 5", "Subject 6", "% 6"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 1030, 300));

        jTabbedPane1.addTab("Grade", jPanel2);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Subject", "Teacher Number"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jPanel8.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1030, 330));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 1050, 350));

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("First Name");
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel13.setText("Teacher Number");
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        jLabel14.setText("Subject");
        jPanel9.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel15.setText("Last Name");
        jPanel9.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        jLabel16.setText("Password");
        jPanel9.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, -1, -1));

        jButton2.setText("Add");
        jPanel9.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        jButton3.setText("Update");
        jPanel9.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));

        jButton4.setText("Delete");
        jPanel9.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, -1, -1));

        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1050, 170));

        jTabbedPane1.addTab("Teacher List", jPanel7);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 1100, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addStudInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudInfoActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlCon = DriverManager.getConnection(dataCon,username,password);
            preState = sqlCon.prepareStatement("INSERT INTO ResultsSystem.Student(firstName, lastName, studentId, address, phone) VALUES (?,?,?,?,?)");
            preState.setString (1,jTxtStudFirstName.getText());
            preState.setString (2,jTxtStudLastName.getText());
            preState.setString (3,jTxtStudNum.getText());
            preState.setString (4,jTxtStudAddress.getText());
            preState.setString (5,jTxtStudConNum.getText());
            
            preState.executeUpdate();
            JOptionPane.showMessageDialog(this, "Student info updated");
            uploadDBStudentInfo();
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
    }//GEN-LAST:event_addStudInfoActionPerformed

    private void jTxtSub5PreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtSub5PreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtSub5PreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlCon = DriverManager.getConnection(dataCon,username, password);
            preState = sqlCon.prepareStatement("INSERT INTO ResultsSystem.StudentGrade (studentId, subjectOne, precentOne, subjectTwo, precentTwo, subjectThree, precentThree, subjectFour, precentFour, subjectFive, precentFive, subjectSix, precentSix) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            preState.setString (1, jTextField9.getText());
            preState.setString (2, (String) selectSub1.getSelectedItem());
            preState.setString (3, jTxtSub1Pre.getText());
            preState.setString (4, (String) selectSub2.getSelectedItem());
            preState.setString (5, jTxtSub2Pre.getText());
            preState.setString (6, (String) selectSub3.getSelectedItem());
            preState.setString (7, jTxtSub3Pre.getText());
            preState.setString (8, (String) selectSub4.getSelectedItem());
            preState.setString (9, jTxtSub4Pre.getText());
            preState.setString (10, (String) selectSub5.getSelectedItem());
            preState.setString (11, jTxtSub5Pre.getText());
            preState.setString (12, (String) selectSub6.getSelectedItem());
            preState.setString (13, jTxtSub6Pre.getText());
            
            preState.executeUpdate();
            JOptionPane.showMessageDialog(this, "Student result updated");
            uploadDBStudentGrade();
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
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminInter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminInter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminInter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminInter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminInter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudInfo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTxtStudAddress;
    private javax.swing.JTextField jTxtStudConNum;
    private javax.swing.JTextField jTxtStudFirstName;
    private javax.swing.JTextField jTxtStudLastName;
    private javax.swing.JTextField jTxtStudNum;
    private javax.swing.JTextField jTxtSub1Pre;
    private javax.swing.JTextField jTxtSub2Pre;
    private javax.swing.JTextField jTxtSub3Pre;
    private javax.swing.JTextField jTxtSub4Pre;
    private javax.swing.JTextField jTxtSub5Pre;
    private javax.swing.JTextField jTxtSub6Pre;
    private javax.swing.JComboBox<String> selectSub1;
    private javax.swing.JComboBox<String> selectSub2;
    private javax.swing.JComboBox<String> selectSub3;
    private javax.swing.JComboBox<String> selectSub4;
    private javax.swing.JComboBox<String> selectSub5;
    private javax.swing.JComboBox<String> selectSub6;
    // End of variables declaration//GEN-END:variables
}
