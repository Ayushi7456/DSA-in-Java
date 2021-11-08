import java.util.*;
import java.io.*;

public class LinkedList {
    private static class Node {
        int data;
        Node next;
    }

    Node head;
    Node tail;
    int size;

    // O(1)
    public int size() {
        return this.size; // this keyword is used to access the properties of a class
    }

    // O(1)
    public boolean isEmpty() {
        return this.size == 0;
    }

    // O(1)
    public void addLast(int val) { // constructor
        Node nn = new Node();
        nn.data = val;
        nn.next = null;

        if (this.size == 0) {
            this.head = nn;
            this.tail = nn;
        } else {
            this.tail.next = nn;
            this.tail = nn;
        }
        size++;
    }

    // O(1)
    public void addFirst(int val) {
        Node nn = new Node();
        nn.data = val;
        nn.next = null;
        if (this.size == 0) {
            this.head = nn;
            this.tail = nn;
            size++;
        } else {
            nn.next = head;
            this.head = nn;

        }
        size++;
    }

    // O(n)
    public void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // O(1)
    public int getFirst() {
        if (this.size == 0) {
            System.out.println("List is empty.");
            return -1;
        } else {
            return this.head.data;
        }
    }

    // O(1)
    public int getLast() {
        if (this.size == 0) {
            System.out.println("List is empty.");
            return -1;
        } else {
            return this.tail.data;
        }
    }

    public int getAt(int idx) {
        if (this.size == 0) {
            System.out.println("List is empty.");
            return -1;
        } else if (idx < 0 || idx > this.size) {
            System.out.println("Invalid index");
            return -1;
        } else {
            Node temp = this.head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
    }

    public void addAt(int idx, int val) {
        if (idx < 0 || idx > this.size) {
            System.out.println("Invalid index");
        } else if (idx == 0) {
            addFirst(val);
        } else if (idx == this.size) {
            addLast(val);
        } else {
            Node nn = new Node();
            nn.data = val;
            Node temp = this.head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            nn.next = temp.next;
            temp.next = nn;
            this.size++;
        }
    }

    // O(1)
    public void removeFirst() {
        if (this.size == 0) {
            System.out.println("List is empty.");
        } else if (this.size == 1) {
            this.head = null;
            this.tail = null;
            this.size--;
        } else {
            this.head = this.head.next;
            this.size--;
        }
    }

    public void removeLast() {
        if (this.size == 0) {
            System.out.println("List is empty.");
        } else if (this.size == 1) {
            this.head = null;
            this.tail = null;
            this.size--;
        } else {
            Node temp = this.head;
            for (int i = 0; i < this.size - 2; i++) {
                temp = temp.next;
            }
            this.tail = temp;
            temp.next = null;
            size--;
        }
    }

    public void removeAt(int idx) {
        if (this.size == 0) {
            System.out.println("List is empty");
        } else if (idx == 0) {
            removeFirst();
        } else if (idx == this.size) {
            removeLast();
        } else {
            Node temp = this.head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }
}