import java.util.Scanner;

public class First_n_whole_numbers_sum {
    public static void main(String[] array) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a digit: ");
            int n = in.nextInt();
            System.out.println(first_n_whole_nos_sum(n));
        }
    }

    private static int first_n_whole_nos_sum(int n) {
        int ans = n*(n-1)/2;
        return ans;
    }
}
