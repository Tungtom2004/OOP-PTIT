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

public class J01024{
    
    static boolean check(int n){
            while(n != 0){
                int num = n % 10; 
                if(num != 0 && num != 1 && num != 2) return false;
                n /= 10; 
            }
            return true;
        }
    
    
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt(); 
        for(int i = 1;i <= t;i++){
            int n = sc.nextInt(); 
            if(check(n)) System.out.println("YES");
            else System.out.println("NO"); 
        }
    }
}
    