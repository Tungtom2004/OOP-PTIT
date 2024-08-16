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
import java.util.HashSet; 
import java.util.Set; 
import java.util.SortedSet; 
import java.util.TreeSet; 
import java.util.ArrayList; 
import java.util.Collections; 

public class J02014{
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        for(int q = 1;q <= t; q++){
            int n = sc.nextInt(); 
            int a[] = new int[n+1];
            for(int i = 1;i <= n;i++) a[i] = sc.nextInt(); 
            int ok = 0; 
            int L[] = new int[n+1], R[] = new int[n+1];
            L[1] = a[1]; R[n] = a[n];
            for(int i = 2;i <= n;i++) L[i] = L[i - 1] + a[i];
            for(int i = n - 1;i >= 1;i--) R[i] = R[i + 1] + a[i]; 
            for(int i = 1;i <= n;i++){
                if(L[i] == R[i]){
                    ok = 1;
                    System.out.print(i);
                    break;
                }
            }
            if(ok == 0) System.out.print(-1);
            System.out.println(""); 
        }
                
    }
}