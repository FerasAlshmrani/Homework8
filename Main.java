// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("//// Shape ////");
        Shape s1= new Shape("green",true);
        Shape s2 = new Shape();

        System.out.println("The Color of Shape is : "+s1.getColor());
        System.out.println("The fill of Shape is : "+s1.isFilled());
        System.out.println(s1.toString());

        s2.setColor("green");
        s2.setFilled(true);

        System.out.println("//// Circle ////");
        Circle c1 = new Circle("red",false,5);
        Circle c2 = new Circle(5);
        Circle c3 = new Circle();



        System.out.println("The Area of Circle is :"+c1.getArea());
        System.out.println("The Perimeter of Circle is :"+c1.getPerimeter());
        System.out.println(c1.toString());

        System.out.println("The Radius of Circle is :"+c2.getRadius());
        c3.setRadius(20);

        System.out.println("//// Rectangle ////");
        Rectangle r1 = new Rectangle("yellow",true,10,20);
        Rectangle r2 = new Rectangle(10,20);


        System.out.println("The Area of Rectangle is : "+r1.getArea());
        System.out.println("The Perimeter of Rectangle is : "+r1.getPerimeter());

        System.out.println(r1.toString());

        r2.setLength(30);
        System.out.println(r2.getLength());

        System.out.println("//// Square ////");
        Square q1 = new Square(25,"red",true);
        Square q2 = new Square(30);
        Square q3 = new Square();

        System.out.println("The Side of Square is :"+q1.getSide());
        System.out.println(q1.toString());

        System.out.println(q2.getSide());
        q3.setSide(30);
        System.out.println("The Perimeter of Square is : "+q3.getPerimeter());
    }
}