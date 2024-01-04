package Collections;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateWords 
{

    public static void main(String[] args) 
    {
        String[] wordsArray = {"apple", "orange", "banana", "apple", "grape", "banana", "kiwi", "orange"};

        Map<String, Integer> wordCountMap = countDuplicateWords(wordsArray);

        System.out.println("Duplicate Word Count:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) 
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> countDuplicateWords(String[] words) 
    {
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words)
        {
            // Convert the word to lowercase to make the comparison case-insensitive
            String lowercaseWord = word.toLowerCase();

            // Update the count in the map
            wordCountMap.put(lowercaseWord, wordCountMap.getOrDefault(lowercaseWord, 0) + 1);
        }
        return wordCountMap;
    }
}
