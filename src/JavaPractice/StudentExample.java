package JavaPractice;
//class Student {
//    public int roll;
//    public String name;
//    public String course;
//    //default, public, protected, private
//    public int m1, m2, m3;
//    public int total()
//    {
//        return m1+m2+m3;
//    }
//    public float average()
//    {
//        return total()*(1.0f)/3;
//    }
//    public char grade()
//    {
//        if(average() >= 60)
//            return 'A';
//        if(average()>= 40)
//            return 'B';
//        return 'C';
//    }
//}

public class StudentExample{
    public static void main(String args[])
    {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(Student.highestMarks);
        Student s2 = new Student("Sneha", "ME");
        System.out.println(s2.name);

        s.roll = 1;
        s.name = "Ansh Jain";
        s.course = "CSE";
        s.m1 = 80;
        s.m2 = 40;
        s.m3 = 55;
        System.out.println("Total Marks : " + s.total());
        System.out.println("Average : " + s.average());
        System.out.println("Grade : " + s.grade());
        System.out.println(s);
        s.setTopper(s.total());
        System.out.println(Student.highestMarks);
    }
}