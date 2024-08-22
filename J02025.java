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
public class J02025{
    static ArrayList<String> ans;
    
    static boolean nto(int n){
        if(n < 2) return false;
        for(int i = 2;i <= Math.sqrt(n);i++){
            if(n % i == 0) return false;
        }
        return n > 1; 
    }
    
    static void Try(int i,int []a,int sum,String s){
        if(nto(sum)){
            System.out.println(s);
        }
        for(int j = 0;j < i;j++) Try(j,a,sum + a[j],s + a[j] + " "); 
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt();
        for(int q = 0;q < t;q++){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0;i < n;i++) a[i] = sc.nextInt();
            Arrays.sort(a);
            Try(n,a,0,""); 
        }
            
    }
}