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
public class J02021{
    static int x[] = new int[55]; 
    static int n,k,count = 0;
    static void Try(int i){
        for(int j = x[i-1] + 1;j <= n - k +i;j++){
            x[i] = j;
            if(i == k){
                count++;
                for(int l = 1;l <= k;l++) System.out.print(x[l]); 
                System.out.print(" "); 
            }
            else Try(i+1); 
            
        }
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        n = sc.nextInt(); k = sc.nextInt(); 
        x[1] = 0; 
        Try(1); 
        System.out.println(""); 
        System.out.print("Tong cong co " + count + " to hop"); 
    }
}   