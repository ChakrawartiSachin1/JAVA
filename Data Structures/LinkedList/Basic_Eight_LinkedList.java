class Node {
    int data; // value
    Node next; // Reference to the next node

    Node(int data) {
        this.data = data;
    }
}

public class Basic_Eight_LinkedList {
    // Method to display elements of a linked list
    public static void Display_LinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(); // Print a new line after printing all elements
    }

    // Method to display the size of the linked list
    public static int Display_LinkedList_Size(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public static void main(String[] args) {
        // Creating nodes with values 10, 20, 30, 40, and 50
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        // Establishing references between nodes to form a linked list
        a.next = b; // a -> b
        b.next = c; // b -> c
        c.next = d; // c -> d
        d.next = e; // d -> e

        // Display the linked list
        System.out.println("Linked list:");
        Display_LinkedList(a);

        // Display the size of the linked list
        int size = Display_LinkedList_Size(a);
        System.out.println("Size of the linked list: " + size);
    }
}
