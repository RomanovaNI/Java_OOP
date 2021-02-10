public class SwanUpdate {
    String name;
    String breed;
    int age;
    double weight;
    int meter;
    String color;
    String food;
    boolean gender;

    public SwanUpdate(String swanName, int swanAge) {
        name = swanName;
        age = swanAge;
    }
    public SwanUpdate(String name, String breed, String color, boolean gender) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.gender = gender;
    }
    public SwanUpdate (int age, int weight){
        this.age=age;
        this.weight=weight;
    }

    public SwanUpdate (String swanName, String swanFood){
        name=swanName;
        food=swanFood;
    }
  public SwanUpdate (int meter, String breed) {
        this.breed = breed;
        this.meter = meter;
    }




}
