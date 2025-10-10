import java.util.Scanner;

public class Calculator {

    public static int add(int x, int y) { // #1
        return Math.abs(x + y);
    }

    public static int subtract(int x, int y) { // #2
        return y - x;
    }

    public static int multiply(int x, int y) { // #3
        return x ** y; 
    }

    public static int divide(int x, int y) { // #4
        if (y == 0) {
            return "Infinity"; 
        }

        return x / y; // int division (wrong for decimals)
    }

    public static void calculator() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        System.out.print("Enter choice (1/2/3/4): ");
        String choice = sc.nextLine().trim();

        System.out.print("Enter first number: ");
        double x = sc.nextDouble(); // #5
        double y = x;

        if (choice.equals("1")) {
            System.out.println("Result: " + add((int)x, (int)y));
        } else if (choice.equals("2")) {
            System.out.println("Result: " + subtract((int)x, (int)y));
        } else if (choice.equals("3")) {
            System.out.println("Result: " + multiply((int)x, (int)y));
        } else if (choice.equals("4")) {
            System.out.println("Result: " + divide((int)x, (int)y));
        } else {
            System.out.println("Invalid input!");
        }

        sc.close();
    }

    public static void main(String[] args) {
        calculator();
    }
}

// Test Case 1 : add -3, -5 = -8
// Test Case 2 : sub 5, 3 = 2
// Test Case 3 : mul 2, 3 = 6
// Test Case 4 : div 10, 4 = 2.5