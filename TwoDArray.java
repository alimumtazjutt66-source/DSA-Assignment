import java.util.Scanner;

public class TwoDArray {

    static Scanner sc = new Scanner(System.in);

    static int[][] arr = new int[3][3];

    // Add Value Method
    static void addValue() {

        System.out.print("Enter row (0-2): ");
        int row = sc.nextInt();

        System.out.print("Enter column (0-2): ");
        int col = sc.nextInt();

        System.out.print("Enter value: ");
        int value = sc.nextInt();

        arr[row][col] = value;

        System.out.println("Value added successfully.");
    }

    // Delete Value Method
    static void deleteValue() {

        System.out.print("Enter row (0-2): ");
        int row = sc.nextInt();

        System.out.print("Enter column (0-2): ");
        int col = sc.nextInt();

        arr[row][col] = 0;

        System.out.println("Value deleted successfully.");
    }

    // Search Value Method
    static void searchValue() {

        System.out.print("Enter value to search: ");
        int value = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (arr[i][j] == value) {

                    System.out.println(
                        "Value found at row " + i +
                        " and column " + j
                    );

                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Value not found.");
        }
    }

    // Display Method
    static void display() {

        System.out.println("\n2D Array:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }

    // Main Method
    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Value");
            System.out.println("2. Delete Value");
            System.out.println("3. Search Value");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addValue();
                    break;

                case 2:
                    deleteValue();
                    break;

                case 3:
                    searchValue();
                    break;

                case 4:
                    display();
                    break;

                case 5:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);
    }
}