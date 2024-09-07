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
//sout: system.out.println("")   

public class J04003 {
    
    static long gcd(long a,long b){
        if(b == 0) return a;
        else return gcd(b,a % b); 
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        long a = sc.nextLong(), b = sc.nextLong(); long c = a; 
        a/= gcd(a,b); b /= gcd(c,b); 
        System.out.println(a + "/" + b);
    }
}