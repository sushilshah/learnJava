/*************************************************************************
 *  Compilation:  javac LeastSquares.java
 *  Execution:    java LeastSquares
 *  Dependencies: Draw.java DrawListener.java
 * 
 *  Plots the points that the user clicks, and plots the least squares
 *  line through them.
 *
 *************************************************************************/

import java.awt.Color;

public class LeastSquares implements DrawListener {
    private int N = 0;
    private double sumx  = 0.0;                     // sum { x[i],      i = 1..n
    private double sumy  = 0.0;                     // sum { y[i],      i = 1..n
    private double sumx2 = 0.0;                     // sum { x[i]*x[i], i = 1..n
    private double sumy2 = 0.0;                     // sum { y[i]*y[i], i = 1..n
    private double sumxy = 0.0;                     // sum { x[i]*y[i], i = 1..n
    private double[] x = new double[10000];
    private double[] y = new double[10000];

    private Draw draw = new Draw();

    public LeastSquares() {
        draw.addListener(this);
        draw.clear(Color.LIGHT_GRAY);
        draw.show();
    }

    public void mousePressed(double x0, double y0) {
        x[N] = x0;
        y[N] = y0; 
        sumx  += x[N];
        sumy  += y[N];
        sumx2 += x[N]*x[N];
        sumy2 += y[N]*y[N];
        sumxy += x[N]*y[N];
        N++;

        draw.clear();

        // draw the least squares line
        draw.setPenColor(Color.BLACK);
        double a = (N*sumxy - sumx*sumy) / (N*sumx2 - sumx*sumx);
        double b = (sumy - a*sumx) / N;
        draw.line(0, b, 1, a + b);

        // draw the points
        for (int i = 0; i < N; i++) {
            draw.setPenColor(Color.BLUE);
            draw.filledCircle(x[i], y[i], 0.005);
            draw.setPenColor(Color.GRAY);
            draw.line(x[i], y[i], x[i], a*x[i] + b);
        }

        draw.show();
    }


    public void keyTyped(char c) { draw.save("leastsquares" + c + ".png"); }
    public void mouseDragged(double x, double y) { }
    public void mouseReleased(double x, double y) { }


    // test client
    public static void main(String[] args) {
        LeastSquares ls = new LeastSquares();
    }
 

   
}
