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

public class J01006 {
    static long fibo(int n){
        if(n == 1) return 1;
        else if(n == 2) return 1;
        long f1 = 1, f2 = 1,fn = 0; 
        for(int i = 3;i <= n;i++){
            fn = f1 + f2;
            f2 = f1;
            f1 = fn; 
        }
        return fn; 
    }
    
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt(); 
        for(int i = 1;i <= t;i++){
            int n = sc.nextInt(); 
            System.out.println(fibo(n)); 
        }
    }
}