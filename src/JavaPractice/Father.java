package JavaPractice;

public class Father extends GrandFather {
    int x = 20;
    public Father(){
        System.out.println("Default of Father");
    }
    public Father(String s){
        System.out.println("Parameterized of Father " + s);
    }
    public Father(String s, String t){
        super(t);
        System.out.println("Parameterized2 of Father " + s);
    }
    void display()
    {
        System.out.println("In Display of father");
    }

}
