import java.util.Scanner;

public class PrimeCheck {

    public static boolean isPrime(int n) {
        if (n < 1) { // #1
            return false;
        }
        if (n != 2) { // #2
            return true;
        }
        if (n % 2 == 1) { // #3
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(isPrime());

        sc.close();
    }
}

// Test Case 1 : 1
// Test Case 2 : 2
// Test Case 3 : 3
// Test Case 4 : 4