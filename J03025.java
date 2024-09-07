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

public class J03025 {
    
    static boolean check(String s){
        int l = 0, r = s.length()-1; 
        int count = 0;
        while(l <= r){
            if(s.charAt(l) != s.charAt(r)) count++;
            l++; r--; 
        }
        if(count == 1 || count == 0 && s.length() % 2 == 1) return true;
        return false;
    }
    
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in); 
        int t = Integer.parseInt(sc.nextLine()); 
        for(int q = 1; q <= t; q++){
            String s = sc.nextLine(); 
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}