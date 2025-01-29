public class ObjectParameterizedConstructor {
    int a,b;
    ObjectParameterizedConstructor(){
       a=0;
       b=0;
    }
    ObjectParameterizedConstructor(int num3, int num4){
        this.a=num3;
        this.b=num4;
    }

    ObjectParameterizedConstructor(ObjectParameterizedConstructor obj){
        this.a= obj.a;
        this.b=obj.b;
    }
    void toDisplay(){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        ObjectParameterizedConstructor obj1 = new ObjectParameterizedConstructor(10,30);
        System.out.println("Original object");
        obj1.toDisplay();

        ObjectParameterizedConstructor obj2 = new ObjectParameterizedConstructor(obj1);
        System.out.println("Copied object");
        obj2.toDisplay();
    }
}
