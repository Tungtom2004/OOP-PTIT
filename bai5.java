/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTEST1;
import java.util.*;
public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        TreeSet<String> se = new TreeSet<>(); 
        String tmp = ""; 
        for(int i = 0;i < s.length()-2;i+=2){
            tmp = tmp + s.charAt(i) + s.charAt(i+1); 
            se.add(tmp);
            tmp = ""; 
        }
        for(String x:se){
            System.out.print(x + " ");
        }
    }
}
