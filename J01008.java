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

public class J01008{
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        for(int q = 1;q <= t;q++){
            int n = sc.nextInt(); 
            System.out.print("Test " + q + ": "); 
            for(int i = 2;i <= Math.sqrt(n);i++){
                int count = 0;
                if(n % i == 0){
                    while(n % i == 0){
                        count++; 
                        n /= i; 
                    }
                    System.out.print(i + "(" + count + ") "); 
                }
            }
            if(n != 1) System.out.println(n + "(" + 1 + ")");
            else System.out.println(""); 
        }
            
    }
}
    