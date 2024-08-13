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

public class J01017{
    
    static boolean check(long n){
        while(n >= 10){
            long n1 = n % 10; 
            long n2 = (n/10)%10; 
            if(Math.abs(n1 - n2) != 1) return false; 
            n /= 10; 
        }
        return true;
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt(); 
        while(q != 0){
            long n = sc.nextLong(); 
            if(check(n)) System.out.println("YES");
            else System.out.println("NO");
            q-=1; 
        }
    }
}