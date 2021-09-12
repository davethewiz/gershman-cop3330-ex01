/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Gershman
 */

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String inputName = scanner.nextLine();

        String output = "Hello, " + inputName + ", nice to meet you!";
        System.out.print(output);
    }
}
