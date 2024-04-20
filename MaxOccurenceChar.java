//WAP to print the highest occurence character in a given string 

public class MaxOccurenceChar   {
    
    public static char findHighestOccurrence(String str) {
        int maxCount = 0;
        char highestOccurrenceChar = '\0';
        
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int count = 0;
            
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == currentChar) {
                    count++;
                }
            }
            
            if (count > maxCount) {
                maxCount = count;
                highestOccurrenceChar = currentChar;
            }
        }
        
        return highestOccurrenceChar;
    }
    
    public static void main(String[] args) {
        String str = "MAMAMAMAMAM ";
        char highestOccurrence = findHighestOccurrence(str);
        
        if (highestOccurrence != '\0') {
            System.out.println("The character with the highest occurrence in \"" + str + "\" is: " + highestOccurrence);
        } else {
            System.out.println("No characters found in the input string.");
        }
    }
}
