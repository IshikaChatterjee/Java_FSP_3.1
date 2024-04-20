public class ReverseStringUsingSwap {
    
    public static String reverse(String str) {
    
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        
        while (left < right) {
        char temp = charArray[left];
        charArray[left] = charArray[right];
        charArray[right] = temp;
            

            left++;
            right--;
        }
    
        return new String(charArray);
    }
    
    public static void main(String[] args) {
        String inputString = "Company Recruiting Java Developers";
        String reversedString = reverse(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Reversed string: " + reversedString);
    }
}

