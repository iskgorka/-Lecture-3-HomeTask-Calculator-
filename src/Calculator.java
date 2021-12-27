import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the first value?");
        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.println("Incorrect input. Try to use double: ");
        }
        double firstValue = sc.nextDouble();
        System.out.println("What is the second value?");
        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.println("Incorrect input. Try to use double: ");
        }
        double secondValue = sc.nextDouble();
        System.out.println("Chose the operation between (+, -, *, /, %)");
        do{
            String operation = sc.next();
            if (operation.equals("+")) {
                System.out.println(firstValue + secondValue);
                break;
            } else if (operation.equals("-")) {
                System.out.println(firstValue - secondValue);
                break;
            } else if (operation.equals("*")) {
                System.out.println(firstValue * secondValue);
                break;
            } else if (operation.equals("/")) {
                System.out.println(firstValue / secondValue);
                break;
            } else if (operation.equals("%")) {
                System.out.println(firstValue % secondValue);
                break;
            }
            else {
                System.out.println("You input unsupported operations! Try again: ");
            }
        }
        while (true);
        }
    }
