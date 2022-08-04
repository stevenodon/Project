/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;
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
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.math.BigInteger;


/**
 *
 * @author stevenodonoghue
 */
public class AdminInter extends javax.swing.JFrame {
/*
    Connections to database - Fill in on all classes. 
*/
    private static final String username = "root";
    private static final String password = "Pa55w0rd!";
    private static final String dataCon = "jdbc:mysql://localhost:3306/ResultsSystem";
/*
    Constructors for database 
*/
    Connection sqlCon = null;
    PreparedStatement preState = null;
    ResultSet resultSet = null;
    
    int q, i;

/*
    Creates new form AdminInter
*/
    public AdminInter() {
        initComponents();
    }
    
/*
    Getting entries from Student table in database & add to app table
*/
    public void uploadDBStudentInfo (){
    try {
       Class.forName("com.mysql.cj.jdbc.Driver");
       preState = sqlCon.prepareStatement("SELECT * FROM ResultsSystem.Student");
       resultSet = preState.executeQuery();
       ResultSetMetaData stData = resultSet.getMetaData();
       
       q = stData.getColumnCount();
       DefaultTableModel RecordTable = (DefaultTableModel)jStudentListTable.getModel();
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
                                                
/*
    Getting entries from StudentGrade table in database & add to app table
*/
    public void uploadDBStudentGrade () {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        sqlCon = DriverManager.getConnection(dataCon,username,password);
        preState = sqlCon.prepareStatement("SELECT * FROM ResultsSystem.StudentGrade");
        resultSet = preState.executeQuery();
        ResultSetMetaData stData = resultSet.getMetaData();
        
        q = stData.getColumnCount();
        DefaultTableModel RecordTable = (DefaultTableModel)jStudGradeTable.getModel();
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
   
/*
    Getting entries from Teacher table in database & add to app table
*/   
    public void uploadDBTeacherInfo (){
    try {
       Class.forName("com.mysql.cj.jdbc.Driver");
       preState = sqlCon.prepareStatement("SELECT * FROM ResultsSystem.Teacher");
       resultSet = preState.executeQuery();
       ResultSetMetaData stData = resultSet.getMetaData();
       
       q =stData.getColumnCount();
       DefaultTableModel RecordTable = (DefaultTableModel)jTeacherListTable.getModel();
       RecordTable.setRowCount (0);
       
       while (resultSet.next()){
           Vector columnData = new Vector();
           
           for(i=1;i<=q;i++){
               columnData.add(resultSet.getString("teacherId"));
               columnData.add(resultSet.getString("firstName"));
               columnData.add(resultSet.getString("lastName"));
               columnData.add(resultSet.getString("subject"));
               columnData.add(resultSet.getString("email"));
               columnData.add(resultSet.getString("password"));
           }
        RecordTable.addRow(columnData);
        }
       }
    catch (Exception ex)
        {
        JOptionPane.showMessageDialog(null, ex);
        }
    }
    
//    
//NETBEANS MATERIAL - DO NOT EDIT
//     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TabbedPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jStudentListTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        addNewStudInfo = new javax.swing.JButton();
        updateStudInfo = new javax.swing.JButton();
        studDeleteButton = new javax.swing.JButton();
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
        addNewStudGrade = new javax.swing.JButton();
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
        updateStudGrade = new javax.swing.JButton();
        gradeDeleteButton = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jTxtStudGradeNum = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jStudGradeTable = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTeacherListTable = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        addNewTeach = new javax.swing.JButton();
        UpdateTeach = new javax.swing.JButton();
        teachDeleteButt = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTxtTeachNum = new javax.swing.JTextField();
        jTxtTeachFirstName = new javax.swing.JTextField();
        jTxtTeachLastName = new javax.swing.JTextField();
        jTxtTeachEmail = new javax.swing.JTextField();
        jTeachPassword = new javax.swing.JTextField();
        jComboTeachSub = new javax.swing.JComboBox<>();
        adminLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 255));
        setPreferredSize(new java.awt.Dimension(1118, 675));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Administator Interface");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        TabbedPane.setBackground(new java.awt.Color(153, 153, 255));
        TabbedPane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 4, true));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 4, true));

        jStudentListTable.setBackground(new java.awt.Color(204, 255, 255));
        jStudentListTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jStudentListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jStudentListTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jStudentListTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 1010, 340));

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 4, true));

        jLabel2.setText("First Name");

        jLabel3.setText("Last Name");

        jLabel4.setText("Address");

        jLabel5.setText("Contact Number");

        jLabel6.setText("Student Number");

        addNewStudInfo.setText("Add");
        addNewStudInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewStudInfoActionPerformed(evt);
            }
        });

        updateStudInfo.setText("Update");
        updateStudInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStudInfoActionPerformed(evt);
            }
        });

        studDeleteButton.setText("Delete");
        studDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studDeleteButtonActionPerformed(evt);
            }
        });

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
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jTxtStudFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel3)
                                .addGap(25, 25, 25)
                                .addComponent(jTxtStudLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTxtStudAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(addNewStudInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateStudInfo)
                        .addGap(18, 18, 18)
                        .addComponent(studDeleteButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtStudNum, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(jTxtStudConNum))
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
                    .addComponent(addNewStudInfo)
                    .addComponent(updateStudInfo)
                    .addComponent(studDeleteButton))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 1010, 180));

        TabbedPane.addTab("Student List", jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setForeground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 4, true));

        jLabel9.setText("Subject 1");

        jLabel10.setText("Subject 2");

        jLabel11.setText("Subject 3");

        addNewStudGrade.setText("Add");
        addNewStudGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewStudGradeActionPerformed(evt);
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

        jTxtSub6Pre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtSub6Pre.setText("0");

        updateStudGrade.setText("Update");
        updateStudGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStudGradeActionPerformed(evt);
            }
        });

        gradeDeleteButton.setText("Delete");
        gradeDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeDeleteButtonActionPerformed(evt);
            }
        });

        jLabel20.setText("Student Number");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selectSub2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(selectSub3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addComponent(selectSub1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtStudGradeNum, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTxtSub3Pre, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jTxtSub2Pre)
                    .addComponent(jTxtSub1Pre))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectSub6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectSub5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectSub4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTxtSub5Pre, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtSub4Pre, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtSub6Pre, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(addNewStudGrade)
                        .addGap(61, 61, 61)
                        .addComponent(updateStudGrade)
                        .addGap(52, 52, 52)
                        .addComponent(gradeDeleteButton)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jTxtStudGradeNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(selectSub4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtSub4Pre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectSub3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtSub3Pre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectSub1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtSub1Pre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectSub2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtSub2Pre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtSub5Pre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectSub5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectSub6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtSub6Pre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addNewStudGrade)
                            .addComponent(updateStudGrade)
                            .addComponent(gradeDeleteButton))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 1010, 180));

        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 4, true));

        jStudGradeTable.setBackground(new java.awt.Color(204, 255, 255));
        jStudGradeTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jStudGradeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jStudGradeTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jStudGradeTable);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 1010, 340));

        TabbedPane.addTab("Grade", jPanel2);

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 4, true));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTeacherListTable.setBackground(new java.awt.Color(153, 255, 255));
        jTeacherListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Teacher Number", "First Name", "Last Name", "Subject", "Email"
            }
        ));
        jTeacherListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTeacherListTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTeacherListTable);

        jPanel8.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 990, 320));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 1010, 340));

        jPanel9.setBackground(new java.awt.Color(204, 255, 255));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 4, true));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("First Name");
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        jLabel13.setText("Teacher Number");
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel14.setText("Subject");
        jPanel9.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel15.setText("Last Name");
        jPanel9.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, -1, -1));

        jLabel16.setText("Password");
        jPanel9.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, -1, -1));

        addNewTeach.setText("Add");
        addNewTeach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewTeachActionPerformed(evt);
            }
        });
        jPanel9.add(addNewTeach, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        UpdateTeach.setText("Update");
        UpdateTeach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateTeachActionPerformed(evt);
            }
        });
        jPanel9.add(UpdateTeach, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));

        teachDeleteButt.setText("Delete");
        teachDeleteButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teachDeleteButtActionPerformed(evt);
            }
        });
        jPanel9.add(teachDeleteButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, -1, -1));

        jLabel7.setText("Email");
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));
        jPanel9.add(jTxtTeachNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 140, -1));
        jPanel9.add(jTxtTeachFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 240, -1));
        jPanel9.add(jTxtTeachLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, 250, -1));
        jPanel9.add(jTxtTeachEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 240, -1));
        jPanel9.add(jTeachPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 250, -1));

        jComboTeachSub.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maths", "Irish", "English", "Physics", "Chemistry", "Biology ", "French ", "German" }));
        jPanel9.add(jComboTeachSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 170, -1));

        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 1010, 180));

        TabbedPane.addTab("Teacher List", jPanel7);

        getContentPane().add(TabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 1100, 620));

        adminLogout.setText("Logout");
        adminLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(adminLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

//
//AUTHOR MATERIAL
//
/*
    Add function to add a new student's details
*/
    private void addNewStudInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewStudInfoActionPerformed
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
    }//GEN-LAST:event_addNewStudInfoActionPerformed
