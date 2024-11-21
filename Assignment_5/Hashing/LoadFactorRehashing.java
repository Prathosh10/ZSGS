package Hashing;

import java.util.Arrays;

public class LoadFactorRehashing {
    public static void main(String[] args) {
        HashTable students = new HashTable(5);
        students.add(1, "Antony");
        students.add(2, "Dhanush");
        students.add(3, "Muthu kumar");
        students.add(4, "Natrajan");
        students.add(5, "Santhosh");

        System.out.println("before exceeding load factor");
        students.printTable();

        students.add(6, "Thirumala");

        System.out.println("after rehashing");
        students.printTable();
    }
}

class HashTable {
    private int size;
    private int count;
    private int[] keys;
    private String[] values;
    private final double LOAD_FACTOR = 0.75;

    public HashTable(int initialSize) {
        this.size = initialSize;
        this.keys = new int[initialSize];
        this.values = new String[initialSize];
        this.count = 0;

        for (int i = 0; i < initialSize; i++) {
            keys[i] = -1;
        }
    }

    private int hashFunction(int key) {
        return key % size;
    }

    public void add(int key, String value) {
        if ((double) count / size > LOAD_FACTOR) {
            rehash();
        }

        int index = hashFunction(key);
        while (keys[index] != -1) {
            index = (index + 1) % size;
        }

        if (keys[index] == -1) {
            count++;
        }

        keys[index] = key;
        values[index] = value;
    }

    private void rehash() {
        int newSize = size * 2;
        size = newSize;

        int[] oldKeys = keys;
        String[] oldValues = values;

        keys = new int[newSize];
        values = new String[newSize];

        Arrays.fill(keys, -1);
        count = 0;

        for (int i = 0; i < oldKeys.length; i++) {
            if (oldKeys[i] != -1) {
                add(oldKeys[i], oldValues[i]);
            }
        }

        System.out.println("new size : " + size);
    }

    public String get(int key) {
        int index = hashFunction(key);
        int startIndex = index;

        while (keys[index] != -1) {
            if (keys[index] == key) {
                return values[index];
            }

            index = (index + 1) % size;

            if (index == startIndex) {
                break;
            }
        }
        return null;
    }

    public void printTable() {

        for (int i = 0; i < size; i++) {
            System.out.println("index : " + i);

            if (keys[i] != -1) {
                System.out.println("Key : " + keys[i] + " value : " + values[i]);
            } else {
                System.out.println("Empty");
            }
        }
    }
}
