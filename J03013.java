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

public class J03013 {
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt();
        for(int q = 1;q <= t;q++){
            BigInteger a = sc.nextBigInteger(); 
            BigInteger b = sc.nextBigInteger(); 
            int ans = Math.max(a.toString().length(),b.toString().length()); 
            String c = a.subtract(b).abs().toString(); 
            while(c.length() < ans) c = "0" + c; 
            System.out.println(c);
        }
    }
}