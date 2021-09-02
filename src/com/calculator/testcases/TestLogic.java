package com.calculator.testcases;

import static org.junit.Assert.assertEquals;
import org.junit.After;  
import org.junit.AfterClass;  
import org.junit.Before;  
import org.junit.BeforeClass;  
import org.junit.Test;  

import com.calculator.logic.Calculator;
  
public class TestLogic {  
  
    @BeforeClass  
    public static void setUpBeforeClass() throws Exception {  
        System.out.println("Método ejecutado antes de todos los métodos");  
    }  
    
    @Before  
    public void setUp() throws Exception {  
        System.out.println("Método ejecutado siempre antes de cada método");  
    }  
  
    @Test  
    public void add_test(){  
        System.out.println("Test case add");  
        int expected = 10;
        int result = Calculator.add(3, 7);
        System.out.println(result);
        assertEquals(expected, result);
    }  
    
    @Test  
    public void substraction_test(){  
        System.out.println("Test case substraction");  
        int expected = 5;
        int result = Calculator.substraction(13, 8);
        System.out.println(result);
        assertEquals(expected, result);
    }
    
    @Test
    public void multiplication_test(){
        System.out.println("Test case multiplication");  
        int expected = 40;
        int result = Calculator.multiplication(5, 8);
        System.out.println(result);
        assertEquals(expected, result);
    }
    
    @Test
    public void division_test(){
        System.out.println("Test case division");  
        int expected = 17;
        int result = Calculator.division(85, 5);
        System.out.println(result);
        assertEquals(expected, result);
    }
    
    @After  
    public void tearDown() throws Exception {  
        System.out.println("Método ejecutado siempre después de cada método");  
    }  
  
    @AfterClass  
    public static void tearDownAfterClass() throws Exception {  
        System.out.println("Método ejecutado después de todos los métodos");  
    }  
  
}