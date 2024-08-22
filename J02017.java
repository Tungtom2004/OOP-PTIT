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
public class J02017{
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        int a[] = new int[n]; 
        Stack<Integer>st = new Stack<Integer>();
        for(int i = 0;i < n;i++) a[i] = sc.nextInt();
        for(int i = 0;i < n;i++){
            if(st.empty()) st.push(a[i]);
            else{
                int x = st.peek(); 
                if((x + a[i]) % 2 == 0) st.pop();
                else st.push(a[i]); 
            }
        }
        System.out.println(st.size()); 
            
    }
}