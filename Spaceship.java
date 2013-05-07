/*************************************************************************
 *  Compilation:  javac Spaceship.java
 *  Execution:    java Spaceship
 *  Dependencies: Draw.java DrawListener.java starfield.jpg spaceship.gif
 *
 *  Move a spaceship using the keys 'i', 'j', 'k', or 'l'.
 *     i:  accelerate in current direction
 *     j:  rotate counterclockwise
 *     k:  decelerate in current direction
 *     l:  rotate clockwise
 *
 *  Rotate not currently working in Draw
 *
 *************************************************************************/

import java.awt.Color;

public class Spaceship implements DrawListener {
    private Draw draw = new Draw();

    private double rx, ry;        // position
    private double vx, vy;        // velocity
    private double direction;     // orientation of ship

    public Spaceship() {
        draw.addListener(this);
        show();
        draw.setPenColor(Color.WHITE);
        draw.text(.5, .1, "Press 'i', 'j', 'k' or 'l' to move");
        draw.show(1000);
    }

    public void launch() {
        rx = ry = 0.5;
        vx = vy = 0.0;
        direction = 0.0;

        while (true) {
            rx = rx + vx;
            ry = ry + vy;
            show();
            draw.show(50);
        }
    }

    public void show() {
        draw.picture(.5, .5, "starfield.jpg");

        // for cyclic wrap-around at boundaries
        rx = (1 + rx) % 1;
        ry = (1 + ry) % 1;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                double degrees = direction;   // make sure it doesn't change within loop from gui thread
                draw.picture(rx + i, ry + j, "spaceship.gif", degrees);
            }
        }
    }

    public void keyTyped(char c) {
        if      (c == 'j')  direction += 2;              // rotate counterclockwise
        else if (c == 'l')  direction -= 2;              // rotate clockwise
        else if (c == 'i')  {                            // accelerate
            vx += 0.002 * Math.cos(Math.toRadians(direction));
            vy += 0.002 * Math.sin(Math.toRadians(direction));
        }
        else if (c == 'k')  {                            // decelerate
            vx -= 0.002 * Math.cos(Math.toRadians(direction));
            vy -= 0.002 * Math.sin(Math.toRadians(direction));
        }
    }


    public void mousePressed (double x, double y) { }
    public void mouseDragged (double x, double y) { }
    public void mouseReleased(double x, double y) { }

    // test client
    public static void main(String[] args) {
        Spaceship ship = new Spaceship();
        ship.launch();
    }
 

   
}
