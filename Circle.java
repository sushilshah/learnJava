/*************************************************************************
 *  Compilation:  javac Circle.java
 *  Execution:    java Circle N
 *  
 *  Prints out a circle of radius N like the one below.
 *
 *  % java Circle 5
 *  . . . . . * . . . . . 
 *  . . * * * * * * * . . 
 *  . * * * * * * * * * . 
 *  . * * * * * * * * * . 
 *  . * * * * * * * * * . 
 *  * * * * * * * * * * * 
 *  . * * * * * * * * * . 
 *  . * * * * * * * * * . 
 *  . * * * * * * * * * . 
 *  . . * * * * * * * . . 
 *  . . . . . * . . . . . 
 *
 *************************************************************************/

public class Circle {

    public static void main(String[] args) { 
        int N = Integer.parseInt(args[0]);

        for (int i = -N; i <= N; i++) {
            for (int j = -N; j <= N; j++) {
                if (i*i + j*j <= N*N) System.out.print("* ");
                else                  System.out.print(". ");
            }
            System.out.println();
        }
    }
}