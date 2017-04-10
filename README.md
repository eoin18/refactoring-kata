# refactoring-kata

[![Build Status](https://travis-ci.org/eoin18/refactoring-kata.svg?branch=master)](https://travis-ci.org/eoin18/refactoring-kata)

[![codecov](https://codecov.io/gh/eoin18/refactoring-kata/branch/master/graph/badge.svg)](https://codecov.io/gh/eoin18/refactoring-kata)

A refactoring kata for use in coding dojo

Based on/Stolen from [Advent Of Code 2016 Day 2](http://adventofcode.com/2016/day/2)
 
## Description
 
Given a keypad like below, and a set of instructions, each button to be pressed can be found by starting on the previous button and moving to adjacent buttons on the keypad: U moves up, D moves down, L moves left, and R moves right. Each line of instructions corresponds to one button, starting at the previous button (or, for the first line, the "5" button); press whatever button you're on at the end of each line. If a move doesn't lead to a button, ignore it.
```
1 2 3  
4 5 6  
7 8 9 
```
 
#### Example
Suppose your instructions are:  
``` 
    ULL 
    RRDDD 
    LURDL
    UUUUD
```  

* You start at "5" and move up (to "2"), left (to "1"), and left (you can't, and stay on "1"), so the first button is 1.
* Starting from the previous button ("1"), you move right twice (to "3") and then down three times (stopping at "9" after two moves and ignoring the third), ending up with 9.
* Continuing from "9", you move left, up, right, down, and left, ending with 8.
* Finally, you move up four times (stopping at "2"), then down once, ending with 5.

So, in this example, the bathroom code is `1985`.

#### Goal
The goal of the Kata is to refactor the code to be more modular, resolve the unit test failures and increase the code coverage.

### Part 2
If the Kata is completed in time, there is a second part of the challenge to add, below:

The same rules apply as above, however the keypad is different in this case:

```
    1
  2 3 4
5 6 7 8 9
  A B C
    D
```

#### Example
* You still start at "5" and stop when you're at an edge, but given the same instructions as above, the outcome is very different:
* You start at "5" and don't move at all (up and left are both edges), ending at 5.
* Continuing from "5", you move right twice and down three times (through "6", "7", "B", "D", "D"), ending at D.
* Then, from "D", you move five more times (through "D", "B", "C", "C", "B"), ending at B.
* Finally, after five more moves, you end at 3.  

So, given the actual keypad layout, the code would be `5DB3`