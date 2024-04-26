class Node {
    int data; // value
    Node next; // Reference to the next node

    Node(int data) {
        this.data = data;
    }
}

public class Basic_Six_LinkedList {
    // Method to display elements of a linked list using recursion
    public static void Display_LinkedList_Recursion(Node head) {
        if (head == null) // Base case: if head is null, return
            return;
        System.out.println(head.data); // Print the data of the current node
        Display_LinkedList_Recursion(head.next); // Recursively call the method with the next node
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

        // Display the linked list starting from the head node 'a' using recursion
        Display_LinkedList_Recursion(a);
    }
}
