/*************************************************************************
 *  Compilation:  javac Glass.java
 *  Execution:    java Glass filename
 * 
 *  Reads in an image from a file, and apply an image filter that
 *  makes it look like it's being seen through glass. This effect is
 *  accomplished by plotting pixel (x, y) in the color of a random
 *  neighboring pixel (xx, yy).
 *
 *  % java Glass baboon.jpg
 *
 *************************************************************************/

import java.awt.Color;

public class Glass {

    // return random integer between a and b
    public static int random(int a, int b) {
        return a + (int) (Math.random() * (b-a+1));
    }

    public static void main(String[] args) {
        Picture pic1 = new Picture(args[0]);
        pic1.show();
        int width  = pic1.width();
        int height = pic1.height();
        Picture pic2 = new Picture(width, height);

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                int xx = (width  + x + random(-5, 5)) % width;
                int yy = (height + y + random(-5, 5)) % height;
                Color c = pic1.get(xx, yy);
                pic2.set(x, y, c);
            }
        }

        pic2.show();
    }
   
}
