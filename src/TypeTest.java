import inheritance.Person;
import inheritance.Student;

public class TypeTest {

    public static void main(String args[]) {
        Person p[] = new Person[10];

        for (int i = 0; i < 10; i++) {
            if (i<5)
                p[i] = new Student();
            else
                p[i] = new Person();
        }

        Person o1 = (Person) p[0];
        Person o2 = p[0];
//        Student o3 = p[0];
        Student o4 = (Student) p[0];
//        Student o5 = p[9];
        Student o6 = (Student) p[9];
//        int x = p[0].getStudentNumber();
    }
}
