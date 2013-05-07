public class Arr{
	public static void main(String [] args){
		/* int [] a = new int[1000];
		for (int i = 0;i<= 999;i++)
			a[i] = i;
			
		System.out.println(a[999]); */
		/* int [] a = new int[10];
		for (int i = 0; i < 10; i++)
			a[i] = 9 - i;
		for (int i = 0; i < 10; i++)
			a[i] = a[a[i]];
		for (int i = 0; i < 10; i++)
			System.out.println(a[i]); */
		/* int	N = 10;
		int[] a = new int[N];
		a[0] = 0;
		a[1] = 1;
		for (int i = 0; i < N; i++) {
			a[i] = a[i-1] + a[i-2];
		System.out.println(a[i]);
		} */
		int[] a = { 1, 2, 3 };
		int[] b = { 1, 2, 3 };
		System.out.println(a == b);
	}
}