import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        String str;
        int i, len;
        int[] counter = new int[256];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a word: ");

        str = scanner.nextLine();
        len = str.length();

        for (i = 0; i < len; i++)
        {
            counter[str.charAt(i)]++;
        }

        for (i = 0; i < 256; i++)
        {
            if (counter[i] != 0)
            {
                System.out.println((char) i + ": " + counter[i]);
            }
        }
    }
}