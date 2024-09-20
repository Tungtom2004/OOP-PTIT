/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTEST1;
import java.util.*; 
class SinhVien implements Comparable<SinhVien>{
    private String msv,name,lop,email,phone;
    public SinhVien(String msv,String name,String lop,String email,String phone){
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.email = email;
        this.phone = '0'+ phone; 
    }
    
    @Override
    public int compareTo(SinhVien sv){
        if(!this.lop.equals(sv.lop)){
            return this.lop.compareTo(sv.lop); 
        }
        else return this.msv.compareTo(sv.msv); 
    }
    
    @Override
    public String toString(){
        return msv + " " + name + " " + lop + " " + email + " " + phone; 
    }
}


public class bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        List<SinhVien> sinhVienlist = new ArrayList<>(); 
        while(sc.hasNextLine()){
            SinhVien sv = new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()); 
            sinhVienlist.add(sv); 
        }
        Collections.sort(sinhVienlist);
        for(SinhVien sv:sinhVienlist){
            System.out.println(sv);
        }
    }
}
