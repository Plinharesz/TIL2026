# Arrays & Hashing - Cheat Sheet

## 1. Time Complexity (Big O)
Crucial for choosing the right data structure.

| Operation | Array / ArrayList | HashMap / HashSet |
| :--- | :--- | :--- |
| **Access** | $O(1)$ | N/A |
| **Search** | $O(n)$ | $O(1)$ (Average) |
| **Insert** | $O(1)$* | $O(1)$ (Average) |
| **Remove** | $O(n)$ | $O(1)$ (Average) |

> *Note: Insertion at the end of an ArrayList is amortized $O(1)$. Inserting in the middle is $O(n)$.
> *Note 2: HashMap worst case is $O(n)$ (collisions), but assume $O(1)$ for interviews.

---

## 2. The Core Trade-off
Most problems in this category boil down to:
**Trading Space (Memory) for Time (Speed).**

* **Brute Force:** Usually nested loops ($O(n^2)$).
* **Optimization:** Use a HashMap/HashSet ($O(n)$ space) to store visited elements for $O(1)$ lookups.

---

## 3. Resolution Patterns

### A. Frequency Map (Counters)
Used to count occurrences of elements.
* **Problems:** Valid Anagram, Top K Frequent Elements.
* **Technique:** `Map<Character, Integer>` or `Map<Integer, Integer>`.
* **Java Snippet:**
    ```java
    map.put(num, map.getOrDefault(num, 0) + 1);
    ```
* **Optimization (Array[26]):** If inputs are strictly lowercase English letters ('a'-'z'), use an `int` array instead of a HashMap. It's faster and uses less memory.
    * `int index = c - 'a';`

### B. HashMap as "History"
Used to check if a complement value has been seen before.
* **Problems:** Two Sum.
* **Logic:** While iterating `x`, check if `target - x` exists in the map.
* **Storage:** Usually stores `{ value : index }`.

### C. Grouping Keys (Hashing Structures)
Used to group similar items.
* **Problems:** Group Anagrams.
* **Challenge:** How to make "eat" and "tea" have the same key?
    1.  **Sort the String:** Convert string to char array, sort, convert back to string. (Cost: $O(k \log k)$ per string).
    2.  **Frequency Key:** Create a unique string signature based on char counts (e.g., "1#0#2#...").
    * *Warning:* In Java, do **not** use `int[]` as a `HashMap` key. Arrays do not override `hashCode()`/`equals()` by value. Convert the array to a String or use a `List<Integer>` as the key.

### D. Prefix Sum (Pre-processing)
Used to calculate subarray sums/products without re-iterating.
* **Problems:** Product of Array Except Self.
* **Logic:** Create auxiliary arrays to store cumulative operations from left-to-right and right-to-left.
    * `prefix[i]` = product of all elements before `i`.
    * `postfix[i]` = product of all elements after `i`.

### E. HashSet for Sequences
Used for intelligent $O(1)$ lookups.
* **Problems:** Longest Consecutive Sequence.
* **Technique:** Add all numbers to a `HashSet`. Iterate through the set and only build a sequence if it is the **start** of a sequence (i.e., check if `num - 1` does **not** exist in the set).

---

## 4. Java Specific Tips
* **String Comparison:** Always use `.equals()`, never `==`.
    * `str1.equals(str2)` checks content. `str1 == str2` checks memory address.
* **Sorting:**
    * Arrays: `Arrays.sort(arr)`
    * Collections (Lists): `Collections.sort(list)`
* **Array to List:** `Arrays.asList()` returns a fixed-size list. For a modifiable list: `new ArrayList<>(Arrays.asList(arr))`.
* **Map Iteration:**
    ```java
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        int key = entry.getKey();
        int val = entry.getValue();
    }
    ```
* **Bucket Sort Logic (for Top K Frequent):**
    * Java doesn't support generic arrays easily (`List<Integer>[]`).
    * Workaround: Use `List<Integer>[] bucket = new List[n + 1];` (will cause a warning) or `List<List<Integer>>`.