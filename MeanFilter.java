/*************************************************************************
 *  Compilation:  javac MeanFilter.java
 *  Execution:    java MeanFilter filename
 * 
 *  Reads in an image from a file, and flips it horizontally.
 *
 *  [ 1 1 1 ]
 *  [ 1 1 1 ] / 9
 *  [ 1 1 1 ] 
 * 
 *  % java MeanFilter image.jpg
 *
 *
 *************************************************************************/

import java.awt.Color;

public class MeanFilter {

    public static void main(String[] args) {
        Picture pic = new Picture(args[0]);
        int width  = pic.width();
        int height = pic.height();
        Picture pic2 = new Picture(width, height);


        pic.show();
        pic2.show();
        for (int y = 1; y < height - 1; y++) {
            for (int x = 1; x < width - 1; x++) {
                Color c00 = pic.get(x-1, y-1);
                Color c01 = pic.get(x-1, y  );
                Color c02 = pic.get(x-1, y+1);
                Color c10 = pic.get(x  , y-1);
                Color c11 = pic.get(x  , y  );
                Color c12 = pic.get(x  , y+1);
                Color c20 = pic.get(x+1, y-1);
                Color c21 = pic.get(x+1, y  );
                Color c22 = pic.get(x+1, y+1);
                int r = c00.getRed() + c01.getRed() + c02.getRed() +
                        c10.getRed() + c11.getRed() + c12.getRed() +
                        c20.getRed() + c21.getRed() + c22.getRed();
                int g = c00.getGreen() + c01.getGreen() + c02.getGreen() +
                        c10.getGreen() + c11.getGreen() + c12.getGreen() +
                        c20.getGreen() + c21.getGreen() + c22.getGreen();
                int b = c00.getBlue() + c01.getBlue() + c02.getBlue() +
                        c10.getBlue() + c11.getBlue() + c12.getBlue() +
                        c20.getBlue() + c21.getBlue() + c22.getBlue();
                Color c = new Color(r/9, g/9, b/9);
                pic2.set(x, y, c);
            }
            if (y % 20 == 0) pic2.show();
        }
        pic.show();
        pic2.show();
    }
 

   
}
