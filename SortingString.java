import java.util.Random;

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
        Random rnd = new Random();
        for (int i = s.length() - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            char[] chars = s.toCharArray();

            char a = chars[index];
            chars[index] = chars[i];
            chars[i] = a;

            s = String.valueOf(chars);
        }

        System.out.println(s);
        return s;
    }
}