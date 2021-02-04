public class Car {
    int wheels = 4;
    int mileAge;
    String color;
    String carID;
    int doors;
    String brandName;
    String label;
    boolean registration;

    public void move(int distance) {
        System.out.println("We drive");
        //mileAge += distance;
        mileAge = mileAge + distance;
    }
    public void recolor(String newColor){
        color=newColor;
    }

    public void displayInfo() {
        System.out.println("Wheels number " + wheels);
        System.out.println("Total miles " + mileAge);
        System.out.println("Color of the car " + color);
        System.out.println("ID " + carID);
        System.out.println("Door numbers " + doors);
        System.out.println("Brand name " + brandName);
        System.out.println("Car label " + label);
        System.out.println("Registration " + (registration==true ? "yes" : "no"));

    }
}

class TestCar {
    public static void main(String[] args) {
        Car car = new Car();
        Car toyota = new Car();
        Car porsche = new Car();
    /*    System.out.println(porsche.brandName);
        System.out.println(porsche.doors);
        System.out.println(porsche.registration);*/
        porsche.move(1200);
/*        System.out.println(porsche.mileAge);
        System.out.println(porsche.wheels);*/
        porsche.registration = true;
        //porsche.color="Yellow";
        porsche.recolor("Pink");
        porsche.displayInfo();
    }
}