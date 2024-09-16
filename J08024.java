/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasic;
import java.util.*;
public class J08024 {
    static ArrayList<Integer> res = new ArrayList<>(); 
    static void Try(int i,int n,String s){
        res.add(Integer.parseInt(s)); 
        if(i == n) return;
        Try(i+1,n,s + "0"); 
        Try(i+1,n,s + "9"); 
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        Try(0,8,"9"); 
        Collections.sort(res);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            for(int x:res){
                if(x % n == 0){
                    System.out.println(x);
                    break; 
                }
            }
        }
    }
}
