package JavaPractice;

public class StaticMethodCall {
    public StaticMethodCall() {
    }

    void inc(int c) {
        ++c;
        System.out.println(c);
    }

    public static void main(String[] args) {
        int x = 5;
        StaticMethodCall sc = new StaticMethodCall();
        sc.inc(x);
        System.out.println(x);
    }
}
