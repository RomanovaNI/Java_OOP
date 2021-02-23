package inheritance;

public class StartApplication {

    public static void main(String[] args) {
        //lessonStart();

        Person st1 = new Student("Паша", "Алексеев", "43534", "male", 18, "Tourism");
        Person st2 = new Student("Рита", "Иванова", "3564356345", "female", 22, "Political science");
        Person w1 = new Worker("Egor", "Sidorov", "43435", "male", 56, true);
        Person w2 = new Worker("Olga", "Sidorova", "43", "female", 66, false);
        Person t1 = new Teacher("David", "Fisher", "44444", "male", 43, 3500.3);
        Person t2 = new Teacher("Lara", "Kroft", "140818", "female", 33, 4567.3);
        Academy berlin = new Academy(8);
        berlin.addPerson(st1);
        berlin.addPerson(st2);
        berlin.addPerson(w1);
        berlin.addPerson(w2);
        berlin.addPerson(t1);
        berlin.addPerson(t2);


        berlin.bubbleSort();


        Student pasha = new Student("Паша", "Алексеев", "43534", "male", 18, "Tourism");
        Person dasha = new Student("Даша", "Семёнофф", "5345243", "female", 20, "Political science");
        Object rita = new Student("Рита", "Иванова", "3564356345", "female", 22, "Informatica");
        Person andrew = new Teacher();

        String hausmaster = "Василий";

        Student[] informatik = new Student[]{pasha, (Student) dasha, (Student) rita};
        Person[] newPersons = new Person[]{dasha, null, pasha, (Student) rita, andrew};
        Object[] myArr = new Object[]{dasha, pasha, rita, andrew, hausmaster};
        // Животное человек2 = new Человек;
        // Человек человек1 = new Человек;

    }

    private static void lessonStart() {
        Student sasha = new Student();
        sasha.study();
        sasha.eats();
        Teacher tch = new Teacher();
        Student glasha = new Student("Glasha", "Ivanova", "2021_021", "female", 17, "History");
        System.out.println(glasha);
        System.out.println("=========");
        Person ps = new Person();
        System.out.println(ps);
        System.out.println("=========");
        Teacher tc = new Teacher("Alina", "Orlova", "4958498569", "female", 45, 375.5);
        System.out.println(tc);
    }
}
