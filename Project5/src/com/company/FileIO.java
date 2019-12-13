package com.company;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package fxfileio;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author lmeade
 */
class FileIO {
    public void writeFile(String text) throws java.io.IOException
    {

        FileOutputStream out = null;

        //Code to write to file

        byte b[] = text.getBytes();
        String outputFileName = "text.txt";
        out = new FileOutputStream(outputFileName);
        out.write(b);
        out.close();
        //Clear text field


    }
    public String readFile() throws java.io.IOException
    {
        FileInputStream in = null;
        //Code to read from file
        String inputFileName = "text.txt";
        File inputFile = new File(inputFileName);
        in = new FileInputStream(inputFile);
        byte bt[] = new byte[(int) inputFile.length()];
        in.read(bt);
        String s = new String(bt);
        in.close();
        return s;
    }
}

