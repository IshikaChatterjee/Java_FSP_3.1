import java.util.Scanner;

public class DescendingStringSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        String sortedString = sortDescending(input);
        System.out.println("String sorted in descending order: " + sortedString);
    }

    public static String sortDescending(String str) {
        char[] chars = str.toCharArray();

    
        for (int i = 0; i < chars.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[j] > chars[maxIndex]) {
                    maxIndex = j;
                }
            }
        
            char temp = chars[i];
            chars[i] = chars[maxIndex];
            chars[maxIndex] = temp;
        }

        return new String(chars);
    }
}