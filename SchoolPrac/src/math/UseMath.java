package math;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Navi
 */
public class UseMath {
    public static void main (String[] args){ 
        
        // mulitply the numbers 3 and 2 using both classes 
        
        // using the static method class 
        System.out.println("3 * 2 = " + MathCalc.multiply(3, 2));
        
        // using non static methods - have to create object 
        MathCalc2 mathy = new MathCalc2(3,2);  
        System.out.println("3 * 2 = " + mathy.mulitply()); 

        
    }
}
