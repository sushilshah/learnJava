public class monthday{
	public static void main(String [] args){
		String [] months = {
							 "Jan", "Feb", "Mar", "Apr", "May", "Jun", 
                             "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
							};
		int [] days = {
						31, 28, 31, 30, 31, 30,
						31, 31, 30, 31, 30, 31
					   };
		String name = args[0];
		for(int i = 0;i < 12 ; i++){
			if(name.equalsIgnoreCase(months[i]))
				System.out.println(name + " has " + days[i] + "days ");
		}
	}
}