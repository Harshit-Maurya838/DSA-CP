<h2><a href="https://codeforces.com/contest/1890/problem/A" target="_blank" rel="noopener noreferrer">1890A — Doremy's Paint 3</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1890A](https://codeforces.com/contest/1890/problem/A) |

## Topics
`constructive algorithms`

---

## Problem Statement

A. Doremy's Paint 3time limit per test1 secondmemory limit per test256 megabytesinputstandard inputoutputstandard output

An array $$$b\_1, b\_2, \\ldots, b\_n$$$ of positive integers is good if all the sums of two adjacent elements are equal to the same value. More formally, the array is good if there exists a $$$k$$$ such that $$$b\_1 + b\_2 = b\_2 + b\_3 = \\ldots = b\_{n-1} + b\_n = k$$$.

Doremy has an array $$$a$$$ of length $$$n$$$. Now Doremy can permute its elements (change their order) however she wants. Determine if she can make the array good.

Input

The input consists of multiple test cases. The first line contains a single integer $$$t$$$ ($$$1\\le t\\le 100$$$) — the number of test cases. The description of the test cases follows.

The first line of each test case contains a single integer $$$n$$$ ($$$2 \\le n \\le 100$$$) — the length of the array $$$a$$$.

The second line of each test case contains $$$ n $$$ integers $$$ a\_1,a\_2,\\ldots,a\_n $$$ ($$$1 \\le a\_i \\le 10^5$$$).

There are no constraints on the sum of $$$n$$$ over all test cases.

Output

For each test case, print "Yes" (without quotes), if it is possible to make the array good, and "No" (without quotes) otherwise.

You can output the answer in any case (upper or lower). For example, the strings "yEs", "yes", "Yes", and "YES" will be recognized as positive responses.

ExampleInputCopy

```
528 931 1 241 1 4 552 3 3 3 34100000 100000 100000 100000
```

OutputCopy

```
Yes
Yes
No
No
Yes
```
Note

In the first test case, $$$\[8,9\]$$$ and $$$\[9,8\]$$$ are good.

In the second test case, $$$\[1,2,1\]$$$ is good because $$$a\_1+a\_2=a\_2+a\_3=3$$$.

In the third test case, it can be shown that no permutation is good.