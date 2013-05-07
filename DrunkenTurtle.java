/*************************************************************************
 *  Compilation:  javac DrunkenTurtle.java
 *  Execution:    java DrunkenTurtle T step
 *  Dependencies: Turtle.java 
 *  
 *  Plot the path of a drunken turtle.
 *
 *  % java DrunkenTurtle 10000 .01
 *
 *************************************************************************/


public class DrunkenTurtle {
    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);             // number of steps
        double step = Double.parseDouble(args[1]);     // step size

        Turtle turtle = new Turtle(0.5, 0.5, 0.0);
        for (int t = 0; t < T; t++) {
            turtle.turnLeft(360.0 * Math.random());
            turtle.goForward(step);
        }
    }
}

