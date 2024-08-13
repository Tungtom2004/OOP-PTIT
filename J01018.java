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

public class J01018{
    
    static boolean check1(long n){
        long sum = 0;
        while(n != 0){
            sum += n % 10;
            n /= 10; 
        }
        return sum % 10 == 0; 
    }
    
    static boolean check2(long n){
        while(n >= 10){
            long d1 = n % 10, d2 = (n/10)%10; 
            if(Math.abs(d1 - d2) != 2) return false;
            n /= 10; 
        }
        return true;
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt(); 
        for(int i = 1;i <= t;i++){
            long n = sc.nextLong(); 
            if(check1(n) && check2(n)) System.out.println("YES");
            else System.out.println("NO"); 
        }
    }
}
    