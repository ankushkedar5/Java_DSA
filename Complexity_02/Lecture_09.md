# Lecture 09 - Time & Space Complexity

## Time Complexity

- Time Complexity tells us how the number of operations grows as input size `n` increases.
- It does NOT mean the exact time taken in seconds.
- We use **Big-O notation** to represent it.

### Common Time Complexities

`O(1) < O(log n) < O(√n) < O(n) < O(n·log n) < O(n²) < O(n³) < O(2ⁿ) < O(n!)`

### Examples

- `O(1)` → Constant → Direct access
- `O(n)` → Linear → Single loop
- `O(n²)` → Quadratic → Nested loops
- `O(n³)` → Cubic → Three nested loops

### Important Rules

- Sequential loops → Add complexities
- Nested loops → Multiply complexities
- Ignore constants: `O(2n)` → `O(n)`
- Keep the dominant term: `O(n² + n)` → `O(n²)`

---

## Space Complexity

- Space Complexity tells us how much **extra memory** an algorithm needs as input size increases.
- It includes variables, arrays, data structures, recursion, etc.

### Examples

- Fixed variables → `O(1)` Space
- Array of size `n` → `O(n)` Space

---

## Best, Average & Worst Case

- **Best Case** → Minimum work required.
- **Average Case** → Expected work for a typical input.
- **Worst Case** → Maximum work required.

---

## Key Point

> **Time Complexity → How operations grow.**
>
> **Space Complexity → How extra memory grows.**