package org.launchcode;

import java.util.Scanner;

public class AliceInWonderland {
    public static void main(String[] args) {
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of " +
                "having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no " +
                "pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or " +
                "conversation?’";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a term to search for:");

        String userTerm = input.next();

        if (firstSentence.toLowerCase().contains(userTerm.toLowerCase())) {

            System.out.println(firstSentence.indexOf(userTerm));
            System.out.println(userTerm.length());
            String verify = firstSentence.toLowerCase().replace(userTerm.toLowerCase(), "VERIFY");
            System.out.println(verify);

            System.out.println("The term you entered is contained in the first sentence of Alice in Wonderland!");

        } else {
            System.out.println("The term you entered is not contained within the first sentence of Alice in Wonderland.");
        }

    }
}
