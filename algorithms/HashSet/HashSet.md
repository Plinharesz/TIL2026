# Java: Understanding HashSet

Today I learned about the `HashSet` data structure in Java and how it differs from standard Arrays or ArrayLists.

### What is a HashSet?
A `HashSet` is a collection that implements the `Set` interface. Its main characteristic is that it **does not allow duplicate elements**. It uses a hash table for storage, which makes it extremely efficient.

### Key Characteristics:
* **Uniqueness:** It automatically handles duplicates. If you try to add an element that already exists, it won't be added again.
* **Performance ($O(1)$):** Operations like `add()`, `remove()`, and especially `contains()` take constant time on average. This is much faster than iterating through a list ($O(n)$) to check for an item.
* **Unordered:** It does not guarantee the order of elements (unlike a List).
* **No Primitives:** You must use Wrapper classes (e.g., `Set<Integer>` instead of `Set<int>`).

### Practical Use Case
I learned how to use `HashSet` to solve the "Contains Duplicate" problem efficiently. Instead of using nested loops with $O(n^2)$ complexity (Brute Force), we can iterate through the array once and use the `HashSet` to track seen numbers, reducing the complexity to $O(n)$.

### Code Snippet
```java
// Using the Interface (Set) for flexibility
Set<Integer> seenNumbers = new HashSet<>();

seenNumbers.add(1);
seenNumbers.add(2);
seenNumbers.add(1); // Ignored!

System.out.println(seenNumbers.size()); // Output: 2