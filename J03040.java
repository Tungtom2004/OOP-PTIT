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
import java.util.HashSet; 
//sout: system.out.println("")   

public class J03040 {
    
    static boolean check1(String s){
        for(int i = 0;i < s.length()-1;i++){
            if(s.charAt(i) >= s.charAt(i+1)) return false;
        }
        return true; 
    }
    
    static boolean check2(String s){
        for(int i = 0;i < s.length()-1;i++){
            if(s.charAt(i) != s.charAt(i+1)) return false;
        }
        return true; 
    }
    
    static boolean check3(String s){
        if((s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2)) && (s.charAt(3) == s.charAt(4))) return true;
        else return false; 
    }
    
    static boolean check4(String s){
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) != '6' && s.charAt(i) != '8') return false;
        }
        return true; 
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int t = Integer.parseInt(sc.nextLine()); 
        for(int q = 1;q <= t;q++){
            String s = sc.nextLine(); 
            String tmp = ""; 
            tmp += s.charAt(5); 
            tmp += s.charAt(6); 
            tmp += s.charAt(7); 
            tmp += s.charAt(9); 
            tmp += s.charAt(10); 
            if(check1(tmp) || check2(tmp) || check3(tmp) || check4(tmp)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}