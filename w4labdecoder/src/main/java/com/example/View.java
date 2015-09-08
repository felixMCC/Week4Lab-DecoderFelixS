package com.example;
import java.util.Scanner;

/**
 * Created by nsotres on 9/8/15.
 *
 * Deals with the output and input of user
 */
public class View {

    Scanner in = new Scanner(System.in);
    String sentence = "";
    String token = "";

    public void printMessageToUser(String message){
        System.out.println(message);
    }

    public String promptUserForString(){
        System.out.println("Please enter a sentence:");
        sentence = in.nextLine();
        return sentence;
    }

    public String promptUserForToken(){
        //read next token
        token = in.next();
        //read next line to get rid of delimiter
        in.nextLine();
        return token;
    }
}