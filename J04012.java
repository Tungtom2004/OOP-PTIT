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
public class J04012 {
    
    static class nhanVien{
        private String name,chucVu,id; 
        private double luong, ngayCong;
        private double luongThang,phuCap,thuNhap,thuong; 
        nhanVien(String name,double luong, double ngayCong, String chucVu){
            this.name = name;
            this.luong = luong;
            this.ngayCong = ngayCong;
            this.chucVu = chucVu;
            this.id = "NV01"; 
            this.luongThang = 0; 
            this.phuCap = 0; 
            this.thuNhap = 0; 
            this.thuong = 0; 
        }
        
        public void solve(){
            this.luongThang = this.luong * this.ngayCong; 
            if(this.ngayCong > 25) this.thuong = 0.2 * this.luongThang; 
            else if(this.ngayCong >= 22 && this.ngayCong <= 25) this.thuong = 0.1*this.luongThang; 
            else this.thuong = 0; 
            
            if(this.chucVu.equals("GD")) this.phuCap = 250000; 
            else if(this.chucVu.equals("PGD")) this.phuCap = 200000; 
            else if(this.chucVu.equals("TP")) this.phuCap = 180000; 
            else if(this.chucVu.equals("NV")) this.phuCap = 150000; 
            this.thuNhap = (int)this.luongThang + this.thuong + this.phuCap; 
        }
        public String toString(){
            solve(); 
            return this.id + " " + this.name + " " + (int)this.luongThang + " " + (int)this.thuong + " " + (int)this.phuCap + " " + (int)this.thuNhap; 
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String name = sc.nextLine();
        //double luong = sc.nextDouble(); 
        //double ngayCong = sc.nextDouble(); 
        //String chucVu = sc.next(); 
        //nhanVien x = new nhanVien(name,luong,ngayCong,chucVu); 
        //System.out.println(x);
        double x = 23.0; 
        System.out.println(String.format("%.0f", x));
    }
}
