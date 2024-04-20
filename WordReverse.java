    
    public class WordReverse {
        public static void main(String[] args) {
            String sentence = "The bull and the hen get married";
            int wordCount = countWords(sentence);
            System.out.println("Total number of words: " + wordCount);
    
            String reversedSentence = reverseLetters(sentence);
            System.out.println("Sentence after reversing each and every letter: " + reversedSentence);
        }
    
        public static int countWords(String sentence)
        {
            String words[] = sentence.split("\\s+");
            return words.length;
        }
    

    
        public static String reverseLetters(String sentence) {
            StringBuilder reversed = new StringBuilder();
            for (int i = sentence.length() - 1; i >= 0; i--) {
                reversed.append(sentence.charAt(i));
            }
            return reversed.toString();
        }
    }
    