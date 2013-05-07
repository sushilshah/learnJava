public class converUpper{
	public static void main(String [] args){
		String [] a = {"aaaaaaaaa"};
		String s = "" ;
		for (int i = 0; i < a.length; i++) {
			 s = a[i];
			/* s = s.toUpperCase(); */
			System.out.println("First FOR : " + s + " " + a[i]);
		}

		 for (int i = 0; i < a.length; i++) {
			a[i].toUpperCase();
			System.out.println("2nd FOR : " + s + " " + a[i] + " " + a[i].toUpperCase() );
		}

		for (int i = 0; i < a.length; i++) {
			a[i] = a[i].toUpperCase();
			System.out.println("3rd FOR : " + s + " " + a[i]); 
		} 
	}

}

