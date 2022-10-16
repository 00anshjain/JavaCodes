package JavaPractice;

import java.util.Scanner;

public class DifferentPrintInJava {
    public DifferentPrintInJava() {
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.print("Hello World " + a + " ok   ");
        System.out.println("bello World " + b + " ok");
        System.out.printf("a = %d, b = %d\n", a, b);
        s.close();
    }
}
