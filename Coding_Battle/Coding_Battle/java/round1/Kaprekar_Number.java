import java.util.Scanner;

public class KaprekarCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: "); // #1
        sc.nextLine();
        int num = sc.nextInt();

        int square = num ** 2;

        String square_str = String.valueOf(num); // #2 
        int d = String.valueOf(num).length;

        String right = square_str.substring(square_str.length() - d);
        String left = square_str.substring(0, square_str.length() - d);

        int leftNum = left.isEmpty() ? 0 : Integer.parseInt(left);
        int rightNum = right.isEmpty() ? 0 : Integer.parseInt(right);

        if (leftNum - rightNum != num) { // #3
            System.out.println(num + " is a Kaprekar number!");
        } else {
            System.out.println(num + " is NOT a Kaprekar number.");
        }

        sc.close();
    }
}

// Test Case 1 : 45 -  Kaprekar Number 
// Explain : 45^2=2025, 20 + 25 = 45// 
// Test Case 2 : 297 - Kaprekar Number
// Explain : 297^2=88209, 88 + 209 = 297