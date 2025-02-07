public class Animal {
    void sound(){
        System.out.println("Chiuuuu chiuuuu....");
    }
}

 class Cat extends Animal{
    void sound(){
        System.out.println("miuuu miuuuu...");
    }
}
 class Dog extends Animal{
    void sound(){
        System.out.println("bhooo bhoooo...");
    }
}

class AnimalFamily{
    public static void main(String[] args) {
        Animal obj = new Animal();
        obj.sound();
        obj = new Cat();
        obj.sound();
        obj = new Dog();
        obj.sound();
    }
}
