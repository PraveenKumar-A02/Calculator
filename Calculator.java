import java.util.Scanner;

// Interface for Calculator Operations
interface Operation {
    double execute(double firstNumber, double secondNumber);
}

// Addition Class
class Addition implements Operation {
    @Override
    public double execute(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }
}

// Subtraction Class
class Subtraction implements Operation {
    @Override
    public double execute(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }
}

// Multiplication Class
class Multiplication implements Operation {
    @Override
    public double execute(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }
}

// Division Class
class Division implements Operation {
    @Override
    public double execute(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return firstNumber / secondNumber;
    }
}

// Calculator Class
public class Calculator {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Start calculation....");
        calculator();
    }

    public static void calculator() {
        boolean shouldContinue = true;
        System.out.print("What's the first number?: ");
        double firstNumber = scanner.nextDouble();

        while (shouldContinue) {
            System.out.println("Available operations: + - * /");
            System.out.print("Pick an operation: ");
            char operation = scanner.next().charAt(0);

            System.out.print("What's the next number?: ");
            double secondNumber = scanner.nextDouble();

            Operation calculationFunction;

            switch (operation) {
                case '+':
                    calculationFunction = new Addition();
                    break;
                case '-':
                    calculationFunction = new Subtraction();
                    break;
                case '*':
                    calculationFunction = new Multiplication();
                    break;
                case '/':
                    calculationFunction = new Division();
                    break;
                default:
                    System.out.println("Invalid operation. Please try again.");
                    continue;
            }

            double result = calculationFunction.execute(firstNumber, secondNumber);
            System.out.println(firstNumber + " " + operation + " " + secondNumber + " = " + result);

            System.out.print("Type \"y\" to continue calculating with " + result + ", or type \"n\" to start a new calculation: ");
            String continueCalculation = scanner.next();

            if (continueCalculation.equalsIgnoreCase("y")) {
                firstNumber = result;
            } else {
                shouldContinue = false;
                System.out.println("Starting a new calculation...");
                calculator();
                return;
            }
        }
    }
}



//@GitHub PraveenKumar-A02
