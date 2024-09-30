package com.pluralsight;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello world!");

        //what features the app should have
        //creating accounds
        //viewing accounts
        //viewing videos
        //liking videos
        //commenting on videos

        //create 4 variables for user info
        // username, passwords, email, followerscount, followingcount

        String correctUsername = "desklamp22";
        int userId = 198432;
        String username;
        String password;
        String correctPassword = "!!passWord2";
        String email = "word@gmail.com";
        int followersCount = 63;
        int followingCount = 740;
        boolean isSynced = false;
        boolean isBanned = false;
        int videoLikes = 302904;
        boolean isLoggedIn; //= true; make sure to change value when updating info

        Scanner reader = new Scanner(System.in);
        // show the text : welcome to tiktok, would you like to log in?
        //sout = shortcut for system.out.println
        System.out.println("Welcome to TikTok. Would you like to log in?");

        //ask for username and store it in a variable
        //ask for the password and store it in a variable
        System.out.println("What is your username:");
        username = reader.nextLine(); //don't have to write String username, cuz the username is already defined

        System.out.println("What is your password?");
        password = reader.nextLine();

       /* if (password.equals(password)) {
            System.out.println("Log in successful! It's good to have you back :)");
            isLoggedIn = true;
        }
        else {
            System.out.println("Your password/ username is incorrect :(");
            isLoggedIn = false;
        }

        */

        // print text "hi + username + good to have you back

        //equals is a string comparison method that works better than ==
        //use && for the two conditions to have to be correct to log in
        if(password.equals(correctPassword) && username.equals(correctUsername)) {
            System.out.println("Log in successful");
            System.out.println("Hi " + username + "! " + "Good to have you back :)");
            isLoggedIn = true;


           // char[] enteredAnswer = {'A', 'B', 'S', 'D'};
           // char addition = 'A';
            float firstNumber;
            float secondNumber;

            System.out.println("Welcome to the Basic Calculator");
            System.out.println("Enter the first number: ");
            firstNumber = reader.nextFloat();

            System.out.println("Enter the second number: ");
            secondNumber = reader.nextFloat();
            reader.nextLine();

            //System.out.println("Possible calculations:");
            //System.out.println("(A)dd");
            //System.out.println("(S)ubtract");
            //System.out.println("(M)ultiply");
            //System.out.println("(D)ivide");
            //more efficient way:
            System.out.println("Possible calculations:" +
                    "\n (A)dd" +
                    "\n (S)ubtract" +
                    "\n (M)ultiply" +
                    "\n (D)ivide");

            System.out.println("Please select an option: ");
            String enteredAnswer = reader.nextLine();

            if (enteredAnswer.equals("A")) {
                float totalA = firstNumber + secondNumber;
                System.out.println(firstNumber + " + " + secondNumber + " = " + totalA);
                reader.nextInt();
            }
            else if(enteredAnswer.equals("S")) {
                float totalB = firstNumber - secondNumber;
                System.out.println(firstNumber + " - " + secondNumber + " = " + totalB);
            }
            else if(enteredAnswer.equals("M")) {
                float totalC = firstNumber * secondNumber;
                System.out.println(firstNumber + " * " + secondNumber + " = " + totalC);
            }
            else if(enteredAnswer.equals("D")) {
                float totalB = firstNumber / secondNumber;
                System.out.println(firstNumber + " / " + secondNumber + " = " + totalB);
            }










        }
       // else
        {
            System.out.println("Your password/ username is incorrect :(");
            isLoggedIn = false;
        }



        //System.out.println("Hi " + username + "! " + "Good to have you back :)");
        //above commented out to try and integrate welcome into if/else statement, only string text tho, so how to do?
        //could possibly print before entering password






    }
}