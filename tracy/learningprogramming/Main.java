package tracy.learningprogramming;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    var scanner = new Scanner (System.in);
        System.out.println(academy.learnprogramming.Doctor.intro());
        var userInput = "";

        while(!userInput.equalsIgnoreCase("quit")){
            userInput = scanner.nextLine();
        }

	    scanner.close();

    }
}
