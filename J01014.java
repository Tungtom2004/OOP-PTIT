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

public class J01014{
    
    static long tsntMax(long n){
        long res = -1000000000; 
        for(long i = 2;i <= Math.sqrt(n);i++){
            if(n % i == 0){
                res = Math.max(res,i); 
                while(n % i == 0) n/=i; 
            }
        }
        if(n != 1) res = Math.max(res,n);
        return res;
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while(t != 0){
            long n = sc.nextLong(); 
            System.out.println(tsntMax(n));
            t--; 
        }
    }
}