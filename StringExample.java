public class StringExample {

    // String API Link - https://docs.oracle.com/javase/8/docs/api/java/lang/String.html

    public static void main(String[] args) {
        System.out.println("Convert of \"abc\" into upper case = " + "abc".toUpperCase());
        System.out.println("Convert of \"Abcd\" into lower case = " + "Abcd".toLowerCase());

        String name = "nageswara";
        String surname = "ambavaram";

        System.out.println("Length of " + name + " is : " + name.length());
        System.out.println("Char at 8th place from " + name + " is : " + name.charAt(8 - 1));
        System.out.println("a is at from first " + name.indexOf("a"));
        System.out.println("a is at from last " + name.lastIndexOf("a"));
        System.out.println("a is at " + name.indexOf("a", 5));

        System.out.println("Replace of " + name + " is " + name.replace("a", "$"));
//        System.out.println("Replace of " + name + " is " + name.replaceFirst("[a]", "$"));
        System.out.println("Substring of " + name + " is " + name.substring(4));
        System.out.println("Substring of " + name + " is " + name.substring(2, 4));

        System.out.println("Compare of \"B\" with \"B\" " + "B".compareTo("B"));
        System.out.println("Compare of \"A\" with \"B\" " + "A".compareTo("B"));
        System.out.println("Compare of \"B\" with \"A\" " + "B".compareTo("A"));

        System.out.println("Compare of \"B\" with \"B\" " + "B".compareTo("b"));
        System.out.println("Compare of \"B\" with \"B\" " + "b".compareTo("B"));
        System.out.println("Compare of \"B\" with \"B\" " + "B".compareToIgnoreCase("b"));

        int BValue = 'B';
        int bValue = 'b';
        System.out.println("B value is " + BValue);
        System.out.println("b value is " + bValue);

        System.out.println("My Name is " + name.concat(surname));
        System.out.println("My Name is " + String.join(" ", name, surname));

        System.out.println("Does " + name + " contains \"a\" " + name.contains("a"));
        System.out.println("Does " + name + " contains \"z\" " + name.contains("z"));

        System.out.println("Does \"Kalyani\" ends with \"i\" " + "Kalyani".endsWith("i"));
        System.out.println("Does \"nageswara\" ends with \"i\" " + "nageswara".endsWith("i"));
        System.out.println("Does \"sravana\" ends with \"i\" " + "sravana".endsWith("i"));
        System.out.println("Does \"pallavi\" ends with \"i\" " + "pallavi".endsWith("i"));

        System.out.println("Does \"Kalyani\" starts with \"K\" " + "Kalyani".startsWith("K"));
        System.out.println("Does \"nageswara\" starts with \"N\" " + "nageswara".startsWith("N"));
        System.out.println("Does \"sravana\" starts with \"s\" " + "sravana".startsWith("s"));
        System.out.println("Does \"pallavi\" starts with \"p\" " + "pallavi".startsWith("p"));

        System.out.println("Is \"pallavi\" empty " + "pallavi".isEmpty());
        System.out.println("Is \"\" empty " + "".isEmpty());

        System.out.println("Trip \"     pallavi    \"  " + "      pallavi         ".trim());

    }
}
