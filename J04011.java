/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;
import.java.util.*;
public class J04011 {
    
    static class Point{
        double x, y;
        
        public Point(double a, double b){
            x = a;
            y = b;
        }

        static Point nextPoint(Scanner sc){
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            return a;
        }
    }
    
    static double dis(Point a, Point b){
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    static class Triangle{
        double A, B, C;
        public Triangle(Point a, Point b, Point c){
            A = dis(a, b);
            B = dis(b, c);
            C = dis(c, a);
        }
        public boolean valid(){
            double m = Math.max(A, Math.max(B, C));
            return 2*m < A + B + C;
        }
        public String getPerimeter(){
            double c = A+B+C;
            return String.format("%.3f", c);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
