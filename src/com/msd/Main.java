package com.msd;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String text = "Enter positive whole number: ";
        int userNumber;
        Scanner in = new Scanner(System.in);
        System.out.print(text);
        do {
            while (!in.hasNextInt()) {
                System.out.print("Not a whole number. " + text);
                in.next();
            }
            userNumber = in.nextInt();
            if (userNumber <= 0) {
                System.out.print("Not a positive number. " + text);
            }
        } while (userNumber <= 1);

        for(int i = userNumber; i >= 1; i--) {
            String result;

            if ((i % 5 == 0) && (i % 3 == 0)) {
                result = "Agile";
            } else if (i % 3 == 0) {
                result = "Software";
            } else if (i % 5 == 0) {
                result = "Testing";
            } else {
                result = String.valueOf(i);
            }

            System.out.println(result);
        }
    }
}
