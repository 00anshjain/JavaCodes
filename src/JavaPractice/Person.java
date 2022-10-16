package JavaPractice;

public class Person extends Father {
//public class Person{
    int x = 10;
    public Person(){
        x = 10;
        System.out.println("Default of Person");
    }
    public Person(String s){
        System.out.println("Parameterized1 of Person " + s);
    }
    public Person(String s, String w){
        super(w);
        System.out.println("Parameterized2 of Person " + s);
    }
    public Person(String s, String w, String t){
        super(w, t);
        System.out.println("Parameterized3 of Person " + s);
    }
    void display()
    {
        super.display();
        System.out.println("In Display of Person");
    }


}
