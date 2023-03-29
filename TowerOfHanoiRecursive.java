package week6;

public class TowerOfHanoiRecursive {
    public static String showMovesRecursive(int numDisks, char startPeg, char destPeg, char tempPeg) {
        //base case: move the first disk directly to the destination peg
        if (numDisks==1){
            return "Move disk 1 from peg " + startPeg + " to peg " + destPeg + "\n";
        }

        //recursive case: move n-1 disks from the starting peg to the temporary peg,
        //then move the largest disk to the destination peg, and finally
        //move the n-1 disks from the temporary peg to the destination peg
        else {
            return showMovesRecursive(numDisks-1, startPeg, tempPeg, destPeg) + "Move disk " + numDisks + " from peg " + startPeg +
                    " to peg " + destPeg + "\n" + showMovesRecursive(numDisks-1, tempPeg, destPeg, startPeg);
        }
    }
}
