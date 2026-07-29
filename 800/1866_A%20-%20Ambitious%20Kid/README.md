<h2><a href="https://codeforces.com/contest/1866/problem/A" target="_blank" rel="noopener noreferrer">1866A — Ambitious Kid</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1866A](https://codeforces.com/contest/1866/problem/A) |

## Topics
`math`

---

## Problem Statement

A. Ambitious Kidtime limit per test1 secondmemory limit per test256 megabytesinputstandard inputoutputstandard output

Chaneka, Pak Chanek's child, is an ambitious kid, so Pak Chanek gives her the following problem to test her ambition.

Given an array of integers $$$\[A\_1, A\_2, A\_3, \\ldots, A\_N\]$$$. In one operation, Chaneka can choose one element, then increase or decrease the element's value by $$$1$$$. Chaneka can do that operation multiple times, even for different elements.

What is the minimum number of operations that must be done to make it such that $$$A\_1 \\times A\_2 \\times A\_3 \\times \\ldots \\times A\_N = 0$$$?

Input

The first line contains a single integer $$$N$$$ ($$$1 \\leq N \\leq 10^5$$$).

The second line contains $$$N$$$ integers $$$A\_1, A\_2, A\_3, \\ldots, A\_N$$$ ($$$-10^5 \\leq A\_i \\leq 10^5$$$).

Output

An integer representing the minimum number of operations that must be done to make it such that $$$A\_1 \\times A\_2 \\times A\_3 \\times \\ldots \\times A\_N = 0$$$.

ExamplesInputCopy

```
3
2 -6 5
```
OutputCopy

```
2
```
InputCopy

```
1
-3
```
OutputCopy

```
3
```
InputCopy

```
5
0 -1 0 1 0
```
OutputCopy

```
0
```
Note

In the first example, initially, $$$A\_1\\times A\_2\\times A\_3=2\\times(-6)\\times5=-60$$$. Chaneka can do the following sequence of operations:

  

-    Decrease the value of $$$A\_1$$$ by $$$1$$$. Then, $$$A\_1\\times A\_2\\times A\_3=1\\times(-6)\\times5=-30$$$ 
-   Decrease the value of $$$A\_1$$$ by $$$1$$$. Then, $$$A\_1\\times A\_2\\times A\_3=0\\times(-6)\\times5=0$$$

 

In the third example, Chaneka does not have to do any operations, because from the start, it already holds that $$$A\_1\\times A\_2\\times A\_3\\times A\_4\\times A\_5=0\\times(-1)\\times0\\times1\\times0=0$$$