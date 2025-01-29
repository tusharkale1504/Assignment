public class ParameterizedConstructor {
    int a,b;

    ParameterizedConstructor(int a, int b ){
    this.a=a;
    this.b=b;
    }

  void toDisplay(){
      System.out.println(a+b);
    }

    public static void main(String[] args) {
        ParameterizedConstructor obj1 = new ParameterizedConstructor(20,20);
        obj1.toDisplay();
    }

}
