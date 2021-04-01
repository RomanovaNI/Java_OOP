package model;

public class PersonalPractiseArray {
    public static void main(String[] args) {
        //Пример: массив 1 2 3 4 5 6 становится 6 5 4 3 2 1, результат выведите на консоль из main()
        int[] array = {1, 2, 3, 4, 5, 6};

       printArray(array);
        reverseArray(array);
        printArray(array);
        printArray(toArray(array));
    }

    private static void printArray(int[] arr) {
        for (int r : arr) {
            System.out.print(r + ",");
        }
        System.out.println();
    }

    private static void reverseArray(int[] input) {

        for (int i = input.length - 1, j = 0; i > j; i--, j++) {
            int temp = input[i];//temp=6
            input[i]=input[j]; //last index of array->1
            input[j]=temp; //index 0->6
        }
    }

    public static int [] toArray(int[] input) {
        int [] newArr=  new int[input.length];
        for (int i = 0; i < input.length; i++) {

            newArr[i]=input[i];

        }
        return newArr;
    }
}
