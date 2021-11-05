import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the first value?");
        double firstValue = sc.nextDouble();
        System.out.println("Chose the operation between (+, -, *, /, %)");
        String operation = sc.next();
        System.out.println("What is the second value?");
        double secondValue = sc.nextDouble();
        if (operation.equals("+")) {
            System.out.println(firstValue + secondValue);
        } else if (operation.equals("-")) {
            System.out.println(firstValue - secondValue);
        } else if (operation.equals("*")) {
            System.out.println(firstValue * secondValue);
        } else if (operation.equals("/")) {
            System.out.println(firstValue / secondValue);
        } else if (operation.equals("%")) {
            System.out.println(firstValue % secondValue);
        } else {
            System.out.println("You input unsupported operations!");
        }

    }
}
