package basic;
import java.util.Scanner;

public class First_n_natural_number_sum {
    public static void main(String[] array) {
        try(Scanner in = new Scanner(System.in)){
            System.out.print("Enter a digit: ");
            int n = in.nextInt();
            System.out.println(first_n_natural_no_sum(n));
        }
    }

    public static int first_n_natural_no_sum(int n) {
        int ans  = n*(n+1)/2;
        return ans;
    }
}
