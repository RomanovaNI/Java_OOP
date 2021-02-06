import java.util.Arrays;

public class SwanUpdateTest {
    public static void main(String[] args) {
        SwanUpdate swan1 = new SwanUpdate("Lika", 5);
        SwanUpdate swan2 = new SwanUpdate("Nika", 1);

        SwanUpdate swan3 = new SwanUpdate("Rolf", "pelikasus", "grey", false);
        SwanUpdate swan4 = new SwanUpdate("Steven", "caucasus", "black", false);
        System.out.println(swan3.gender ? "female" : "male");

        SwanUpdate swan5 = new SwanUpdate(2, 2);
        SwanUpdate swan6 = new SwanUpdate(3, 5);

        SwanUpdate swan7 = new SwanUpdate("Erik", "fish");
        SwanUpdate swan8 = new SwanUpdate("Susanna", "bread");


        SwanUpdate[] lake = new SwanUpdate[]{swan1, swan2, swan5, swan6};
        System.out.println(lake[1].age);


        int count;
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
        //System.out.println(Arrays.toString(lake[1].age));

        System.out.print("[");
        for (int i = 0; i < lake.length - 1; i++) {
            System.out.print(lake[i].age + ", ");
        }
        System.out.println(lake[lake.length - 1].age + "]");
    }
    }

