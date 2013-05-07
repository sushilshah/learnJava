/*************************************************************************
 *  Compilation:  javac Factorial.java
 *  Execution:    java Factorial N
 *
 *  Reads in a command-line argument N, and prints N! = 1 * 2 * ... * N
 *  to standard output.
 *
 *  % java Factorial 0
 *  1
 *
 *  % java Factorial 1
 *  1
 *
 *  % java Factorial 5
 *  120
 *
 *  % java Factorial 12
 *  479001600
 *
 *  % java Factorial 20
 *  2432902008176640000
 *
 *  % java Factorial -10
 *  java.lang.RuntimeException: Underflow error in factorial
 *
 *  % java Factorial 21
 *  java.lang.RuntimeException: Overflow error in factorial
 *
 *
 *  Remarks
 *  -------
 *   - Would overflow a long if N > 20
 *   - Need to use extended precision arithmetic to handle bigger factorials
 *
 *************************************************************************/

public class Factorial {

    // return n!
    // precondition: n >= 0 and n <= 20
    public static long factorial(long n) {
        if      (n <  0) throw new RuntimeException("Underflow error in factorial");
        else if (n > 20) throw new RuntimeException("Overflow error in factorial");
        else if (n == 0) return 1;
        else             return n * factorial(n-1);
    }

    public static void main(String[] args) {
        long N = Long.parseLong(args[0]);
        System.out.println(factorial(N));
    }

}


