package JavaPractice;
//4 class files linked
// ConstructorInheritance, GrandFather <-- Father <--Person
public class ConstructorInheritance {
    public static void main(String[] args)
    {
        Person p = new Person("Ansh", "Anil", "Manohar Lal");
        System.out.println(p.x);

        Father f = new Father();
        f.display();
        p.display();
        
//        System.out.println(p.x);
//        System.out.println((p.super(x)));
//        System.out.println(p.Super.Super.x);

    }
}
