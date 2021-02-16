public class Exercise {
    public static void main(String[] args) {
        int[] newArray = CoktailSort.createArray(10);
        int[] secondArray = new int[]{100, 5, 36, 56, 90, 3, 5, 68};
        int[] defaultArray = new int[10];

        int[] idealArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] newUnsortArray = unsortArray(idealArray);
        CoktailSort.myPrint(newUnsortArray);


    }

    private static int[] unsortArray(int[] idealArray) {
        // 1.у нас есть отсортированный массив
        // 2.надо его перемешать рандомно
        // 3.Создадим новый массив той же длины
        // 4.В него мы будем переписывать данные
        // 5.По исходному массиву мы идём циклом
        // 6.Мы генерируем случайное число в диапазоне длины массива (Math.random)
        // 7.ЕСЛИ ИНДЕКС случайного числа в НОВОМ массиве уже прописан, то генерируем число заново
        int[] output = new int[idealArray.length];
        int count = 0;
        for (int i = 0; i < idealArray.length; i++) {
            int temp = generateRandomIndex(idealArray.length);
            while (output[temp] != 0) {

                count++;
                temp = generateRandomIndex(idealArray.length);
            }
            output[temp] = idealArray[i];

        }
        System.out.println("Kolichestvo raz " + count);
        return output;
    }

    private static int generateRandomIndex(int diapazon) {
        return (int) (Math.random() * diapazon);
    }
}
