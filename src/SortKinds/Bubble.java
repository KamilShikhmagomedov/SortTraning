package SortKinds;

public class Bubble {
    public static void main(String[] args) {
        int [] array = {5, 1, 9, 5, 6, 2, 8, 6, 1, 4};
        printArray(array);
        System.out.println();
        bubbleSort(array);
        printArray(array);
    }

    public static int[] bubbleSort(int [] array){
        for (int i = 0; i < array.length; i++) {
            int tmp = 0;
            for (int j = 0; j < array.length-1; j++) {
                if (array[j]>array[j+1]){
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        return array;
    }

    public static void printArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}