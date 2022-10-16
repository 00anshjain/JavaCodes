package JavaPractice;

import java.util.Scanner;

public class InputInJava {
    public InputInJava() {
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
