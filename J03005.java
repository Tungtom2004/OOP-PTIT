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

public class J03005 {
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int t = Integer.parseInt(sc.nextLine()); 
        for(int q = 1; q <= t;q++){
            String s = sc.nextLine().trim(); 
            String[] word = s.split("\\s++"); 
            StringBuilder res = new StringBuilder();
            for(int i = 1;i < word.length;i++){
                String tmp = word[i];
                if(tmp.length() > 0){
                    res.append(Character.toUpperCase(tmp.charAt(0))).append(tmp.substring(1).toLowerCase()); 
                }
                res.append(" "); 
            }
            res.deleteCharAt(res.length()-1);
            System.out.println(res.toString() + ", " + word[0].toUpperCase());
        }
    }
}