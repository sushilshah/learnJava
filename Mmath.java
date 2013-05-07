public class Mmath{
	public static void main(String [] args){
		double res;
		double sina = Double.parseDouble(args[0]);
		double cosa = sina;
		sina = Math.sin(sina);
		cosa = Math.cos(cosa);
		res = sina * sina + cosa * cosa;
		System.out.println(res);
		System.out.println("bc" + 2 + 3);
		System.out.println(2 + 3 + "bc");
		System.out.println((char) ('a' + 4)); 
	}}