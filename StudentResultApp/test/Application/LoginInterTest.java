/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Application;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.sql.SQLException;
//import Application.LoginInter;

/**
 *
 * @author stevenodonoghue
 */
public class LoginInterTest {
    
    public LoginInterTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class LoginInter.
     */
    @Test
    public void testMain (){
        try{
        System.out.println("main");
        String[] args = null;
        LoginInter.main(args);
        LoginInter LoginInterTest = new LoginInter();
        LoginInterTest.preState.setString(1,"DROP TABLE");
        String expResult = "DROP TABLE";
        String result = "DROP TABLE";
        assertEquals(expResult,result);
        fail("The test case is a prototype.");
        }
        catch (SQLException ex) 
        {
            java.util.logging.Logger.getLogger(AdminInter.class.getName()).log
                    (java.util.logging.Level.SEVERE,null, ex);
        }
    }
    
}
