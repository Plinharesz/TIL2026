# Product of Array Except Self

## Description

Given an integer array `nums`, return an array `answer` such that `answer[i]` is equal to the product of all the elements of `nums` except `nums[i]`.

## Important Rules

- The product of any prefix or suffix of `nums` is guaranteed to fit in a 32-bit integer.
- You must solve the problem **without using division**.
- The algorithm must run in **O(n)** time.

## Example

Input:
nums = [1, 2, 3, 4]

Output:
[24, 12, 8, 6]

## Constraints

- 2 ≤ nums.length ≤ 10⁵
- -30 ≤ nums[i] ≤ 30