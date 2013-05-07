
/*************************************************************************
 *  Compilation:  javac Repetition.java StdIn.java
 *  Execution:    java Repetition < wordlist.txt
 *  
 *  Read in a list of words from standard input, and print out all
 *  all words for which each leter appears exactly twice.
 *
 *  For each string, we use an array to count the number of times 
 *  each letter appears.
 *
 *  %  java Repetition < words.txt
 *  appall
 *  beriberi
 *  bilabial
 *  coco
 *  couscous
 *  ...
 *  tutu
 *
 *
 *  Bugs
 *  ----
 *  We assume that the input words consists of lowercase letters and
 *  do no error checking.
 *
 *************************************************************************/

public class Repetition { 
    public static void main(String[] args) {

        int[] cnt = new int[26];       // profile of input word

        // read in dictionary words, one at a time and process
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();

            // compute profile of s
            for (int i = 0; i < 26; i++)
                cnt[i] = 0;
            for (int i = 0; i < s.length(); i++)
                ++cnt[s.charAt(i) - 'a'];

            // check if each character appears 0 or 2 times
            boolean match = true;
            for (int i = 0; i < 26; i++)
                if (cnt[i] != 0 && cnt[i] != 2) match = false;
            if (match) System.out.println(s);
        }
    }

}
