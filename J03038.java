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
//sout: system.out.println("")   

public class J03038{
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        String s = sc.nextLine();
        HashSet<Character> se = new HashSet<Character>(); 
        for(int i = 0;i < s.length();i++) se.add(s.charAt(i)); 
        System.out.println(se.size()); 
    }
}