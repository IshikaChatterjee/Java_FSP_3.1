import java.util.Scanner;

public class CapitalizeSentence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        String convertedSentence = capitalizeSentence(sentence);
        System.out.println("Converted sentence: " + convertedSentence);
    }

    public static String capitalizeSentence(String sentence) {
        StringBuilder sb = new StringBuilder();

        boolean capitalizeNext = true;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch == ' ' || ch == '\n') {
                capitalizeNext = true;
            } else {
                if (capitalizeNext) {
                    ch = Character.toUpperCase(ch);
                } else {
                    ch = Character.toLowerCase(ch);
                }
                if (isVowel(ch)) {
                    ch = Character.toUpperCase(ch);
                }
            
                sb.append(ch);
                capitalizeNext = false;
            }
        }

        return sb.toString();
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
}
