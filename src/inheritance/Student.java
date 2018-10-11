package inheritance;

public class Student extends Person {

    public int studentNumber;
    public static int numberOfStudents;



//    public Student() {
//    }

    {
        System.out.println("inheritance.Student init block");
        this.studentNumber = 0;
    }

//    static {
//        numberOfStudents = 10;
//        System.out.println("inheritance.Student static init block");
//    }

//    public Student(String name, int studentNumber) {
//        super(name);
//        System.out.println("inheritance.Student constructor");
//        this.studentNumber = studentNumber;
//    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return super.getName();
    }
}