/*
    Add function to add a student's grades
*/
    private void addNewStudGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewStudGradeActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlCon = DriverManager.getConnection(dataCon,username, password);
            preState = sqlCon.prepareStatement("INSERT INTO ResultsSystem.StudentGrade (studentId, subjectOne, precentOne, subjectTwo, precentTwo, subjectThree, precentThree, subjectFour, precentFour, subjectFive, precentFive, subjectSix, precentSix) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            preState.setString (1, jTxtStudGradeNum.getText());
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
    }//GEN-LAST:event_addNewStudGradeActionPerformed

/*
    Add function to add a new teacher's details
*/
    private void addNewTeachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewTeachActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlCon = DriverManager.getConnection(dataCon,username,password);
            preState = sqlCon.prepareStatement("INSERT INTO ResultsSystem.Teacher(teacherId, firstName, lastName, subject, email, password) VALUES (?,?,?,?,?,?)");
            preState.setString (1,jTxtTeachNum.getText());
            preState.setString (2,jTxtTeachFirstName.getText());
            preState.setString (3,jTxtTeachLastName.getText());
            preState.setString (4, (String) jComboTeachSub.getSelectedItem());
            preState.setString (5,jTxtTeachEmail.getText());
            preState.setString (6,jTeachPassword.getText());
            
            preState.executeUpdate();
            JOptionPane.showMessageDialog(this, "Teacher info updated");
            uploadDBTeacherInfo();
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
    }//GEN-LAST:event_addNewTeachActionPerformed

    
