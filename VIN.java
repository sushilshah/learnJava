
/*************************************************************************
 *  Compilation:  javac VIN.java
 *  Execution:    java VIN s
 *  
 *  Determines if a VIN number is valid by computing its check digit.
 *  Do aggressive error checking.
 *
 *  % java VIN 1B4YEM9P4KP186543
 *  Invalid
 * 
 *  % java VIN 1FA-CP45E-X-LF192944
 *  Valid
 *
 *  % java VIN 1FA-CP45E-6-LF192944
 *  Invalid
 * 
 *  % java VIN QFA-CP45E-X-LF192944
 *  Exception in thread "main" java.lang.RuntimeException: Illegal character: Q
 * 
 *  % java VIN 1FA-CP45E-G-LF192944
 *  Exception in thread "main" java.lang.RuntimeException: Illegal check digit: G
 *
 *  % java VIN 1FA-CP45E-X-LF19294
 *  Exception in thread "main" java.lang.RuntimeException: VIN number must be 17 characters
 *
 *************************************************************************/
/* VIN numbers. A VIN number is a 17-character string that uniquely identifies a motor vehicle. It also encodes the manufacturer and attributes of the vehicle. To guard against accidentally entering an incorrect VIN number, the VIN number incorporates a check digit (the 9th character). Each letter and number is assigned a value between 0 and 9. The check digit is chosen so to be the weighted sum of the values mod 11, using the symbol X if the remainder is 10.
 


A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
1 2 3 4 5 6 7 8 - 1 2 3 4 5 - 7 - 9 2 3 4 5 6 7 8 9

1st 2nd 3rd 4th 5th 6th 7th 8th 9th 10  11  12  13  14  15  16  17
 8   7   6   5   4   3   2  10   0   9   8   7   6   5   4   3   2
 

For example the check digit of the partial VIN number 1FA-CP45E-?-LF192944 is X because the weighted sum is 373 and 373 mod 11 is 10.
 



 1   F   A   C   P   4   5   E   X   L   F   1   9   2   9   4   4
 1   6   1   3   7   4   5   5   -   3   6   1   9   2   9   4   4
 8   7   6   5   4   3   2  10   -   9   8   7   6   5   4   3   2
------------------------------------------------------------------
 8  42   6  15  28  12  10  50   -  27  48   7  54  10  36  12   8
 

Write a program VIN.java that takes a command line string and determines whether or not it is a valid VIN number. Allow the input to be entered with upper or lower case, and allow dashes to be inserted. Do thorough error checking, e.g., that the string is the right length, that no illegal characters are used (I, O, Q), etc.
 */
 
public class VIN { 
    public static void main(String[] args) {
        int[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 0, 1,
                         2, 3, 4, 5, 0, 7, 0, 9, 2, 3,
                         4, 5, 6, 7, 8, 9 };
        int[] weights = { 8, 7, 6, 5, 4, 3, 2, 10, 0, 9,
                          8, 7, 6, 5, 4, 3, 2 };

        String s = args[0];
        s = s.replaceAll("-", "");
        s = s.toUpperCase();
        if (s.length() != 17)
            throw new RuntimeException("VIN number must be 17 characters");
 
        int sum = 0;
        for (int i = 0; i < 17; i++) {
            char c = s.charAt(i);
            int value;
            int weight = weights[i];

            // letter
            if (c >= 'A' && c <= 'Z') {
                value = values[c - 'A'];
                if (value == 0)
                    throw new RuntimeException("Illegal character: " + c);
            }

            // number
            else if (c >= '0' && c <= '9') value = c - '0';
                
            // illegal character
            else throw new RuntimeException("Illegal character: " + c);

            sum = sum + weight * value;

        }

        // check digit
        sum = sum % 11;
        char check = s.charAt(8);
        if (check != 'X' && (check < '0' || check > '9'))
            throw new RuntimeException("Illegal check digit: " + check);
        if      (sum == 10 && check == 'X') System.out.println("Valid");
        else if (sum == check - '0')        System.out.println("Valid");
        else                                System.out.println("Invalid");

    }

}
