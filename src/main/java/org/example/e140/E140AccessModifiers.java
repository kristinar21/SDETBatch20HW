package org.example.e140;

public class E140AccessModifiers {

    String maxLength(String[] words) {
        if (words == null || words.length == 0) {
            return null;
        }
        String maxLengthWord = words[0];
        for (String word : words) {
            if (word.length() > maxLengthWord.length()) {
                maxLengthWord = word;
            }
        }
        return maxLengthWord;
    }
    public static void main(String[] args) {
        E140AccessModifiers processor = new E140AccessModifiers();
        String[] words = {"apple", "banana", "cherry", "blueberry", "grape"};
        System.out.println("Longest word: " + processor.maxLength(words));
    }

}
