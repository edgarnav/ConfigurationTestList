package com.calculator.logic;

import java.util.StringTokenizer;

public class Calculator {  
    //method that returns maximum number  
    public static int add(int value_a, int value_b){  
        int result = value_a + value_b;
        return result;
    }

    public static int substraction(int value_a, int value_b){
    	int result = value_a - value_b;
        return result;
    }

    public static int multiplication(int value_a, int value_b) {
    	int result = value_a * value_b;
        return result;
    }
    
    public static int division(int value_a, int value_b) {
    	int result = value_a / value_b;
        return result;
    }
} 

