/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;
import java.util.*;
public class J04008 {
    private double d1,d2,d3;
    J04008(double d1, double d2, double d3){
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    
    public double P(){
        return d1 + d2 + d3; 
    }
    
    public String toString(){
        return String.format("%.3f",P()); 
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt(); 
        while(t --> 0){
            double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble(), d = sc.nextDouble(), e = sc.nextDouble(), f = sc.nextDouble(); 
            double d1 = Math.sqrt((c - a)*(c-a) + (b-d)*(b-d)), d2 = Math.sqrt((e - a)*(e - a) + (f - b)*(f - b)), d3 = Math.sqrt((e-c)*(e-c) + (f-d)*(f-d)); 
            if(d1 + d2 <= d3 || d2 + d3 <= d1 || d1 + d3 <= d2) System.out.println("INVALID");
            else{
                J04008 p = new J04008(d1,d2,d3); 
                System.out.println(p);
            }
        }
    }
}
