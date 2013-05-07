/*************************************************************************
 *  Compilation:  javac KamaSutra.java
 *  Execution:    java KamaSutra word
 *
 *  Encode a message using the Kama Sutra cipher.
 *  
 *  % java KamaSutra "MEET AT ELEVEN"
 *  SUUR QR UWUPUO
 * 
 *  % java KamaSutra "SUUR QR UWUPUO"
 *  MEET AT ELEVEN
 *
 *************************************************************************/

public class KamaSutra {

    public static void main(String[] args) {
        String top = "ABCEFGHKLMNPR";
        String bot = "QDZUJIXYWSOVT";
        String s = args[0].toUpperCase();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if      (top.indexOf(c) >= 0) System.out.print(bot.charAt(top.indexOf(c)));
            else if (bot.indexOf(c) >= 0) System.out.print(top.charAt(bot.indexOf(c)));
            else                          System.out.print(c);
        }
        System.out.println();
    }

}
