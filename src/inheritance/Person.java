package inheritance;

public class Person {
    private String name;


    {
        System.out.println("inheritance.Person init block");
        name = "no name yet";
    }
//    public Person(){
//        System.out.println("inheritance.Person constructor");
//        name = "no name yet";
//    }
//    public Person(String name) {
//        System.out.println("inheritance.Person constructor");
//        this.name = name;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
