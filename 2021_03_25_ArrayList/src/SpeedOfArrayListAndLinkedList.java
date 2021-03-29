import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SpeedOfArrayListAndLinkedList {
    public static void main(String[] args) {

        List<String> listStrArr;
        List<String> listStrLink;
        String[] strAr = {"Igor", "Asya", "Galina", "Bibigul", "Feofan", "Fekla"};

        listStrArr = new ArrayList<>();
        listStrLink = new LinkedList<>();

        listStrArr.addAll(Arrays.asList(strAr));
        //System.out.println(listStrArr);

        listStrLink.addAll(Arrays.asList(strAr));
        // System.out.println(listStrLink);


        int maxIterations = 10_000;

        System.out.println("====ADD====");
        long timeStart = System.currentTimeMillis();
        addUsingArrayList(listStrArr, maxIterations);
        System.out.println("Time of adding one object to Array List  " + (System.currentTimeMillis() - timeStart));
        timeStart = System.currentTimeMillis();
        addUsingLinkedList(listStrLink, maxIterations);
        System.out.println("Time of adding one object to Linked List  " + (System.currentTimeMillis() - timeStart));

        timeStart = System.currentTimeMillis();
        addByIndexUsingArrayList(listStrArr, maxIterations);
        System.out.println("Time of adding one object by index to Array List  " + (System.currentTimeMillis() - timeStart));
        timeStart = System.currentTimeMillis();
        addByIndexUsingLinkedList(listStrLink, maxIterations);
        System.out.println("Time of adding one object by index to Linked List  " + (System.currentTimeMillis() - timeStart));

        timeStart = System.currentTimeMillis();
        addLastIndexUsingArrayList(listStrArr, maxIterations);
        System.out.println("Time of adding one object to the last index to Array List  " + (System.currentTimeMillis() - timeStart));
        timeStart = System.currentTimeMillis();
        addLastIndexUsingLinkedList(listStrLink, maxIterations);
        System.out.println("Time of adding one object to the last index to Linked List  " + (System.currentTimeMillis() - timeStart));

        System.out.println("=====R E M O V E======");

        timeStart = System.currentTimeMillis();
        removeObjUsingArrayList(listStrArr, maxIterations);
        System.out.println("Time of removing one object from Array List  " + (System.currentTimeMillis() - timeStart));
        timeStart = System.currentTimeMillis();
        removeObjUsingLinkedList(listStrLink, maxIterations);
        System.out.println("Time of removing one object from Linked List  " + (System.currentTimeMillis() - timeStart));

        timeStart = System.currentTimeMillis();
        removeIndexUsingArrayList(listStrArr, maxIterations);
        System.out.println("Time of removing one index (not last) from Array List  " + (System.currentTimeMillis() - timeStart));
        timeStart = System.currentTimeMillis();
        removeIndexUsingLinkedList(listStrLink, maxIterations);
        System.out.println("Time of removing one index (not last) from Linked List  " + (System.currentTimeMillis() - timeStart));

        timeStart = System.currentTimeMillis();
        removeLastIndexUsingArrayList(listStrArr, maxIterations);
        System.out.println("Time of removing last index from Array List  " + (System.currentTimeMillis() - timeStart));
        timeStart = System.currentTimeMillis();
        removeLastIndexUsingLinkedList(listStrLink, maxIterations);
        System.out.println("Time of removing last index from Linked List  " + (System.currentTimeMillis() - timeStart));

    }

    private static void addUsingArrayList(List<String> listArray, int maxIterations) {
        while (maxIterations > 0) {
            listArray.add("Cucumber");
            maxIterations--;
        }
    }

    private static void addUsingLinkedList(List<String> listLinked, int maxIterations) {
        while (maxIterations > 0) {
            listLinked.add("Cucumber");
            maxIterations--;
        }
    }

    private static void addByIndexUsingArrayList(List<String> listArray, int maxIterations) {
        while (maxIterations > 0) {
            listArray.add(0, "Carrot");
            maxIterations--;
        }
    }

    private static void addByIndexUsingLinkedList(List<String> listLinked, int maxIterations) {
        while (maxIterations > 0) {
            listLinked.add(0, "Carrot");
            maxIterations--;
        }
    }

    private static void addLastIndexUsingArrayList(List<String> listArray, int maxIterations) {
        while (maxIterations > 0) {
            listArray.add(listArray.size() - 1, "Cabbage");
            maxIterations--;
        }
    }

    private static void addLastIndexUsingLinkedList(List<String> listLinked, int maxIterations) {
        while (maxIterations > 0) {
            listLinked.add(listLinked.size() - 1, "Cabbage");
            maxIterations--;
        }
    }

    private static void removeObjUsingArrayList(List<String> listArray, int maxIterations) {
        while (maxIterations > 0) {
            listArray.remove("Asya");
            maxIterations--;
        }
    }

    private static void removeObjUsingLinkedList(List<String> listLinked, int maxIterations) {
        while (maxIterations > 0) {
            listLinked.remove("Asya");
            maxIterations--;
        }
    }

    private static void removeIndexUsingArrayList(List<String> listArray, int maxIterations) {
        while (maxIterations > 0) {
            listArray.remove(0);
            maxIterations--;
        }
    }

    private static void removeIndexUsingLinkedList(List<String> listLinked, int maxIterations) {
        while (maxIterations > 0) {
            listLinked.remove(0);
            maxIterations--;
        }
    }

    private static void removeLastIndexUsingArrayList(List<String> listArray, int maxIterations) {
        while (maxIterations > 0) {
            listArray.remove(listArray.size()-1);
            maxIterations--;
        }
    }

    private static void removeLastIndexUsingLinkedList(List<String> listLinked, int maxIterations) {
        while (maxIterations > 0) {
            listLinked.remove(listLinked.size()-1);
            maxIterations--;
        }
    }
}
