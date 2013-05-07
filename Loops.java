


/*************************************************************************
 *  Compilation:  javac Loops.java
 *  Execution:    java Loops
 *
 *
 *************************************************************************/




public class Loops {

    public static void main(String[] args) {
 
       int N = Integer.parseInt(args[0]);

       // print powers of two
       int v = 1;
       for (int i = 0; i <= N; i++) {
           System.out.println(v);
           v = 2 * v;
       }
       System.out.println();

       // print largest power of two less than or equal to N
       v = 1;
       while (v <= N/2) {
           v = 2 * v;
       }
       System.out.println(v);
       System.out.println();

       // compute a finite sum (1 + 2 + ... + N)
       int sum = 0;
       for (int i = 1; i <= N; i++) {
           sum += i;
       }
       System.out.println(sum);
       System.out.println();

       // compute a finite product (N!)
       int product = 1;
       for (int i = 1; i <= N; i++) {
           product *= i;
       }
       System.out.println(product);
       System.out.println();

       // print a table of values (2 pi i / N)
       for (int i = 0; i <= N; i++) {
           System.out.println(i + " " + 2 * Math.PI * i / N);
       }
       System.out.println();

       // print the ruler function
       String ruler = " ";
       for (int i = 1; i <= N; i++) {
           ruler = ruler + i + ruler;
       }
       System.out.println(ruler);
       System.out.println();

    }
}

