package SortKinds;

public class Selection {
    public static void main(String[] args) {
        int [] array = {5, 1, 9, 5, 6, 2, 8, 6, 1, 4};
        printArray(array);
        System.out.println();
        selectionSort(array);
        printArray(array);
    }

    public static int[] selectionSort(int [] array){
        for (int i = 0; i < array.length; i++) {
            int key = array[i];
            int min_i = i;
            for (int j = i+1; j < array.length; j++) {
                if (key > array[j]){
                    key = array[j];
                    min_i = j;
                }
            }
            if (i != min_i){
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
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
