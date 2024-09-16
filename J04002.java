
package oop;
import java.util.*; 
public class J04002 {
    public long x; 
    public long y; 
    public String s;
    
    J04002(long d,long r,String color){
        x = d;
        y = r;
        s = color; 
    }
    
    public String convert(){
        StringBuilder p = new StringBuilder(); 
        p.append(s.substring(0, 1).toUpperCase()).append(s.substring(1).toLowerCase()); 
        s = p.toString(); 
        return s; 
    }
   
    public void solve(){
        long P = (x + y)*2; 
        long S = x*y; 
        String k = convert(); 
        System.out.println(P + " " + S + " " + k);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        long a = sc.nextLong(), b = sc.nextLong(); String p = sc.next(); 
        if(a <= 0 || b <= 0) System.out.println("INVALID");
        else{
            J04002 x = new J04002(a,b,p);
            x.solve();
        }
    }
}
