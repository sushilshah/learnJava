/*************************************************************************
 *  Compilation:  javac Slider.java
 *  Execution:    java Slider
 *  Dependencies: Draw.java
 *
 *  Draw a curve formed by rolling a smaller circle of radius r inside
 *  a larger circle or radius R. If the pen offset of the pen point in
 *  the moving circle is a, then the equation of the resulting curve
 *  at time t is
 *
 *     x = (R+r)*cos(t) - (r+a)*cos(((R+r)/r)*t)
 *     y = (R+r)*sin(t) - (r+a)*sin(((R+r)/r)*t)
 *
 *  Slider controls R.
 *
 *  Reference: http://www.wordsmith.org/~anu/java/spirograph.html
 *
 *  Notes: requires Java 1.5 to avoid contentPane() junk.
 *
 *************************************************************************/

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.BorderLayout;
import java.awt.Color;



public class Slider implements ChangeListener {
    private Draw draw = new Draw();
    private JFrame frame = new JFrame();
    private JSlider slider = new JSlider(JSlider.HORIZONTAL, 1, 100, 37);

    // create the frame with an empty image
    public Slider() {
        // a panel for the 3 sliders
        draw.setXscale(-4, +4);
        draw.setYscale(-4, +4);
        slider.addChangeListener(this);

        // add components to the frame
        JLabel canvas = draw.getJLabel();
        frame.add(canvas, BorderLayout.CENTER);
        frame.add(slider, BorderLayout.NORTH);

        frame.setTitle("Slider");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        stateChanged(null);   // draw default spirograph
        frame.setVisible(true);
    }

    public void stateChanged(ChangeEvent e) {
        double R = Math.toRadians(slider.getValue());
        double r = Math.toRadians(3);
        double a = Math.toRadians(71);
        
        draw.clear(Color.BLACK);
        draw.setPenColor(Color.YELLOW);
        draw.show(0);

        for (double t = 0.0; t < 80; t += 0.02) {
            double x = (R+r) * Math.cos(t) - (r+a) * Math.cos(((R+r)/r)*t);
            double y = (R+r) * Math.sin(t) - (r+a) * Math.sin(((R+r)/r)*t);
            draw.point(x, y);
        }
        draw.show(0);
        frame.repaint();   // repaints sliders and canvas
    }


    // create one frame object
    public static void main(String[] args) {
        new Slider();
    }
}

