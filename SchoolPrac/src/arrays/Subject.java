/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CLLB19
 */
public class Subject {
    private int[] arr = new int[150]; 
    private int size; 
    
    public Subject(){ 
        size = 0; 
        try { 
            Scanner sc = new Scanner(new File("C:\\Users\\CLLB19\\Documents\\NetBeansProjects\\SchoolPrac\\SchoolPrac\\src\\arrays\\Marks.txt"));
            while(sc.hasNext()){ 
                arr[size] = sc.nextInt(); 
                size++; 
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("The file was not found: " + ex);
        }
        
    }
    
    public void SortArr(){ 
        
        
        for(int currentPos = 0; currentPos < size; currentPos++){ 
             int lowestPos = currentPos; 
          
   
            for(int i = currentPos; i < size; i++){ 
              
                if(arr[i] < arr[lowestPos]){ 
                     lowestPos = i; 
                } 
               
            }
                 int temp = arr[lowestPos]; 
                arr[lowestPos] = arr[currentPos]; 
                arr[currentPos] = temp;
        }
    }
    
    public void PrintArr(){ 
    
        for(int i = 0; i < size; i++)
            System.out.print(arr[i]+" ");
        
        System.out.println("");
}
}
