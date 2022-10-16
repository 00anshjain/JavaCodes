package JavaPractice;

import java.util.Scanner;

public class AreaOfTriangle {
    public AreaOfTriangle() {
    }

    public static void main(String[] args) {
        System.out.println("Enter base and height");
        Scanner sc = new Scanner(System.in);
        float length = sc.nextFloat();
        float breadth = sc.nextFloat();
        float area = length * breadth;
        double b = Math.sqrt((double)area);
        System.out.println("Area of Tringle :" + area);
        System.out.println("Sqrt of Area : " + b);
        sc.close();
    }
}
