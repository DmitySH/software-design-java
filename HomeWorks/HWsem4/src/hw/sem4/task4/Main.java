package hw.sem4.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter word: ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        PalindromeFinder pf =  new PalindromeFinder(input);
        System.out.println(pf);
    }
}
