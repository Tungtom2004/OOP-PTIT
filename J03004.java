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

public class J03004 {
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int t = Integer.parseInt(sc.nextLine()); 
        for(int q = 1; q <= t;q++){
            String s = sc.nextLine();
            String[] word = s.split("\\s++"); 
            StringBuilder res = new StringBuilder(); 
            for(String x:word){
                if(x.length() > 0){
                    res.append(Character.toUpperCase(x.charAt(0))).append(x.substring(1).toLowerCase()); 
                }
                res.append(" "); 
            }
            System.out.println(res.toString());
        }
    }
}