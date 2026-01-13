# HashMaps (Hash Table)

##  Definition
A **HashMap** is a data structure that implements an associative array abstract data type, a structure that can map **keys** to **values**.

It uses a **hash function** to compute an index (also called a *hash code*) into an array of buckets or slots, from which the desired value can be found. It is one of the most efficient structures for lookups.

##  Key Characteristics
1.  **Key-Value Pairs:** Data is stored as `(Key, Value)`.
2.  **Unique Keys:** Duplicate keys are not allowed. If you insert a key that already exists, the value is updated.
3.  **Null Keys/Values:** Java `HashMap` allows one `null` key and multiple `null` values.
4.  **Unordered:** It does not guarantee the order of the map (unlike `TreeMap` or `LinkedHashMap`).

##  Time Complexity (Big O)

| Operation | Average Case | Worst Case | Explanation |
| :--- | :---: | :---: | :--- |
| **Insert (Put)** | $O(1)$ | $O(n)$ | Constant time usually. $O(n)$ if many collisions occur (rare). |
| **Access (Get)** | $O(1)$ | $O(n)$ | Calculated via Hash Function. |
| **Search (Key)** | $O(1)$ | $O(n)$ | Direct access via hash. |
| **Delete** | $O(1)$ | $O(n)$ | Direct removal via hash. |

##  How it Works (Under the hood)
1.  **Hashing:** When you pass a key, Java calculates `key.hashCode()`.
2.  **Index Calculation:** It converts that hash code into an index (e.g., `hash % arrayLength`).
3.  **Collision Handling:** If two keys end up at the same index, Java uses a **LinkedList** (or a Balanced Tree/Red-Black Tree in modern Java versions) to store them in the same bucket.

##  When to use?
* When you need fast lookups by a specific ID or Key.
* Counting frequencies of elements (e.g., "Count how many times each word appears").
* Caching data/results.