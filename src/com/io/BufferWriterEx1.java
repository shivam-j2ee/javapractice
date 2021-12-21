package com.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterEx1 {

	public static void main(String[] args) throws IOException {
		FileWriter f=new FileWriter("C:/Users/Shivam Tiwari/Desktop/FileIO/BufferWriter.txt");
        BufferedWriter b=new  BufferedWriter(f);
        b.write("shivam");
        b.newLine();
        b.write("56");
 	    b.close();
	}
}
