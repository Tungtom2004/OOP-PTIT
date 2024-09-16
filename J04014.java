/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;
import java.util.*;
public class J04014 {
    static long gcd(long a,long b){
        if(b == 0) return a;
        else return gcd(b,a % b); 
    }
            
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt(); 
        while(t --> 0){
            long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong(), d = sc.nextLong();
            long tu1 = a*d + b * c, mau1 = b*d; 
            tu1 /= gcd(tu1,mau1); mau1/=gcd((a*d + b*c),mau1); 
            tu1*=tu1; mau1*=mau1; 
            System.out.print(tu1 + "/" + mau1 + " ");
            long tu2 = tu1 * a * c, mau2 = mau1 * b * d; 
            tu2/=gcd(tu2,mau2); mau2 /= gcd((tu1 * a * c),mau2);
            System.out.println(tu2 + "/" + mau2);
        }
    }
}
