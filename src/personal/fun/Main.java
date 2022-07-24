package personal.fun;

import personal.fun.binaryTree.Node;
import personal.fun.binaryTree.Tree;
import personal.fun.makeWordWithLettersGiven.MakeWordWithGivenLetters;
import personal.fun.permutation.Permutation;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        Integer[] integersForTree = { 20, 41 ,23,71, 72,18, 30, 40, 50,25, 42, 100,19,70,22,17, 60,92,64,62,67, 80,54,52,57,58,90,21, 45, 55,91, 35,24, 65, 75};
        /* Use debugger on the line below and then open the root attribute!
         * The lower and higher numbers are divided symmetrically!
         */
        tree.createTree(integersForTree, new Node(51));

        Permutation permutation = new Permutation();
        // Gives all the possible permutations of a number!
        permutation.callPermutation("2341");

        MakeWordWithGivenLetters makeWordWithGivenLetters = new MakeWordWithGivenLetters();
        // Method below checks whether a word can be made by the given letters
        // It doesn't matter how many letters you give it will only check if the word can be made.
        // If you want the size of the lettersGiven and word to be the same just add a simple if statement.

        // returns false
        makeWordWithGivenLetters.checkIfWordCanBeMade("keirbafsak", "kaasfabriek");

        // returns true
        makeWordWithGivenLetters.checkIfWordCanBeMade("keirbafsaak", "kaasfabriek");
    }
}
