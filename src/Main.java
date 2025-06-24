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


    }
}
