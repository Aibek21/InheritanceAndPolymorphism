package abstraction;

public abstract class AbstractShape {

    private Color color;
    private Point anchorPoint;

    void move(int dx, int dy){
        System.out.println("AbstractShape move method: "+dx +" "+dy);
        anchorPoint.move(dx, dy);
    };
    abstract void draw(Canvas canvas);


    @Override
    public String toString() {
        return "toString() of AbstractShape";
    }
}
