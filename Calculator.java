public class Calculator {

    public static void main(String[] args) {
        Calculator cal = new Calculator();

        int add = cal.add(10, 20);
        System.out.println("Addition of 10 and 20 is : " + add);

        int sub = cal.sub(20, 10);
        System.out.println("Subtraction of 20 and 10 is : " + sub);

        int mul = cal.mul(10, 20);
        System.out.println("Multiplication of 10 and 20 is : " + mul);

        System.out.println("Division of 20 by 10 is : " + cal.div(20, 10));

        System.out.println("Modulus of 20 by 10 is : " + cal.mod(20, 10));
    }
    // Addition : sum = a + b -> a and b are operands/variable. +, *, /, -, % are operators

    int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // Subtraction : sub = a - b
    int sub(int a, int b) {
        int sub = a - b;
        return sub;
    }

    // Multiplication : mul = a * b
    int mul(int a, int b) {
        int m = a * b;
        return m;
    }

    // Division : div = a / b
    int div(int a, int b) {
        return a / b;
    }

    // Modulus : mod = a % b
    int mod(int a, int b) {
        return a % b;
    }
}
