
package javabasic;
import java.util.*;
public class JKT013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            Queue<String> q = new LinkedList<>();
            q.add("6"); q.add("8"); 
            Vector<String> v = new Vector<>(); 
            int len = 0;
            while(len <= n){
                String tmp = q.peek(); q.remove(); 
                v.add(tmp); 
                q.add(tmp + "6"); q.add(tmp + "8"); 
                len = q.element().length(); 
            }
            Collections.reverse(v);
            System.out.println(v.size());
            for(String x:v){
                System.out.print(x + " ");
            }
            System.out.println("");
        }
    }
}
