import java.util.Random;
import java.util.Collections;

/*
 * 3/5/13
 * This program will sort the word "typewriter" in alphabetical order.
 *
 */
public class SortingString {
    public static void main(String[] args)
    {

        String s = "typewriter";

        for (int i = 0; i < Integer.MAX_VALUE; i++)
        {
            s = randomSort(s);

            if (s.equals("eeiprrttwy"))
            {
                System.out.println(s);
                break;
            }

            if (i == Integer.MAX_VALUE - 1)
            {
                i = 0;
            }
        }

    }

    public static String randomSort(String s)
    {
        char[] chars = s.toCharArray();
        Collections.shuffle(chars);

        s = String.valueOf(chars);
        
        System.out.println(s);
        return s;
    }
}
