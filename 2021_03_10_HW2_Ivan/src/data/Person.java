package data;

public class Person {
    String name;
    long id;
    int age;

    public Person() {
        name = "no name";
    }

    public Person(String name, long id, int age) {
        if (name == null || name.trim().isEmpty()) {
            this.name = "no name";
        } else {
            this.name = name;
        }
        if (id < 0) {
            System.out.println("wrong id");
        } else {
            this.id = id;
        }

        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            this.name = "wrong name";
        } else {
            this.name = name;
        }

    }

    public long getId() {
        return id;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150) {
            System.out.println("wrong age");
        } else {
            this.age = age;
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
