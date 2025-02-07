class Animal1
{
    void eat()
    {
        System.out.println("Animal Eats....");
    }
    void sound()
    {
        System.out.println("Animal Sounds....");
        System.out.println("--------------------");
    }
}
class Lion extends Animal1
{
    void eat()
    {
        System.out.println("--------Lion------");
        System.out.println("Lion eat other small Animals");
    }
    void sound()
    {
        System.out.println("Lion Sound Like Roarrrr....Roarrr !");
    }
}
class Tiger extends Animal1
{
    void eat()
    {
        System.out.println("--------Tiger------");
        System.out.println("Tiger also eat other small Animals");
    }
    void sound()
    {
        System.out.println("Tiger Sound Like Roarrrr....Roarrr !");
    }
}
class Panther extends Animal1
{
    void eat()
    {
        System.out.println("--------Panther------");
        System.out.println("Panther Eats...");
    }
    void sound()
    {
        System.out.println("Panther Sound Like Growl....Growl !");
    }
}
 class InheritanceQ4 {

    public static void main(String[] args)
    {
        Animal1 obj = null;
        obj = new Animal1();
        obj.eat();
        obj.sound();

        obj = new Lion();
        obj.eat();
        obj.sound();

        obj = new Tiger();
        obj.eat();
        obj.sound();


        obj = new Panther();
        obj.eat();
        obj.sound();


    }

}


