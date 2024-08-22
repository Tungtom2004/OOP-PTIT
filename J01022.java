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
public class J01022{
    static long F[] = new long[100]; 
    
    static int bin(int n,long k){
        if(n == 1) return 0; 
        if(n == 2) return 1; 
        if(k <= F[n-2]) return bin(n-2,k);
        return bin(n-1,k - F[n-2]); 
        
    }
    
    public static void main(String [] args){
        F[1] = F[2] = 1; 
        for(int i = 3;i < 93;i++) F[i] = F[i-1] + F[i-2]; 
        
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt();
        for(int q = 1;q <= t;q++){
            int n = sc.nextInt(); long k = sc.nextLong(); 
            System.out.println(bin(n,k)); 
        }
        
    }
}