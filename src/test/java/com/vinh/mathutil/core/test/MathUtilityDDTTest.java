/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.vinh.mathutil.core.test;

import com.vinh.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author lamvinh
 */
public class MathUtilityDDTTest {
    // ta cần chuẩn bị bộ data để nhồi vào cái hàm qau 2 tham số đã chauwd sẳn 
    //kĩ thuật tách data kiểm thử ra khỏi câu lệnh so sánh 
    //để data ở riêng 1 chỗ, từ từ fill vào hàm so sánh 
    //kĩ thuật này là DDT data driven testing
    //data thường để ở amngr 2 chiều
    // 1 cái ở đầu vào n, 1 cái là đầu ramong đợi
    //và có nhiều cặp như thế
    //tên là tham số hóa kiểm thử
    
    public static Object[][]initData () {
        Object[][] dataSet = {{0,1},
            {1,1},
            {3,6},
            {4,24},
            {5,120}};
            return dataSet;
    }
    @ParameterizedTest
    @MethodSource("initData")
        public void verifyFactorialGivenRightArgument0ReturnOK(int n, long expected){
            assertEquals(expected, MathUtility.getFactorial(n));
        }
    
}
