/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTEST1;
import java.util.*; 
public class Bai3 {
    
    static void solve1(String s){
        String word[] = s.trim().split("\\s+"); 
        int n = word.length; 
        StringBuilder res = new StringBuilder(); 
        res.append(Character.toUpperCase(word[n-1].charAt(0))).append(word[n-1].substring(1).toLowerCase()); 
        res.append(" "); 
        for(int i = 0;i < n - 1;i++){
            String x = word[i];
            if(x.length() > 0){
                res.append(Character.toUpperCase(x.charAt(0))).append(x.substring(1).toLowerCase()); 
            }
            res.append(" "); 
        }
        System.out.println(res.toString());
    }
    
    static void solve2(String s){
        String word[] = s.trim().split("\\s+"); 
        StringBuilder res = new StringBuilder();
        int n = word.length; 
        for(int i = 1;i < n;i++){
            String x = word[i];
            if(x.length() > 0){
                res.append(Character.toUpperCase(x.charAt(0))).append(x.substring(1).toLowerCase()); 
            }
            res.append(" "); 
        }
        res.append(Character.toUpperCase(word[0].charAt(0))).append(word[0].substring(1).toLowerCase()); 
        System.out.println(res.toString());
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt();
        String s; int x;
        while(t --> 0){
            x = sc.nextInt();
            sc.nextLine(); 
            s = sc.nextLine();
            if(x == 1) solve1(s);
            else solve2(s); 
        }
    }
}
