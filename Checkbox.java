/* 

public class Checkbox {

    public static void main(String[] args) { 
        int N = Integer.parseInt(args[0]);

        // loop N times, one for each row
        for (int i = 0; i < N; i++) {

            // print j periods
            for (int j = 0; j < i; j++)
                System.out.print("* ");

            // print N-i asterisks
/*             for (int j = 0; j < N-i; j++)
                System.out.print("* ");
*/
            // print a new line
            /* System.out.println();
        }
    }
}
*/


 public class Checkbox{
	public static void main(String [] args){
		int n = Integer.parseInt(args[0]);
		for (int i = 0; i <= n ; i ++){
			for (int j = 0; j <= i; j++){
				System.out.print("* ");
				 
			}
			 System.out.println();  

		}
	}
}








//public class Checkbox
//{
	//public static void main(String[] args)
	//{
		//declare keyboard as scanner type
		/* Scanner keyboard = new Scanner(System.in); */
		//get input from the user
			/* 	System.out.print("Please enter a value of height (1-50): "); */
		//declare height as int
		//int height =  Integer.parseInt(args[0]); /* keyboard.nextInt(); */
		//Run a group of nested for loops to make a square
			//for(int i = 0; i < height; i++)
			//{
				//for(int j = 0; j <= height; j++);
					//{
						//System.out.print('*');
					//}
				//System.out.println();
			//}
		//Run a group of nested for loops to make a right triangle starting from the top left
			/* for(int i = 0; i <= height; i++)
				{
					for(int j = 0; j < i; j++)
					{
						System.out.print('*');
					}
					System.out.println();
				} */
		//Run a nested for loop to make a second right triangle
			
					
				
	//}

//} 