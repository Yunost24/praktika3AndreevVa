package task1;

public class Main {

    public static void main(String[] args) {


        Shape s1 = new Circle(5.5, "RED", false); // upcasting
        System.out.println(s1);
        System.out.println("Площадь круга: " + s1.getArea());
        System.out.println("Периметр круга: " + s1.getPerimeter());
        System.out.println("Цвет круга: " + s1.getColor());
        System.out.println("Круг заполнен?: " + s1.isFilled());

        System.out.println("\n\n");



        Circle c1 = (Circle)s1;
        System.out.println(c1);
        System.out.println("Площадь круга: " +c1.getArea());
        System.out.println("Периметр круга: " +c1.getPerimeter());
        System.out.println("Цвет круга: " + c1.getColor());
        System.out.println("Круг заполнен?:" + c1.isFilled());
        System.out.println("Радиус круга:" + c1.getRadius());

        System.out.println("\n\n");

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println(s3);
        System.out.println("Площадь прямоугольника: " + s3.getArea());
        System.out.println("Периметр прямоугольника: " + s3.getPerimeter());
        System.out.println("Цвет прямоугольника: " + s3.getColor());

        System.out.println("\n\n");


        Rectangle r1 = (Rectangle)s3;
        System.out.println(r1);
        System.out.println( "Площадь прямоугольника: " + r1.getArea());
        System.out.println("Цвет прямоугольника: " + r1.getColor());
        System.out.println( "Длина прямоугольника: " + r1.getLength());

        System.out.println("\n\n");

        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println("Площадь квадрата: " + s4.getArea());
        System.out.println("Цвет квадрата: " + s4.getColor());

        System.out.println("\n\n");


        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println("Площадь прямоугольника: " + r2.getArea());
        System.out.println("Цвет прямоугольника: " + r2.getColor());
        System.out.println("Длина прямоугольника: " + r2.getLength());

        System.out.println("\n\n");

        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println("Площадь квадрата: " + sq1.getArea());
        System.out.println("Цвет квадрата: " + sq1.getColor());
        System.out.println("Ширина стороны: " + sq1.getSide());
        System.out.println("Длина стороны: " + sq1.getLength());





    }

}
