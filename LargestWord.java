// find largest word with continuos letter eg-> abcklmnpqryz         output ->klmn

public class LargestWord {
    public static void main(String[] args) {
        String word = "abcklmnpqryz";
        String largestWord = "";
        String currentWord = "" + word.charAt(0);

        for (int i = 1; i < word.length(); i++) {
            char presentChar = word.charAt(i);
            char prevChar = word.charAt(i - 1);

            if ((int) presentChar == (int) prevChar + 1) {
                currentWord += presentChar;
            } else {
                if (currentWord.length() > largestWord.length()) {
                    largestWord = currentWord;
                }
                currentWord = "" + presentChar;
            }
        }
        if (currentWord.length() > largestWord.length()) {
            largestWord = currentWord;
        }
        System.out.print(largestWord);

    }
}
