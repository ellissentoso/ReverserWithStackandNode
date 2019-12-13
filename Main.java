package com.company;
/* Name: Ellis Sentoso
 *  Professor: Ladawn Meade
 *  Class: CS1B - Java
 *  Assignment: Project 5 - Reversing files
 *  Email: ellissentoso@gmail.com
 *  Date: 11/12/2019
 */
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

//        FileOutputStream fout = new FileOutputStream("Heck_Yeah.txt");
      //  Reverser<Integer> reverse = new Reverser<Integer>();
        Reverser reverse = new Reverser();

        reverse.FileToStack("reversePoem.txt");
        reverse.StackToFile("reversePoemOutput.txt");
        reverse.FileToStack("reverseSpells.txt");
        reverse.StackToFile("reverseSpellsOutput.txt");

        //reverse.St("/reverse.txt");
    }
}
