// WAP to replace every alternate vowel with its consonant.
public class AlternateVowelReplacement {
    
    public static String replaceAlternateVowels(String str) {
        StringBuilder sb = new StringBuilder();
        int vowelCount = 0;
        
        for (char c : str.toCharArray()) {
            if (isVowel(c)) {
                if (vowelCount % 2 == 0) {
                    sb.append(getNextConsonant(c));
                } else {
                    sb.append(c);
                }
                vowelCount++;
            } else {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
    
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'A' || c == 'E' || c == 'O' || c == 'I' || c == 'U';
    }
    
    public static char getNextConsonant(char vowel) {
        switch(Character.toLowerCase(vowel)) {
            case 'A':
                return 'B';
            case 'E':
                return 'F';
            case 'I':
                return 'J';
            case 'O':
                return 'P';
            case 'U':
                return 'V';
            default:
                return vowel;
        }
    }
    
    public static void main(String[] args) {
        String inputString = "ISHIKA";
        String replacedString = replaceAlternateVowels(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("String with alternate vowels replaced: " + replacedString);
    }
}
