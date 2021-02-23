public class MyStart {
    public static void main(String[] args) {
        Animal dog1 = new Dog("Bobik", "mops", 2020, "male", false, true);
        Cat cat1 = new Cat("Murka", "siam", 2015, "female", true, "chair");
        Object pig1 = new Pig("Peppa", "noname", 2019, "female", false, 37);
        System.out.println(dog1);
        dog1.eats();
        dog1.drinks();
        dog1.moves();
        dog1.makesSound();

    }
}
