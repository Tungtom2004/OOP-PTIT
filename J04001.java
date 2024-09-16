/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author Admin
 */
import java.util.*;
public class J04001 {
    public double x; 
    public double y; 
    
    public void dis(){
        double res = Math.sqrt(x + y); 
        System.out.printf("%.4f",res);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt();
        while(t --> 0){
            double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble(), d = sc.nextDouble(); 
            J04001 p = new J04001(); 
            p.x = (c-a)*(c-a); p.y = (b-d)*(b-d); 
            p.dis();
            System.out.println("");
        }
    }
}
