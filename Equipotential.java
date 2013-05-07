/*************************************************************************
 *  Compilation:  javac Equipotential.java
 *  Execution:    java Equipotential N
 *  Dependencies: DeluxeCharge.java Picture.java
 *
 *  Potential value visualization for a set of charges.
 *
 *  % java Equipotential 5
 *
 *************************************************************************/

public class Equipotential  {

    public static void main(String[] args) {
        int SIZE = 800;
        double RADIUS = 500E-12;            // real size (m)
        double eps = RADIUS / SIZE;         // real size of 1 pixel
        double e = 1.60217733E-19;          // elementary charge (C)
        int N = Integer.parseInt(args[0]);  // number of charges
        DeluxeCharge[] charges;             // the N random charges

        // N random charges
        charges = new DeluxeCharge[N];
        for (int i = 0; i < N; i++) {
            double x = Math.random() * RADIUS;
            double y = Math.random() * RADIUS;
            double k = e;
            if (Math.random() < 0.5) k = -e;
            charges[i] = new DeluxeCharge(x, y, k);
        }			
		
        Picture pic = new Picture(SIZE, SIZE);

        // draw equipotential lines; compute potential and field strength at (x, y)
        for (int ix = 0; ix < SIZE; ix++) {
            for (int iy = 0; iy < SIZE; iy++) {
                double x = ix * RADIUS / SIZE;
                double y = iy * RADIUS / SIZE;

                // electric potential V at (x, y)
                double V = 0.0;
                for (int i = 0; i < N; i++) {
                    V += charges[i].potential(x, y);
                }

                // vector field (Ex, Ey) at (x, y) and total strength E
                double Ex = 0.0, Ey = 0.0;
                for (int i = 0; i < N; i++) {
                    Ex += charges[i].fieldX(x, y);
                    Ey += charges[i].fieldY(x, y);
                }
                double E = Math.sqrt(Ex*Ex + Ey*Ey);
				
                // draw if potential is < 1/2 pixel from a multiple of 5V (since E = grad V)
                // if ((Math.abs(V) % 5) < 1.0 * E * eps) {
                if ((V - Math.floor(V/5) * 5) <  1.0 * E * eps) {
                    pic.set(ix, SIZE-1-iy, StdDraw.WHITE);
                }
            }
        }

        pic.show();

    }
}
