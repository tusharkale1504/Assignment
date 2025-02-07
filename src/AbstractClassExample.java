abstract class AbstractParent{
    void education(){
        System.out.println("Education");
    }
    abstract void job();
}

class AbstractChild extends AbstractParent{
    void job(){
        System.out.println("Job abstract method");
    }

}

public class AbstractClassExample {
    public static void main(String[] args) {
        AbstractChild obj = new AbstractChild();
        obj.education();
        obj.job();
    }
}

