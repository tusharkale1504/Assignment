public class DefaultConstructor {
int a;
int b;
    DefaultConstructor(){
        a=10;
        b=20;
    }

void toDisplay(){
    System.out.println(a+b);
    }
    public static void main(String[] args) {
        DefaultConstructor obj= new DefaultConstructor();
        obj.toDisplay();
    }
}
