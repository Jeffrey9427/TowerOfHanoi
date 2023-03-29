package week6;

import java.util.Stack;

public class TowerOfHanoiIterative {
    public static void showMovesIterative(int numDisks, Stack startPeg, Stack destPeg, Stack tempPeg) {
        //number of moves required to solve the tower of hanoi problem : (2^n-1)
        int totalNumMoves = (int) Math.pow(2, numDisks) - 1;

        //define three pegs as characters: L for left (start), M for middle (temp), and R for right (destination)
        char start = 'L';
        char mid = 'M';
        char dest = 'R';

        if (numDisks % 2 == 0) {
            char temp = dest;
            dest = mid;
            mid = temp;
        }

        //fills the startPeg stack with all the disks, with larger disks at the bottom
        for (int i=numDisks; i>=1; i--) {
            startPeg.push(i);
        }

        for (int i=1; i<=totalNumMoves; i++) {
            if (i % 3 == 1) {
                moveDisks(startPeg, destPeg, start, dest);
            } else if (i % 3 == 2) {
                moveDisks(startPeg, tempPeg, start, mid);
            } else {
                moveDisks(tempPeg, destPeg, mid, dest);
            }
        }
    }

    public static void moveDisks(Stack<Integer> startPeg, Stack<Integer> destPeg, char from, char to) {
        //pop the top disk from the start peg and the destination peg to be compared
        int pole1TopDisk = !startPeg.isEmpty() ? startPeg.pop() : 0;
        int pole2TopDisk = !destPeg.isEmpty() ? destPeg.pop() : 0;

        //move the disk from one peg to another and print the movement
        if (pole1TopDisk == 0) {
            startPeg.push(pole2TopDisk);
            printDiskMovement(to, from, pole2TopDisk);
        } else if (pole2TopDisk == 0) {
            destPeg.push(pole1TopDisk);
            printDiskMovement(from, to, pole1TopDisk);
        } else if (pole1TopDisk > pole2TopDisk) {
            startPeg.push(pole1TopDisk);
            startPeg.push(pole2TopDisk);
            printDiskMovement(to, from, pole2TopDisk);
        } else {
            destPeg.push(pole2TopDisk);
            destPeg.push(pole1TopDisk);
            printDiskMovement(from, to, pole1TopDisk);
        }
    }

    public static void printDiskMovement(char fromPeg, char toPeg, int disk) {
        System.out.println("Move disk " + disk + " from " + fromPeg + " to " + toPeg);
    }
}