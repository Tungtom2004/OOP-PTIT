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
//sout: system.out.println("")   

public class J03006{
    
    static boolean check1(String s, String k){
        return s.equals(k) == true; 
    }
    
    static boolean check2(String s){
        for(int i = 0;i < s.length();i++){
            int digit = Character.getNumericValue(s.charAt(i)); 
            if(digit % 2 != 0) return false;
        }
        return true; 
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int t = Integer.parseInt(sc.nextLine()); 
        for(int q = 1; q <= t;q++){
            String s = sc.nextLine(); 
            StringBuilder res = new StringBuilder(s); 
            res.reverse(); 
            String k = res.toString(); 
            if(check1(s,k) && check2(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}