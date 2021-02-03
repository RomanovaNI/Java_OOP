package homework01;

public class Swan {
    int age;
    double weight;
    int meter;
    String color;
    String name;
    String food;
    boolean gender;

    public void swim(int newMeter) {
        System.out.println("Swan swims");
        meter += newMeter;
    }

    public void eat(String newFood) {
        food += newFood;
    }

    public void swanInfo() {
        System.out.println("The name of the swan - " + name);
        System.out.println("It is a " + (gender == true ? "female" : "male"));
        System.out.println("The age of the swan - " + age + "y.o.");
        System.out.println("The weight of the swan - " + weight + "kg");
        System.out.println("How many meters has " + name + " already swum - " + meter + "m");
        System.out.println(name + " has today " + food + " eaten");
        System.out.println("============");
    }
}

class TestSwan {
    public static void main(String[] args) {
        Swan swan = new Swan();
        swan.name = "Lika";
        swan.gender = true;
        swan.age = 2;
        swan.weight = 4.3;
        swan.meter = 470;
        swan.food = "cucmber";
        swan.swanInfo();

        swan.name = "Rolf";
        swan.gender = false;
        swan.age = 1;
        swan.weight = 2.3;
        swan.meter = 170;
        swan.food = "bread";
        swan.swim(200);
        swan.eat(" and fish");
        swan.swanInfo();
    }


}

