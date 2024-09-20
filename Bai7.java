/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTEST1;
import java.util.*;
public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            Map<Integer,Integer> mp = new LinkedHashMap<>();
            int n = sc.nextInt();
            for(int i = 0;i < n;i++){
                int x = sc.nextInt();
                if(!mp.containsKey(x)) mp.put(x,1);
                else mp.put(x,mp.get(x)+1); 
            }
            int a[][] = new int[mp.size()][2]; 
            int cnt = 0;
            for(Map.Entry<Integer,Integer>entry:mp.entrySet()){
                a[cnt][0] = entry.getKey(); 
                a[cnt++][1] = entry.getValue();
            }
            Arrays.sort(a, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2){
                    return Integer.compare(o2[1],o1[1]); 
                }
            }); 
            for(int i = 0;i < cnt;i++){
                for(int j = 0;j < a[i][1];j++){
                    System.out.print(a[i][0] + " ");
                }
            }
            System.out.println("");
        }
    }
}
