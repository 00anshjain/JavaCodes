package JavaPractice;

public class Student {
    public Student(){
        course = "ME";
        name = "Anonymous";
    }
    public Student(String name, String course){
        this.course = course;
        this.name = name;
    }

    public int roll;
    public String name;
    public String course;
    //default, public, protected, private
    public int m1, m2, m3;
    public int total()
    {
        return m1+m2+m3;
    }
//    static string schoolTopper;
    static int highestMarks = 0;
    static void setTopper(int marks)
    {
        if(marks > highestMarks)
        {
            highestMarks = marks;
        }
    }
    public float average()
    {
        return total()*(1.0f)/3;
    }
    public char grade()
    {
        if(average() >= 60)
            return 'A';
        if(average()>= 40)
            return 'B';
        return 'C';
    }
    public String toString(){
        return "Mr./Ms. " + name + " has scored total " + total() + " marks and secured " + grade() + ".";
    }
}
