import java.util.Scanner;

public class ProductSumDifference {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.print("Enter a digit: ");
            int n = in.nextInt();
            System.out.println(get_difference(n));
        }
    }

    private static int get_difference(int n) {
        int sum = 0;
        int product = 1;
        while(n > 0) {
            int r = n % 10;
            sum += r;
            product *= r;
            n /= 10;
        }
        return product - sum;
    }
}
