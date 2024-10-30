
/**
 * Main
 * 1. Display option
 * - 1.1. display all the numbers
 * - 1.2. display the mean of the numbers
 * - 1.3. display the median of the numbers
 * - 1.4. display the mode (highest frequency) of the numbers
 * - 1.4. simple: display one of the modes of the number
 * 2. Allow users to enter a list of numbers
 * 3. They can also choose to delete, update a number which they have added
 * OR clear the entire list without having to exit the program
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Declaring the number list and scanner
        ArrayList<Integer> numberList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // display a menu that allows the user to choose
        // between seeing all the guests, adding a new guest
        // editing a guest or removing a guest
        while (true) {
            displayMenu();
            int choice = makeAChoice(sc, 1, 6);

            // implement the other options
            if (choice == 1) {
                displayOption1();
                int displayChoice = makeAChoice(sc, 1, 4);
                if (displayChoice == 1) {
                    displayList(numberList, sc);
                }
                if (displayChoice == 2) {
                    displayMean(numberList);
                }
                if (displayChoice == 3) {
                    displayMedian(numberList);
                }
                if (displayChoice == 4) {
                    displayMode(numberList);
                }

            }
            if (choice == 2) {
                // add a new guest
                addNumber(numberList, sc);
            }
            if (choice == 3) {
                deleteNumber(numberList, sc);
            }
            if (choice == 4) {
                updateNumber(numberList, sc);
            }
            if (choice == 5) {
                clearNumberList(numberList, sc);
            }
            if (choice == 6) {
                break;
            }
        }
        System.out.println("Goodbye!");
    }

    // Main Menu
    public static void displayMenu() {
        System.out.println("");
        System.out.println("====================");
        System.out.println("1. Display option");
        System.out.println("2. Input a new number into number list");
        System.out.println("3. Delete a number from the number list");
        System.out.println("4. Update a number from the number list");
        System.out.println("5. Clear the number list");
        System.out.println("6. Exit program");

    }

    // make a choice function
    public static Integer makeAChoice(Scanner sc, int lowerBound, int upperBound) {
        int choice;
        while (true) {
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            // clear the keyboard buffer to get rid of the \n in there
            sc.nextLine();
            System.out.println("Your choice: " + choice);
            if (choice >= lowerBound && choice <= upperBound) {
                System.out.println("");
                break;
            } else {
                System.out.println("Please enter between " + lowerBound + " to " + upperBound);
            }
        }
        return choice;
    }

    // 1: Display menu
    public static void displayOption1() {
        System.out.println("====================");
        System.out.println("1. Get list of all numbers");
        System.out.println("2. Get the mean of all the numbers");
        System.out.println("3. Get the median of all the numbers");
        System.out.println("4. Get the mode (highest frequency) of all the numbers");
    }

    // 1.1: Display number list
    public static void displayList(ArrayList<Integer> numberList, Scanner sc) {
        System.out.println("Display number List");
    }

    // 1.2: Display mean of number list
    public static void displayMean(ArrayList<Integer> numberList) {
        System.out.println("Mean of number List");
    }

    // 1.3: Display median of number list
    public static void displayMedian(ArrayList<Integer> numberList) {
        System.out.println("Median number List");
    }

    // 1.4: Display mode of number list
    public static void displayMode(ArrayList<Integer> numberList) {
        System.out.println("Mode of number List");
    }

    // 2: Input a new number into number list
    public static void addNumber(ArrayList<Integer> numberList, Scanner sc) {
        System.out.println("Input the new number: ");
    }

    // 3: Delete a number from number list
    public static void deleteNumber(ArrayList<Integer> numberList, Scanner sc) {
        System.out.println("Delete a number: ");
    }

    // 4: Delete a number from number list
    public static void updateNumber(ArrayList<Integer> numberList, Scanner sc) {
        System.out.println("Update a number: ");
    }

    // 5: Delete a number from number list
    public static void clearNumberList(ArrayList<Integer> numberList, Scanner sc) {
        System.out.println("Clear number list");
    }
}