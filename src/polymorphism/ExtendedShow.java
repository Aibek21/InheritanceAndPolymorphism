package polymorphism;

public class ExtendedShow extends SuperShow {

    public String str = "ExtendedStr";

    @Override
    public void show() {
        System.out.println("Extended.show: " + str);
    }

    public void show(int a, char b){

    }

    public void show(char b, int a){

    }
}
