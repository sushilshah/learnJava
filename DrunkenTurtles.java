/*************************************************************************
 *  Compilation:  javac DrunkenTurtles.java
 *  Execution:    java DrunkenTurtles T step
 *  Dependencies: Turtle.java 
 *  
 *  Plot the path of a drunken turtle.
 *
 *  % java DrunkenTurtles 20 5000 .005 
 *
 *************************************************************************/


public class DrunkenTurtles {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);             // number of turtles
        int T = Integer.parseInt(args[1]);             // number of steps
        double step = Double.parseDouble(args[2]);     // step size

        // create N turtles
        Turtle[] turtles = new Turtle[N];
        for (int i = 0; i < N; i++) {
            turtles[i] = new Turtle(Math.random(), Math.random(), 0.0);
        }

        // simulate the movement for T steps
        for (int t = 0; t < T; t++) {
            for (int i = 0; i < N; i++) {
                turtles[i].turnLeft(360.0 * Math.random());
                turtles[i].goForward(step);
            }
        }
    }
}

