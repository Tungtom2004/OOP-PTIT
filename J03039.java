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
//sout: system.out.println("")   

public class J03039{
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt(); 
        for(int q = 1; q <= t;q++){
            BigInteger a = sc.nextBigInteger(), b = sc.nextBigInteger(); 
            BigInteger c = a.mod(b), d = b.mod(a); 
            if(c == BigInteger.ZERO || d == BigInteger.ZERO) System.out.println("YES");
            else System.out.println("NO");
            
        }
    }
}