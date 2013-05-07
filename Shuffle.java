
/*************************************************************************
 *  Compilation:  javac Shuffle.java
 *  Execution:    java Shuffle arg1 arg2 arg3
 *  
 *  Prints out the command line arguments in random order.
 *  Uses a function that takes an array and rearranges it 
 *  in random order.
 *
 *  % java Shuffle Alice Bob Cynthia Dan Erin Frank
 *  Bob
 *  Frank
 *  Dan
 *  Cynthia
 *  Alice
 *  Erin
 *
 *  % java Shuffle Alice Bob Cynthia Dan Erin Frank
 *  Cynthia
 *  Alice
 *  Frank
 *  Dan
 *  Erin
 *  Bob
 *
 *************************************************************************/

public class Shuffle { 

    // swaps array elements i and j
    public static void exch(String[] a, int i, int j) {
        String swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    // take as input an array of strings and rearrange them in random order
    public static void shuffle(String[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int r = i + (int) (Math.random() * (N-i));   // between i and N-1
            exch(a, i, r);
        }
    }

    // take as input an array of strings and print them out to standard output
    public static void show(String[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    // shuffle the command line arguments
    public static void main(String[] args) { 
        shuffle(args);
        show(args);

    }
}
