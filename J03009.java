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

public class J01001 {
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int t = Integer.parseInt(sc.nextLine()); 
        for(int q = 1; q <= t;q++){
            String s1 = sc.nextLine(), s2 = sc.nextLine(); 
            TreeSet<String> a = new TreeSet<>(); 
            TreeSet<String> b = new TreeSet<>();
            String[] word1 = s1.split(" "); 
            String[] word2 = s2.split(" "); 
            for(String x:word1) a.add(x); 
            for(String x:word2) b.add(x); 
            for(String x:a){
                if(!b.contains(x)) System.out.print(x + " ");
            }
            System.out.println("");
        }
    }
}