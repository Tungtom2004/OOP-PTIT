
package javabasic;
import java.util.*;
public class J08022 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt(); 
        while(t --> 0){
            int n = sc.nextInt(); 
            int a[] = new int[n];
            for(int i = 0;i < n;i++) a[i] = sc.nextInt(); 
            Stack<Integer>st = new Stack<>();
            int res[] = new int[n];
            for(int i = n - 1;i >= 0;i--){
                if(st.empty()){
                    res[i] = -1;
                    st.push(a[i]); 
                }
                else{
                    while(!st.empty() && st.peek() <= a[i]) st.pop(); 
                    if(st.empty()) res[i] = -1;
                    else res[i] = st.peek(); 
                    st.push(a[i]); 
                }
            }
            for(int i = 0;i < n;i++){
                System.out.print(res[i]+" ");
            }
            System.out.println("");
        }
       
    }
}
