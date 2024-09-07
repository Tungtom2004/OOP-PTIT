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

public class J03026 {
    
    static boolean check(String a, String b){
        if(a.length() != b.length()) return false;
        for(int i = 0;i < a.length();i++){
            if(a.charAt(i) != b.charAt(i)) return false;
        }
        return true; 
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int t = Integer.parseInt(sc.nextLine()); 
        for(int q = 1;q <= t;q++){
            String s1 = sc.nextLine(), s2 = sc.nextLine(); 
            if(!check(s1,s2)) System.out.println(Math.max(s1.length(),s2.length())); 
            else System.out.println("-1");
        }
    }
}