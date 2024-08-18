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
public class J02101{
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt(); 
        for(int q = 1;q <= t;q++){
            int n = sc.nextInt(); 
            int a[][] = new int[n+1][n+1];
            for(int i = 1;i <= n;i++){
                for(int j = 1;j <= n;j++){
                    a[i][j] = sc.nextInt(); 
                }
            }
            int i = 1;
            while(i <= n){
                if(i % 2 == 1){
                    for(int j = 1;j <= n;j++){
                        System.out.print(a[i][j] + " "); 
                    }
                }
                else{
                    for(int j = n;j >= 1;j--){
                        System.out.print(a[i][j] + " "); 
                    }
                }
                i++; 
            }
            System.out.println(""); 
        }
    }
}