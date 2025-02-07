import java.util.Scanner;

class Shape {
    void calculateArea() {
        System.out.println("Calculating the area...");
    }
}

class Circle extends Shape {
    @Override
    void calculateArea() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        int r = scan.nextInt();
        final double pi = 3.1417;
        double areaOfCircle = pi * r * r;
        System.out.println("Area of circle is: " + areaOfCircle);
    }
}

class Rectangle extends Shape {
    @Override
    void calculateArea() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        int l = scan.nextInt();
        System.out.print("Enter breadth of the rectangle: ");
        int b = scan.nextInt();
        int areaOfRectangle = l * b;
        System.out.println("Area of rectangle is: " + areaOfRectangle);
    }
}

class Triangle extends Shape {
    @Override
    void calculateArea() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter base of the triangle: ");
        int b = scan.nextInt();
        System.out.print("Enter height of the triangle: ");
        int h = scan.nextInt();
        double areaOfTriangle = 0.5 * b * h;
        System.out.println("Area of triangle is: " + areaOfTriangle);
    }
}

 class ShapeDemo {
    public static void main(String[] args) {
        Shape obj;

        obj = new Circle();
        obj.calculateArea();

        obj = new Rectangle();
        obj.calculateArea();

        obj = new Triangle();
        obj.calculateArea();
    }
}
