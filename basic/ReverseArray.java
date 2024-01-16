package basic;
import java.util.Arrays;
import java.util.Scanner;

class ReverseArray {
    public static void main(String[] array) {
        try (Scanner in = new Scanner(System.in)) {
            int[] arr = { 1,2,3,4,5 };
            reverseArray(arr);
            System.out.println(Arrays.toString(arr));
        }
    }

    static void reverseArray(int[] arr) {
        int i = 0;
        int j = arr.length -1;
        while(i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}