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
import java.math.BigInteger; 

public class J02004{
    
    static boolean check(int a[]){
        int l = 0, r = a.length - 1; 
        while(l <= r){
            if(a[l] != a[r]) return false;
            l++; --r;
        }
        return true; 
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt(); 
        for(int q = 1;q <= t;q++){
            int n = sc.nextInt(); 
            int a[] = new int[n];
            for(int i = 0;i < n;i++){
                a[i] = sc.nextInt(); 
            }
            if(check(a)) System.out.println("YES"); 
            else System.out.println("NO");
        }
    }
}