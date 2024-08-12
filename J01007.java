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

public class J01007{
    static boolean checkfibo(long n){
        if(n == 0 || n == 1) return true; 
        long f1 = 1,f2 = 1,fn; 
        for(long i = 2;i <= 92;i++){
            fn = f1 +f2; 
            if(fn == n) return true;
            f2 = f1;
            f1 = fn; 
        }
        return false; 
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt(); 
        for(int i = 1;i <= t;i++){
            long n = sc.nextLong(); 
            if(checkfibo(n)) System.out.println("YES");
            else System.out.println("NO"); 
        }
    }
}