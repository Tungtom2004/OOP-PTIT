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

public class J03007 {
    static boolean check(String s, String k){
        if(s.charAt(0) == '8' && s.charAt(s.length()-1) == '8' && s.equals(k)){
            long sum = 0; 
            for(int i = 0;i < s.length();i++){
                int digit = Character.getNumericValue(s.charAt(i)); 
                sum += digit;
            }
            if(sum % 10 == 0) return true;
            else return false;
        }
        else return false; 
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int t = Integer.parseInt(sc.nextLine()); 
        for(int q = 1; q <= t;q++){
            String s = sc.nextLine(); 
            StringBuilder res = new StringBuilder(s); 
            res.reverse(); 
            String k = res.toString(); 
            if (check(s,k)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}