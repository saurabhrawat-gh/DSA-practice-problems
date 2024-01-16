

import java.util.Scanner;

class Number_of_factors {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a number: ");

            int n = in.nextInt();
            int count = number_of_factors(n);
            System.out.println(count);
        }
    }

    private static int number_of_factors(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i == n / i)
                    count++;
                else
                    count += 2;
            }
        }
        return count;
    }
}