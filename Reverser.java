package com.company;

import java.io.*;
import java.io.FileInputStream;

//public class Reverser<E> {
public class Reverser {

    Stack<Character> _reverse;

    //   private Object Node;
  //  private Object Integer;

    protected Reverser() {
        _reverse = new Stack<Character>();
    }

    public void FileToStack(String FileName) throws IOException {


//        BufferedReader reader;
        FileInputStream reader;
        try {
            //reader = new BufferedReader(new FileReader(FileName));
            reader = new FileInputStream(FileName);
            
            int r = 0;
            
            //  while (reader.ready()) {
            while ((r = reader.read()) != -1) {
//                System.out.println( (char) r);
                _reverse.push((char) r);
            }

            // debug
//            Node p;
//            String showAll = "";
//            for( p = _reverse.top; p != null; p = p.next )
//                showAll += (char) p.getData() + "\n";
//            System.out.println(showAll);


            reader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");

        }
    }

    public void StackToFile(String FileNameOut)  throws IOException {
        FileOutputStream write;
        try {
            Node p;
            write = new FileOutputStream(FileNameOut);

            for( p = _reverse.top; p != null; p = p.next )
                // showAll += (char) p.getData() + "\n";
                write.write(_reverse.pop());
//            System.out.println();
            write.close();

        }
        catch (IOException e) {
            System.out.println("Output File not found");
        }

    }
}




