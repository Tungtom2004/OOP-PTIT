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
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
//sout: system.out.println("")   

public class J02035{
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        for(int q = 1; q <= t; q++){
            int n = sc.nextInt();
            long a[] = new long[n], b[] = new long[n]; 
            for(int i = 0;i < n;i++) a[i] = b[i] = sc.nextLong();
            Arrays.sort(a);
            for(int i = 0;i < n;i++){
                if(b[i] == a[0]){
                    System.out.println(i);
                    break; 
                }
            }
        }
    }
}