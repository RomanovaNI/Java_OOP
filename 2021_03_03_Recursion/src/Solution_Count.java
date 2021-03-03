public class Solution_Count {
    public static void main(String[] args) {
        System.out.println(count7(717));// → 2
        System.out.println(count7(7));// → 1
        System.out.println(count7(123));// → 0
        System.out.println(count7(767676));// → 3
        System.out.println(count7(8877778));// → 4

       /* int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{7};
        int[] arr3 = new int[]{7, 1, 7};*/
/*
        System.out.println(count7Array(arr1));
        System.out.println(count7Array(arr2));
        System.out.println(count7Array(arr3));*/
    }

   /* private static int count7Array(int[] n) {
        int count=0;
        for (int i = 0; i < n.length; i++) {
            if (n[i]==7){
                count++;
            }
        }
        return count;
    }*/

    private static int count7(int n) {
        int count = 0;
        char seven='7';
        String num= String.valueOf(n);
  //     System.out.println(num.substring(0,1));
        for (int i = 0; i < num.length(); i++) {
            if(num.charAt(i)==seven){
                count++;
            }
        }
        return count;
    }
    /*private static int count7Recursion(int n) {
        int count = 0;
        if (n % 10 == 7) {
            count++;
        } else if ( n / 10 == 7){
            count++;
        }
        return count;
    }*/
}
