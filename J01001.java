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

public class J01001 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 
        if(a <= 0 || b <= 0) System.out.print(0); 
        else{
            int P = (a + b)*2; 
            int S = a * b;
            System.out.print(P + " " + S); 
        }
        
    }
}