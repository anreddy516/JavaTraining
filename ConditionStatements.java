public class ConditionStatements {

    public static void main(String[] args) {
        exampleIfConditionStatement();
        exampleForElseConditionStatement();
        exampleForElseIfConditionStatement();
        exampleForSwitchConditionStatement();
        isPersonEligibleToVote();
        isNumberEvenOrNot();
    }

    public static void exampleIfConditionStatement() {
        int a = 20;
        int b = 18;

        if ( a > b) {
            System.out.println(a + " is greater than " + b);
        }

        if ( b < a) {
            System.out.println(b + " is less than " + a);
        }
    }

    public static void exampleForElseConditionStatement() {
        int time = 20;

        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
    }

    public static void exampleForElseIfConditionStatement() {
        int time = 8;

        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
    }

    public static void exampleForSwitchConditionStatement() {
        int day = 5;

        switch (day) {
            case 1: // Is day equals to 1
                System.out.println("Monday");
                break;
            case 2: // Is day equals to 2
                System.out.println("Tuesday");
                break;
            case 3: // Is day equals to 3
                System.out.println("Wednesday");
                break;
            case 4:  // Is day equals to 4
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    public static void isPersonEligibleToVote() {
        int age = 20;
        if (age >= 21) {
            System.out.println("Person is eligible to vote");
        } else {
            System.out.println("Person is NOT eligible to vote");
        }
    }

    public static void isNumberEvenOrNot() {
        int num = 10;

        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}
