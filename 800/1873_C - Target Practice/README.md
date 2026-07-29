<h2><a href="https://codeforces.com/contest/1873/problem/C" target="_blank" rel="noopener noreferrer">1873C — Target Practice</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | C++23 (GCC 14-64, msys2) |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1873C](https://codeforces.com/contest/1873/problem/C) |

## Topics
`implementation` `math`

---

## Problem Statement

C. Target Practicetime limit per test1 secondmemory limit per test256 megabytesinputstandard inputoutputstandard output

A 10 \\times 10 target is made out of five "rings" as shown. Each ring has a different point value: the outermost ring — 1 point, the next ring — 2 points, ..., the center ring — 5 points.

 

Vlad fired several arrows at the target. Help him determine how many points he got.

Input

The input consists of multiple test cases. The first line of the input contains a single integer t (1 \\leq t \\leq 1000) — the number of test cases.

Each test case consists of 10 lines, each containing 10 characters. Each character in the grid is either \\texttt{X} (representing an arrow) or \\texttt{.} (representing no arrow).

Output

For each test case, output a single integer — the total number of points of the arrows.

ExampleInputCopy

```
4X..........................X.......X..........X......................X..X..........................X................................................................................................................................................X.......................................................XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
```

OutputCopy

```
17
0
5
220
```
Note

In the first test case, there are three arrows on the outer ring worth 1 point each, two arrows on the ring worth 3 points each, and two arrows on the ring worth 4 points each. The total score is 3 \\times 1 + 2 \\times 3 + 2 \\times 4 = 17.

 

In the second test case, there aren't any arrows, so the score is 0.