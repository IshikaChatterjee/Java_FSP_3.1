// WAP  to check if two given words are anagrams or not.

import java.util.Arrays;

public class AnagramChecker {
    
    public static boolean areAnagrams(String word1, String word2) {
    
        if (word1.length() != word2.length()) {
            return false;
        }
        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
    
    public static void main(String[] args) {
        String word1 = "SPEAR";
        String word2 = "PEARS";  
        if (areAnagrams(word1, word2)) {
            System.out.println("\"" + word1 + "\" and \"" + word2 + "\" are anagrams.");
        } else {
            System.out.println("\"" + word1 + "\" and \"" + word2 + "\" are not anagrams.");
        }
    }
}
