
/*************************************************************************
 *  Compilation:  javac Infix.java In.java
 *  Execution:    java Infix 
 *  Dependencies: Stack.java
 *
 *  Reads in an infix expression and outputs an equivalent postfix
 *  expression.
 *
 *  Windows users: replace <Ctrl-d> with <Ctrl-z> to signify end of file.
 * 
 *  % java Infix
 *  ( 2 + ( ( 3 + 4 ) * ( 5 * 6 ) ) )
 *  <Ctrl-d>
 *  2 3 4 + 5 6 * * + 
 *
 *  % java Infix | java Postfix
 *  ( 2 + ( ( 3 + 4 ) * ( 5 * 6 ) ) )
 *  <Ctrl-d>
 *  212
 *
 *************************************************************************/

public class Infix {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if      (s.equals("+")) stack.push(s);
            else if (s.equals("*")) stack.push(s);
            else if (s.equals(")")) System.out.print(stack.pop() + " ");
            else if (s.equals("(")) System.out.print("");
            else                    System.out.print(s + " ");
        }
        System.out.println();
    }
}

