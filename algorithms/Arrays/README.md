# Arrays

##  Definition
An **Array** is a linear data structure that stores a collection of elements of the same type in a **contiguous** block of memory.

It is the most fundamental structure in Computer Science. Because the memory is contiguous, the computer knows exactly where each element is located based on its index, allowing for extremely fast access.

##  Key Characteristics
1.  **Fixed Size:** In Java (primitive arrays), once created, the size cannot be changed.
2.  **Indexed:** Each element is accessed by a numerical index (starting at 0).
3.  **Homogeneous:** All elements must be of the same type (e.g., all `int` or all `String`).

##  Time Complexity (Big O)

| Operation | Complexity | Explanation |
| :--- | :---: | :--- |
| **Access (Get)** | $O(1)$ | Instant, uses mathematical address calculation. |
| **Search** | $O(n)$ | In the worst case, you must scan the entire array to find a value. |
| **Insertion** | $O(n)$ | Inserting in the middle requires shifting subsequent elements. |
| **Deletion** | $O(n)$ | Removing and maintaining order requires shifting elements. |

##  When to use?
* When you know the exact amount of data you will store beforehand.
* When read speed (access by index) is the top priority.
* As a building block for more complex structures (e.g., HashMaps, Heaps, Matrices).

## Java Note
Do not confuse a primitive Array (`int[]`) with an `ArrayList`.
* **Array (`[]`):** Fixed size, faster, less overhead.
* **ArrayList:** Dynamic size (grows automatically), but slightly slower due to wrapper overhead.