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

public class J02008{
    static long ucln(long a,long b){
        if(b == 0) return a; 
        else return ucln(b,a%b); 
    }
    
    static long lcm(long a,long b){
        return (a*b)/ucln(a,b); 
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt(); 
        for(int q = 1;q <= t;q++){
            long n = sc.nextInt(); 
            long res = 1;
            for(long i = 1;i <= n;i++) res = lcm(i,res); 
            System.out.println(res); 
        }
    }
}