// This code implements a queue managements system
// it displays a menu to enqueue, dequeue, and display the queue
import java.util.LinkedList;
import java.util.Scanner;

public class QueueManagementSystem {
    // initializing queue
    private static LinkedList<String> queue = new LinkedList<>();

    // main method
    public static void main(String[] args) {
        // initializing scanner
        Scanner scanner = new Scanner(System.in);
        // starting a loop to display the menu
        while (true) {
            System.out.println("\nQueue Management System");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display Queue");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            // switch case
            switch (choice) {
                case 1:
                    System.out.print("Enter the element to enqueue: ");
                    String element = scanner.nextLine();
                    enqueue(element);
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    displayQueue();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // method to enqueue
    private static void enqueue(String element) {
        queue.addLast(element);
        System.out.println("Element '" + element + "' enqueued successfully.");
    }

    // method to dequeue
    private static void dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
        } else {
            String removedElement = queue.removeFirst();
            System.out.println("Element '" + removedElement + "' dequeued successfully.");
        }
    }

    // method to display the queue
    private static void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue: " + queue);
        }
    }
}

/* LinkedList implementation facilitates queue operations efficiently as 
it supports constant-time insertion and deletion at both ends (front and back), 
which aligns with enqueue and dequeue operations of a queue. 
This is advantageous over ArrayList, especially for frequent insertions and deletions, 
as it avoids the need for array resizing and shifting, resulting in better performance and memory management. */
