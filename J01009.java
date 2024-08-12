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

public class J01009 {
    static long factorial(long n){
        if(n == 0 || n == 1) return 1;
        return n * factorial(n - 1); 
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        long n = sc.nextLong(); 
        long sum = 0; 
        for(long i = 1;i <= n;i++){
            sum += factorial(i);
        }
        System.out.print(sum); 
    }
}