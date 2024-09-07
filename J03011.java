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

public class J03011 {
    
    static BigInteger gcd(BigInteger a,BigInteger b){
         if(b == BigInteger.ZERO) return a;
         else return gcd(b,a.mod(b)); 
        
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt();
        for(int q = 1;q <= t;q++){
            BigInteger a = sc.nextBigInteger(); 
            BigInteger b = sc.nextBigInteger(); 
            System.out.println(gcd(a,b));
        }
    }
}