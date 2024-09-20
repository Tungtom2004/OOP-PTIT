/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTEST1;
import java.util.*; 
public class bai4 {
    public static void main(String[] args) {
        int chan[] = new int[1005]; 
        int le[] = new int[1005]; 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int a[] = new int[n]; 
            for(int i = 0;i < n;i++){
                a[i] = sc.nextInt();
                if(a[i] % 2 == 0) chan[a[i]]++;
                else le[a[i]]++; 
            }
            Vector<Integer> v1 = new Vector<>(), v2 = new Vector<>();
            for(int i = 0;i < n;i++){
                if(a[i] % 2 == 0){
                    if(chan[a[i]] != 0){
                        v1.add(a[i]);
                        chan[a[i]] = 0; 
                    }
                }
                else{
                    if(le[a[i]] != 0){
                        v2.add(a[i]);
                        le[a[i]] = 0; 
                    }
                }
            }
            Collections.sort(v1);
            Collections.sort(v2,Comparator.reverseOrder());
            for(int x:v1){
                System.out.print(x + " ");
            }
            System.out.println("");
            for(int x:v2){
                System.out.print(x + " ");
            }
            System.out.println("");
        }
        
    }
}
