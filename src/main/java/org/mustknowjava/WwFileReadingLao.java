package org.mustknowjava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WwFileReadingLao {


    public static void main(String[] args) throws IOException {
        String location = "C:\\Users\\Sathiskumar\\OneDrive\\Documents\\Nash\\Testing\\LAO\\sample-file writing\\file writer.txt\\";

        FileReader reader = new FileReader(location);
        BufferedReader reader1 = new BufferedReader(reader);
        //String thetext = reader1.readLine(); //- for last line only

        String currentLine; //IMPORTANT - for all text in the file

        while ((currentLine=reader1.readLine())!=null) {
            System.out.println(currentLine);

        }

    }

}
