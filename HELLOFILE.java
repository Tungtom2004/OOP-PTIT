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
import java.io.File; 
import java.io.FileNotFoundException;

public class HELLOFILE{
    public static void main(String [] args){
        File file = new File("Hello.txt"); 
        try{
            Scanner scaner = new Scanner(file); 
            while(scaner.hasNextLine()){
                System.out.println(scaner.nextLine());
            }
            scaner.close(); 
        }catch(FileNotFoundException e){
            
        }  
    }
}