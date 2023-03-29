package week6;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Tower of Hanoi");
        System.out.print("Enter number of disks: ");
        int nDisks = in.nextInt();

        /********************
         *     Recursive    *
         ********************/
        System.out.println("\nRecursive Approach");

        //checks the time complexity
        double startTime = System.currentTimeMillis();

        //create instance of the class and calls the function
        TowerOfHanoiRecursive recursive = new TowerOfHanoiRecursive();
        System.out.println(recursive.showMovesRecursive(nDisks, 'L', 'R', 'M'));

        double endTime = System.currentTimeMillis();
        double totalTime = endTime - startTime;

        System.out.println("Recursive function - run time = " + totalTime + " ms.");


        /********************
         *     Iterative    *
         ********************/
        System.out.println("\nIterative Approach");

        //checks the time complexity
        startTime = System.currentTimeMillis();

        //create instance, stacks and call the function
        TowerOfHanoiIterative iterative = new TowerOfHanoiIterative();

        Stack<Integer> startPeg = new Stack();
        Stack<Integer> tempPeg = new Stack();
        Stack<Integer> destPeg = new Stack();
        iterative.showMovesIterative(nDisks, startPeg, destPeg, tempPeg);

        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;

        System.out.println("Iterative function - run time = " + totalTime + " ms.");
    }
}