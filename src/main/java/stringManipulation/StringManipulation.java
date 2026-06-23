package stringManipulation;
import java.util.*;

public class StringManipulation {


    /*1- Find the number of vowels in a string. Vowels in English are A, E, O,U and I.

    Input: “hello”
    Output: 2

    */
    public static int findNumOfVowels(String word){
        if(word==null) return 0;

        int count = 0;
        String vowels = "aeiou";
        for( var ch: word.toLowerCase().toCharArray()){
            if(vowels.indexOf(ch) != -1) count++;

        }
        return count;
    }


    //reverse string
    public static String reverse(String word){
        if(word==null) return "";

        //1 using stack
        Stack<Character> stack = new Stack<>();
        char[] arrWord =  word.toCharArray();
        StringBuilder reverse = new StringBuilder();

        for(char letter: arrWord){
            stack.push(letter);
        }

        for(char _ : arrWord){
            reverse.append(stack.pop());
        }


        //2 no stack
        StringBuilder reverse2 = new StringBuilder();

        for(int i = arrWord.length -1; i >=0; i-- ){
            reverse2.append(arrWord[i]);
        }

        return reverse.toString();
    }

    /* 3- Reverse the order of words in a sentence.
    Input: “Trees are beautiful”
    Output: “beautiful are Trees”
    */
    public static String reverseOrder(String sentence){

        //1
        String[] words = sentence.split(" ");
        StringBuilder rSentence = new StringBuilder();
        for(int i = words.length - 1; i >=0; i--){
            rSentence.append(words[i]).append(" ");

        }

        //without needed to trim the space at the end
        /*
        String[] words = sentence.split(" ");
        Collections.reverse(Arrays.asList(words2));
        return String.join(" ", words)
        */

        return rSentence.toString().trim();

    }


    /*5- Remove duplicate characters in a string.*/
    public static String removeDuplicates(String word){
        if(word==null) return "";
        Set<Character> seen = new HashSet<>();
        StringBuilder output = new StringBuilder();

        for(char ch: word.toCharArray()){
            if(!seen.contains(ch)){
                seen.add(ch);
                output.append((ch));


            }
        }

        return output.toString();
    }

    
    /*6- Find the most repeated character in a string.*/
    public static char getMaxOccuringChar(String word){

        Map<Character, Integer> frequencies = new HashMap<>();
        for(var character: word.toCharArray()){
            if (!frequencies.containsKey(character)) frequencies.put(character, 0);

            frequencies.compute(character, (k, count) -> count + 1);
        }


        int count = 0;
        char mostRepeatedChar = ' ';

        for (Map.Entry<Character, Integer> entry : frequencies.entrySet()) {
           if(entry.getValue() > count) mostRepeatedChar = entry.getKey();
        }

        return mostRepeatedChar;
    }

    /*7- Capitalize the first letter of each word in a sentence. Also, remove any extra spaces between words.*/
    public static String capitalizeSentence(String sentence){

        String[] words = sentence
                .trim()
                .replaceAll(" +", " ")
                .split(" ");
        for(int i = 0; i< words.length; i++)
            words[i] = words[i].substring(0,1).toUpperCase()
                    +  words[i].substring(1).toLowerCase();

        return String.join(" ", words);
    }

    /*8 Detect if two strings are anagram of each other. A string is an
    anagram of another string if it has the exact same characters in any
    order.*/
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        int ENGLISH_ALPHABET = 26;
        int[] frequencies = new int[ENGLISH_ALPHABET];

        for (int i = 0; i < str1.length(); i++) {
            frequencies[str1.toLowerCase().charAt(i) - 'a']++;
            frequencies[str2.toLowerCase().charAt(i) - 'a' ]--;
        }

        // If they are anagrams, every single position must be exactly 0
        for (int count : frequencies) {
            if (count != 0) return false;
        }

        return true;
    }

    /*9 Check if a string is palindrome. If we read a palindrome string from
    left or right, we get the exact same characters.*/
    public static boolean isPalindrome(String str) {
        /*
          //stack
        Stack<Character> stack = new Stack<>();
        StringBuilder strReversed = new StringBuilder();
        for(char ch: str.toCharArray()){
            stack.push(ch);
        }

        for(char _: str.toCharArray()){
            strReversed.append( stack.pop());
        }
        return strReversed.toString().equals(str);

         */


        //two pointers
        int left = 0;
        int right = str.length() - 1;

        while(right>left){
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }

        return true;
    }













}
