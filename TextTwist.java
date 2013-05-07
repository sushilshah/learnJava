
/*************************************************************************
 *  Compilation:  javac TextTwist.java StdIn.java
 *  Execution:    java TextTwist word < words.txt
 *  
 *  Reads in a word from the command line, and a dictionary
 *  of words from standard input, and prints out all words in the 
 *  dictionary that can be formed be rearranging some of the  
 *  letters in the input word and have at least 4 letters.
 *
 *  For each string, we create a profile which counts the number of
 *  times each character occurs.
 *
 *  %  java TextTwist science < words.txt
 *  esen
 *  nice
 *  niece
 *  scene
 *  scenic
 *  science
 *  since
 *  sine
 *
 *
 *  Restrictions
 *  ------------
 *  We assume that the input words are ASCII.
 *
 *************************************************************************/

public class TextTwist { 
    private static final int ALPHABET = 256;

    // return profile of ASCII string s
    public static int[] profile(String s) {
        int[] cnt = new int[ALPHABET];
        for (int i = 0; i < s.length(); i++)
            ++cnt[s.charAt(i)];
        return cnt;
    }

    // are two profiles identical?
    public static boolean contains(int[] cnt1, int[] cnt2) {
        for (int i = 0; i < ALPHABET; i++)
            if (cnt1[i] < cnt2[i]) return false;
        return true;
    }


    public static void main(String[] args) {

        // comptue profile of input word
        String word = args[0].toLowerCase();
        int[] cnt1 = profile(word);

        // read in dictionary words, one at a time and process
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString().toLowerCase();

            // check that s is of right length
            if (s.length() < 4 || s.length() > word.length()) continue;

            // compute profile of s
            int[] cnt2 = profile(s);

            // check against input word
            if (contains(cnt1, cnt2)) System.out.println(s);
        }
    }

}
