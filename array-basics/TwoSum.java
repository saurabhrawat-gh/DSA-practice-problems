import java.util.Arrays;
import java.util.Scanner;

/*
 * Not the optimum solution,
 * will cover later with two pointer method,
 * or hashmaps
 */
public class TwoSum {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter array size: ");
            int size = in.nextInt();

            System.out.print("Enter k: ");
            int k = in.nextInt();

            System.out.print("Enter an array: ");
            int[] arr = new int[size];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }

            int[] ans = twoSum(arr, k);
            System.out.println(Arrays.toString(ans));
        }
    }

    private static int[] twoSum(int[] arr, int k) {
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] + arr[j] == k)
                    return new int[] { i, j };
            }
        }
        return new int[] { -1, -1 };
    }
}
