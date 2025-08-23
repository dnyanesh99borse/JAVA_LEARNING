package DICTIONARY;
import java.util.Scanner;

public class DictionaryArrayDemo {

    // Entry to store key-value pair
    static class Entry {
        int key;
        String value;
        Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    // Dictionary implemented using an unsorted array
    static class DictionaryArray {
        private final Entry[] arr;
        private int size = 0;

        DictionaryArray(int capacity) {
            arr = new Entry[capacity];
        }

        // Linear search for key, returns index or -1
        private int findIndex(int key) {
            for (int i = 0; i < size; i++) {
                if (arr[i].key == key) return i;
            }
            return -1;
        }

        // Insert (put): fails if full or key exists
        public boolean insert(int key, String value) {
            if (size == arr.length) return false;          // full
            if (findIndex(key) != -1) return false;        // duplicate key
            arr[size++] = new Entry(key, value);
            return true;
        }

        // Get value by key; returns null if not found
        public String get(int key) {
            int idx = findIndex(key);
            return (idx == -1) ? null : arr[idx].value;
        }

        // Update value for existing key
        public boolean update(int key, String newValue) {
            int idx = findIndex(key);
            if (idx == -1) return false;                   // not found
            arr[idx].value = newValue;
            return true;
        }

        // Delete key (order-preserving shift)
        public boolean delete(int key) {
            int idx = findIndex(key);
            if (idx == -1) return false;                   // not found
            for (int i = idx; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[size - 1] = null;
            size--;
            return true;
        }

        // Display all pairs
        public void display() {
            if (size == 0) {
                System.out.println("Dictionary is empty.");
                return;
            }
            System.out.println("Current (key, value) pairs:");
            for (int i = 0; i < size; i++) {
                System.out.println("(" + arr[i].key + ", " + arr[i].value + ")");
            }
        }

        public int size() { return size; }

        public boolean isFull() { return size == arr.length; }

        public boolean isEmpty() { return size == 0; }
    }
}




