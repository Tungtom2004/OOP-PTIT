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

public class J03010 {
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        Map<String,Integer> mp = new HashMap<>(); 
        int t = sc.nextInt(); sc.nextLine(); 
        for(int q = 1; q <= t;q++){
            String word[] = sc.nextLine().trim().toLowerCase().split("\\s++"); 
            int n = word.length; 
            StringBuilder res = new StringBuilder(); 
            res.append(word[n-1]); 
            for(int i = 0;i < n - 1;i++){
                res.append(word[i].charAt(0)); 
            }
            String email = res.toString(); 
            if(mp.containsKey(email)){
                int count = mp.get(email) + 1; 
                mp.put(email, count); 
                res.append(count); 
            }
            else mp.put(email, 1); 
            System.out.println(res + "@ptit.edu.vn");
        }
    }
}