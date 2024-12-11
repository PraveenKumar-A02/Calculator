# Calculator Application (Java OOP)

This is a simple **Calculator Application** implemented in Java using Object-Oriented Programming (OOP) principles. The program supports basic arithmetic operations such as addition, subtraction, multiplication, and division.

## Features

- User-friendly console-based interaction.
- Implements OOP concepts such as interfaces and classes.
- Handles invalid operations and division by zero gracefully.
- Allows users to chain calculations or start new ones.

## How It Works

1. The user enters the first number.
2. The available operations (`+`, `-`, `*`, `/`) are displayed.
3. The user picks an operation and provides the next number.
4. The result is calculated and displayed.
5. The user can choose to continue with the result or start a new calculation.

## Classes and Structure

### 1. **`Operation` Interface**
Defines the method `execute` which performs the operation.

### 2. **Concrete Classes**
Implements the `Operation` interface for specific operations:
- `Addition`: Adds two numbers.
- `Subtraction`: Subtracts the second number from the first.
- `Multiplication`: Multiplies two numbers.
- `Division`: Divides the first number by the second, with a check for division by zero.

### 3. **`Calculator` Class**
- Handles user interaction and drives the program.
- Implements the logic for chaining calculations or restarting.

## Prerequisites

- **Java Development Kit (JDK)**: Ensure JDK 8 or above is installed.
- A code editor or IDE such as IntelliJ IDEA, Eclipse, or VS Code.

## How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/PraveenKumar-A02/Calculator.git
   ```
2. Navigate to the project directory:
   ```bash
   cd calculator-oop-java
   ```
3. Compile the code:
   ```bash
   javac Calculator.java
   ```
4. Run the application:
   ```bash
   java Calculator
   ```

## Example Output

```
Start calculation....
What's the first number?: 10
Available operations: + - * /
Pick an operation: +
What's the next number?: 5
10.0 + 5.0 = 15.0
Type "y" to continue calculating with 15.0, or type "n" to start a new calculation: n
Starting a new calculation...
```

## Error Handling

- Division by zero is not allowed and will throw an `ArithmeticException` with a descriptive message.
- Invalid operations prompt the user to re-enter a valid one.

## Contribution

Contributions are welcome! Feel free to submit a pull request or open an issue for improvements or bug fixes.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

Happy coding! 😊

