public class ConstructorOverloading {
double a,b;
    ConstructorOverloading(double num1, int num2){
this.a=num1;
this.b=num2;
    }
    ConstructorOverloading(int num3, int num4){
        this.a=num3;
        this.b=num4;
    }
    void toDisplay(){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading(10.0,30);
        System.out.println("Using first constructor");
        obj1.toDisplay();

        ConstructorOverloading obj2 = new ConstructorOverloading(40,50);
        System.out.println("Using second constructor");
        obj2.toDisplay();
    }
}
