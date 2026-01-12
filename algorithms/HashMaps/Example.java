import java.util.Map;

public class Example package algorithms.Arrays.arrays_and_hashmaps.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class HashMapExamples {

    public static void main(String[] args) {
        System.out.println("=== HASHMAP STUDY ===\n");

        // 1. DECLARATION AND INITIALIZATION
        // Map<KeyType, ValueType>
        Map<String, Integer> inventory = new HashMap<>();

        // 2. INSERTING (PUT) - O(1)
        inventory.put("Apple", 50);
        inventory.put("Banana", 30);
        inventory.put("Orange", 20);

        // Updating a value (Same key overwrites the old value)
        inventory.put("Apple", 55);

        System.out.println("Current Inventory: " + inventory);

        // 3. ACCESSING (GET) - O(1)
        int appleCount = inventory.get("Apple");
        System.out.println("Apples available: " + appleCount);

        // Handling non-existent keys (Avoids NullPointerException)
        // getOrDefault is very useful for counters
        int grapeCount = inventory.getOrDefault("Grape", 0);
        System.out.println("Grapes available: " + grapeCount);

        // 4. CHECKING EXISTENCE - O(1)
        if (inventory.containsKey("Banana")) {
            System.out.println("Yes, we have Bananas.");
        }

        // 5. REMOVING - O(1)
        inventory.remove("Orange");
        System.out.println("After removing Orange: " + inventory);

        // 6. ITERATION
        System.out.println("\n--- Iterating over Map ---");

        // Method A: Iterating over Keys (keySet)
        for (String key : inventory.keySet()) {
            System.out.println("Key: " + key);
        }

        // Method B: Iterating over Entries (Best for Key + Value)
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}{
}
