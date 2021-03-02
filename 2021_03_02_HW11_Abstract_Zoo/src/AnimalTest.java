public class AnimalTest {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", 2020, "male", "brown");
        System.out.println(barsik);
        barsik.drinks();
        barsik.makesSound();
        System.out.println("=====");

        Dog drugok= new Dog("Drugok", 2018, "male", "white");
        System.out.println(drugok);
        drugok.makesSound();
        System.out.println("======");

        Pig peppa=new Pig("Peppa", 2015, "female", "pink");
        System.out.println(peppa);
        peppa.makesSound();
        peppa.drinks();
        System.out.println("======");

        Dragon dragon1=new Dragon("Змей Горыныч", 234, "male", "black");
        System.out.println(dragon1);
        dragon1.makesSound();
        dragon1.drinks();
    }
}
