import java.util.Arrays;

public class SwanTest {
    public static void main(String[] args) {
        Swan swan1 = new Swan("Lika", 5);
        Swan swan2 = new Swan("Nika", 1);

        Swan swan3 = new Swan("Rolf", "pelikasus", "grey", false);
        Swan swan4 = new Swan("Steven", "caucasus", "black", false);
        // System.out.println(swan3.gender ? "female" : "male");

        Swan swan5 = new Swan(12, 2);
        Swan swan6 = new Swan(3, 5);

        Swan swan7 = new Swan("Erik", "fish");
        Swan swan8 = new Swan("Susanna", "bread");


        Swan[] lake = new Swan[]{swan1, swan2, swan5, swan6};

        // System.out.println(lake[1].age);

     /* int count;
        do {
            count = 0;
            for (int i = 0; i < lake.length - 1; i++) {
                if (lake[i].age > lake[i + 1].age) {
                   int temp = lake[i].age;
                   lake[i].age = lake[i + 1].age;
                    lake[i + 1].age = temp;
                    count++;
                }
            }
        }
        while (count > 0);
        printAge(lake);*/


        printLake(lake);
        printLake(deleteElement(2, lake));
        Swan swan10 = new Swan("Jane", 13);
        printLake(addElement(0, lake, swan10));
        printAge(addElement(0, lake, swan10));
        printLake(updateElement(0, lake, swan10));
        printAge(updateElement(0, lake, swan10));
    }


    private static void printAge(Swan[] input) {
        System.out.print("[");
        for (int i = 0; i < input.length - 1; i++) {
            System.out.print(input[i].age + ", ");
        }
        System.out.println(input[input.length - 1].age + "]");
    }

    private static Swan[]updateElement(int index, Swan[] input, Swan element) {
        Swan[] pound = new Swan[input.length];
        for (int i = 0; i < pound.length; i++) {
            pound[i]=input[i];
        }
        pound[index] = element;
        return pound;
    }

    private static Swan[] addElement(int index, Swan[] input, Swan element) {
        Swan[] pound = new Swan[input.length + 1];
        pound[index] = element;
        for (int i = 0; i < index; i++) {
            pound[i] = input[i];
        }
        for (int i = index; i < input.length; i++) {
            pound[i + 1] = input[i];
        }
        return pound;
    }

    private static Swan[] deleteElement(int index, Swan[] input) {
        Swan[] pound = new Swan[input.length - 1];
        for (int i = 0; i < index; i++) {
            pound[i] = input[i];
        }
        for (int i = index; i < pound.length; i++) {
            pound[i] = input[i + 1];
        }
        return pound;
    }

    private static void printLake(Swan[] input) {
        System.out.print("[");
        for (int i = 0; i < input.length - 1; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println(input[input.length - 1] + "]");
    }

}

