public class lentest{
public static void main(String[] args) {
   String s1 = args[0];
   String s2 = args[1];
   int length1 = s1.length();
   int length2 = s2.length();
   if (length1 > length2) System.out.println(length1);
   else                   System.out.println(length2);
}
}