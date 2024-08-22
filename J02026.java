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
public class J02026{
    
    static void Try(int i,int j,int k,int a[],String s){
        if(j == k){
            System.out.println(s); 
            return; 
            
        }
        for(int l = i; l < a.length;l++) Try(l+1,j+1,k,a,s + a[l] + " "); 
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt(); 
        for(int q = 1;q <= t;q++){
            int n = sc.nextInt(); 
            int k = sc.nextInt(); 
            int a[] = new int[n]; 
            for(int i = 0;i < n;i++) a[i] = sc.nextInt();
            Arrays.sort(a); 
            Try(0,0,k,a,""); 
        }
            
    }
}