package abstraction;

public class Circle extends AbstractShape {

    private int radius;


    public Circle(int radius) {
        this.radius = radius;
    }

    int calculateDiameter() {
        return 2 * radius;
    }

    @Override
    void move(int dx, int dy) {
        super.move(dx, dy);
    }

    @Override
    void draw(Canvas canvas) {

    }


    @Override
    public String toString() {
        return "Circle with radius: " + radius;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle)
            return this.radius == ((Circle) obj).radius;
        return false;
    }
}
