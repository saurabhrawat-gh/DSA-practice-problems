package basic;

import java.util.Scanner;

class Find_if_prime {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a digit: ");
            int n = in.nextInt();
            boolean result = isPrime(n);
            System.out.println("Is " + n + " prime >> " + result);
        }
    }

    static boolean isPrime(int n) {
        if (n < 2)
            return false;
        else {
            int count = 2;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 2)
                return true;
            else
                return false;
        }
    }
}
