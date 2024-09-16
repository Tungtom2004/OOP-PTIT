
package oop;
import java.util.*; 
public class J04013 {
    
    static class ThiSinh{
        private String id,name,kvts,Ketqua; 
        private double score,uutien,finalScore; 
        
        ThiSinh(String id,String name,double d1,double d2,double d3){
            this.id = id;
            this.name = name; 
            this.score = 2*d1 + d2 + d3; 
            this.kvts = id.substring(0,3); 
        }
        
        public double getfinalScore(){
            if(this.kvts.equals("KV1")) this.finalScore = this.score+0.5; 
            else if(this.kvts.equals("KV2")) this.finalScore = this.score+1.0; 
            else if(this.kvts.equals("KV3")) this.finalScore = this.score+2.5; 
            return this.finalScore;
        }
        
        public String getKetqua(){
            this.finalScore = getfinalScore(); 
            if(this.finalScore >= 24) this.Ketqua = "TRUNG TUYEN";
            else this.Ketqua = "TRUOT";
            return this.Ketqua; 
        }
        
        public String getscore(){
            String s = String.format("%.1f",this.score); 
            this.score = Double.parseDouble(s);
            if(this.score - (int)this.score == 0.0){
                return String.format("%.0f",this.score);
            }
            else return String.format("%.1f",this.score); 
        }
        
        public String getuutien(){
            if(this.kvts.equals("KV1")) this.uutien = 0.5; 
            else if(this.kvts.equals("KV2")) this.uutien = 1.0;
            else if(this.kvts.equals("KV3")) this.uutien = 2.5; 
            if(this.uutien - (int)this.uutien == 0.0) return String.format("%.0f",this.uutien); 
            else return String.format("%.1f",this.uutien); 
        }
        
        public String toString(){
            this.Ketqua = getKetqua(); 
            String s1 = getscore(); 
            String s2 = getuutien(); 
            return this.id + " " + this.name + " " + s2 + " " + s1 + " " + this.Ketqua; 
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String id = sc.nextLine(); 
        String name = sc.nextLine();  
        double d1 = sc.nextDouble(), d2 = sc.nextDouble(), d3 = sc.nextDouble();
        ThiSinh x = new ThiSinh(id,name,d1,d2,d3);
        System.out.println(x);
    }
    
}
