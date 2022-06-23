import javax.sound.midi.Soundbank;
import java.lang.reflect.GenericArrayType;

public class SortingPractice {
    public static void main(String[] args){
        int[] arr = {85, 3, 1, 32, 25};
        int[] arr2 = {99, 23, 6, 45, 1};
        int[] arr3 = {12, 34, 3, 4, 17};

        System.out.print("Array before sorting: ");
            printArray(arr);
        System.out.print("Array after sorting: "); //bubble sort
            bubbleSort(arr);
        System.out.println();

        System.out.print("Array2 before sorting: "); //selection sort
            printArray(arr2);
        System.out.print("Array2 after sorting: ");
            selectSort(arr2);
        System.out.println();

        System.out.print("Array3 before sorting: ");
            printArray(arr3);
        System.out.print("Array3 after sorting: "); //insertion sort
            insertSort(arr3);
        System.out.println();
    }

    public static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }
    public static void selectSort(int[] arr){
        int c = 0;
        for(int i = 0; i < arr.length; i++){
            int minIndex = arr[i];
            for(int j = c; j < arr.length; j++){
                if(arr[j] < minIndex) {
                    minIndex = arr[j];
                    int temp = arr[i];
                    arr[i] = minIndex;
                    arr[j] = temp;
                }
            }
            c++;
        }
        printArray(arr);
    }

    public static void insertSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            for(int j = i-1; j >=0; j--){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(i == arr.length-1){
                System.out.println(arr[i]);
            }
            else{
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