/*
    Update function to change a student's details.
*/
    private void updateStudInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStudInfoActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlCon = DriverManager.getConnection(dataCon,username,password);
            preState = sqlCon.prepareStatement("UPDATE ResultsSystem.Student SET firstName = ?, lastName = ?, studentId = ?, address = ?, phone = ? WHERE studentId = ?");
            preState.setString (1,jTxtStudFirstName.getText());
            preState.setString (2,jTxtStudLastName.getText());
            preState.setString (3,jTxtStudNum.getText());
            preState.setString (4,jTxtStudAddress.getText());
            preState.setString (5,jTxtStudConNum.getText());
            preState.setString (6,jTxtStudNum.getText());
            
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
    }//GEN-LAST:event_updateStudInfoActionPerformed

/*
    Populate textboxes when a row is clicked in the student table in app.
*/      
    private void jStudentListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jStudentListTableMouseClicked
       DefaultTableModel RecordTable = (DefaultTableModel)jStudentListTable.getModel();
       int SelectedRows = jStudentListTable.getSelectedRow();
       
       jTxtStudFirstName.setText(RecordTable.getValueAt(SelectedRows,0).toString());
       jTxtStudLastName.setText(RecordTable.getValueAt(SelectedRows,1).toString());
       jTxtStudNum.setText(RecordTable.getValueAt(SelectedRows,2).toString());
       jTxtStudAddress.setText(RecordTable.getValueAt(SelectedRows,3).toString());
       jTxtStudConNum.setText(RecordTable.getValueAt(SelectedRows,4).toString());
    }//GEN-LAST:event_jStudentListTableMouseClicked

