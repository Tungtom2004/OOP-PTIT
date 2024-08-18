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
public class J02106{
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int a[][] = new int[n+5][4]; 
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= 3;j++){
                a[i][j] = sc.nextInt(); 
            }
        }
        int count = 0; 
        for(int i = 1;i <= n;i++){
            int c1 = 0,c2 = 0;
            for(int j = 1;j <= 3;j++){
                if(a[i][j] == 1) c1++;
                else c2++; 
            }
            if(c1 > c2) count++; 
        }
        System.out.println(count); 
    }
}   