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
public class J01004 {
    static boolean checkPrime(int n){
        if(n < 2) return false;
        for(int i = 2;i <= Math.sqrt(n);i++){
            if(n % i == 0) return false;
        }
        return n > 1; 
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt(); 
        for(int i = 1;i <= t;i++){
            int n = sc.nextInt(); 
            if(checkPrime(n)) System.out.println("YES");
            else System.out.println("NO"); 
        }
    }
}