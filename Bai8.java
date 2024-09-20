/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTEST1;
import java.math.BigInteger;
import java.util.*; 
public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt();
        String s;
        ArrayList<BigInteger> v = new ArrayList<>();
        while(t --> 0){
            s = sc.next();
            StringBuilder res = new StringBuilder();
            for(int i = 0;i < s.length();i++){
                if(Character.isDigit(s.charAt(i))){
                    res.append(s.charAt(i)); 
                }
                else res.append(" "); 
            }
            String word[] = res.toString().trim().split("\\s+"); 
            for(String x:word){
                if(!x.isEmpty()){
                    BigInteger k = new BigInteger(x);
                    v.add(k); 
                }
            }
        }
        Collections.sort(v);
        for(BigInteger x:v){
            System.out.println(x);
        }
    }
}
