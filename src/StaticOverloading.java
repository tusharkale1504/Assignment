class Parent{
    void sum(int a, int b){
       int c= a+b;
        System.out.println("The sum is "+c);
    }
    void area(int r){
final double pi = 3.1417;
double areaOfCircle = pi*r*r;
        System.out.println("Area of circle is "+areaOfCircle);
    }
}

class Child extends Parent{
    void div(int a, int b){
        int c= a/b;
        System.out.println("The div is "+c);
    }
    void area(int l, int b){
        double areaOfRectangle = l*b;
        System.out.println("Area of rectangle is "+areaOfRectangle);
    }
}

public class StaticOverloading {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.sum(20,10);
        obj.div(20,10);
        obj.area(4);
    }
}
