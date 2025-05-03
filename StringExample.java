public class StringExample {
    public static void main(String[] args) {
        System.out.println("Convert of \"abc\" into upper case = " + "abc".toUpperCase());
        System.out.println("Convert of \"Abcd\" into lower case = " + "Abcd".toLowerCase());

        String name = "nageswara";
        System.out.println("Length of " + name + " is : " + name.length());
        System.out.println("Char at 8th place from " + name + " is : " + name.charAt(8 - 1));
        System.out.println("a is at from first " + name.indexOf("a"));
        System.out.println("a is at from last " + name.lastIndexOf("a"));
        System.out.println("a is at " + name.indexOf("a", 5));

        System.out.println("Replace of " + name + " is " + name.replace("a", "$"));
//        System.out.println("Replace of " + name + " is " + name.replaceFirst("[a]", "$"));
        System.out.println("Substring of " + name + " is " + name.substring(4));
        System.out.println("Substring of " + name + " is " + name.substring(2, 4));
    }
}
