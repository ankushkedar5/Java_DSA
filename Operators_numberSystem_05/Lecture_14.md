# Java Operators

Operators are special symbols used to perform operations on variables and values.

## 1. Arithmetic Operators

Used to perform basic mathematical operations.

| Operator | Description           | Example       |
|----------|-----------------------|---------------|
| `+`      | Addition              | `a + b`       |
| `-`      | Subtraction           | `a - b`       |
| `*`      | Multiplication        | `a * b`       |
| `/`      | Division              | `a / b`       |
| `%`      | Modulus (remainder)   | `a % b`       |

```java
int a = 10, b = 3;
System.out.println(a + b); // 13
System.out.println(a % b); // 1
```

## 2. Relational (Comparison) Operators

Used to compare two values. Result is always `boolean` (`true`/`false`).

| Operator | Description                 | Example   |
|----------|-----------------------------|-----------|
| `==`     | Equal to                    | `a == b`  |
| `!=`     | Not equal to                | `a != b`  |
| `>`      | Greater than                | `a > b`   |
| `<`      | Less than                   | `a < b`   |
| `>=`     | Greater than or equal to    | `a >= b`  |
| `<=`     | Less than or equal to       | `a <= b`  |

## 3. Logical Operators

Used to combine multiple conditions.

| Operator | Description  | Example             |
|----------|--------------|---------------------|
| `&&`     | Logical AND  | `a > 5 && b < 10`   |
| `\|\|`   | Logical OR   | `a > 5 \|\| b < 10` |
| `!`      | Logical NOT  | `!(a > 5)`          |

## 4. Assignment Operators

Used to assign values to variables.

| Operator | Example  | Same As     |
|----------|----------|-------------|
| `=`      | `a = b`  | `a = b`     |
| `+=`     | `a += b` | `a = a + b` |
| `-=`     | `a -= b` | `a = a - b` |
| `*=`     | `a *= b` | `a = a * b` |
| `/=`     | `a /= b` | `a = a / b` |
| `%=`     | `a %= b` | `a = a % b` |

## 5. Unary Operators

Operate on a single operand.

| Operator | Description             | Example        |
|----------|-------------------------|----------------|
| `+`      | Unary plus              | `+a`           |
| `-`      | Unary minus             | `-a`           |
| `++`     | Increment (by 1)        | `a++` or `++a` |
| `--`     | Decrement (by 1)        | `a--` or `--a` |
| `!`      | Logical NOT             | `!flag`        |

**Pre vs Post:**
- `++a` → increments first, then uses value
- `a++` → uses value first, then increments

## 6. Bitwise Operators

Operate on individual bits of integer types.

| Operator | Description           | Example   |
|----------|-----------------------|-----------|
| `&`      | Bitwise AND           | `a & b`   |
| `\|`     | Bitwise OR            | `a \| b`  |
| `^`      | Bitwise XOR           | `a ^ b`   |
| `~`      | Bitwise Complement    | `~a`      |
| `<<`     | Left Shift            | `a << 2`  |
| `>>`     | Right Shift           | `a >> 2`  |
| `>>>`    | Unsigned Right Shift  | `a >>> 2` |

## 7. Ternary Operator

Shorthand for `if-else`. Syntax: `condition ? value_if_true : value_if_false`

```java
int a = 10, b = 20;
int max = (a > b) ? a : b;
System.out.println(max); // 20
```

## 8. instanceof Operator

Checks whether an object is an instance of a specific class.

```java
String s = "hello";
System.out.println(s instanceof String); // true
```

## Operator Precedence (High to Low)

1. Postfix (`expr++`, `expr--`)
2. Unary (`++expr`, `--expr`, `+`, `-`, `!`, `~`)
3. Multiplicative (`*`, `/`, `%`)
4. Additive (`+`, `-`)
5. Shift (`<<`, `>>`, `>>>`)
6. Relational (`<`, `>`, `<=`, `>=`, `instanceof`)
7. Equality (`==`, `!=`)
8. Bitwise AND (`&`)
9. Bitwise XOR (`^`)
10. Bitwise OR (`|`)
11. Logical AND (`&&`)
12. Logical OR (`||`)
13. Ternary (`?:`)
14. Assignment (`=`, `+=`, `-=`, etc.)

