<h2><a href="https://codeforces.com/contest/2229/problem/B" target="_blank" rel="noopener noreferrer">2229B — Absolute Cinema</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 2229B](https://codeforces.com/contest/2229/problem/B) |

## Topics
`greedy` `math`

---

## Problem Statement

B. Absolute Cinematime limit per test1.5 secondsmemory limit per test256 megabytesinputstandard inputoutputstandard output You find yourself with two arrays of positive integers $$$a$$$ and $$$b$$$, both of length $$$n$$$. You are to perform the following operation any number of times:

  

-   select an integer $$$i$$$ ($$$1 \\le i \\le n$$$) and swap $$$a\_i$$$ and $$$b\_i$$$.

 

Determine the maximum value of $$$\\max(a) + \\sum^{n}\_{i = 1}{b\_i}$$$ attainable if you perform the operations optimally.Input

Each test contains multiple test cases. The first line contains the number of test cases $$$t$$$ ($$$1 \\le t \\le 10^4$$$). The description of the test cases follows.

 

The first line of each testcase contains an integer $$$n$$$ ($$$1 \\le n \\le 10^5$$$) — the length of the arrays $$$a$$$ and $$$b$$$.

The second line of each testcase contains $$$n$$$ integers $$$a\_1,a\_2,\\ldots,a\_{n}$$$ ($$$1 \\le a\_i \\le 10^9$$$).

The third line of each testcase contains $$$n$$$ integers $$$b\_1,b\_2,\\ldots,b\_{n}$$$ ($$$1 \\le b\_i \\le 10^9$$$).

It is guaranteed that the sum of $$$n$$$ over all test cases does not exceed $$$10^5$$$. Output

For each testcase, output the maximum value of $$$\\max(a) + \\sum^{n}\_{i = 1}{b\_i}$$$ attainable.

ExampleInputCopy

```
412111231 2 34 5 642 3 6 71 4 5 8
```

OutputCopy

```
331827
```

Note

Test Case 3: No swaps are required, so the answer is $$$\\max(\[1, 2, 3\]) + 4 + 5 + 6 = 3 + 15 = 18$$$, it can be proven that this is optimal.

Test Case 4: You can achieve the maximum by swapping indices $$$1$$$, $$$3$$$ and $$$4$$$. So we get: 

 -   $$$a = \[1, 3, 5, 8\]$$$
-   $$$b = \[2, 4, 6, 7\]$$$ 

 This gives an answer of $$$\\max(\[1, 3, 5, 8\]) + 2 + 4 + 6 + 7 = 8 + 19 = 27$$$, it can be proven that this is optimal.