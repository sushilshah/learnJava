
/*************************************************************************
 *  Compilation:  javac Squeeze.java
 *  Execution:    java Squeeze
 *  Dependencies: In.java
 *
 *  Takes a string command line argument and removes adjacent spaces.
 *  
 *  % java Squeeze "this is    a    test"
 *  this is a test
 *
 *************************************************************************/

public class Squeeze { 
    public static String squeeze(String s) { 
        char[] a = s.toCharArray();
        int N = 1;
        for (int i = 1; i < a.length; i++) { 
            a[N] = a[i];
            if      (a[N]   != ' ') N++;
            else if (a[N-1] != ' ') N++; 
        }
        return new String(a, 0, N);
    }


    public static void main(String[] args) { 
        System.out.println(squeeze(args[0]));
    }

}
