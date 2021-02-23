package inheritance;

public class Academy {
    public Person[] persons;
    public int size;


    public Academy(int capacity) {
        persons = new Person[capacity];
        size = 0;
    }

    public boolean addPerson(Person person) {
        if (size < persons.length) {
            persons[size] = person;
            size++;
            return true;
        }
        return false;
    }

    public boolean deletePerson(Person person) {
        for (int i = 0; i < size; i++) {
            if (persons[i].equals(person)) {
                persons[i] = persons[size - 1];
                size--;
                return true;
            }
        }
        return false;
    }

    public void bubbleSort() {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < size - 1; i++) {
                if (persons[i].getAge() > persons[i + 1].getAge()) {
                    Person temp = persons[i];
                    persons[i] = persons[i + 1];
                    persons[i + 1] = temp;
                    unsorted = true;
                }
            }

        }

        for (int i = 0; i < size; i++) {
            System.out.print(persons[i].getAge() + " ");
        }

    }
}

