package launchcode.org;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

    public static void sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for(int i : arr) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        System.out.println(total);
    }

    public static void main(String[] args) {
        ArrayList<Integer> listArrayInts = new ArrayList<>();
        listArrayInts.add(1);
        listArrayInts.add(2);
        listArrayInts.add(3);
        listArrayInts.add(4);
        listArrayInts.add(5);
        listArrayInts.add(6);
        listArrayInts.add(7);
        listArrayInts.add(8);
        listArrayInts.add(9);
        listArrayInts.add(10);

        sumEven(listArrayInts);

        ArrayList<String> arrayListSentence = new ArrayList<>();
        arrayListSentence.add("2");
        arrayListSentence.add("to");
        arrayListSentence.add("too");
        arrayListSentence.add("four");
        arrayListSentence.add("longe");
        arrayListSentence.add("longer");

        fiveLetters(arrayListSentence);
    }
    public static void fiveLetters(ArrayList<String> sentence) {
        System.out.println("Enter a word length:");
        Scanner input = new Scanner(System.in);
        int wordLength = input.nextInt();
        for(String word : sentence) {
            if (word.length() > 6) {
                System.out.println("selection too long");
            } else if (word.length() == wordLength) {
                System.out.println(word);
            }
        }
    }
}
