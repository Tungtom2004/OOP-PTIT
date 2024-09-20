/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTEST1;
import java.util.*; 
public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m; 
        TreeSet<String> a = new TreeSet<>(), b = new TreeSet<>();
        n = Integer.parseInt(sc.nextLine()); 
        for(int i = 0;i < n;i++){
            String s = sc.nextLine(); 
            String word[] = s.trim().split("\\s+"); 
            StringBuilder res = new StringBuilder(); 
            for(String x:word){
                if(x.length() > 0){
                    res.append(x.toLowerCase()); 
                }
                res.append(" "); 
            }
            String x[] = res.toString().trim().split("\\s+"); 
            for(String p:x) a.add(p); 
        }
        
        m = Integer.parseInt(sc.nextLine()); 
        for(int i = 0;i < m;i++){
            String s = sc.nextLine(); 
            String word[] = s.trim().split("\\s+"); 
            StringBuilder res = new StringBuilder(); 
            for(String x:word){
                if(x.length() > 0){
                    res.append(x.toLowerCase()); 
                }
                res.append(" "); 
            }
            String x[] = res.toString().trim().split("\\s+"); 
            for(String p:x) b.add(p); 
        }
        TreeSet<String> dif1 = new TreeSet<String>(a);
        TreeSet<String>dif2 = new TreeSet<String>(b);
        dif1.removeAll(b); 
        dif2.removeAll(a); 
        for(String x:dif1){
            System.out.print(x + " ");
        }
        System.out.println("");
        for(String x:dif2){
            System.out.print(x + " ");
        }
    }
}
