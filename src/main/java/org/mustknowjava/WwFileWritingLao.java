package org.mustknowjava;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WwFileWritingLao {

    public static void main(String[] args) throws IOException {

        String location = "C:\\Users\\Sathiskumar\\OneDrive\\Documents\\Nash\\Testing\\LAO\\sample-file writing\\file writer.txt\\";
        String content = "This too shal pass";

        FileWriter writer = new FileWriter(location);//METHOD1
        writer.write(content);
        writer.close();

        String location1="C:\\Users\\Sathiskumar\\OneDrive\\Documents\\Nash\\Testing\\LAO\\sample-file writing\\bufferedwriter.txt\\";
        String content1 = "JSHUA 3-7 SERMON123";

        FileWriter writer1 = new FileWriter(location1); //METHOD 2
        BufferedWriter bufferedWriter = new BufferedWriter(writer1);
        bufferedWriter.write(content1);
        bufferedWriter.close();

        String location2 = "C:\\Users\\Sathiskumar\\OneDrive\\Documents\\Nash\\Testing\\LAO\\sample-file writing\\fileoutputstream.txt\\";
        String content2="This is fileoutput stream";

        FileOutputStream outputStream = new FileOutputStream(location2); //METHOD 3
        byte[] thecontent=content2.getBytes();
        outputStream.write(thecontent);
        outputStream.close();

        //METHOD  4 -PATH

    }
}
