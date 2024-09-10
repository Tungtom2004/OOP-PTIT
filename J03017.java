
package javabasic;
import java.util.*; 
//sout: system.out.println("")   

public class J03017 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int t = Integer.parseInt(sc.nextLine()); 
        while(t --> 0){
            String s = sc.next(); 
            Stack<Integer> st = new Stack<>();
            for(int i = 0;i < s.length();i++){
                if(st.size() < 2) st.add(i);
                else{
                    if(s.charAt(i) == '0' && s.charAt(st.peek()) == '0' && s.charAt(st.elementAt(st.size()-2)) == '1'){
                        st.pop();
                        st.pop(); 
                    }
                    else st.add(i); 
                }
            }
            int res = 0;
            for(int i = 1;i < st.size();i++){
                res = Math.max(res, st.elementAt(i) - st.elementAt(i-1) - 1);
            }
            if(st.empty()) res = s.length(); 
            else{
                res = Math.max(res,st.elementAt(0)); 
                res = Math.max(res, s.length() - st.peek() - 1); 
            }
            System.out.println(res);
        }
    }
}