/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author Admin
 */
import java.util.*; 
public class J04015{
    
    static class Teacher{
        private String name, position; 
        private long salary,income = 0, total = 0;
        private int id; 
        Teacher(String name, String position,long salary){
            this.name = name;
            this.position = position; 
            this.salary = salary; 
            this.id = Integer.valueOf(position.substring(2,4)); 
            this.total = 0; 
            this.income = 0; 
        }
        
        public void solve(){
            
            if(this.position.substring(0,2) == "HT"){
                this.income = 2000000; 
                this.total = this.salary * this.id + this.income; 
            }
            
            else if(this.position.substring(0,2) == "HP"){
                this.income = 900000; 
                this.total = this.salary * this.id + this.income; 
            }
            
            else if(this.position.substring(0,2) == "GV"){
                this.income = 500000; 
                this.total = this.salary * this.id + this.income; 
            }
        }
        
        
        public String toString(){
            solve(); 
            return this.position + " " + this.name + " " + this.id + " " + this.income + " " + this.total; 
        }
        
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String position = sc.next(); 
        sc.nextLine(); 
        String name = sc.nextLine(); 
        long salary = sc.nextLong(); 
        Teacher x = new Teacher(name,position,salary); 
        System.out.println(x);
    }
    
}
