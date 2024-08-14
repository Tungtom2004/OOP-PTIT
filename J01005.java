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

public class J01005{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt();
        for(int q = 1;q <= t;q++){
            double n = sc.nextDouble(), h = sc.nextDouble(); 
            for(double i = 1;i < n;i++){
                double p = i/n; 
                double dis = h * Math.sqrt(p); 
                System.out.printf("%.6f ",dis); 
            }
            System.out.println("");
        }
    }
}
    