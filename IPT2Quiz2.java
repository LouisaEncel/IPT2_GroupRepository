
import java.util.Scanner;

public class IPT2Quiz2 {
    
    
    //Addition Method
    public static double addition(double num1, double num2) {
        return num1 + num2;
    }
    
    //Multiplication Method
    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }
   
    
    //Division Method
    public static double division(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Division by zero!");
            return Double.NaN; // NaN (Not a Number) represents an undefined result
        }
    }
    
    //Subtraction Method
     public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }
    
     
     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        char operation;

        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();
        
        System.out.print("Enter operation (+, -, *, /): ");
        operation = scanner.next().charAt(0);

        double result = 0;

        switch (operation) {
            case '+':
                result = addition(num1, num2);
                break;
            case '-':
                result = subtraction(num1, num2);
                break;
            case '*':
                result = multiplication(num1, num2);
                break;
            case '/':
                result = division(num1, num2);
                break;
            default:
                System.out.println("Invalid operation!");
                return;
        }

        System.out.println("Result: " + result);
    }
}