/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasic;



//Scanner sc = new Scanner(System.in); DUNG KHI MUON NHAP DU LIEU
//alt enter
        
/**
 *
 * @author Admin78
 */
//char c = sc.nextLine().charAt(0);: 
import java.util.*; 
//sout: system.out.println("")   

public class J08015{
    
    static int firstpos(long a[],int l,int r, long x){
        int pos = -1; 
        while(l <= r){
            int m = (l+r)/2;
            if(a[m] == x){
                pos = m;
                r = m - 1; 
            }
            else if(a[m] > x) r = m - 1;
            else l = m + 1;
        }
        return pos; 
    }
    
    
    static int lastpos(long a[],int l,int r, long x){
        int pos = -1; 
        while(l <= r){
            int m = (l+r)/2;
            if(a[m] == x){
                pos = m;
                l = m + 1; 
            }
            else if(a[m] > x) r = m - 1;
            else l = m + 1;
        }
        return pos; 
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt();
        for(int q = 1; q <= t;q++){
            int n = sc.nextInt(), k = sc.nextInt();
            long a[] = new long[n];
            for(int i = 0;i < n;i++) a[i] = sc.nextLong();
            Arrays.sort(a);
            long cnt = 0;
            for(int i = 0;i < n;i++){
                long x = k - a[i];
                int first = firstpos(a,i+1,n-1,x), last = lastpos(a,i+1,n-1,x); 
                if(first != -1 && last != -1) cnt += last-first + 1; 
            }
            System.out.println(cnt);
        }
        
    }
}