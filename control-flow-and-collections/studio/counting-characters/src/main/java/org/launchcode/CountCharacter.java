package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class CountCharacter {
    public static void main(String[] args) {
        String hiddenFiguresQuote = "If the product of two terms is zero then common sense says at least one of the two " +
                "terms has to be zero to start with. So if you move all the terms over to one side, you can put the " +
                "quadratics into a form that can be factored allowing that side of the equation to equal zero. Once " +
                "you’ve done that, it’s pretty straightforward from there.";

        char[] charsInString = hiddenFiguresQuote.toCharArray();

        HashMap<Character, Integer> count = new HashMap<>();
        for (char character : charsInString) {
            if (!count.containsKey(character)) {
                count.put(character, 1);
            } else {
                count.put(character, count.get(character) + 1);
            }
        }
        for(Map.Entry<Character, Integer> entry : count.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
