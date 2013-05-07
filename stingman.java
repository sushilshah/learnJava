public class stingman{
	public static void main(String [] args){
		String s,t;
		int n;
		s = args[0];
		n = Integer.parseInt(args[1]);
		if (s.length() < n) {
			t = s.substring(0,n); 
			System.out.println("value to t : " + t + " value of s:  " + s + "		value of n " + n); 
		}
		else {
			t = String.format("%" + n +"s", s).replace(' ', '*');
			System.out.println("value to t : " + t + " value of s:  " + s + "  		value of n " + n);
			
		}
	}
}