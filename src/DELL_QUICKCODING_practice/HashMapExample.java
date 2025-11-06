
import java.util.*;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        // Map<String, Integer> map = new LinkedHashMap<>();
        //add items
        map.put("apple", 1);
        map.put("mango", 2);
        map.put("banana", 3);

        //Access items
        System.out.println(map.get("mango"));
        System.out.println(map.get("banana"));
        System.out.println(map.get("apple"));

        //check  if key  exists;
        System.out.println(map.containsKey("grape"));
        System.out.println((map.containsKey("apple")));

        //remove keys
        map.remove("banana");
        System.out.println(map.containsKey("banana"));

        System.out.println(map.size());

        //add more items
        map.put("grape", 4);
        map.put("kiwi", 5);

        //print only the keys()
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        //print only the values()
        for (Integer value : map.values()) {
            System.out.println(value);
        }
    }
}
