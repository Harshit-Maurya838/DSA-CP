<h2><a href="https://codeforces.com/contest/1883/problem/C" target="_blank" rel="noopener noreferrer">1883C — Raspberries</a></h2>

| | |
|---|---|
| **Difficulty** | 1000 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1883C](https://codeforces.com/contest/1883/problem/C) |

## Topics
`dp` `math`

---

## Problem Statement

C. Raspberriestime limit per test2 secondsmemory limit per test256 megabytesinputstandard inputoutputstandard output

You are given an array of integers $$$a\_1, a\_2, \\ldots, a\_n$$$ and a number $$$k$$$ ($$$2 \\leq k \\leq 5$$$). In one operation, you can do the following:

 

-   Choose an index $$$1 \\leq i \\leq n$$$,
 -   Set $$$a\_i = a\_i + 1$$$.

Find the minimum number of operations needed to make the product of all the numbers in the array $$$a\_1 \\cdot a\_2 \\cdot \\ldots \\cdot a\_n$$$ divisible by $$$k$$$.

Input

Each test consists of multiple test cases. The first line contains a single integer $$$t$$$ ($$$1 \\leq t \\leq 10^4$$$) — the number of test cases. Then follows the description of the test cases.

The first line of each test case contains two integers $$$n$$$ and $$$k$$$ ($$$2 \\leq n \\leq 10^5$$$, $$$2 \\leq k \\leq 5$$$) — the size of the array $$$a$$$ and the number $$$k$$$.

The second line of each test case contains $$$n$$$ integers $$$a\_1, a\_2, \\ldots, a\_n$$$ ($$$1 \\leq a\_i \\leq 10$$$).

It is guaranteed that the sum of $$$n$$$ over all test cases does not exceed $$$2 \\cdot 10^5$$$.

Output

For each test case, output the minimum number of operations needed to make the product of all the numbers in the array divisible by $$$k$$$.

ExampleInputCopy

```
152 57 33 37 4 15 29 7 7 3 95 55 4 1 2 37 49 5 1 5 9 5 13 46 3 63 46 1 53 41 5 94 41 4 1 13 43 5 34 58 9 9 32 51 62 510 104 51 6 1 12 57 7
```

OutputCopy

```
2
2
1
0
2
0
1
2
0
1
1
4
0
4
3
```
Note

In the first test case, we need to choose the index $$$i = 2$$$ twice. After that, the array will be $$$a = \[7, 5\]$$$. The product of all the numbers in the array is $$$35$$$.

In the fourth test case, the product of the numbers in the array is $$$120$$$, which is already divisible by $$$5$$$, so no operations are needed.

In the eighth test case, we can perform two operations by choosing $$$i = 2$$$ and $$$i = 3$$$ in any order. After that, the array will be $$$a = \[1, 6, 10\]$$$. The product of the numbers in the array is $$$60$$$.