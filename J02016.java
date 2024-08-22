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

import java.util.*; 
public class J02016{ 
    
    static boolean check(long a[]){
        int n = a.length - 1; 
        for(int i = n;i >= 2;i--){
            int j = 0, k = i - 1; 
            while(j < k){
                long x = a[j] + a[k];
                if(a[i] == x) return true; 
                else if(a[i] > x) ++j; 
                else --k; 
            }
        }
        return false; 
    }
    
    static long sq(long x){
        return x*x; 
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt();
        for(int q = 1;q <= t;q++){
            int n = sc.nextInt();
            long a[] = new long[n];
            for(int i = 0;i < n;i++) a[i] = sq(sc.nextLong()); 
            if(check(a)) System.out.println("YES");
            else System.out.println("NO"); 
        }
    }
}