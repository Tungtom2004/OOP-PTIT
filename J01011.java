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

public class J01011 {
    static long gcd(long a,long b){
        while(b != 0){
            long tmp = a % b; 
            a = b;
            b = tmp; 
        }
        return a; 
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while(t != 0){
            long a = sc.nextLong(),b = sc.nextLong();
            long ucln = gcd(a,b),bcnn = (a * b)/gcd(a,b);
            System.out.println(bcnn + " " + ucln);
            t-=1; 
        }
    }
}