# Tower of Hanoi 

A solution to the classic Tower of Hanoi problem, implemented in Java with Recursive and Iterative methods.

### Problem description 

The Tower of Hanoi problem consists of three pegs and a number of disks of different sizes which can slide onto any peg. The puzzle starts with the disks in a neat stack in ascending order of size on one peg, the smallest at the top, thus making a conical shape.

The objective of the puzzle is to move the entire stack of disks from the starting peg to the destination peg, with the following simple rules: 

1. Only one disk can be moved at a time.
2. Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack or on an empty peg.
3. No disk may be placed on top of a smaller disk.

### Usage and Problem Testing

To run the program, simply execute the `Main.java` file. The program will prompt you to enter the number of the disks you wish to use, and then it will display the steps necessary to solve the puzzle. Example of the program testing with the number of disks inputted is 3. 

```
Tower of Hanoi
Enter number of disks: 3

Recursive Approach
Move disk 1 from peg L to peg R
Move disk 2 from peg L to peg M
Move disk 1 from peg R to peg M
Move disk 3 from peg L to peg R
Move disk 1 from peg M to peg L
Move disk 2 from peg M to peg R
Move disk 1 from peg L to peg R

Recursive function - run time = 22.0 ms.

Iterative Approach
Move disk 1 from L to R
Move disk 2 from L to M
Move disk 1 from R to M
Move disk 3 from L to R
Move disk 1 from M to L
Move disk 2 from M to R
Move disk 1 from L to R
Iterative function - run time = 6.0 ms.
```



