package com.example;
/**
 * Week 4: Decoder
 * Created by Nestor (Felix) Sotres on 9/8/15.
 *
 * This program will take a series of sentences from the user and decode certain words into a message.
 * The program will use the Model, View, Control paradigm.
 */
public class Decoder {

    public static void main(String[] args){
        System.out.println("Hello Decoder!");

        //create view and model objects for program to reference
        Model mainModel = new Model();
        View mainView = new View();

        //create a Control object to pass on control of project
        Control mainControl = new Control(mainModel, mainView);

        //give control of program to the Control class
        mainControl.runDecoder();
    }
}
