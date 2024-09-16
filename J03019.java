
package javabasic;
import java.util.*; 
public class J03019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String s = sc.nextLine(); 
            Stack<Character> st = new Stack<>(); 
            for(int i = 0;i < s.length();i++){
                if(st.empty()) st.add(s.charAt(i));
                else{
                    while(!st.empty() && st.peek() < s.charAt(i)) st.pop(); 
                    st.add(s.charAt(i)); 
                }
            }
            StringBuilder tmp = new StringBuilder(); 
            while(!st.empty()){
                tmp.append(st.peek()); 
                st.pop(); 
            }
            tmp.reverse(); 
            System.out.println(tmp.toString());
    }
}
