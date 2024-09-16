/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasic;
import java.util.*; 

public class J02022 {
    static int a[] = new int[25]; 
    static int n; static boolean visited[] = new boolean[25]; 
    static ArrayList<String> res = new ArrayList<>();
    
    static boolean check1(){
        for(int i = 0;i < n;i++){
            if(a[i] == 0) return false;
        }
        return true; 
    }
    
    static boolean check2(){
        HashSet<Integer> se = new HashSet<>();
        for(int i = 0;i < n;i++) se.add(a[i]); 
        return se.size() == n; 
    }
    
    static boolean check3(){
        for(int i = 0;i < n-1;i++){
            if(Math.abs(a[i] - a[i+1]) == 1) return false;
        }
        return true; 
    }
    
    static void solve(){
        if(check1() && check2() && check3()){
            for(int i = 0;i < n;i++){
                System.out.print(a[i]);
            }
            System.out.println("");
            //System.out.println("");
        }
    }
    
    static void Try(int i){
        for(int j = 0;j < n;j++){
            if(visited[j] == false){
                a[i] = j+1; 
                visited[j] = true;
                if(i == n-1) solve();
                else Try(i+1);
                visited[j] = false;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt();
        while(t --> 0){
            n = sc.nextInt(); 
            Try(0); 
            System.out.println("");
        }
    }
}
