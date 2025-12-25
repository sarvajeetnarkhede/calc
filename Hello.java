import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Adding the numbers
        int sum = num1 + num2;

        // Displaying result
        System.out.println("Addition = " + sum);

        sc.close();
    }
}

