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

public class J03027 {
    
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in); 
            String s = sc.nextLine(); 
            Stack<Character> st = new Stack<>(); 
            for(int i = 0;i < s.length();i++){
                if(st.empty()) st.add(s.charAt(i));
                else{
                    int k = 0; 
                    while(!st.empty() && st.peek() == s.charAt(i)){
                        k++;
                        st.pop(); 
                    }
                    if(k == 0) st.add(s.charAt(i)); 
                }
            }
            
            String res = ""; 
            while(!st.empty()){
                res += st.peek(); 
                st.pop(); 
            }
            if(res.length() == 0) System.out.println("Empty String");
            else{
                for(int i = res.length()-1;i >= 0;i--){
                    System.out.print(res.charAt(i));
                }
            }
    }
}