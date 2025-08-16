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











//
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        DictionaryArray dict = new DictionaryArray(100); // adjust capacity as needed
//
//        while (true) {
//            System.out.println("\n=== Dictionary (Array) ===");
//            System.out.println("1. Insert (put)");
//            System.out.println("2. Get (search)");
//            System.out.println("3. Update");
//            System.out.println("4. Delete");
//            System.out.println("5. Display");
//            System.out.println("6. Size");
//            System.out.println("0. Exit");
//            System.out.print("Choose option: ");
//
//            int choice;
//            try {
//                choice = Integer.parseInt(sc.nextLine().trim());
//            } catch (Exception e) {
//                System.out.println("Invalid input. Try again.");
//                continue;
//            }
//
//            switch (choice) {
//                case 1: {
//                    System.out.print("Enter key (int): ");
//                    int key = Integer.parseInt(sc.nextLine().trim());
//                    System.out.print("Enter value (String): ");
//                    String value = sc.nextLine();
//                    boolean ok = dict.insert(key, value);
//                    System.out.println(ok ? "Inserted." :
//                            dict.isFull() ? "Failed: Dictionary is full." : "Failed: Key already exists.");
//                    break;
//                }
//                case 2: {
//                    System.out.print("Enter key (int): ");
//                    int key = Integer.parseInt(sc.nextLine().trim());
//                    String val = dict.get(key);
//                    System.out.println(val == null ? "Not found." : "Value = " + val);
//                    break;
//                }
//                case 3: {
//                    System.out.print("Enter key (int) to update: ");
//                    int key = Integer.parseInt(sc.nextLine().trim());
//                    System.out.print("Enter new value (String): ");
//                    String newVal = sc.nextLine();
//                    boolean ok = dict.update(key, newVal);
//                    System.out.println(ok ? "Updated." : "Failed: Key not found.");
//                    break;
//                }
//                case 4: {
//                    System.out.print("Enter key (int) to delete: ");
//                    int key = Integer.parseInt(sc.nextLine().trim());
//                    boolean ok = dict.delete(key);
//                    System.out.println(ok ? "Deleted." : "Failed: Key not found.");
//                    break;
//                }
//                case 5: {
//                    dict.display();
//                    break;
//                }
//                case 6: {
//                    System.out.println("Size = " + dict.size());
//                    break;
//                }
//                case 0:
//                    System.out.println("Bye!");
//                    return;
//                default:
//                    System.out.println("Invalid option. Try again.");
//            }
//        }
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
