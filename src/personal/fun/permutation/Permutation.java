package personal.fun.permutation;

public class Permutation {


    public void callPermutation(String number) {
        try {
            Integer.parseInt(number);
            permutationCreator(number);
        } catch (NumberFormatException e) {
            System.out.println("An error occurred");
        }
    }

    public void permutationCreator(String number) {
        String checkingNumber;
        boolean sameNumbers;
        boolean addNumber;

        // The integer should be parsed to a number for the loop!
        for(int i = 1; i <= Integer.parseInt(number) * 10; i++) {
            // Everytime the loop starts over sameNumbers should be changed to false!
            sameNumbers = false;
            // To check the chars of the checkingNumber with the number it should be casted to a String.
            checkingNumber = Integer.toString(i);

            if(checkingNumber.length() == number.length()) {
                for(int j = 0; j < checkingNumber.length(); j++) {
                    // EveryTime the loop starts the addNumber should be changed to false!
                    addNumber = false;

                    // An integer can only occur one time in a number!
                    for(int k = 0; k < checkingNumber.length(); k++) {
                        if (j != k && checkingNumber.charAt(j) == checkingNumber.charAt(k)) {
                            sameNumbers = true;
                        }

                        /* Every integer in number is checked wether it occurs in the checkingNumber
                        * if not then the addNumber stays false!*/
                        if(number.charAt(j) == checkingNumber.charAt(k)) {
                            addNumber = true;
                        }
                    }

                    // If the addNumber = false the loop breaks!
                    if(!addNumber) {
                        break;
                    }
                    // If an integer is multiple times in a number the loop breaks;
                    // If it's not then the checkingNumber can be printed as a permutation of number!
                   if(sameNumbers) {
                       break;
                   } else if (j == checkingNumber.length() - 1) {
                       System.out.println(checkingNumber);
                   }
                }
            }
        }
    }
}
