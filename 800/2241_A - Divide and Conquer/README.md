<h2><a href="https://codeforces.com/contest/2241/problem/A" target="_blank" rel="noopener noreferrer">2241A — Divide and Conquer</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | C++23 (GCC 14-64, msys2) |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 2241A](https://codeforces.com/contest/2241/problem/A) |

## Topics
`greedy` `math` `number theory`

---

## Problem Statement

A. Divide and Conquertime limit per test1 secondmemory limit per test256 megabytesinputstandard inputoutputstandard output

You are given two positive integers $$$x$$$ and $$$y$$$.

You are allowed to perform the following operation any number of times (possibly zero): 

-   Choose any positive integer $$$z$$$ such that $$$z$$$ divides $$$x$$$;
-   Set $$$x := \\frac{x}{z}$$$.

 

Determine whether you can make $$$x$$$ exactly equal to $$$y$$$ using this operation.

Input

The first line of the input contains a single integer $$$t$$$ ($$$1 \\le t \\le 10^4$$$) — the number of test cases. The description of each test case follows.

The only line of each test case contains two space-separated integers $$$x$$$ and $$$y$$$ ($$$1 \\le x, y \\le 100$$$).

Output

For each test case, print "YES" if you can make $$$x$$$ exactly equal to $$$y$$$ and "NO" otherwise.

You can output "YES" and "NO" in any case (for example, strings "yEs", "yes" and "Yes" will be recognized as a positive response).

ExampleInputCopy

```
312 26 799 79
```

OutputCopy

```
YESNONO
```

Note

For the first test case, 

-   Choosing $$$z = 2$$$ makes $$$x = \\frac{12}{2} = 6$$$
-   Choosing $$$z = 3$$$ makes $$$x = \\frac{6}{3} = 2$$$

 

Thus, we can make $$$x = y$$$. Hence, output YES.

For the second test case, it can be shown that it is impossible to make $$$x$$$ equal to $$$y$$$.