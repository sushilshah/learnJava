/*************************************************************************
 *  Compilation:  javac Brighter.java
 *  Execution:    java Brighter filename
 * 
 *  Reads in an image from a file, and create a brighter version.
 *
 *  % java Brighter image.jpg
 *
 *************************************************************************/

import java.awt.Color;

public class Brighter {

    public static void main(String[] args) {
        Picture pic1 = new Picture(args[0]);
        int width  = pic1.width();
        int height = pic1.height();
        pic1.show();

        Picture pic2 = new Picture(width, height);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                Color c1 = pic1.get(x, y);
                Color c2 = c1.brighter();
                pic2.set(x, y, c2);
            }
        }
        pic2.show();
    }
 

   
}
