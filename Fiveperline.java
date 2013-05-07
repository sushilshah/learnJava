/* public class Fiveperline{
	public static void main(String[] args){
	
			for(int i = 1000; i <= 2000; i ++){
				if (i % 5 == 0){System.out.println("\n");}
				System.out.println(i + " ");
			}
	}
} */

public class Fiveperline { 

   public static void main(String[] args) {

       // print integers from 1000 to 2000, 5 per line
       int start = 1000, end = 2000;
       for (int i = start; i <= end; i++) {
          System.out.print(i + " ");
          if (i % 5 == 4) System.out.println();
       }
/*       System.out.println(); */

   }
}
