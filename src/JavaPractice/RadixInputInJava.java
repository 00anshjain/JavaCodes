package JavaPractice;

import java.util.Scanner;

public class RadixInputInJava {
    public RadixInputInJava() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useRadix(2);
        int a = sc.nextInt();
        System.out.println("the number is " + a);
        sc.useRadix(10);
        int b = sc.nextInt();
        System.out.println("the number is " + b);
        sc.close();
    }
}
