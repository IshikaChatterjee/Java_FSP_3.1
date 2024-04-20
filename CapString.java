import java.util.Scanner;

public class CapString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        String result = capitalizeLetters(sentence);
        System.out.println("Result: " + result);
    }

    public static String capitalizeLetters(String sentence) {
        StringBuilder sb = new StringBuilder();
        char[] chars = sentence.toCharArray();
        boolean capitalizeNext = true;

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];

            
            if (Character.isAlphabetic(c) && capitalizeNext) {
                c = (char) (c - 32); 
                capitalizeNext = false;
            }

            
            if (i < chars.length - 1 && !Character.isLetter(chars[i + 1]) && Character.isAlphabetic(c)) {
                c = (char) (c - 32); 
            }

        
            if ("aeiouAEIOU".indexOf(c) != -1) {
                c = Character.toUpperCase(c);
            }


            
            if (!Character.isLetter(c)) {
                capitalizeNext = true;
            }

            sb.append(c);
        }

        return sb.toString();
    }
}

