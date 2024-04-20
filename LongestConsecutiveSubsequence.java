// A program to print the longest consecutive sequence in the given string.

/*import java.util.Arrays;

public class LongestConsecutiveSubsequence {
    
    public static int longestConsecutiveSubsequence(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        

        char[] charArray = str.toCharArray();

        Arrays.sort(charArray);
        
        int longestLength = 1;
        int currentLength = 1;

        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i] == charArray[i - 1] + 1) {
                currentLength++;
            } else if (charArray[i] != charArray[i - 1]) {
                currentLength = 1;
            }
            
            longestLength = Math.max(longestLength, currentLength);
        }
        
        return longestLength;
    }
    
    public static void main(String[] args) {
        String str = "AMPABCDAMNOXYPQRSTBC";
        
        int maxConsecutiveLength = longestConsecutiveSubsequence(str);
        
        System.out.println("The longest consecutive subsequence length is: " + maxConsecutiveLength );
    }
}
*/

import java.util.ArrayList;
import java.util.List;

public class LongestConsecutiveSubsequence{
    public static List<String[]> findLongestConsecutiveSubsequences(String[] array) {
        int n = array.length;
        if (n == 0) {
            return new ArrayList<>();
        }
        List<String[]> longestSubsequences = new ArrayList<>();
        int currentLength = 1;
        int currentStartIndex = 0;
        int maxLength = 0;
        for (int i = 1; i < n; i++) {

            if (array[i - 1].charAt(0) + 1 == array[i].charAt(0)) {
                currentLength++;
            } else {

                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    longestSubsequences.clear(); // Clear previous subsequences
                    longestSubsequences.add(new String[] {array[currentStartIndex], array[i - 1]});
                }
                else if (currentLength == maxLength) {
                    longestSubsequences.add(new String[] {array[currentStartIndex], array[i - 1]});
                }
                currentStartIndex = i;
                currentLength = 1;
            }
        }
        if (currentLength == maxLength) {
            longestSubsequences.add(new String[] {array[currentStartIndex], array[n - 1]});
        } else if (currentLength > maxLength) {
            maxLength = currentLength;
            longestSubsequences.clear();
            longestSubsequences.add(new String[] {array[currentStartIndex], array[n - 1]});
        }
        return longestSubsequences;
    }
    public static void main(String[] args) {
        String[] array = {"A", "M", "P", "A", "B", "C", "D", "A", "M", "N", "O", "X", "Y", "P", "Q", "R", "S", "T", "B", "C"};
        List<String[]> longestSubsequences = findLongestConsecutiveSubsequences(array);
        System.out.println("Longest possible consecutive subsequences:");
        for (String[] subsequence : longestSubsequences) {
            for (char c = subsequence[0].charAt(0); c <= subsequence[1].charAt(0); c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}


