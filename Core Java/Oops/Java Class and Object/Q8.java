// Q8: PalindromeChecker
public class Q8 {
    String text;

    Q8(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String cleantext = text.replaceAll("\\s", "").toLowerCase();
        String reverseText = new StringBuilder(cleantext).reverse().toString();
        return cleantext.equals(reverseText);
    }

    public void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is palindrome");
        } else {
            System.out.println(text + " is not Palindrome");
        }
    }

    public static void main(String[] args) {
        Q8 checker1 = new Q8("A man a plan a canal Panama");
        checker1.displayResult();
        Q8 checker2 = new Q8("Hello");
        checker2.displayResult();
    }
}
