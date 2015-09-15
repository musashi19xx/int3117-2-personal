/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phuongtrinhbac2;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Musashi
 */
public class Phuongtrinhbac2Test {
    
    public Phuongtrinhbac2Test() {
        
    }
    /**
     * Test of solve method, of class Phuongtrinhbac2.
     */
    @Test
    public void TestNghiemKep() {       
        double a = 1;
        double b = 2;
        double c = 1;
        double[] expectedResult = {-1,-1}; // x1 and x2
        double[] result = Phuongtrinhbac2.solve(a, b, c);
       	assertArrayEquals(expectedResult,result,0.0);     
    }
    @Test
    public void TestBinhThuong() {       
        double a = 1;
        double b = 2;
        double c = -3;
        double[] expectedResult = {-3,1}; // x1 and x2
        double[] result = Phuongtrinhbac2.solve(a, b, c);
       	assertArrayEquals(expectedResult,result,0.0);     
    }
    
    @Test
    public void TestVoNghiem() {       
        double a = 1;
        double b = 2;
        double c = 100;
        double[] expectedResult={0,0}; // x1 and x2
        double[] result = Phuongtrinhbac2.solve(a, b, c);
       	assertArrayEquals(expectedResult,result,0.0);
    }
    
    @Test
    public void TestaBang0() {        
        double a = 0;
        double b = 2;
        double c = 1;
        double[] expectedResult={-0.5,-0.5}; // x1 and x2
        double[] result = Phuongtrinhbac2.solve(a, b, c);
       	assertArrayEquals(expectedResult,result,0.0);
    }
    
    @Test
    public void TestbBang0() {       
        double a = 1;
        double b = 0;
        double c = -1;
        double[] expectedResult={-1,1}; // x1 and x2
        double[] result = Phuongtrinhbac2.solve(a, b, c);
       	assertArrayEquals(expectedResult,result,0.0);
    }
    
    @Test
    public void TestcBang0() {       
        double a = 1;
        double b = 1;
        double c = 0;
        double[] expectedResult={-1,0}; // x1 and x2
        double[] result = Phuongtrinhbac2.solve(a, b, c);
       	assertArrayEquals(expectedResult,result,0.0);
    }
    @Test
    public void TestabBang0() {       
        double a = 0;
        double b = 0;
        double c = 1;
        double[] expectedResult={0,0}; // x1 and x2
        double[] result = Phuongtrinhbac2.solve(a, b, c);
       	assertArrayEquals(expectedResult,result,0.0);
    }
    @Test
    public void TestacBang0() {        
        double a = 0;
        double b = 1;
        double c = 0;
        double[] expectedResult={0,0}; // x1 and x2
        double[] result = Phuongtrinhbac2.solve(a, b, c);
       	assertArrayEquals(expectedResult,result,0.0);
    }
    
    @Test
    public void TestbcBang0() {       
        double a = 1;
        double b = 0;
        double c = 0;
        double[] expectedResult={0,0}; // x1 and x2
        double[] result = Phuongtrinhbac2.solve(a, b, c);
       	assertArrayEquals(expectedResult,result,0.0);
    }
    @Test
    public void TestabcBang0() { 
        double a = 0;
        double b = 0;
        double c = 0;
        double[] expectedResult={0,0}; // x1 and x2
        double[] result = Phuongtrinhbac2.solve(a, b, c);
       	assertArrayEquals(expectedResult,result,0.0);
    }
    
}