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
//sout: system.out.println("")   

public class J01021{
    
    static long binpow(long a,long b){
        long mod = 1000000007; 
        long res = 1;
        a %= mod;
        while(b != 0){
            if(b % 2 == 1){
                res *= (a % mod);
                res %= mod;
            }
            b /= 2;
            a *= (a % mod);
            a %= mod;
        }
        return res; 
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            long a = sc.nextLong(), b = sc.nextLong(); 
            if(a == 0 && b == 0) break; 
            else System.out.println(binpow(a,b)); 
        }
            
    }
}