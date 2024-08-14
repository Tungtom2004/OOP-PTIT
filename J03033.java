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

import java.util.Scanner; 
import java.math.BigInteger; 

public class J03033{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt(); 
        for(int i = 1;i <= t;i++){
            BigInteger a = sc.nextBigInteger(), b = sc.nextBigInteger(); 
            BigInteger GCD = a.gcd(b); 
            BigInteger LCM = (a.multiply(b)).divide(GCD); 
            System.out.println(LCM); 
        }
        
    }
}