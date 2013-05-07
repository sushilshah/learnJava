/*************************************************************************
 *  Compilation:  javac Threshold.java 
 *  Execution:    java Threshold frame00001.jpg
 *  Dependencies: Picture.java Luminance.java
 *
 *  Reads in a JPEG/GIF/PNG file, displays it on the screen,
 *  converts all pixels to grayscale, and displays those
 *  pixels with a grayscale value >= 180.
 *
 *************************************************************************/

import java.awt.Color;

public class Threshold {
	
    public static void main(String[] args) {
        int THRESHOLD = 180;
        String filename = args[0];
        Picture pic = new Picture(filename);
        pic.show();
        for (int i = 0; i < pic.width(); i++) {
            for (int j = 0; j < pic.height(); j++) {
                Color color = pic.get(i, j);
                double lum = Luminance.lum(color);
                if (lum >= THRESHOLD) pic.set(i, j, Color.WHITE);
                else                  pic.set(i, j, Color.BLACK);
            }
        }
        pic.show();
    }
}
