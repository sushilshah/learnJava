
/*************************************************************************
 *  Compilation:  javac Paint.java
 *  Execution:    java Paint
 *  Dependencies: Draw.java DrawListener.java
 * 
 *  User clicks and drags to draw filled circles of different 
 *  radii and colors. Uses XOR mode to draw and erase
 *  the circle as it is being drawn.
 *
 *  Remarks
 *  -------
 *   - the dragging boolean variable is needed since mouseDragged
 *     can be true without a mouseClicked in the current window region
 *
 *************************************************************************/

import java.awt.Color;

public class Paint implements DrawListener {
    private Point p;                    // center of circle
    private double radius;              // radius of circle to draw
    private boolean dragging = false;   // is the user dragging the mouse?
    private Draw draw;                  // the drawing object

    public Paint() {
        draw = new Draw();
        draw.addListener(this);
        draw.show();
    }

    // user clicks the mouse at (x, y)
    public void mousePressed(double x, double y) {
        p = new Point(x, y);
        draw.setPenColor(Color.getHSBColor((float) Math.random(), 1.0f, 1.0f));
        radius = 0;
        draw.filledCircle(p.x(), p.y(), radius);
        draw.xorOn();
        dragging = true;
    }

    // user is dragging the mouse, currently at (x, y)
    public void mouseDragged(double x, double y) {
        if (!dragging) return;
        draw.filledCircle(p.x(), p.y(), radius);
        Point q = new Point(x, y);
        radius = p.distanceTo(q);
        draw.filledCircle(p.x(), p.y(), radius);
        draw.show();
    }

    // user releases the mouse at location (x, y)
    public void mouseReleased(double x, double y) {
        if (!dragging) return;
        draw.xorOff();
        draw.filledCircle(p.x(), p.y(), radius);
        draw.show();
        dragging = false;
    }

    // save image to file
    public void keyTyped(char c) { draw.save("paint" + c + ".png"); }

    // test client
    public static void main(String[] args) {
        Paint paint = new Paint();
    }
 
   
}
