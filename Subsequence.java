
/*************************************************************************
 *  Compilation:  javac Subsequence.java
 *  Execution:    java Subsequence s t
 *  
 *  Determines whether string s is a subsequence of string t.
 *
 *
 *************************************************************************/


public class Subsequence { 
    public static boolean isSubsequence(String s, String t) {
        int M = s.length();
        int N = t.length();

        int i = 0;
        for (int j = 0; j < N; j++) {
            if (s.charAt(i) == t.charAt(j)) i++;
            if (i == M) return true;
        }
        return false;
    }

    public static void main(String[] args) { 
        String s = args[0];
        String t = args[1];
        System.out.println(isSubsequence(s, t));
    }

}
