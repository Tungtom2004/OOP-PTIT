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

public class J02007{
    
    public static void main(String [] args){
        int cnt[] = new int[10005]; 
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt(); 
        for(int q = 1;q <= t;q++){
            int n = sc.nextInt(); 
            int a[] = new int[n];
            for(int i = 0;i < n;i++){
                a[i] = sc.nextInt(); 
                cnt[a[i]]++; 
            }
            System.out.println("Test " + q + ":"); 
            for(int i = 0;i < n;i++){
                if(cnt[a[i]] != 0){
                    System.out.println(a[i] + " xuat hien " + cnt[a[i]] + " lan ");
                    cnt[a[i]] = 0; 
                }
            }
        }
    }
}