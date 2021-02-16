import java.util.Arrays;

public class HW5 {
    public static void main(String[] args) {
        // 1.Given an array of ints, return true if the array contains no 1’s and no 3’s.
        int[] arr1 = new int[]{0, 2, 4};
        int[] arr2 = new int[]{1, 2, 3};
        int[] arr3 = new int[]{1, 2, 4};
        System.out.println(lucky13(arr1)); //→true
        System.out.println(lucky13(arr2));// →false
        System.out.println(lucky13(arr3));// →false

       /* 2. Given a number n, create and return a new int array of length n,
        containing the numbers 0, 1, 2, …n - 1. The given n may be 0, in which
        case just  return a length 0 array.You do not need a separate
        if -statement for the length -0 case; the for -loop should naturally execute 0 times in that
        case , so it just works.
        The syntax to make a new int array is:new int[desired_length] (See also:
        FizzBuzz Code)*/

        myPrint(fizzArray(4));
        System.out.println("========");
        // myPrint(fizzArray(0));
        System.out.println("========");
        myPrint(fizzArray(10));

        // 3.Given an array of ints, return true if it contains no 1’s or it contains no 4’s.
        int[] arr5 = new int[]{1, 2, 3};
        int[] arr6 = new int[]{1, 2, 3, 4};
        int[] arr7 = new int[]{2, 3, 4};

        System.out.println(no14(arr5));// →true
        System.out.println(no14(arr6));// →false
        System.out.println(no14(arr7));// →true

    }

    private static boolean no14(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 1 && input[input.length - 1] == 4) {
                return false;
            }
        }
        return true;
    }

    private static int[] fizzArray(int n) {
        int[] newArray = new int[n];
        if (n == 0) {
            newArray = new int[0];
        }
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i;


        }
        return newArray;
    }

    private static boolean lucky13(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 1 || input[i] == 3) {
                return false;
            }
        }
        return true;
    }

    public static void myPrint(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1]);
    }
}
