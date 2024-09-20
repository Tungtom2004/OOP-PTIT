/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTEST1;
import java.util.*; 
public class Bai2 {
    
    static long fibo(long n){
        if(n == 1 || n == 2) return 1; 
        long fn, f1 = 1, f2 = 1;
        for(long i = 3;i < 93;i++){
            fn = f1 + f2;
            if(i == n) return fn;
            f2 = f1; f1 = fn; 
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt();
        while(t --> 0){
            long a = sc.nextLong(), b = sc.nextLong();
            for(long i = a;i <= b;i++){
                System.out.print(fibo(i) + " ");
            }
            System.out.println("");
        }
    }
}
