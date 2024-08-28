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

public class J08020{
    
    static boolean check(String s){
        Stack <Character> st = new Stack<Character>(); 
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') st.push(s.charAt(i)); 
            else{
                if(st.empty()) return false;
                char x = st.peek();
                if(s.charAt(i) == ')' && x == '(') st.pop(); 
                else if(s.charAt(i) == ']' && x == '[') st.pop(); 
                else if(s.charAt(i) == '}' && x == '{') st.pop();    
            }
        }
        if(st.empty()) return true;
        else return false;
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int t = Integer.parseInt(sc.nextLine()); 
        for(int q = 1; q <= t;q++){
            String s = sc.nextLine(); 
            if(check(s)) System.out.println("YES");
            else System.out.println("NO"); 
        }
        
    }
}