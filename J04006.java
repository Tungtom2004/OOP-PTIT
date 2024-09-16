
package oop;
import java.util.*;
public class J04006 {
    
    public String id; 
    private String name; 
    private String birth; 
    private String lop; 
    private double score; 
    
    J04006(String name, String birth,String lop,double score){
        this.name = name;
        this.birth = birth; 
        this.score = score;
        this.lop = lop; 
        this.id = "B20DCCN001"; 
    }
    
    public String convert(String s){
        if(s.charAt(1) == '/') s = "0" + s; 
        if(s.charAt(4) == '/') s = s.substring(0,3) + "0" + s.substring(3); 
        return s; 
    }
    
    public String toString(){
        return this.id + " " + this.name + " " + this.lop + " " + convert(this.birth) + " " + String.format("%.2f",this.score); 
    }      
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine(); 
        String lop = sc.next();
        String ns = sc.next();
        double a = sc.nextDouble(); 
        J04006 p = new J04006(ten,ns,lop,a); 
        System.out.println(p);
    }
}
