package abstraction;

public class Square extends AbstractShape {

    private int length;

    @Override
    void draw(Canvas canvas) {
        System.out.println("Square draw method");
    }
}
