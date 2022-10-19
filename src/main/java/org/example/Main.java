package org.example;


import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter something:");
        String input = sc.nextLine();


// TODO: 10/18/22 Tells whether the input is a number or not

        if (StringUtils.isNumeric(input)) {
            System.out.println("You entered a number");
        } else {
            System.out.println("That was not a number");
        }

// TODO: 10/18/22 Flips the case of the string

        System.out.println(StringUtils.swapCase(input));

// TODO: 10/18/22 Reverses the string

        System.out.println(StringUtils.reverse(input));

    } //Main METHOD
} //Main CLASS