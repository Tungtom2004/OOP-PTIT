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
import java.util.*;
import java.io.*;
public class J02028{
    
    static boolean check(long a[],long k){
        int n = a.length; 
        Map<Long, Integer> mp = new HashMap<Long,Integer>(); 
        long sum = 0;
        for(int r = 0; r < n; r++){
            sum += a[r];
            if(sum == k) return true; // NEU TONG = K RETURN TRUE LUON
            if(mp.containsKey(sum - k)) return true; // KIEM TRA XEM TRUOC DO CO TONG NAO = SUM - K CHUA, NEU CO RETURN TRUE
            mp.put(sum,r); 
        }
        return false;
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt();
        for(int q = 1;q <= t;q++){
            int n = sc.nextInt(); long k = sc.nextLong();
            long a[] = new long[n];
            for(int i = 0;i < n;i++) a[i] = sc.nextLong(); 
            if(check(a,k)) System.out.println("YES");
            else System.out.println("NO"); 
                    
        }
            
    }
}