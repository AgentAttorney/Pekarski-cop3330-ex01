package ex01;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Richard Pekarski
 */

/*Create a program that prompts for your name and prints a greeting using your name.

        Example Output
        What is your name? Brian
        Hello, Brian, nice to meet you!
        Constraint
        Keep the input, string concatenation, and output separate.
        Challenges
        Write a new version of the program without using any variables.
        Write a version of the program that displays different greetings for different people.
        Write a version of the program that displays the greeting in a GUI window.

 */

public class SayHello {
    public static void main(String[] args)
    {
        System.out.print("What is your name? ");
        Scanner input = new Scanner(System.in);
        String entered_name = "Hello, "+ input.nextLine() + ", nice to meet you!";
        System.out.println(entered_name);
    }
}
