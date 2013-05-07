
class loop1{
	public static void main(String [] args){
		int i, j;
		for (i = 0, j = 1; i < 10; i++) j += i; 
		System.out.println(j);
		for (j = 0; j < 10; j++) j += j;
		System.out.println(j);
		for (i = 0, j = 0; i < 10; i++) j += j++; 
		System.out.println(j);
	}
}