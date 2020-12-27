package SortKinds;

public class Heap {
    public static void main(String[] args) {
        int [] array = {3, 1, 9, 5, 7, 2, 8, 6, 1, 4};
        printArray(array);
        System.out.println();
        heapSort(array);
        printArray(array);
    }

    public static void heapSort(int[] array){
        int length = array.length;
        for (int i = length / 2 - 1; i >= 0; i--)
            heapify(array, length, i);
        for (int i=length-1; i>=0; i--){
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
    }

    static void heapify(int arr[], int length, int i) {
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;
        if (left < length && arr[left] > arr[largest])
            largest = left;
        if (right < length && arr[right] > arr[largest])
            largest = right;
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, length, largest);
        }
    }

    public static void printArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}