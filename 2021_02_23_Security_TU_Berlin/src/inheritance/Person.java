package inheritance;

public class Person {
    private String firstName;
    private String secondName;
    private String uniID;
    private String gender;
    private int age;


    public Person(String firstName, String secondName, String uniID) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.uniID = uniID;

    }

    public Person() {
    }

    public Person(String firstName, String secondName, String uniID, String gender, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.uniID = uniID;
        this.gender = gender;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getUniID() {
        return uniID;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    void eats() {
        System.out.println("Lunch time 13:00");
    }

    void walks() {
        System.out.println("is walking");
    }
    void getsSalary(){
        System.out.println("gets salary!Wow");
    }

    @Override
    public String toString() {
        return "inheritance.Person {" +
                "first name " + firstName + " " +
                "second name " + secondName + " " +
                "uniID " + uniID + " " +
                "gender " + gender + " " +
                "age " + age +"}";
    }
}