/*
    Populate textboxes when a row is clicked in the student grade table in app.
*/     
    private void jStudGradeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jStudGradeTableMouseClicked
       DefaultTableModel RecordTable = (DefaultTableModel)jStudGradeTable.getModel();
       int SelectedRows = jStudGradeTable.getSelectedRow();
       
       jTxtStudGradeNum.setText(RecordTable.getValueAt(SelectedRows,0).toString());
       selectSub1.setSelectedItem(RecordTable.getValueAt(SelectedRows,1).toString());
       jTxtSub1Pre.setText(RecordTable.getValueAt(SelectedRows,2).toString());
       selectSub2.setSelectedItem(RecordTable.getValueAt(SelectedRows,3).toString());
       jTxtSub2Pre.setText(RecordTable.getValueAt(SelectedRows,4).toString());
       selectSub3.setSelectedItem(RecordTable.getValueAt(SelectedRows,5).toString());
       jTxtSub3Pre.setText(RecordTable.getValueAt(SelectedRows,6).toString());
       selectSub4.setSelectedItem(RecordTable.getValueAt(SelectedRows,7).toString());
       jTxtSub4Pre.setText(RecordTable.getValueAt(SelectedRows,8).toString());
       selectSub5.setSelectedItem(RecordTable.getValueAt(SelectedRows,9).toString());
       jTxtSub5Pre.setText(RecordTable.getValueAt(SelectedRows,10).toString());
       selectSub6.setSelectedItem(RecordTable.getValueAt(SelectedRows,11).toString());
       jTxtSub6Pre.setText(RecordTable.getValueAt(SelectedRows,12).toString());
       
    }//GEN-LAST:event_jStudGradeTableMouseClicked

/*
    Update function to change a teacher's details.
*/    
    private void UpdateTeachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateTeachActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlCon = DriverManager.getConnection(dataCon,username,password);
            preState = sqlCon.prepareStatement("UPDATE ResultsSystem.Teacher SET teacherId = ?, firstName = ?, lastName = ?, subject = ?, email = ?, password = ? WHERE teacherId = ?");
            preState.setString (1,jTxtTeachNum.getText());
            preState.setString (2,jTxtTeachFirstName.getText());
            preState.setString (3,jTxtTeachLastName.getText());
            preState.setString (4, (String) jComboTeachSub.getSelectedItem());
            preState.setString (5,jTxtTeachEmail.getText());
            preState.setString (6,jTeachPassword.getText());
            preState.setString (7,jTxtTeachNum.getText());
            
            preState.executeUpdate();
            JOptionPane.showMessageDialog(this, "Teacher info updated");
            uploadDBTeacherInfo();
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
    }//GEN-LAST:event_UpdateTeachActionPerformed

/*
    Update function to change subject and percentage of a student grade.
*/    
    private void updateStudGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStudGradeActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlCon = DriverManager.getConnection(dataCon,username,password);
            preState = sqlCon.prepareStatement("UPDATE ResultsSystem.StudentGrade SET studentId = ?, subjectOne = ?, precentOne = ?, subjectTwo = ?, precentTwo = ?, subjectThree = ?, precentThree = ?, subjectFour = ?, precentFour = ?, subjectFive = ?, precentFive = ?, subjectSix = ?, precentSix = ? WHERE studentId = ?");
            preState.setString (1, jTxtStudGradeNum.getText());
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
            preState.setString (14, jTxtStudGradeNum.getText());
            
            preState.executeUpdate();
            JOptionPane.showMessageDialog(this, "Student Grade updated info updated");
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
    }//GEN-LAST:event_updateStudGradeActionPerformed

/*
    Populate textboxes when a row is clicked on in teacher table.
*/    
    private void jTeacherListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTeacherListTableMouseClicked
       DefaultTableModel RecordTable = (DefaultTableModel)jTeacherListTable.getModel();
       int SelectedRows = jTeacherListTable.getSelectedRow();
       
       jTxtTeachNum.setText(RecordTable.getValueAt(SelectedRows,0).toString());
       jTxtTeachFirstName.setText(RecordTable.getValueAt(SelectedRows,1).toString());
       jTxtTeachLastName.setText(RecordTable.getValueAt(SelectedRows,2).toString());
       jComboTeachSub.setSelectedItem(RecordTable.getValueAt(SelectedRows,3).toString());
       jTxtTeachEmail.setText(RecordTable.getValueAt(SelectedRows,4).toString());
       jTeachPassword.setText(RecordTable.getValueAt(SelectedRows,5).toString());
    }//GEN-LAST:event_jTeacherListTableMouseClicked

