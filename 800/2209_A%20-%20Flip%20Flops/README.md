<h2><a href="https://codeforces.com/contest/2209/problem/A" target="_blank" rel="noopener noreferrer">2209A — Flip Flops</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 2209A](https://codeforces.com/contest/2209/problem/A) |

## Topics
`greedy`

---

## Problem Statement

A. Flip Flopstime limit per test1 secondmemory limit per test256 megabytesinputstandard inputoutputstandard output

OtterZ set up a battle with $$$n$$$ monsters in order to increase his combat power. Each monster has a combat power $$$a\_i$$$ and OtterZ has a combat power of $$$c$$$. He has $$$k$$$ flip flops and can perform the following operations: 

 -   Kill an alive monster $$$i$$$ if $$$a\_i \\le c$$$; then $$$c$$$ becomes $$$c + a\_i$$$.
-   Throw a flip flop at an alive monster $$$i$$$; the flip-flop will be broken and the monster will become angrier, then $$$a\_i$$$ becomes $$$a\_i + 1$$$. 

 Help OtterZ obtain the maximum possible $$$c$$$ after the battle.Input

Each test contains multiple test cases. The first line contains the number of test cases $$$t$$$ ($$$1 \\le t \\le 500$$$). The description of the test cases follows.

 

The first line of each test case contains three integers $$$n$$$, $$$c$$$ and $$$k$$$ ($$$1 \\le n \\le 100$$$, $$$0 \\le c,k \\le 10 ^ 9$$$).

The second line contains $$$n$$$ integers $$$a\_1,a\_2,\\ldots,a\_n$$$ ($$$0\\le a\_i\\le 10 ^ 9$$$).

Output

For each test case, output an integer — the maximum possible combat power.

ExampleInputCopy

```
101 12 23211 8 451 3 4163 6 314 9 115 9 220 16 18 16 115 18 301 2 93 84 27 29 132 9 38 4 7 1 610 9 28 1 8 11 17 3 14 16 20 1010 192 1091 9 20 9 829 3 87 1 283 710 1000000000 100000000019 1000000000 1 9 2 3 8 1 2 3
```

OutputCopy

```
1216369531091197213000000048
```

Note

In the first test,OtterZ found a strong monster and ran away, with combat power $$$12$$$.

In the sixth test, OtterZ participated in the battle: 

-   Throw $$$10$$$ flip flops to monster $$$2$$$, the combat power of monster $$$2$$$ turns to $$$12$$$.
-    Throw $$$10$$$ flip flops to monster $$$1$$$, the combat power of monster $$$1$$$ turns to $$$11$$$. 
-    Kill monster $$$1$$$, OtterZ's combat power turns to $$$29$$$. 
-    Throw $$$10$$$ flip flops to monster $$$5$$$, the combat power of monster $$$5$$$ turns to $$$12$$$. 
-    Kill monster $$$2$$$, OtterZ's combat power turns to $$$41$$$. 
-    Kill monster $$$5$$$, OtterZ's combat power turns to $$$53$$$. 
-   OtterZ runs away with combat power $$$53$$$.