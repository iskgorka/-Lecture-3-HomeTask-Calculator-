import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the first value?");
        double firstValue = sc.nextDouble();
        System.out.println("Chose the operation between (+, -, *, /, %)");
        String operation = sc.next();
        System.out.println("What is the second value?");
        double secondValue = sc.nextDouble();

        switch (operation) {
            case "+":
                System.out.println(firstValue + secondValue);
                break;
            case "-":
                System.out.println(firstValue - secondValue);
                break;
            case "*":
                System.out.println(firstValue * secondValue);
                break;
            case "/":
                System.out.println(firstValue / secondValue);
                break;
            case "%":
                System.out.println(firstValue % secondValue);
                break;
            default:
                System.out.println("You input unsupported operations!");
        }
    }
}
