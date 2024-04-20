// WRITE A PROGRAM TO REVERSE A GIVEN STRING WITHOUT USING INBUIT---FUNCTION


public class Rev_String {
    
    public static String reverse(String str) {

        String reversed = "";
        

        for (int i = str.length() - 1; i >= 0; i--) {
    
            reversed += str.charAt(i);
        }
        
        return reversed;
    }
    
    public static void main(String[] args) {
        String inputString = "Java Developers ";
        
        String reversedString = reverse(inputString);
        
        System.out.println("Original string: " + inputString);
        System.out.println("Reversed String: " + reversedString);
}

}

