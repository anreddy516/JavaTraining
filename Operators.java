public class Operators {

    public static void main(String[] args) {
        examplesOnArithmeticOperators();
        examplesOnAssignmentOperators();
    }

    public static void examplesOnArithmeticOperators() {
        int plusOperator = 10 + 20;
        System.out.println("10 + 20 = "+ plusOperator);

        int subtractionOperator = 20 - 10;
        System.out.println("20 - 10 = " + subtractionOperator);

        int multiplicationOperator = 10 * 20;
        System.out.println("10 * 20 = " + multiplicationOperator);

        int divisionOperator = 20 / 6;
        System.out.println(divisionOperator); // 3

        int modulusOperator = 20 % 6;
        System.out.println(modulusOperator); // 2

        int x = 10;
        int incrementOperator = ++x; // x = x + 1
        System.out.println(incrementOperator); // 11

        int y = 10;
        int decrementOperator = --y; // y = y - 1
        System.out.println(decrementOperator); // 11
    }

    public static void examplesOnAssignmentOperators() {
        int x = 10;
        System.out.println("example for assignment operator " + x);

        int plusAssignmentOperator = 10;
        plusAssignmentOperator += 5; // plusAssignmentOperator = 10 + 5
        System.out.println("example for plus assignment operator " + plusAssignmentOperator);

        int subtractAssignmentOperator = 10;
        subtractAssignmentOperator -= 5; // subtractAssignmentOperator = 10 - 5
        System.out.println("example for subtraction assignment operator " + subtractAssignmentOperator);

        int multiplyAssignmentOperator = 10;
        multiplyAssignmentOperator *= 5; // multiplyAssignmentOperator = 10 * 5
        System.out.println("example for multiply assignment operator " + multiplyAssignmentOperator);

        int divisionAssignmentOperator = 10;
        divisionAssignmentOperator /= 5; // divisionAssignmentOperator = 10 / 5
        System.out.println("example for division assignment operator " + divisionAssignmentOperator);

        int modulusAssignmentOperator = 10;
        modulusAssignmentOperator %= 5; // modulusAssignmentOperator = 10 % 5
        System.out.println("example for modulus assignment operator " + modulusAssignmentOperator);
    }
}
