
package javabasic;
import java.util.*; 
public class J01025 {
    static int maxLen(int a,int b,int c,int d){
        return Math.max(Math.max(a,b),Math.max(c,d));
    }
    
    static int minLen(int a,int b,int c,int d){
        return Math.min(Math.min(a,b), Math.min(c,d)); 
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xA = sc.nextInt(), yA = sc.nextInt(),xB = sc.nextInt(), yB = sc.nextInt(); 
        int xC = sc.nextInt(), yC = sc.nextInt(), xD = sc.nextInt(), yD = sc.nextInt(); 
        int len1 = minLen(xA,xB,xC,xD),len2 = maxLen(xA,xB,xC,xD); 
        int len3 = minLen(yA,yB,yC,yD), len4 = maxLen(yA,yB,yC,yD);
        int len = Math.max(len2 - len1,len4-len3);
        System.out.println(len*len);
    }
}
