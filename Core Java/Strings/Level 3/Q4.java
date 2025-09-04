import java.util.Scanner;

public class Q4 {

    public static String[][] findFrequencies(String text) {
        int[] freq = new int[256];
        int length = text.length();

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (freq[ch] > 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                freq[ch] = 0;
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] frequencies = findFrequencies(input);
        System.out.println("Character | Frequency");
        System.out.println("--------------------");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println("    " + frequencies[i][0] + "     |     " + frequencies[i][1]);
        }
    }
}
