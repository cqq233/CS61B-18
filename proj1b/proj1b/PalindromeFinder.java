/**
 * This class outputs all palindromes in the words file in the current directory.
 */
public class PalindromeFinder {

    public static void main(String[] args) {
        int minLength = 4;
        In in = new In("C:\\Users\\kang\\Desktop\\CS61B-18\\CS61B-18\\library-sp18\\data");
        Palindrome palindrome = new Palindrome();

        while (!in.isEmpty()) {
            String word = in.readString();
            if (word.length() >= minLength && palindrome.isPalindrome(word)) {
                System.out.println(word);
            }
        }
    }
}
