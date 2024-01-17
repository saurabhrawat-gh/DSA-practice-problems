import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {

    public static void main(String[] array) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print(" Enter arr size: ");
            int size = in.nextInt();

            System.out.print(" Enter rotating number: ");
            int k = in.nextInt();

            System.out.print(" Enter an arr: ");
            int[] arr = new int[size];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }

            rotateArrayByK(arr, k);
            System.out.println(Arrays.toString(arr));
        }
    }

    private static void rotateArrayByK(int[] arr, int k) {
        reverseArray(arr, 0, arr.length - 1);
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, arr.length - 1);
    }

    static void reverseArray(int[] arr, int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }

    }
}
