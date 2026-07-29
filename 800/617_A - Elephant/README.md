<h2><a href="https://codeforces.com/contest/617/problem/A" target="_blank" rel="noopener noreferrer">617A — Elephant</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 617A](https://codeforces.com/contest/617/problem/A) |

## Topics
`math`

---

## Problem Statement

A. Elephanttime limit per test1 secondmemory limit per test256 megabytesinputstandard inputoutputstandard output

An elephant decided to visit his friend. It turned out that the elephant's house is located at point 0 and his friend's house is located at point _x_(_x_ > 0) of the coordinate line. In one step the elephant can move 1, 2, 3, 4 or 5 positions forward. Determine, what is the minimum number of steps he need to make in order to get to his friend's house.

Input

The first line of the input contains an integer _x_ (1 ≤ _x_ ≤ 1 000 000) — The coordinate of the friend's house.

Output

Print the minimum number of steps that elephant needs to make to get from point 0 to point _x_.

ExamplesInputCopy

```
5
```

OutputCopy

```
1
```

InputCopy

```
12
```

OutputCopy

```
3
```

Note

In the first sample the elephant needs to make one step of length 5 to reach the point _x_.

In the second sample the elephant can get to point _x_ if he moves by 3, 5 and 4. There are other ways to get the optimal answer but the elephant cannot reach _x_ in less than three moves.