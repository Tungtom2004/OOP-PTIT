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

public class J01010{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt(); 
        while(q != 0){
            long n = sc.nextLong(); 
            String t = "";
            int ok = 1; 
            while(n != 0){
                long digit = n % 10;
                if(digit == 0) t += "0"; 
                else if(digit == 1) t += "1";
                else if(digit == 8) t += "0";
                else if(digit == 9) t += "0";
                else{
                    ok = 0;
                    break; 
                }
                n /= 10; 
            }
            if(ok == 0) System.out.println("INVALID"); 
            else{
                String res = new StringBuilder(t).reverse().toString();
                if(res.length() > 1){
                    long num =  Long.valueOf(res);  
                    if(num == 0) System.out.println("INVALID"); 
                    else System.out.println(Long.valueOf(res)); 
                }
            }
            q-=1; 
        }
    }
}