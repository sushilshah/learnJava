
/*************************************************************************
 *  Compilation:  javac WidthChecker.java
 *  Execution:    java WidthChecker N < source.java
 *  Dependencies: StdIn.java
 *  
 *  Reads in a text file and prints out all lines that have (strictly)
 *  more than N characters (including spaces but not the newline 
 *  character itself).
 *
 *  Note: setting parameter N = -1 prints out all lines with line numbers.
 *
 *************************************************************************/

public class WidthChecker { 
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);       // max line length

        for (int cnt = 1; !StdIn.isEmpty(); cnt++) {
            String line = StdIn.readLine();      // read in next line
            if (line.length() > N)               // line exceeds threshold
                System.out.println(cnt + ": " + line);
        }
    }

}
