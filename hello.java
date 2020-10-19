package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String username;

        System.out.println("What is your name?");
        username = input.nextLine();
        System.out.println("Hello, " + username);
    }
}
