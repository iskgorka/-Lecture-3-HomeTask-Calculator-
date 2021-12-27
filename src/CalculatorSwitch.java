import java.util.Scanner;

public class CalculatorSwitch {
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
        while (true){
            String operation = sc.next();
            boolean shouldBreak = false;
            switch (operation) {
                case "+":
                    System.out.println(firstValue + secondValue);
                    shouldBreak = true;
                    break;
                case "-":
                    System.out.println(firstValue - secondValue);
                    shouldBreak = true;
                    break;
                case "*":
                    System.out.println(firstValue * secondValue);
                    shouldBreak = true;
                    break;
                case "/":
                    System.out.println(firstValue / secondValue);
                    shouldBreak = true;
                    break;
                case "%":
                    System.out.println(firstValue % secondValue);
                    shouldBreak = true;
                    break;
                default:
                    System.out.println("You input unsupported operations! Try again: ");
            }
            if (shouldBreak) break;
        }
    }
}

