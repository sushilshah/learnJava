
public class DoubleOps { 

   public static void main(String[] args) {
      double a = Double.parseDouble(args[0]);
      double b = Double.parseDouble(args[1]);
      double sum  = a + b;
      double prod = a * b;
      double quot = a / b;
      double rem  = a % b;

      System.out.println(a + " + " + b + " = " + sum);
      System.out.println(a + " * " + b + " = " + prod);
      System.out.println(a + " / " + b + " = " + quot);
      System.out.println(a + " % " + b + " = " + rem);

      System.out.println();
      System.out.println("sin(pi/2) = " + Math.sin(Math.PI/2));
      System.out.println("log(e)    = " + Math.log(Math.E));

   }
}
