package SortKinds;

public class Quick {
    public static void main(String[] args) {
        int [] array = {3, 1, 9, 5, 7, 2, 8, 6, 1, 4};
        printArray(array);
        System.out.println();
        quickSort(array, 0, array.length-1);
        printArray(array);
    }

    public static void quickSort(int[] array, int from, int to){
        if (from < to){
            int baseIndex = partition(array, from, to);
            quickSort(array, from, baseIndex-1);
            quickSort(array, baseIndex, to);
        }
    }

    public static int partition(int[] array, int from, int to){
        int indexRight = to;
        int indexLeft = from;
        int baseElement = array[from];
        while (indexLeft <= indexRight){
            while (array[indexLeft]<baseElement){
                indexLeft++;
            }
            while (array[indexRight]>baseElement){
                indexRight--;
            }
            if (indexLeft <= indexRight){
                swap(array, indexRight, indexLeft);
                indexLeft++;
                indexRight--;
            }
        }
        return indexLeft;
    }

    public static void swap(int[] array, int indexRight, int indexLeft){
        int tmp = array[indexRight];
        array[indexRight] = array[indexLeft];
        array[indexLeft] = tmp;
    }

    public static void printArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
