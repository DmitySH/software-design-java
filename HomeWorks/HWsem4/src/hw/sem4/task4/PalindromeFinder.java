package hw.sem4.task4;

public class PalindromeFinder {
    private final String word;

    public PalindromeFinder(String word) {
        this.word = word;
    }

    public boolean isPalindrome(){
        StringBuilder reversedWord = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; --i) {
            reversedWord.append(word.charAt(i));
        }

        return word.equals(reversedWord.toString());
    }

    @Override
    public String toString() {
        return isPalindrome()? "It is palindrome" : "It is NOT palindrome";
    }
}
