package tracy.learningprogramming;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner((System.in));
        Random randomGenerator = new Random();

        int firstNumber = randomGenerator.nextInt(8) +2;
        int secondNumber = randomGenerator.nextInt(8) +2;
        var subtraction = randomGenerator.nextInt(8) +2;
        int answer = firstNumber * secondNumber - subtraction;

        String prompt = ". dont type in the answer, just press enter when you are ready to continue";

        System.out.println("think of a number between 1 and 10, and" + prompt );
        scanner.nextLine();
        System.out.println("multiply your number by  " + firstNumber + prompt);
        scanner.nextLine();
        System.out.println("now multiply the result by " + secondNumber + prompt);
        scanner.nextLine();
        System.out.println("divide the result by the original number thought of"  + prompt);
        scanner.nextLine();
        System.out.println("now subtract " + subtraction + prompt);
        scanner.nextLine();


        System.out.println("the answer is " + answer);

        scanner.close();

    }

}
