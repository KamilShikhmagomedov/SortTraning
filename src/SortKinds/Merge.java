package SortKinds;

public class Merge {
    public static void main(String[] args) {
        int [] array = {5, 1, 9, 5, 6, 2, 8, 6, 1, 4};
        printArray(array);
        System.out.println();
        mergeSort(array);
        printArray(array);
    }

    public static void mergeSort(int[] array){
        if(array.length <2) return;
        int middle = array.length/2;
        int left[] = new int[middle];
        int right[] = new int[array.length-middle];
        for(int i=0; i<middle; i++){
            left[i] = array[i];
        }
        for(int i=0; i<array.length-middle; i++){
            right[i] = array[middle+i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(array, right, left);
    }

    public static void merge(int[] array, int[] arrayL, int[] arrayR){
        int arrayLMinIndex = 0;
        int arrayRMinIndex = 0;
        int arrayMinIndex = 0;
        while (arrayLMinIndex < arrayL.length && arrayRMinIndex < arrayR.length){
            if (arrayL[arrayLMinIndex] < arrayR[arrayRMinIndex]){
                array[arrayMinIndex] = arrayL[arrayLMinIndex];
                arrayLMinIndex++;
            } else {
                array[arrayMinIndex] = arrayR[arrayRMinIndex];
                arrayRMinIndex++;
            }
            arrayMinIndex++;
        }
        while (arrayLMinIndex<arrayL.length){
            array[arrayMinIndex++] = arrayL[arrayLMinIndex++];
        }
        while (arrayRMinIndex<arrayR.length){
            array[arrayMinIndex++] = arrayR[arrayRMinIndex++];
        }
    }

    public static void printArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}