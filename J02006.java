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

public class J03033{
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(), m = sc.nextInt();
        int a[] = new int[n], b[] = new int[m];
        for(int i = 0;i < n;i++) a[i] = sc.nextInt(); 
        for(int i = 0;i < m;i++) b[i] = sc.nextInt(); 
        SortedSet<Integer> s1 = new TreeSet<Integer>(); 
        SortedSet<Integer> s2 = new TreeSet<Integer>(); 
        for(int i = 0;i < n;i++) s1.add(a[i]);
        for(int i = 0;i < m;i++) s2.add(b[i]);
        SortedSet<Integer>union = new TreeSet<Integer>(s1); 
        union.addAll(s2); 
        for(int i: union) System.out.print(i + " "); 
    }
}