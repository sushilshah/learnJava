
/*************************************************************************
 *  Compilation:  javac Rot13.java
 *  Execution:    java Rot13 string
 *  
 *  Encodes the string using Rot13. Rot13 works by replacing each upper
 *  and lower case letters with the letter 13 positions ahead or behind
 *  it in the alphabet. The encryption algorithm is symmetric - applying
 *  the same algorithm a second time recovers the original message.
 *
 *  %java Rot13 Encryption
 *  Rapelcgvba
 *
 *  % java Rot13 Rapelcgvba
 *  Encryption
 *
 *  % java Rot13 abcABCzyxZYX
 *  nopNOPmlkMLK
 *
 *************************************************************************/

public class Rot13 { 

    public static void main(String[] args) {
        String s = args[0];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if       (c >= 'a' && c <= 'm') c += 13;
            else if  (c >= 'A' && c <= 'M') c += 13;
            else if  (c >= 'n' && c <= 'z') c -= 13;
            else if  (c >= 'N' && c <= 'Z') c -= 13;
            System.out.print(c);
        }
        System.out.println();
    }

}
