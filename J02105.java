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
public class J02105{
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int a[][] = new int[n+5][n+5];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                a[i][j] = sc.nextInt(); 
            }
        }
        ArrayList<String>adj = new ArrayList<String>();
        for(int i = 0;i < n;i++){
            String tmp = ""; 
            for(int j = 0;j < n;j++){
                if(a[i][j] == 1) tmp = tmp + Integer.toString(j+1) + " "; 
            }  
            adj.add(tmp); 
        }
        for(int i = 0;i < n;i++){
            int p = i + 1; 
            System.out.print("List" + "(" + p + ")" + " = "); 
            System.out.println(adj.get(i)); 
        }
        
    }
}   