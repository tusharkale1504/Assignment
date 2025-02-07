class BaseClass{
    void sum(){
        int a = 10;
        int b = 20;
        int c = a+b;
        System.out.println("The sum is "+c);
    }
}

class DerivedClass1 extends BaseClass{
    void sum(){
        float a = 1.5f;
        float b = 2.5f;
        float c = a+b;
        System.out.println("The sum is "+c);
    }
}

class DerivedClass2 extends BaseClass{
    void sum(){
        char a = 'A';
        char b = 'B';
        int c = a+b;
        System.out.println("The sum is "+c);
    }
}

public class DynamicOverriding {
    public static void main(String[] args) {
        BaseClass base = new BaseClass();
        base.sum();
        base = new DerivedClass1();
        base.sum();
        base = new DerivedClass2();
        base.sum();
    }
}
