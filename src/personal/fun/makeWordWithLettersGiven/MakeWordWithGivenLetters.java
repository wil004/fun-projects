package personal.fun.makeWordWithLettersGiven;

import java.util.ArrayList;
import java.util.List;

public class MakeWordWithGivenLetters {



    public boolean checkIfWordCanBeMade(String lettersGiven, String word) {
        // A char the same length as the word.
        char[] madeWord = new char[word.length()];
        // A list with indexNumbers that are used already
        List<Integer> usedIndexNumbers = new ArrayList<>();
        boolean letterIsAlreadyUsed;

        for(int i = 0; i < lettersGiven.length(); i++) {
            for( int j = 0; j < word.length(); j++) {
                // check if a letter given is also in the word!
                if(lettersGiven.charAt(i) == word.charAt(j)) {
                    // After a char in lettersGiven and word is the same
                    // letterIsAlreadyUsed is set to false.
                    letterIsAlreadyUsed = false;

                    /* Then it needs to be checked whether the indexNumber of a letter from word
                    is already used before!
                    I do this because I don't want the word 'aaa' and the lettersGiven
                    'aa' returning the value true.
                     */
                    for(int number: usedIndexNumbers) {
                        if(number == j) {
                            letterIsAlreadyUsed = true;
                        }
                    }

                    // If the letter is not used before then the letter of the word is added
                    // to exactly the same index place in the madeWord array of chars!
                    // Also the indexNumber of the number will be added to usedIndexNumber so
                    // that place in the word won't be used anymore.
                    // It's like a game of hangman but then different.
                    if (!letterIsAlreadyUsed) {
                        madeWord[j] = word.charAt(j);
                        usedIndexNumbers.add(j);
                        break;
                    }
                }
            }
        }
        // Now you got a char full of letters that we turn into a String.
        StringBuilder sb = new StringBuilder();
        for (Character letter : madeWord) {
            sb.append(letter);
        }
        String madeWordString = sb.toString();

        // Check if the madeWordString equals the word if so then the word can be made by the lettersGiven
        if (madeWordString.equalsIgnoreCase(word)) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }

}
