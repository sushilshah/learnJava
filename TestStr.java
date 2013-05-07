public class TestStr{
	public static void main(String [] args){
		String s = "aaaa";            // s refers to the value "aaaa"
		System.out.println("Value of S : " + s);
		s.replaceAll("a", "b");       // s still refers to the value "aaaa"
		System.out.println("Value of S : " + s);
		String t = s;                 // t refers to the value "aaaa"
		System.out.println("value of S : " + s + "   value of T  : "+ t);
		/* System.out.println(t); */
		s = s.replaceAll("a", "b");   // s now refers to the value "bbbb"
									// t still refers to the value "aaaa"
		
		
		
		System.out.println("value of S	: " + s + "    value of T  : "+ t);							  	
	}
}




tower A 2nd floor bay 4, r. p  mouly.
suresh babu
