import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//      1.Write a program that checks the role of the user
        System.out.println("Checking the user role");
        System.out.println("enter your role in the system:");
        String userRole = input.nextLine();

        if (userRole.equalsIgnoreCase("admin")){
            System.out.println("Welcome "+userRole.toLowerCase());
        } else if (userRole.equalsIgnoreCase("superuser")) {
            System.out.println("Welcome "+userRole.toLowerCase());
        } else if (userRole.equalsIgnoreCase("user")) {
            System.out.println("Welcome "+userRole.toLowerCase());
        } // sounds unnecessary to check (if conditions) because the user is entering it.
        // can be replaced with only the print statement

//      2.Take three numbers from the user and print the greatest number.
        System.out.println("Find max number");
        System.out.println("enter the first number:");
        float number = input.nextFloat();

        System.out.println("enter the second number:");
        float number2 = input.nextFloat();
        float max;

        if (number > number2){
            max = number;
        } else {
            max = number2;
        }

        System.out.println("enter the third number:");
        number = input.nextFloat();

        if (number > max){
            max = number;
        }

        System.out.println("the maximum number is " + max);

//      3.Write a Java program that generates an integer between 1 and 7
//      and displays the name of the weekday.

        System.out.println("Random number generator");
        Random rand = new Random();
        int dayOfWeek = rand.nextInt(7) + 1;

        switch (dayOfWeek){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 7:
                System.out.println("Friday");
                break;
            default:
                System.out.println("out of scope");
        }

//      4. Write a program that takes a numeric score as input and prints
//      the corresponding letter grade using the following grading scale:
        System.out.println("Grade evaluator:");
        int grade = -1;
        do {
            System.out.println("enter your grade (0 to 100):");
            grade = input.nextInt();
            if (grade < 0 || grade > 100){
                System.out.println("cant be, enter again!");
            }
        } while (grade < 0 || grade > 100);

        if (grade >=90){
            System.out.println('A');
        } else if (grade >=80){
            System.out.println('B');
        } else if (grade >=70){
            System.out.println('C');
        } else if (grade >=60){
            System.out.println('D');
        } else {
            System.out.println('F');
        }

//      5. Write a Java program that takes a person's age as input and
//      categorizes them into one of three age categories: "Child,"
//      "Teenager," or "Adult" using an if statement.
        System.out.println("Please enter your age");
        int age = input.nextInt();

        if (age < 13) {
            System.out.println("You are a child");
        } else if (age <= 19) {
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are an adult");
        }

    }
}
