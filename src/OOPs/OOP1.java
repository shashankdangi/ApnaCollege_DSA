package OOPs;

public class OOP1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Shashank";
        s1.roll = 456;
        s1.password = "Shashank@123";

        Student s2 = new Student(s1);
        s2.password = "XYZ";

        s1.name = "Vinay";
        s1.getStudent();
        s2.getStudent();
    }
}

class Student{
    String name ;
    int roll;

    String password;

    int marks[];


    //copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }

    Student(){
        marks = new int[3];
    }

    Student(String name){
        marks = new int[3];
        this.name = name;
    }

    void getStudent(){
        System.out.println("Name : "+ this.name +"\n" + "Roll No: " + this.roll +"\n" + "Password: "+ this.password);
    }
}
