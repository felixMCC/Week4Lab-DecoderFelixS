package com.example;

/**
 * Created by nsotres on 9/8/15.
 *
 * Holds all the data information and manipulates it
 */
public class Model {

    private String currentSentence = "";    //Holds sentence from user to be decoded
    private String exitToken = "";          //Holds string value from user indicating if they want to exit the program
    private CharSequence secretMessage1 = "im checking on my flowers";
    private CharSequence secretMessage2 = "i received my mail";
    private CharSequence secretMessage3 = "i really like sports";

    //setter methods
    public void setCurrentSentence(String string){
        currentSentence = string;
    }

    public void setExitToken(String token){
        exitToken = token;
    }

    //getter methods
    public String getCurrentSentence(){
        return currentSentence;
    }

    public String getExitToken(){
        return exitToken;
    }

    public String decodeMessage(){

        if(currentSentence.toLowerCase().contains(secretMessage1)){
            return "Welcome back Agent." + "\u263A";
        }else if(currentSentence.toLowerCase().contains(secretMessage2)){
            return "Your next travel arrangements will be by " + "\u26F5";
        }else if(currentSentence.toLowerCase().contains(secretMessage3)){
            return "Your next target will be at the big" + "\u26BD" + ". You will arrive and awiat for a " + "\u260E";
        }//else

        return "Thank you for your message. Have a nice day.";
    }

    //Test exitToken
    public boolean testExitToken(){
        if(exitToken.equalsIgnoreCase("Yes")){
            return true;
        }
        return false;
    }
}
