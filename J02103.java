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
public class J02103{
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt(); 
        for(int q = 1;q <= t;q++){
            int n = sc.nextInt(), m = sc.nextInt();
            int a[][] = new int[n+5][m+5]; 
            for(int i = 0;i < n;i++){
                for(int j = 0;j < m;j++) a[i][j] = sc.nextInt(); 
            }
            
            int b[][] = new int[m+5][n+5]; 
            for(int i = 0;i < m;i++){
                for(int j = 0;j < n;j++){
                    b[i][j] = a[j][i]; 
                }
            }
            
            int c[][] = new int[n+5][n+5];
            for(int i = 0;i < n;i++){
                for(int j = 0;j < n;j++){
                    c[i][j] = 0;
                    for(int k = 0;k < m;k++){
                        c[i][j] += a[i][k]*b[k][j]; 
                    }
                }
            }
            System.out.println("Test " + q + ":"); 
            for(int i = 0;i < n;i++){
                for(int j = 0;j < n;j++) System.out.print(c[i][j] + " ");
                System.out.println(""); 
            }
            System.out.println(""); 
            
        }
        
    }
}