package StringBuilder;

public class ReverseWordsInString {

    public static void main(String[] args) {
        String str = "ABC XYZ";
        String reversedString = reverseWords(str);
        System.out.println("Output: " + reversedString);
    }

    public static String reverseWords(String input) 
    {
        String[] words = input.split("\\s+"); // Split the string into character

        StringBuilder reversedResult = new StringBuilder();

        for (String word : words) 
        {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
           
            reversedResult.append(reversedWord).append(" ");
        }

        return reversedResult.toString().trim(); // Remove trailing space
    }
}
