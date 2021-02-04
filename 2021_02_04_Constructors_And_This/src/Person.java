public class Person {
    String firstName;
    String lastName;
    int passportID;
    String date;
    boolean marriageStatus;
    int children;
    String gender;
    //enum;

    public Person(int personID,
                  String personFN,
                  String personLN,
                  String personGender,
                  boolean personMstatus,
                  int personChildren) {
        firstName = personFN;
        lastName = personLN;
        passportID = personID;
        marriageStatus = personMstatus;
        children = personChildren;
        gender = personGender;
    }

    public Person(String personFN, int personID) {
        firstName = personFN;
        passportID = personID;
    }

    public Person(String personFN, int personID, String personGender, boolean marriageS) {
        firstName = personFN;
        passportID = personID;
        gender = personGender;
        marriageStatus = marriageS;
    }

    public void toDisplay() {
        System.out.println("Marriage status " + (marriageStatus ? "yes" : "no"));
        System.out.println("Name " + firstName);
        System.out.println("Gender " + gender);
    }
}

class PersonTest {
    public static void main(String[] args) {
        try2();


    }

    private static void try2() {
        Person javaCoder = new Person("Ilon", 100, "m", true);
        javaCoder.toDisplay();
    }

    private static void telRan() {
        Person student1 = new Person("Ganna", 1);
        System.out.println(student1.firstName);

        Person student2 = new Person("Natalia", 2);
        Person student3 = new Person("Ekaterina", 3);
        Person student4 = new Person("Anastasia", 4);

        Person[] group = new Person[]{student1, student2, student3, student4};
        System.out.println(group[2].firstName);
        System.out.println(group[2]);
    }
}

