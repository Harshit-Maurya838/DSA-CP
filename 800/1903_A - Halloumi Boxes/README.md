<h2><a href="https://codeforces.com/contest/1903/problem/A" target="_blank" rel="noopener noreferrer">1903A — Halloumi Boxes</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1903A](https://codeforces.com/contest/1903/problem/A) |

## Topics
`brute force` `greedy` `sortings`

---

## Problem Statement

A. Halloumi Boxestime limit per test1 secondmemory limit per test256 megabytesinputstandard inputoutputstandard output

Theofanis is busy after his last contest, as now, he has to deliver many halloumis all over the world. He stored them inside $$$n$$$ boxes and each of which has some number $$$a\_i$$$ written on it.

 

He wants to sort them in non-decreasing order based on their number, however, his machine works in a strange way. It can only reverse any subarray$$$^{\\dagger}$$$ of boxes with length at most $$$k$$$.

Find if it's possible to sort the boxes using any number of reverses.

$$$^{\\dagger}$$$ Reversing a subarray means choosing two indices $$$i$$$ and $$$j$$$ (where $$$1 \\le i \\le j \\le n$$$) and changing the array $$$a\_1, a\_2, \\ldots, a\_n$$$ to $$$a\_1, a\_2, \\ldots, a\_{i-1}, \\; a\_j, a\_{j-1}, \\ldots, a\_i, \\; a\_{j+1}, \\ldots, a\_{n-1}, a\_n$$$. The length of the subarray is then $$$j - i + 1$$$.

Input

The first line contains a single integer $$$t$$$ ($$$1 \\le t \\le 100$$$) — the number of test cases.

Each test case consists of two lines.

 

The first line of each test case contains two integers $$$n$$$ and $$$k$$$ ($$$1 \\le k \\le n \\le 100$$$) — the number of boxes and the length of the maximum reverse that Theofanis can make.

 

The second line contains $$$n$$$ integers $$$a\_1, a\_2, \\ldots, a\_n$$$ ($$$1 \\le a\_i \\le 10^{9}$$$) — the number written on each box.

Output

For each test case, print YES (case-insensitive), if the array can be sorted in non-decreasing order, or NO (case-insensitive) otherwise.

ExampleInputCopy

```
53 21 2 33 19 9 94 46 4 2 14 310 3 830 142 13 1
```

OutputCopy

```
YESYESYESYESNO
```

Note

In the first two test cases, the boxes are already sorted in non-decreasing order.

In the third test case, we can reverse the whole array.

In the fourth test case, we can reverse the first two boxes and the last two boxes.

In the fifth test case, it can be shown that it's impossible to sort the boxes.