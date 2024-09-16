
package oop;
import java.util.*;
public class J04005 {
    private String name; 
    private String birth; 
    private double score; 
    
    J04005(String name, String birth, double score){
        this.name = name;
        this.birth = birth; 
        this.score = score;
    }
    
    public String toString(){
        return this.name + " " + this.birth + " " + String.format("%.1f",this.score); 
    }      
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String ten = sc.nextLine(); 
        String nsinh = sc.next();
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble(); 
        J04005 x = new J04005(ten,nsinh,a + b + c);
        System.out.println(x);
    }
}
