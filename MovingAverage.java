
/*************************************************************************
 *  Compilation:  javac MovingAverage.java
 *  Execution:    java MovingAverage N < data.txt
 *  Dependencies: StdIn.java StdOut.java
 *  
 *  This filter takes a moving average of the standard input stream
 *  and puts the result on standard output. There is no limit to
 *  the length of the streams.
 *
 *  % java MovingAverage 4
 *  2.0 4.0 6.0 2.0 2.0 2.0 2.0 3.0 
 *  <ctrl-d> 
 *  3.5 3.5 3.0 2.0 2.25
 *
 *  Note <Ctrl-d> signifies the end of file on OS X and Linux.
 *  On windows use <Ctrl-z>.
 *
 *************************************************************************/



public class MovingAverage{
	public static void main(String [] args){
		int N = Integer.parseInt(args[0]);
		double [] a = new double[N];
		double sum = 0.0;
		for (int i = 0; !StdIn.isEmpty();i++){
			sum -= a[i % N];
			a[i % N] = StdIn.readDouble();
			sum += a [i % N];
			if (i >= N ) StdOut.print(sum / N + " ");
 		}
	}
}