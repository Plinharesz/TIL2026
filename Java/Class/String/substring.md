## What is `substring()`?

`substring()` is a **method of the `String` class in Java** used to **extract part of a string**, creating a **new string** from it.

---

## General Form
- `substring(start, end)`
- The **start index is inclusive**
- The **end index is exclusive**

In other words: it takes characters from `start` up to **but not including** `end`.

---

## Simple Example
Consider the string:

"Programacao"

Indexes:
P r o g r a m a c a o  
0 1 2 3 4 5 6 7 8 9 10

- `substring(0, 4)` → `"Prog"`
- `substring(4, 11)` → `"ramacao"`

---

## Applying It to Real Code Context
In a `decode` method, you might see something like:

`str.substring(i, j)`

Here:
- `i` → where the number (length) starts
- `j` → where the `#` character is

Example:
- String: `"2#hi3#bye"`
- `substring(0, 1)` → `"2"`

Another common usage:

`str.substring(j + 1, j + 1 + length)`

This means:
- Start **right after the `#`**
- Extract **exactly `length` characters**

This ensures that:
- The content can include `#`
- It can include special characters
- It can even be empty

You always extract **the exact number of characters needed**.

---

## Important Notes
- `substring()` **does not change the original string**
- Strings in Java are **immutable**
- Indexes start at **0**
- Invalid indexes cause `StringIndexOutOfBoundsException`

---

If you want, I can also explain **how to mentally trace string indexes step by step**, which is very helpful for exams and interviews.