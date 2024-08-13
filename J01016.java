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
//sout: system.out.println("")   

public class J01016{
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); 
        long count4 = 0, count7 = 0;
        while(n != 0){
            long num = n % 10;
            if(num == 4) count4++;
            else if(num == 7) count7++;
            n /= 10; 
        }
        if(count4 + count7 == 4 || count4 + count7 == 7) System.out.println("YES");
        else System.out.println("NO"); 
    }
}