/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTEST1;

/**
 *
 * @author Admin
 */
import java.util.*; 
import java.io.*; 
import static java.lang.Integer.parseInt;
public class bai1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in); 
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
        int max = -1000000000, min = 1000000000; 
        String s;
        while((s = reader.readLine()) != null){
            String[] nums = s.trim().split("\\s+");
            for(String x:nums){
                if(!x.isEmpty()){
                    int m = parseInt(x); 
                    max = Math.max(m, max);
                    min = Math.min(min, m); 
                }
            }
        }
        System.out.println(max + " " + min);
        
    }
}
