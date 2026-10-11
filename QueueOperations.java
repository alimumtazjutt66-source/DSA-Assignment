import java.util.Scanner;

public class QueueOperations {
    static final int MAX = 10;
    static int[] queue = new int[MAX];
    static int front = 0, rear = -1, count = 0;
    static Scanner sc = new Scanner(System.in);

    static boolean isEmpty() { return count == 0; }
    static boolean isFull()  { return rear == MAX - 1; }

    static void enqueue() {
        if (isFull()) { System.out.println("Queue is full!"); return; }
        System.out.print("Enter token number: ");
        queue[++rear] = sc.nextInt();
        count++;
    }

    static void dequeue() {
        if (isEmpty()) { System.out.println("Queue is empty!"); return; }
        System.out.println("Served token: " + queue[front++]);
        count--;
        if (count == 0) { front = 0; rear = -1; } // reset when empty
    }

    static void display() {
        if (isEmpty()) { System.out.println("Queue is empty."); return; }
        System.out.print("Queue (front to rear): ");
        for (int i = front; i <= rear; i++) System.out.print(queue[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n----- QUEUE MENU -----");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Size");
            System.out.println("5. isEmpty");
            System.out.println("6. isFull");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: enqueue(); break;
                case 2: dequeue(); break;
                case 3: display(); break;
                case 4: System.out.println("Size = " + count); break;
                case 5: System.out.println(isEmpty() ? "Queue is empty." : "Queue is not empty."); break;
                case 6: System.out.println(isFull() ? "Queue is full." : "Queue is not full."); break;
                case 7: System.out.println("Goodbye!"); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 7);
    }
}