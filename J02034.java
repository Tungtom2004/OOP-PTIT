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

import java.util.Scanner; 
public class J02034{
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int cnt = 0,pos = 0;
        for(int i = 0;i < n;i++){
            int x = sc.nextInt();
            if(x == pos+1){
                pos = x;
                continue; 
            }
            else{
                cnt++; 
                for(int j = pos+1;j < x;j++) System.out.println(j); 
                pos = x; 
            }
        }
        if(cnt == 0) System.out.println("Excellent!"); 
    }
}   