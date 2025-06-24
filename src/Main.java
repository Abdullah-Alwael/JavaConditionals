import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         /*
        * Write a program that takes two strings as input and check if they are equal,
            ignoring the case, then prints whether they are equal or not.
        * */
        Scanner input = new Scanner(System.in);

        System.out.println("String comparison");
        System.out.println("Enter first string");
        String firstString = input.nextLine();

        System.out.println("Enter the second string:");
        String secondString = input.nextLine();

        if (firstString.equalsIgnoreCase(secondString)){
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
