import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        boolean hasDuplicates = false;
        int elements;
        String key;
        Integer value;
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> myMap = new HashMap<>();
        Map<Integer, Integer> duplicatesMap = new HashMap<>();


        System.out.println("How many elements will be in your map? Enter int value:");
        elements = scan.nextInt();

        for (int i = 0; i < elements; i++) {
            System.out.println("Add String key value to the map:");
            key = scan.next();
            value = scan.nextInt();
            if (myMap.containsKey(key)) {
                System.out.println("You can't add value to the existing key!");
            }
            else {
                myMap.put(key, value);
                duplicatesMap.put(value, duplicatesMap.getOrDefault(value, 0) + 1);
            }
        }

        System.out.println("You successfully added " + elements + " elements!");

        System.out.println("Checking for duplicate values:");
        Iterator<Map.Entry<Integer, Integer>> it = duplicatesMap.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<Integer, Integer> entry = it.next();
            if (entry.getValue() > 1) {
                System.out.println("Value " + entry.getKey() + " in the map is repeated " + entry.getValue() + " times");
                hasDuplicates = true;
            }
        }

        if (!hasDuplicates)
            System.out.println("No duplicate values found.");

        scan.close();
    }
}