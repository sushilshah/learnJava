public class Diff{
	public static void main(String [] args){
		int a = Integer.parseInt(args [0]);
		int b = Integer.parseInt(args [1]);
		int min = Math.min(a,b);
		int max = Math.max(a,b);
		
		int diff = max - min;
		double result = min + diff * Math.random();
		System.out.println(result);
	}
}