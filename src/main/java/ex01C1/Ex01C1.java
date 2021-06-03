package ex01C1;
import java.util.Scanner;

public class Ex01C1 {
    public static void main(String[] args)
    {
        System.out.print("What is your name? ");
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, " + input.nextLine() + ", nice to meet you!");
    }
}
