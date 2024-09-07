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

public class J03031 {
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int t = Integer.parseInt(sc.nextLine()); 
        while(t --> 0){
            String s = sc.next(); 
            int k = sc.nextInt(); 
            HashSet<Character> se = new HashSet<>(); 
            for(int i = 0;i < s.length();i++) se.add(s.charAt(i)); 
            if(s.length() < 26) System.out.println("NO");
            else{
                if(26 - se.size() <= k) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}