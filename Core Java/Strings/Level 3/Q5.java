import java.util.Scanner;

public class Q5 {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static char[] uniqueCharacters(String text) {
        int length = findLength(text);
        char[] unique = new char[length];
        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < uniqueCount; j++) {
                if (unique[j] == current) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unique[uniqueCount] = current;
                uniqueCount++;
            }
        }
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = unique[i];
        }
        return result;
    }

    public static String[][] findFrequencies(String text) {
        int[] freq = new int[256];
        int length = findLength(text);
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }
        char[] uniques = uniqueCharacters(text);
        String[][] result = new String[uniques.length][2];
        for (int i = 0; i < uniques.length; i++) {
            char ch = uniques[i];
            result[i][0] = String.valueOf(ch);
            result[i][1] = String.valueOf(freq[ch]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String[][] frequencies = findFrequencies(input);
        System.out.println("\nCharacter | Frequency");
        System.out.println("---------------------");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println("    " + frequencies[i][0] + "     |     " + frequencies[i][1]);
        }
        scanner.close();
    }
}
