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

public class J03032 {
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int t = Integer.parseInt(sc.nextLine()); 
        for(int q = 1;q <= t;q++){
            String s = sc.nextLine();
            String word[] = s.split(" "); 
            for(int i = 0;i < word.length;i++){
                String tmp = word[i]; 
                for(int j = tmp.length()-1;j >= 0;j--){
                    System.out.print(tmp.charAt(j));
                }
                System.out.print(" ");
            }
            System.out.println("");
        }
            
    }
}