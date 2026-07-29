<h2><a href="https://codeforces.com/contest/263/problem/A" target="_blank" rel="noopener noreferrer">263A — Beautiful Matrix</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 263A](https://codeforces.com/contest/263/problem/A) |

## Topics
`implementation`

---

## Problem Statement

A. Beautiful Matrixtime limit per test2 secondsmemory limit per test256 megabytesinputstdinoutputstdout

You've got a 5 × 5 matrix, consisting of 24 zeroes and a single number one. Let's index the matrix rows by numbers from 1 to 5 from top to bottom, let's index the matrix columns by numbers from 1 to 5 from left to right. In one move, you are allowed to apply one of the two following transformations to the matrix:

  

-    Swap two neighboring matrix rows, that is, rows with indexes _i_ and _i_ + 1 for some integer _i_ (1 ≤ _i_ < 5). 
-   Swap two neighboring matrix columns, that is, columns with indexes _j_ and _j_ + 1 for some integer _j_ (1 ≤ _j_ < 5).

 

You think that a matrix looks beautiful, if the single number one of the matrix is located in its middle (in the cell that is on the intersection of the third row and the third column). Count the minimum number of moves needed to make the matrix beautiful.

Input

The input consists of five lines, each line contains five integers: the _j_\-th integer in the _i_\-th line of the input represents the element of the matrix that is located on the intersection of the _i_\-th row and the _j_\-th column. It is guaranteed that the matrix consists of 24 zeroes and a single number one.

Output

Print a single integer — the minimum number of moves needed to make the matrix beautiful.

ExamplesInputCopy

```
0 0 0 0 00 0 0 0 10 0 0 0 00 0 0 0 00 0 0 0 0
```

OutputCopy

```
3
```

InputCopy

```
0 0 0 0 00 0 0 0 00 1 0 0 00 0 0 0 00 0 0 0 0
```

OutputCopy

```
1
```