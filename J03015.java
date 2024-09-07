/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasic;



//Scanner sc = new Scanner(System.in); DUNG KHI MUON NHAP DU LIEU
//alt enter
        
/**
 *
 * @author Admin78
 */
//char c = sc.nextLine().charAt(0);: 
import java.util.*; 
import java.math.*;
import java.util.TreeSet; 
//sout: system.out.println("")   

public class J03015 {
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        BigInteger a = sc.nextBigInteger(); 
            BigInteger b = sc.nextBigInteger(); 
            BigInteger c = a.subtract(b); 
            System.out.println(c);
    }
}