---
*Quick reference notes on Java Operators.*

# Number System

A number system defines a set of rules to represent numbers using digits or symbols. Used in digital electronics and computing.

## 1. Types of Number Systems

| System      | Base (Radix) | Digits Used              |
|-------------|--------------|--------------------------|
| Binary      | 2            | 0, 1                     |
| Octal       | 8            | 0–7                      |
| Decimal     | 10           | 0–9                      |
| Hexadecimal | 16           | 0–9, A–F                 |

## 2. Decimal Number System

- Base 10, most commonly used system.
- Digits: 0–9
- Example: `245` = (2×10²) + (4×10¹) + (5×10⁰)

## 3. Binary Number System

- Base 2, used internally by computers.
- Digits: 0, 1
- Example: `1011` = (1×2³)+(0×2²)+(1×2¹)+(1×2⁰) = 11

## 4. Octal Number System

- Base 8
- Digits: 0–7
- Example: `17` (octal) = (1×8¹)+(7×8⁰) = 15 (decimal)

## 5. Hexadecimal Number System

- Base 16
- Digits: 0–9, A–F (A=10, B=11, C=12, D=13, E=14, F=15)
- Example: `1A` (hex) = (1×16¹)+(10×16⁰) = 26 (decimal)

---

## 6. Number System Conversions

### Decimal → Binary
Divide the number by 2 repeatedly, note remainders, read bottom to top.

```
13 → 13/2 = 6 r1
     6/2  = 3 r0
     3/2  = 1 r1
     1/2  = 0 r1
Result: 1101
```

### Binary → Decimal
Multiply each bit by 2^(position), sum results.

```
1101 = (1×2³)+(1×2²)+(0×2¹)+(1×2⁰) = 8+4+0+1 = 13
```

### Decimal → Octal
Divide the number by 8 repeatedly, note remainders, read bottom to top.

```
100 → 100/8 = 12 r4
      12/8  = 1  r4
      1/8   = 0  r1
Result: 144
```

### Octal → Decimal
Multiply each digit by 8^(position), sum results.

```
144 (octal) = (1×8²)+(4×8¹)+(4×8⁰) = 64+32+4 = 100
```

### Decimal → Hexadecimal
Divide the number by 16 repeatedly, note remainders, read bottom to top.

```
255 → 255/16 = 15 r15(F)
      15/16  = 0  r15(F)
Result: FF
```
 
### Hexadecimal → Decimal
Multiply each digit by 16^(position), sum results.

```
FF (hex) = (15×16¹)+(15×16⁰) = 240+15 = 255
```

### Binary → Octal
Group binary digits in sets of 3 (from right), convert each group.

```
101110 → 101 110 → 5 6 → 56 (octal)
```

### Binary → Hexadecimal
Group binary digits in sets of 4 (from right), convert each group.

```
10110110 → 1011 0110 → B 6 → B6 (hex)
```

### Octal → Binary
Convert each octal digit to its 3-bit binary equivalent.

```
56 (octal) → 5=101, 6=110 → 101110
```

### Hexadecimal → Binary
Convert each hex digit to its 4-bit binary equivalent.

```
B6 (hex) → B=1011, 6=0110 → 10110110
```

---

## 7. Quick Conversion Table

| Decimal | Binary | Octal | Hex |
|---------|--------|-------|-----|
| 0       | 0000   | 0     | 0   |
| 1       | 0001   | 1     | 1   |
| 2       | 0010   | 2     | 2   |
| 3       | 0011   | 3     | 3   |
| 4       | 0100   | 4     | 4   |
| 5       | 0101   | 5     | 5   |
| 6       | 0110   | 6     | 6   |
| 7       | 0111   | 7     | 7   |
| 8       | 1000   | 10    | 8   |
| 9       | 1001   | 11    | 9   |
| 10      | 1010   | 12    | A   |
| 11      | 1011   | 13    | B   |
| 12      | 1100   | 14    | C   |
| 13      | 1101   | 15    | D   |
| 14      | 1110   | 16    | E   |
| 15      | 1111   | 17    | F   |

---
*Quick reference notes on Number Systems.*
