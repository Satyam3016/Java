import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        System.out.println("Choose an operation (+, -, *, /):");
        char op = sc.next().charAt(0);

        double result;
        switch (op) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': result = num1 / num2; break;
            default: System.out.println("Invalid operation!"); return;
        }

        System.out.println("The result is: " + result);
        sc.close();
    }
}
