<h2><a href="https://codeforces.com/contest/1901/problem/A" target="_blank" rel="noopener noreferrer">1901A — Line Trip</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1901A](https://codeforces.com/contest/1901/problem/A) |

## Topics
`greedy` `math`

---

## Problem Statement

A. Line Triptime limit per test2 secondsmemory limit per test256 megabytesinputstandard inputoutputstandard output

There is a road, which can be represented as a number line. You are located in the point $$$0$$$ of the number line, and you want to travel from the point $$$0$$$ to the point $$$x$$$, and back to the point $$$0$$$.

You travel by car, which spends $$$1$$$ liter of gasoline per $$$1$$$ unit of distance travelled. When you start at the point $$$0$$$, your car is fully fueled (its gas tank contains the maximum possible amount of fuel).

There are $$$n$$$ gas stations, located in points $$$a\_1, a\_2, \\dots, a\_n$$$. When you arrive at a gas station, you fully refuel your car. Note that you can refuel only at gas stations, and there are no gas stations in points $$$0$$$ and $$$x$$$.

You have to calculate the minimum possible volume of the gas tank in your car (in liters) that will allow you to travel from the point $$$0$$$ to the point $$$x$$$ and back to the point $$$0$$$.

Input

The first line contains one integer $$$t$$$ ($$$1 \\le t \\le 1000$$$) — the number of test cases.

Each test case consists of two lines:

  

-    the first line contains two integers $$$n$$$ and $$$x$$$ ($$$1 \\le n \\le 50$$$; $$$2 \\le x \\le 100$$$); 
-   the second line contains $$$n$$$ integers $$$a\_1, a\_2, \\dots, a\_n$$$ ($$$0  \\lt  a\_1  \\lt  a\_2  \\lt  \\dots  \\lt  a\_n  \\lt  x$$$). Output

For each test case, print one integer — the minimum possible volume of the gas tank in your car that will allow you to travel from the point $$$0$$$ to the point $$$x$$$ and back.

ExampleInputCopy

```
33 71 2 53 61 2 51 107
```

OutputCopy

```
4
3
7
```
Note

In the first test case of the example, if the car has a gas tank of $$$4$$$ liters, you can travel to $$$x$$$ and back as follows:

  

-    travel to the point $$$1$$$, then your car's gas tank contains $$$3$$$ liters of fuel; 
-    refuel at the point $$$1$$$, then your car's gas tank contains $$$4$$$ liters of fuel; 
-    travel to the point $$$2$$$, then your car's gas tank contains $$$3$$$ liters of fuel; 
-    refuel at the point $$$2$$$, then your car's gas tank contains $$$4$$$ liters of fuel; 
-    travel to the point $$$5$$$, then your car's gas tank contains $$$1$$$ liter of fuel; 
-    refuel at the point $$$5$$$, then your car's gas tank contains $$$4$$$ liters of fuel; 
-    travel to the point $$$7$$$, then your car's gas tank contains $$$2$$$ liters of fuel; 
-    travel to the point $$$5$$$, then your car's gas tank contains $$$0$$$ liters of fuel; 
-    refuel at the point $$$5$$$, then your car's gas tank contains $$$4$$$ liters of fuel; 
-    travel to the point $$$2$$$, then your car's gas tank contains $$$1$$$ liter of fuel; 
-    refuel at the point $$$2$$$, then your car's gas tank contains $$$4$$$ liters of fuel; 
-    travel to the point $$$1$$$, then your car's gas tank contains $$$3$$$ liters of fuel; 
-    refuel at the point $$$1$$$, then your car's gas tank contains $$$4$$$ liters of fuel; 
-   travel to the point $$$0$$$, then your car's gas tank contains $$$3$$$ liters of fuel.