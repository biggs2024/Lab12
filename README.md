# Lab 12: Recursion

**Course:** CSCI 1302 - Programming Principles II (Georgia Southern University)  
**Term:** Spring 2026  
**Due Date:** Friday, May 1, 2026  

## 👥 Group Members: Kalis Sandlin, Tyrone Darby, Wesley Soto

## 📝 Overview
This repository contains the Java source code for Lab 12. The primary objective of this lab is to practice solving problems using recursive methods, debugging recursive calls, and coordinating shared code using GitHub. 

The project is divided into three main problems:
1. **Mathematical Recursion:** Implementing a specific recurrence relation.
2. **String Reversal:** Reversing a string using a single recursive method.
3. **Optimized String Reversal:** Reversing a string using a recursive helper method to avoid creating unnecessary string objects in memory.

## 📂 Project Structure

* `Lab12Prob01.java` 
  * Implements `recursiveAbstract(int n)`, which calculates a sequence based on the relation: `f(n) = f(n-3) * (f(n-2) - f(n-1))` where `f(0)=1`, `f(1)=3`, and `f(2)=4`.
* `Lab12Prob02.java`
  * Implements `reverseString(String str)`, which recursively reverses a string by manipulating substrings.
* `Lab12Prob03.java`
  * An optimized version of Problem 2. Implements a helper method `reverseString(String str, int index)` that uses a pointer to track the current character, preventing the creation of new `String` objects during each recursive call.

## 🚀 How to Run

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/](https://github.com/)[your-username]/[your-repo-name].git
   cd [your-repo-name]
