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

public class J02012{
    
    static void print(ArrayList<Integer>a,int dem){
        System.out.print("Buoc " + dem + ": ");
        for(int x:a) System.out.print(x + " ");
        System.out.println(""); 
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int dem = 0; 
        ArrayList<Integer> res = new ArrayList<Integer>(); 
        for(int i = 0;i < n;i++){
            int x = sc.nextInt(); 
            res.add(x);
            Collections.sort(res); 
            print(res,dem); 
            dem++; 
        }
                
    }
}