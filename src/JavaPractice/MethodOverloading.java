package JavaPractice;

public class MethodOverloading {
    public MethodOverloading() {
    }

    static long sum(int a, long b, long c) {
        System.out.println("In long return func");
        return (long)a + b + c;
    }

    static double sum(int a, double b, double c) {
        System.out.println("In IDD return func");
        return (double)a + b + c;
    }

    static double sum(double b, double c, int a) {
        System.out.println("In DDI return func");
        return (double)a + b + c;
    }

    static float sum(int a, float b, float c) {
        System.out.println("In IFF return func");
        return (float)a + b + c;
    }

    static float sum(float b, float c, int a) {
        System.out.println("In FFI return func");
        return (float)a + b + c;
    }

    static float sum(float b, float c, float a) {
        System.out.println("In FFF return func");
        return a + b + c;
    }

    static int sum(int a, int b, int c) {
        System.out.println("In int return func");
        return a + b + c;
    }

    static float sum(float a, float b) {
        System.out.println("In float return func");
        return a + b;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 10;
        float p = 10.1F;
        float q = 6.4F;
        double d = 12.3;
        System.out.println(sum(a, b, c));
        System.out.println(sum(p, q, a));
        System.out.println(sum((double)p, d, a));
    }
}
