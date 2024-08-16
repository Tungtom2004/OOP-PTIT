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

public class J02013{
    
    static void print(int a[],int dem){
        System.out.print("Buoc " + dem + ": "); 
        for(int i = 0;i < a.length;i++){
            System.out.print(a[i] + " "); 
        }
        System.out.println(""); 
    }
    
    static boolean check(int a[]){
        for(int i = 0;i < a.length - 1;i++){
            if(a[i] > a[i+1]) return false;
        }
        return true;
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int a[] = new int[n]; 
        for(int i = 0;i < n;i++) a[i] = sc.nextInt(); 
        int dem = 1; 
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n - i - 1;j++){
                if(a[j] > a[j+1]){
                    int tmp = a[j]; 
                    a[j] = a[j + 1];
                    a[j + 1] = tmp; 
                }
            }
            print(a,dem);
            dem++;
            if(check(a)) break; 
        }
                
    }
}