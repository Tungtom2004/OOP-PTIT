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
//sout: system.out.println("")   

public class J01003 {
    static int division(int n){
        int count = 0; 
        for(int i = 1;i <= Math.sqrt(n);i++){
            if(n % i == 0){
                if(i % 2 == 0){
                    count++; 
                }
                if(i != (n/i) && (n/i) % 2 == 0) count++;
            }
        }
        return count; 
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0){
            int n = sc.nextInt();
            System.out.println(division(n)); 
            t-=1;
        }
    }
}