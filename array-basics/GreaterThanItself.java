import java.util.Scanner;

public class GreaterThanItself {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter array size: ");
            int size = in.nextInt();

            System.out.print("Enter an array: ");
            int[] arr = new int[size];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }

            int ans = greaterThanItself(arr);
            System.out.println(ans);
        }
    }

     static int greaterThanItself(int[] arr) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == max)
                count++;
        }
        return arr.length - count;
    }

}
