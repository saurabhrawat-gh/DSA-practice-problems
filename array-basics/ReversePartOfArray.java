import java.util.Arrays;
import java.util.Scanner;

public class ReversePartOfArray {
    public static void main(String[] array) {
        try(Scanner in = new Scanner(System.in)){
            System.out.print(" Enter arr size: ");
            int size = in.nextInt();

            System.out.print(" Enter an arr: ");
            int [] arr = new int[size];

            for(int i=0; i< arr.length; i++) {
                arr[i] = in.nextInt();
            }
            int s = 3;
            int e = 7;
            reversePartOfArray(arr, s, e);
            System.out.println(Arrays.toString(arr));
        }
    }

    static void reversePartOfArray(int[] arr, int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }

    }
}
