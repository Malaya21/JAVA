//Operators in Java
//Arithmetic Operators
//Assignment Operators
//Comparison Operators
//Logical Operators
//Bitwise Operators
//Ternary Operator
//Instanceof Operator
//unary Operator
//Shift Operator

public class Oprators {
    public static void main(String[] args) {
        //Arithmetic Operators
        int a = 10;
        int b = 20;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
        //Assignment Operators
        int c = 10;
        c += 5;
        System.out.println("Assignment Operators: " + c);
        //Comparison Operators
        //== != > < >= <=
        int d = 10;
        int e = 20;
        System.out.println("Comparison Operators: " + (d == e));
        //Logical Operators
        //&& || !
        boolean f = true;
        boolean g = false;
        System.out.println("Logical Operators: " + (f && g));
       //unaray Operator
       //++ --
        int h = 10;
        System.out.println("Unary Operator: " + h++);
        //Shift Operator
        //<< >> >>>
        int i = 10;
        System.out.println("Shift Operator: " + (i << 2));
       
        //Ternary Operator
        //Syntax: (condition) ? statement1 : statement2
        int j = 10;
        int k = 20;
        int l = (j < k) ? j : k;
        System.out.println("Ternary Operator: " + l);
        //Bitwise Operators
        //& | ^ ~ << >> >>>
        int m = 10;
        int n = 20;
        System.out.println("Bitwise Operators: " + (m & n));
        //Instanceof Operator
        String str = "Hello";
        System.out.println("Instanceof Operator: " + (str instanceof String));

    }
}