/*
    Delete a student record from the system.
*/    
    private void studDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studDeleteButtonActionPerformed
        DefaultTableModel RecordTable = (DefaultTableModel)jStudentListTable.getModel();
        int SelectedRows = jStudentListTable.getSelectedRow();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
                sqlCon=DriverManager.getConnection(dataCon,username,password);
                    preState = sqlCon.prepareStatement("DELETE from Student WHERE studentId = ?");
                    preState.setString (1,jTxtStudNum.getText());
                    preState.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Student is deleted");
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
    }//GEN-LAST:event_studDeleteButtonActionPerformed

/*
    Delete a student's grades record from the system.
*/     
    private void gradeDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeDeleteButtonActionPerformed
        DefaultTableModel RecordTable = (DefaultTableModel)jStudGradeTable.getModel();
        int SelectedRows = jStudGradeTable.getSelectedRow();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
                sqlCon=DriverManager.getConnection(dataCon,username,password);
                    preState = sqlCon.prepareStatement("DELETE from StudentGrade WHERE studentId = ?");
                    preState.setString (1,jTxtStudGradeNum.getText());
                    preState.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Student Grade is deleted");
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
    }//GEN-LAST:event_gradeDeleteButtonActionPerformed

/*
    Delete a teacher record from the system.
*/     
    private void teachDeleteButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teachDeleteButtActionPerformed
        DefaultTableModel RecordTable = (DefaultTableModel)jTeacherListTable.getModel();
        int SelectedRows = jTeacherListTable.getSelectedRow();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
                sqlCon=DriverManager.getConnection(dataCon,username,password);
                    preState = sqlCon.prepareStatement("DELETE from Teacher WHERE teacherId = ?");
                    preState.setString (1,jTxtTeachNum.getText());
                    preState.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Teacher Info is deleted");
                    uploadDBTeacherInfo();                       
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
    }//GEN-LAST:event_teachDeleteButtActionPerformed

/*
   Function to return to login interfaces (Logout Button) 
*/     
    private void adminLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLogoutActionPerformed
        // TODO add your handling code here:
        Login returnLogin = new Login();
        returnLogin.setVisible(true);
        systemExitNewFrame();
    }//GEN-LAST:event_adminLogoutActionPerformed

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
    private javax.swing.JTabbedPane TabbedPane;
    private javax.swing.JButton UpdateTeach;
    private javax.swing.JButton addNewStudGrade;
    private javax.swing.JButton addNewStudInfo;
    private javax.swing.JButton addNewTeach;
    private javax.swing.JButton adminLogout;
    private javax.swing.JButton gradeDeleteButton;
    private javax.swing.JComboBox<String> jComboTeachSub;
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
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JTable jStudGradeTable;
    private javax.swing.JTable jStudentListTable;
    private javax.swing.JTextField jTeachPassword;
    private javax.swing.JTable jTeacherListTable;
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
    private javax.swing.JTextField jTxtTeachEmail;
    private javax.swing.JTextField jTxtTeachFirstName;
    private javax.swing.JTextField jTxtTeachLastName;
    private javax.swing.JTextField jTxtTeachNum;
    private javax.swing.JComboBox<String> selectSub1;
    private javax.swing.JComboBox<String> selectSub2;
    private javax.swing.JComboBox<String> selectSub3;
    private javax.swing.JComboBox<String> selectSub4;
    private javax.swing.JComboBox<String> selectSub5;
    private javax.swing.JComboBox<String> selectSub6;
    private javax.swing.JButton studDeleteButton;
    private javax.swing.JButton teachDeleteButt;
    private javax.swing.JButton updateStudGrade;
    private javax.swing.JButton updateStudInfo;
    // End of variables declaration//GEN-END:variables

//
//AUTHOR MATERIAL
//

/*public static String getHash(){
    StringBuilder pa = new StringBuilder();
    pa.append(toString(jTeachPassword.getText()));
    
    String passToChange = ;
    String generatePassword = null;
      try {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(passToChange.getBytes());
        byte [] bytes = md.digest();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bytes.length; i++){
            sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16). substring(1));
        }
        generatePassword = sb.toString();
        
      }
      catch (NoSuchAlgorithmException e) {
          e.printStackTrace();
      }
      return generatePassword;
    }*/
}
