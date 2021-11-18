/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mibanco;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
//import mibanco.banco.*;

/**
 *
 * @author usuario
 */
public class bancoTest extends TestCase{
    
    public bancoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    public void testWithdraw(){
        
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testTransaction() throws Exception{
        banco b1=new banco(50);
        banco b2=new banco(0);
        System.out.println("transaction1");
        assertTrue(b1.withdraw(200));
        System.out.println("transaction2");
        assertTrue(b2.withdraw(350));
        System.out.println("transaction3");
        assertTrue(b1.deposit(100));
        System.out.println("transaction4");
        assertFalse(b2.withdraw(200));
        System.out.println("transaction5");
        assertTrue(b2.withdraw(150));
        System.out.println("transaction6");
        assertTrue(b1.withdraw(200));
        System.out.println("transaction7");
        assertTrue(b2.deposit(50));
        System.out.println("transaction8");
        assertFalse(b2.withdraw(100));
        
        assertEquals(b1.getfund(),-250);
        assertEquals(b2.getfund(),-450);
        
        
        
    }
}
