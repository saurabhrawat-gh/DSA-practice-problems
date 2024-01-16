
import java.util.Scanner;

public class Square_root_of_number {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a digit ");
            int n = in.nextInt();
            int result = square_root_of_number(n);
            System.out.println(result);
        }
    }

    public static int square_root_of_number(int n) {
        int ans = 1;
        for(int i=1; i*i <= n; i++){
            ans = i;
        }
        return ans;
    }
}
