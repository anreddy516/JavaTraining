public class Variables {

    public static void main(String[] args) {
      // Variable must have a name
      // should start with a charter - For example - age, gender, name,
      // can have numbers and special characters - age

//        Variables must have a type

        boolean isAdult; // Person will become adult when he/she crosses 18 years
        isAdult = true;

        char personInitial;
        personInitial = 'A';

//        byte: 8-bit signed integer, range from -128 to 127.
        byte personAge;
        personAge = 50;

//        short: 16-bit signed integer, range from -32,768 to 32,767.
        short personMonthlySalary;
        personMonthlySalary = 8000;

//        int: 32-bit signed integer, range from -2,147,483,648 to 2,147,483,647.
        int personYearlySalary;
        personYearlySalary = 150000;

//        long: 64-bit signed integer, range from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
        long companyMarketCap;
        companyMarketCap = 10000000000000000L;

        float personHeight = 5.8f;

        double personWeight = 167.7;

        System.out.println("Is Person Adult = " + isAdult);
        System.out.println("Person Initials = " + personInitial);
        System.out.println("Person Age = " + personAge);
        System.out.println("Person Monthly Salary = " + personMonthlySalary);
        System.out.println("Person Yearly Salary = " + personYearlySalary);
        System.out.println("Company Market Cap = " + companyMarketCap);
        System.out.println("Person Height = " + personHeight);
        System.out.println("Person Weight = " + personWeight);

        int x;
        long y;

        x = 10000;
        y = 100000000000000L;
        System.out.println("x value is = " + x);
        System.out.println("y value is = " + y);

//        Type casting - Explicit type casting
        x = (int) y;
        System.out.println("After assigning long value to x value is = " + x);

        int[] personHoursWorkedInAWeek; // Declaring an integer array
        personHoursWorkedInAWeek = new int[7]; // Creating an integer array

        // Assigning values to array variable
        personHoursWorkedInAWeek[0] = 9;
        personHoursWorkedInAWeek[1] = 8;
        personHoursWorkedInAWeek[2] = 9;
        personHoursWorkedInAWeek[3] = 7;
        personHoursWorkedInAWeek[4] = 9;
        personHoursWorkedInAWeek[5] = 0;
        personHoursWorkedInAWeek[6] = 0;

        for(int i = 0; i < 7; i++) {
            System.out.println(personHoursWorkedInAWeek[i]);
        }
    }
}
