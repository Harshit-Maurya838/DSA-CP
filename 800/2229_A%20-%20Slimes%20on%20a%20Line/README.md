<h2><a href="https://codeforces.com/contest/2229/problem/A" target="_blank" rel="noopener noreferrer">2229A — Slimes on a Line</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 2229A](https://codeforces.com/contest/2229/problem/A) |

## Topics
`brute force` `greedy` `math`

---

## Problem Statement

A. Slimes on a Linetime limit per test1 secondmemory limit per test256 megabytesinputstandard inputoutputstandard output There are $$$n$$$ slimes on a line, where slime $$$i$$$ is at position $$$a\_i$$$ on the line. You will perform the following operation some number of times (possibly none):

  

-   select an integer $$$x$$$, then for each $$$j$$$ ($$$1 \\le j \\le n$$$): 
    
    -   if $$$a\_j  \\lt  x$$$ then do $$$a\_j := a\_j + 1$$$.
    -    if $$$a\_j  \\gt  x$$$ then do $$$a\_j := a\_j - 1$$$. 
    -   if $$$a\_j = x$$$ then do nothing.

 

Determine the minimum number of operations to make all slimes occupy the same position.Input

Each test contains multiple test cases. The first line contains the number of test cases $$$t$$$ ($$$1 \\le t \\le 100$$$). The description of the test cases follows.

 

The first line of each testcase contains an integer $$$n$$$ ($$$2 \\le n \\le 1000$$$) — the number of slimes.

The second line of each testcase contains $$$n$$$ integers $$$a\_1,a\_2,\\ldots,a\_{n}$$$ ($$$1 \\le a\_i \\le 1000$$$) — the initial positions of the slimes.

It is guaranteed that the sum of $$$n$$$ over all test cases does not exceed $$$1000$$$. Output

For each testcase, output the minimum number of operations required to make all slimes occupy the same position.

ExampleInputCopy

```
1051 2 3 4 553 3 3 3 365 6 7 1 2 322 541 3 8 746 2 1 831 3 951 10 1 10 10810 8 5 9 1 6 9 1021 1000
```

OutputCopy

```
203244455500
```

Note

Test Case 1: We can perform $$$2$$$ operations, both with $$$x = 3$$$. The first operation updates the array of positions to $$$a = \[2, 3, 3, 3, 4\]$$$, and then the second operation updates it to $$$a = \[3, 3, 3, 3, 3\]$$$.

Test Case 2: All the slimes are already at position $$$3$$$, and hence $$$0$$$ operations are needed.