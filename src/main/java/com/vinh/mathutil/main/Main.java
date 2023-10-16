/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.vinh.mathutil.main;

import com.vinh.mathutil.core.MathUtility;

/**
 *
 * @author lamvinh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 5;
        long expected = 5;
        long actual = MathUtility.getFactorial(n);
        System.out.println(n + "! -> expected: " + expected + " | actual: " + actual);
    }
    
}
