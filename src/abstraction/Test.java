package abstraction;

public class Test {

    public static void main(String args[]) {

//        AbstractShape[] shapes = new AbstractShape[10];
//        Canvas canvas = new Canvas();
//        for (int i = 0; i < 10; i++) {
//            if (i < 3)
//                shapes[i] = new AbstractShape();
//            else if (i < 6)
//                shapes[i] = new Circle();
//            else
//                shapes[i] = new Square();
//        }
//
//        ((Circle)shapes[4]).calculateDiameter();
//        for (int i=0; i < shapes.length; i++)
//            shapes[i].draw(canvas);

        Circle circle = new Circle(10);
        Circle circle1 = new Circle(10);
        System.out.println(circle.equals(circle1));
        System.out.println(circle.toString());

        Square square = new Square();
        Square square1 = new Square();
        Square square2 = square;
        System.out.println(square.equals(square1));
        System.out.println(square.equals(square2));
        System.out.println(circle.equals(square));
        System.out.println(square.toString());
    }
}
