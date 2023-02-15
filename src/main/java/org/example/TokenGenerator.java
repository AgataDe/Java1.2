package org.example;

import java.util.*;

public class TokenGenerator {
    public static void main(String[] args) {

        Random random = new Random();
        List<Character> listForToken = new ArrayList<>();
        System.out.println("The method generates 3 types of tokens: 5, 10 and 15. Choose the size you need:");

        int sizeOfToken = getNumberFromUser();
        switch (sizeOfToken) {
            case 5, 10, 15 -> {
                for (int i = 0; i < sizeOfToken; i++) {
                    listForToken.add(i, createListForRandomChar().get(random.nextInt(createListForRandomChar()
                            .size())));
                }
                String token = listForToken.toString().replaceAll(", ", "")
                        .substring(1, listForToken.size() + 1);
                System.out.println(token);
            }
            default -> System.out.println("Please note that you can only choose from sizes: 5, 10 and 15 ");
        }
    }

    private static List<Character> createListForRandomChar() {
        List<Character> listForRandomChar = new ArrayList<>();

        for (int i = 97; i < 123; i++) listForRandomChar.add((char) i);
        for (int i = 65; i < 91; i++) listForRandomChar.add((char) i);
        for (int i = 48; i < 58; i++) listForRandomChar.add((char) i);
        for (int i = 35; i < 39; i++) listForRandomChar.add((char) i);
        for (int i = 40; i < 43; i++) listForRandomChar.add((char) i);

        listForRandomChar.add((char) 94);
        listForRandomChar.add((char) 33);
        listForRandomChar.add((char) 64);

        return listForRandomChar;
    }

    private static int getNumberFromUser() {
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                return input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("ERROR - this is not a number! Please try again");
            }
        }
    }
}