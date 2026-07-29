<h2><a href="https://codeforces.com/contest/2209/problem/B" target="_blank" rel="noopener noreferrer">2209B — Array</a></h2>

| | |
|---|---|
| **Difficulty** | 900 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 2209B](https://codeforces.com/contest/2209/problem/B) |

## Topics
`greedy`

---

## Problem Statement

B. Arraytime limit per test1.5 secondsmemory limit per test256 megabytesinputstandard inputoutputstandard output You are given an integer array $$$a$$$ of length $$$n$$$.

 

For each index $$$i$$$, find the maximum number of indices $$$j$$$ such that $$$j  \\gt  i$$$ and $$$|a\_i - k|  \\gt  |a\_j - k|$$$, over all possible integer values of $$$k$$$.Input

Each test contains multiple test cases. The first line contains the number of test cases $$$t$$$ ($$$1 \\le t \\le 100$$$). The description of the test cases follows.

 

The first line of each test case contains an integer $$$n$$$ ($$$1 \\le n \\le 5000$$$).

The second line contains $$$n$$$ integers $$$a\_1, a\_2, \\ldots, a\_n$$$ ($$$-10^9 \\le a\_i \\le 10^9$$$).

It is guaranteed that the sum of $$$n$$$ over all test cases does not exceed $$$5000$$$. Output

For each test case, output $$$n$$$ integers denoting the answer.

ExampleInputCopy

```
6110922105 -10551 2 93 84 272 9 38 4 7 1 6101 9 20 9 829 3 87 1 283 7119 18 29817 283 3 3928 5726 1942 1000000000 -1000000000 19
```

OutputCopy

```
01 04 2 2 1 05 4 4 2 2 1 08 4 4 3 5 3 2 2 1 08 7 7 4 5 3 3 2 2 1 0
```

Note

In the second test, the answers are: 

-   For $$$i=1$$$, you can choose $$$k=-195$$$, then $$$j=2$$$.
-   For $$$i=2$$$, you can choose $$$k=5$$$, there exists no index $$$j \\gt i$$$.

 

In the third test, the answers are: 

-   For $$$i=1$$$, you can choose $$$k=195$$$, then $$$j=2,3,4,5$$$.
-    For $$$i=2$$$, you can choose $$$k=78$$$, then $$$j=3,4$$$. 
-    For $$$i=3$$$, you can choose $$$k=15$$$, then $$$j=4,5$$$. 
-    For $$$i=4$$$, you can choose $$$k=15$$$, then $$$j=5$$$. 
-   For $$$i=5$$$, you can choose $$$k=998\\,244\\,353$$$, there exists no index $$$j \\gt i$$$.