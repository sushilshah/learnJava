public class Dowhile{
	public static void main(String [] args){
		int n = Integer.parseInt(args[0]);
		int a = n;
		int b = n;
		while(a < 2){
			System.out.println(n + "Print while");
			a = a + 1;
		}
		do{
			System.out.println(n + "print doWhile");
			b = b + 1;
		} while(b < 2);
	}
}


