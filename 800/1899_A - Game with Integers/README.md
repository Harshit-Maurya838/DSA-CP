<h2><a href="https://codeforces.com/contest/1899/problem/A" target="_blank" rel="noopener noreferrer">1899A — Game with Integers</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1899A](https://codeforces.com/contest/1899/problem/A) |

## Topics
`games` `math` `number theory`

---

## Problem Statement

A. Game with Integerstime limit per test1 secondmemory limit per test256 megabytesinputstandard inputoutputstandard output

Vanya and Vova are playing a game. Players are given an integer $$$n$$$. On their turn, the player can add $$$1$$$ to the current integer or subtract $$$1$$$. The players take turns; Vanya starts. If after Vanya's move the integer is divisible by $$$3$$$, then he wins. If $$$10$$$ moves have passed and Vanya has not won, then Vova wins.

Write a program that, based on the integer $$$n$$$, determines who will win if both players play optimally.

Input

The first line contains the integer $$$t$$$ ($$$1 \\leq t \\leq 100$$$) — the number of test cases.

The single line of each test case contains the integer $$$n$$$ ($$$1 \\leq n \\leq 1000$$$).

Output

For each test case, print "First" without quotes if Vanya wins, and "Second" without quotes if Vova wins.

ExampleInputCopy

```
61351009991000
```

OutputCopy

```
First
Second
First
First
Second
First
```