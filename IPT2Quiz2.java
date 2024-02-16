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
    
    public static void main(String[] args) {
        // Main program logic will go here
    }
}

