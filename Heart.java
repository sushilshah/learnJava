

/*************************************************************************
 *  Compilation:  javac Heart.java
 *  Execution:    java Heart N
 *  
 *  Prints out a heart.
 *
 *  % java Heart 15
 *  . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 
 *  . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 
 *  . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 
 *  . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 
 *  . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 
 *  . . . . . . . . . . . . * * * * * * * . . . . . . . * * * * * * * . . . . . . . . . . . . 
 *  . . . . . . . . . . * * * * * * * * * * * . . . * * * * * * * * * * * . . . . . . . . . . 
 *  . . . . . . . . . * * * * * * * * * * * * * . * * * * * * * * * * * * * . . . . . . . . . 
 *  . . . . . . . . * * * * * * * * * * * * * * * * * * * * * * * * * * * * * . . . . . . . . 
 *  . . . . . . . * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * . . . . . . . 
 *  . . . . . . * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * . . . . . . 
 *  . . . . . . * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * . . . . . . 
 *  . . . . . * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * . . . . . 
 *  . . . . . * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * . . . . . 
 *  . . . . . * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * . . . . . 
 *  . . . . . * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * . . . . . 
 *  . . . . . * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * . . . . . 
 *  . . . . . * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * . . . . . 
 *  . . . . . * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * . . . . . 
 *  . . . . . . * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * . . . . . . 
 *  . . . . . . * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * . . . . . . 
 *  . . . . . . . * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * . . . . . . . 
 *  . . . . . . . . * * * * * * * * * * * * * * * * * * * * * * * * * * * * * . . . . . . . . 
 *  . . . . . . . . . * * * * * * * * * * * * * * * * * * * * * * * * * * * . . . . . . . . . 
 *  . . . . . . . . . . * * * * * * * * * * * * * * * * * * * * * * * * * . . . . . . . . . . 
 *  . . . . . . . . . . . * * * * * * * * * * * * * * * * * * * * * * * . . . . . . . . . . . 
 *  . . . . . . . . . . . . * * * * * * * * * * * * * * * * * * * * * . . . . . . . . . . . . 
 *  . . . . . . . . . . . . . * * * * * * * * * * * * * * * * * * * . . . . . . . . . . . . . 
 *  . . . . . . . . . . . . . . * * * * * * * * * * * * * * * * * . . . . . . . . . . . . . . 
 *  . . . . . . . . . . . . . . . * * * * * * * * * * * * * * * . . . . . . . . . . . . . . . 
 *  . . . . . . . . . . . . . . . . * * * * * * * * * * * * * . . . . . . . . . . . . . . . . 
 *  . . . . . . . . . . . . . . . . . * * * * * * * * * * * . . . . . . . . . . . . . . . . . 
 *  . . . . . . . . . . . . . . . . . . * * * * * * * * * . . . . . . . . . . . . . . . . . . 
 *  . . . . . . . . . . . . . . . . . . . * * * * * * * . . . . . . . . . . . . . . . . . . . 
 *  . . . . . . . . . . . . . . . . . . . . * * * * * . . . . . . . . . . . . . . . . . . . . 
 *  . . . . . . . . . . . . . . . . . . . . . * * * . . . . . . . . . . . . . . . . . . . . . 
 *  . . . . . . . . . . . . . . . . . . . . . . * . . . . . . . . . . . . . . . . . . . . . . 
 *  . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 
 *
 *************************************************************************/


public class Heart {

    public static void main(String[] args) { 
        int N = Integer.parseInt(args[0]);
        for (int i = -3*N/2; i <= N; i++) {
            for (int j = -3*N/2; j <= 3*N/2; j++) {

                // inside either diamond or two circles
                if ( (Math.abs(i) + Math.abs(j) < N)
                    || ((-N/2-i) * (-N/2-i) + ( N/2-j) * ( N/2-j) <= N*N/2)
                    || ((-N/2-i) * (-N/2-i) + (-N/2-j) * (-N/2-j) <= N*N/2)
                   )
                        System.out.print("* ");
                else    System.out.print(". ");
            }
            System.out.println();
        }
    }
}
