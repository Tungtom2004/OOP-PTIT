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
import java.math.*;
import java.util.TreeSet; 
//sout: system.out.println("")   

public class J01013 {
    static long prime[] = new long[2000005];
    static void sang(){
        for(int i = 0;i < 2000001;i++){
            prime[i] = 0;
            int ok = 1;
            for(int j = 2;j <= (int)Math.sqrt(i);j++){
                if(i % j == 0){
                    prime[i] = prime[j] + prime[i/j];
                    ok = 0;
                    break; 
                }
            }
            if(ok == 1) prime[i] = i;
        }
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt(); 
        long sum = 0; 
        sang(); 
        for(int q = 1; q <= t;q++){
            sum += prime[sc.nextInt()]; 
        }
        System.out.println(sum);
        
    }
}