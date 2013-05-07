public class Test{
	public static void main(String [] args){
		int a = 1000;
		for(int i = 0;i <= 100; i++){
			/* System.out.println(i + " " + i % 10 + " " + i % 100); */
			/* System.out.println();
			System.out.println(i % 100); */
			/* if (i % 10 == 1 &&  i % 100 == 11){
				System.out.println(i + "th Hello");
			}	
			if (i % 10 == 2 &&  i % 100 == 12){
				System.out.println(i + "th Hello");
			}	
			if (i % 10 == 3 &&  i % 100 == 1){
				System.out.println(i + "th Hello");
			}	
			
			if(i % 10 == 1 &&  i % 100 != 11){
				System.out.println(i + "st Hello");
			}
			if (i % 10 == 2 &&  i % 100 != 12){
				System.out.println(i + "nd Hello");
			}
			if (i % 10 == 3 &&  i % 100 != 1){
				System.out.println(i + "rd Hello");
			} */
			if (int >= 11 && int <= 13) {
				System.out.print(i + "th Hello");
			}
			else {
				if(i % 10 == 1){ System.out.print(i + "st Hello");	}
				if(i % 10 == 2){ System.out.print(i + "nd Hello");	}
				if(i % 10 == 3){ System.out.print(i + "rd Hello");	}
				if(i % 10 > 3){ System.out.print(i + "st Hello");	}
			}
			}
				
						
		}
	}
}