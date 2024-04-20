public class SwapFirstLastWord {
    public static void main(String[] args) {
        String sentence = "The bull and the hen get married";
        int wordCount = countWords(sentence);
        System.out.println("Total number of words: " + wordCount);
        String swappedSentence = swapFirstAndLastWord(sentence);
        System.out.println("Sentence after swapping first and last word: " + swappedSentence);
    }

    public static int countWords(String sentence) {

        String[] words = sentence.split("\\s+");
        return words.length;
    }

    public static String swapFirstAndLastWord(String sentence) {
        String[] words = sentence.split("\\s+");

        if (words.length >= 2) {
            String firstWord = words[0];
            String lastWord = words[words.length - 1];
            words[0] = lastWord;
            words[words.length - 1] = firstWord;
        }
        
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word).append(" ");
        }
        
        return sb.toString().trim();
    }
}