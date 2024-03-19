package March_18_Assignment;

import java.util.Scanner;

// Node class representing a node in the linked list
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Q1_Add_Linked_List_Number
{
    public static Node addTwoNumbers(Node l1, Node l2) {
        Node dummyHead = new Node(0);
        Node current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }
            current.next = new Node(sum % 10);
            carry = sum / 10;
            current = current.next;
        }

        if (carry > 0) {
            current.next = new Node(carry);
        }

        return dummyHead.next;
    }

    // Function to print the linked list
    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("-1");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCases = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        for (int i = 0; i < numCases; i++) {
            String[] input1 = scanner.nextLine().split(" ");
            String[] input2 = scanner.nextLine().split(" ");
            Node l1 = createLinkedList(input1);
            Node l2 = createLinkedList(input2);
            Node result = addTwoNumbers(l1, l2);
            printLinkedList(result);
        }
        scanner.close();
    }

    // Function to create a linked list from an array of integers
    public static Node createLinkedList(String[] input) {
        Node dummyHead = new Node(0);
        Node current = dummyHead;
        for (int i = 0; i < input.length - 1; i++) {
            int data = Integer.parseInt(input[i]);
            current.next = new Node(data);
            current = current.next;
        }
        return dummyHead.next;
    }

}
