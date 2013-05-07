
public class Triangle {

    public static void main(String[] args) { 
        int N = Integer.parseInt(args[0]);

        // loop N times, one for each row
        for (int i = 0; i < N; i++) {

            // print j periods
            for (int j = 0; j < i; j++)
                System.out.print(". ");

            // print N-i asterisks
            for (int j = 0; j < N-i; j++)
                System.out.print("* ");

            // print a new line
            System.out.println();
        }
    }
}
