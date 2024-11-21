package Hashing;

import java.util.LinkedList;

public class CollisionResolutionSeparateChaining {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(5);
        hashTable.add(1, "Note");
        hashTable.add(2, "Book");
        hashTable.add(3, "Pen");
        hashTable.add(4, "Pencil");
        hashTable.add(5, "Eraser");
        hashTable.add(14, "Color Pencil");

        hashTable.printTable();
    }
}

class HashTable {
    private final int size;
    private final LinkedList<Node>[] table;

    public HashTable(int size) {
        this.size = size;
        this.table = new LinkedList[size];

        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hashFunction(int key) {
        return key % size;
    }

    public void add(int key, String value) {
        int index = hashFunction(key);
        LinkedList<Node> temp = table[index];

        for (Node node : temp) {
            if (node.key == key) {
                node.value = value;
                return;
            }
        }
        temp.add(new Node(key, value));
    }

    public String get(int key) {
        int index = hashFunction(key);
        LinkedList<Node> temp = table[index];

        for (Node node : temp) {
            if (node.key == key) {
                return node.value;
            }
        }

        return null;
    }

    public void printTable() {
        for (int i = 0; i < size; i++) {
            System.out.println("Table " + i + " : ");

            for (Node node : table[i]) {
                System.out.print("[" + node.key + " -> " + node.value + "] ");
            }
            System.out.println();
        }
    }
}

class Node {
    int key;
    String value;

    Node(int key, String value) {
        this.key = key;
        this.value = value;
    }
}
