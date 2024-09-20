/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTEST1;
import java.util.*; 
public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine()); 
        while(t --> 0){
            long tich = 1,tong = 0;
            String s = sc.next();
            for(int i = 0;i < s.length();i++){
                if(i % 2 == 0){
                    int x = Character.getNumericValue(s.charAt(i)); 
                    if(x != 0) tich *= x; 
                }
                else{
                    tong += Character.getNumericValue(s.charAt(i)); 
                }
            }
            System.out.println(tich + " " + tong);
        }
    }
}
