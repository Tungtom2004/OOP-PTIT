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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//sout: system.out.println("")   

public class J02102{
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                list.add(sc.nextInt()); 
            }
        }
        Collections.sort(list); 
        int pos = 0; 
        int a[][] = new int[n][n]; 
        int h1 = 0, h2 = n-1, c1 = 0, c2 = n - 1;
        while(h1 <= h2 && c1 <= c2){
            for(int i = c1; i <= c2;i++){
                a[h1][i] = list.get(pos); 
                pos++; 
            }
            h1++;
            for(int i = h1; i <= h2;i++){
                a[i][c2] = list.get(pos);
                pos++; 
            }
            --c2;
            if(c1 <= c2){
                for(int i = c2; i >= c1; i--){
                    a[h2][i] = list.get(pos);
                    pos++; 
                }
            }
            --h2;
            if(h1 <= h2){
                for(int i = h2; i >= h1; i--){
                    a[i][c1] = list.get(pos); 
                    pos++; 
                }
            }
            c1++; 
        }
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++) System.out.print(a[i][j] + " "); 
            System.out.println("");
        }
    }
}