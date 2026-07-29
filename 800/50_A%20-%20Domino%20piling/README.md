<h2><a href="https://codeforces.com/contest/50/problem/A" target="_blank" rel="noopener noreferrer">50A — Domino piling</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 50A](https://codeforces.com/contest/50/problem/A) |

## Topics
`greedy` `math`

---

## Problem Statement

A. Domino pilingtime limit per test2 secondsmemory limit per test256 megabytesinputstdinoutputstdout

You are given a rectangular board of _M_ × _N_ squares. Also you are given an unlimited number of standard domino pieces of 2 × 1 squares. You are allowed to rotate the pieces. You are asked to place as many dominoes as possible on the board so as to meet the following conditions:

1\. Each domino completely covers two squares.

2\. No two dominoes overlap.

3\. Each domino lies entirely inside the board. It is allowed to touch the edges of the board.

Find the maximum number of dominoes, which can be placed under these restrictions.

Input

In a single line you are given two integers _M_ and _N_ — board sizes in squares (1 ≤ _M_ ≤ _N_ ≤ 16).

Output

Output one number — the maximal number of dominoes, which can be placed.

ExamplesInputCopy

```
2 4
```

OutputCopy

```
4
```

InputCopy

```
3 3
```

OutputCopy

```
4
```