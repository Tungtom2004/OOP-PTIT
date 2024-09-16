/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;
import java.util.*; 
public class J04004 {
     static long gcd(long a,long b){
        if(b == 0) return a;
        else return gcd(b,a % b);
    }
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong(), d = sc.nextLong(); 
        long tu = a*d + b*c, mau = b*d;
        long msc = gcd(tu,mau); 
        tu/=msc; mau/=msc; 
        System.out.println(tu + "/" + mau);
    }
}
