public class Mmax{
	public static int max3(int a, int b, int c){
		int max = a;
		if (b > max) max = b;
		if(c > max) max = c;
		return max;
	}
	public static double max3(double  a, double  b, double  c){
		double  max = a;
		if (b > max) max = b;
		if(c > max) max = c;
		return max;
	}
	
	public static void main(String [] args){
		double m = Double.parseDouble(args[0]) , m1 = Double.parseDouble(args[1]), m2 = Double.parseDouble(args[2]) ;
		double res = max3(m,m1,m2);
		StdOut.print(res);
		
	}
}


