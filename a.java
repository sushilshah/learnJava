public class a{
	public static void main(String [] args){
		String s;
		int a = Integer.parseInt(args[0]);
	s = String.format("%-" + a +"s", "bar").replace(' ', '-');
	System.out.println(s);

	}
	}