package com.example;

/**
 * Created by nsotres on 9/8/15.
 *
 * Control structure for the project
 */
public class Control {

    //Paradigm objects used to run program
    Model theModel;
    View theView;

    boolean exit = false;

    //constructor for class
    Control(Model model, View view){
        //Set Model and View objects
        theModel = model;
        theView = view;
    }

    //main loop for program
    public void runDecoder(){
        System.out.println("Im now running inside of the Control!");

        do{
            //Prompt user for sentence
            theModel.setCurrentSentence(theView.promptUserForString());

            //Print sentence entered
            theView.printMessageToUser("Message entered: " + theModel.getCurrentSentence());

            //Decode message
            theView.printMessageToUser(theModel.decodeMessage());

            //Ask user if they would like to enter another sentence
            theView.printMessageToUser("Would you like to enter another sentence?");
            theView.printMessageToUser("(YES/NO)");
            //Prompt for a short answer (token)
            theModel.setExitToken(theView.promptUserForToken());



            //exit = true;

        }while(theModel.testExitToken());

    }
}
