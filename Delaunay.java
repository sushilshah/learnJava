/*************************************************************************
 *  Compilation:  javac Delaunay.java
 *  Execution:    java Delaunay
 *  Dependencies: Draw.java DrawListener.java
 * 
 *  Plots the points that the user clicks, and draws the
 *  Delaunay triangulation using a brute force approach. One defining
 *  property of the Delaunay triangulation is that the circle 
 *  circumscribed by each triangle does not contain any other input
 *  points.
 *  
 *
 *  Limitations
 *  -----------
 *   - this algorithm takes N^4 time in worst case and N^3 in best case
 *     (possible to improve Delaunay triangulation to N log N)
 *   - assumes no degeneracies (e.g., no 4 points are cocircular)
 *   - at most 1000 points - the algorithm will get hopelessly slow
 *     long before this limit is ever approached
 *
 *************************************************************************/

import java.awt.Color;

public class Delaunay implements DrawListener {
    private int MAXN = 1000;                    // maximum number of points
    private int N = 0;                          // number of points
    private Point[] points = new Point[MAXN];   // user-selected points
    private Draw draw;                          // the drawing GUI

    // create an empty Delaunay triangulation GUI
    public Delaunay() {
        draw = new Draw();
        draw.addListener(this);
        draw.show();
    }

    // callback when the user clicks at (x, y)
    public void mousePressed(double x, double y) {
        points[N++] = new Point(x, y);
        draw.clear(Color.LIGHT_GRAY);
        draw.setPenColor(Color.BLACK);
        for (int i = 0; i < N; i++)
            points[i].draw(draw);
        draw.setPenColor(Color.BLUE);


        // determine if i-j-k is a circle with no interior points 
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    boolean isTriangle = true;
                    for (int a = 0; a < N; a++) {
                        if (a == i || a == j || a == k) continue;
                        if (points[a].inside(points[i], points[j], points[k])) {
                           isTriangle = false;
                           break;
                        }
                    }
                    if (isTriangle) {
                        points[i].drawTo(points[j], draw);
                        points[i].drawTo(points[k], draw);
                        points[j].drawTo(points[k], draw);
                    }
                }
            }
        }

        draw.show();
    }

    // other callbacks
    public void keyTyped(char c) { draw.save("delaunay" + c + ".png"); }
    public void mouseDragged(double x, double y) { }
    public void mouseReleased(double x, double y) { }


    // test client
    public static void main(String[] args) {
        Delaunay delaunay = new Delaunay();
    }
   
}
