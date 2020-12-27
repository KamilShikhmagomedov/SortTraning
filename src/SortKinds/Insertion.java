package SortKinds;

public class Insertion {
    public static void main(String[] args) {
        int [] array = {5, 1, 9, 5, 6, 2, 8, 6, 1, 4};
        printArray(array);
        System.out.println();
        insertionSort(array);
        printArray(array);
    }

    public static int[]insertionSort(int [] array){
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i-1;
            while (j >= 0 && array[j] > key){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
        return array;
    }

    public static void printArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
