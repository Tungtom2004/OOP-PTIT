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

public class J02037 {
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt(); sc.nextLine(); 
        for(int q = 1; q <= t;q++){
            String num[] = sc.nextLine().trim().split("\\s++"); 
            int chan = 0, le = 0;
            for(int i = 0;i < num.length;i++){
                int x = Integer.parseInt(num[i]); 
                if(x % 2 == 0) chan++;
                else le++; 
            }
            if((num.length % 2 == 0 && chan > le) || (num.length % 2 != 0 && le > chan)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}