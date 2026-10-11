import java.util.Scanner;

public class ArrayOperations {
    static final int MAX = 10;
    static int[] arr = new int[MAX];
    static int n = 0;
    static Scanner sc = new Scanner(System.in);

    static void addValue() {
        if (n == MAX) { System.out.println("Array is full!"); return; }
        System.out.print("Enter book ID: ");
        arr[n++] = sc.nextInt();
    }

    static void insertAt() {
        if (n == MAX) { System.out.println("Array is full!"); return; }
        System.out.print("Enter index (0 to " + n + "): ");
        int idx = sc.nextInt();
        if (idx < 0 || idx > n) { System.out.println("Invalid index!"); return; }
        System.out.print("Enter value: ");
        int v = sc.nextInt();
        for (int i = n; i > idx; i--) arr[i] = arr[i - 1];
        arr[idx] = v;
        n++;
    }

    static void fillArray() {
        System.out.println("Enter values (-1 to stop):");
        while (n < MAX) {
            int v = sc.nextInt();
            if (v == -1) break;
            arr[n++] = v;
        }
        if (n == MAX) System.out.println("Array is full.");
    }

    static void deleteLast() {
        if (n == 0) { System.out.println("Array is empty!"); return; }
        System.out.println("Deleted: " + arr[--n]);
    }

    static void deleteByIndex() {
        if (n == 0) { System.out.println("Array is empty!"); return; }
        System.out.print("Enter index (0 to " + (n - 1) + "): ");
        int idx = sc.nextInt();
        if (idx < 0 || idx >= n) { System.out.println("Invalid index!"); return; }
        System.out.println("Deleted: " + arr[idx]);
        for (int i = idx; i < n - 1; i++) arr[i] = arr[i + 1];
        n--;
    }

    static void display() {
        if (n == 0) { System.out.println("Array is empty!"); return; }
        System.out.print("Elements: ");
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void searchValue() {
        System.out.print("Enter value to search: ");
        int v = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == v) {
                System.out.println("Found at index " + i);
                return;
            }
        }
        System.out.println("Value not found.");
    }

    static void getAt() {
        System.out.print("Enter index: ");
        int idx = sc.nextInt();
        if (idx < 0 || idx >= n) { System.out.println("Invalid index!"); return; }
        System.out.println("Value = " + arr[idx]);
    }

    static void replaceAt() {
        System.out.print("Enter index: ");
        int idx = sc.nextInt();
        if (idx < 0 || idx >= n) { System.out.println("Invalid index!"); return; }
        System.out.print("Enter new value: ");
        arr[idx] = sc.nextInt();
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n----- ARRAY MENU -----");
            System.out.println("1. Add value");
            System.out.println("2. Insert at index");
            System.out.println("3. Fill array");
            System.out.println("4. Delete last element");
            System.out.println("5. Delete by index");
            System.out.println("6. Display");
            System.out.println("7. Search value");
            System.out.println("8. Get value at index");
            System.out.println("9. Replace/Update value at index");
            System.out.println("10. size");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: addValue(); break;
                case 2: insertAt(); break;
                case 3: fillArray(); break;
                case 4: deleteLast(); break;
                case 5: deleteByIndex(); break;
                case 6: display(); break;
                case 7: searchValue(); break;
                case 8: getAt(); break;
                case 9: replaceAt(); break;
                case 10: System.out.println("Size = " + n); break;
                case 11: System.out.println("Goodbye!"); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 11);
    }
}